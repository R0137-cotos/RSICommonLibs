package jp.co.ricoh.cotos.rsicommonlib.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * [KIZUNAvi]代売用請求データ作成のユーティリティクラス
 *
 */
@Component
public class KIZUNAviCreateSubstituteSalesClaimUtil {

	/**
	 * 請求書番号の文字列フォーマット処理
	 * @param rjManageNumber RJ管理番号
	 * @param billingDate 請求年月(yyyyMM)
	 * @return String 請求書番号
	 */
	public String formatInvoiceNumber(String rjManageNumber, String billingDate) {
		// 請求書番号＝RJ管理番号 ＋ ”-” ＋ 計上.請求年月（YYYYMM）
		StringBuilder invoiceNumber = new StringBuilder();
		invoiceNumber.append(rjManageNumber);
		invoiceNumber.append("-");
		invoiceNumber.append(billingDate.substring(0, 6));
		return invoiceNumber.toString();
	}

	/**
	 * 課金計上テーブルの拡張項目からテナントIDを取得
	 *
	 * 例）課金計上テーブルの拡張項目のJSONデータレイアウト
	 * {
	 *   "createdAt" : 1542337750000,
	 *   "createdUserId" : "COTOSforRSI",
	 *   "updatedAt" : 1542337750000,
	 *   "updatedUserId" : "COTOSforRSI",
	 * "version" : 1,
	 * "id" : 1,
	 * "targetSys" : "RSI",
	 * "bplatsRequestNo" : "RSIC000001",
	 * "makerManageNo" : "RKOR000001",
	 * "contractNm" : "RICOH Smart Integretion",
	 * "orderDate" : "2018-11-16",
	 * "serviceStartDate1" : "2018-11-16",
	 * "cancelExpectDate" : "2020-11-16",
	 * "applicationStatus" : "4",
	 * "contractCreateDate" : "2018-11-16",
	 * "updateInterval" : null,
	 * "paymentStartDate" : "2018-11-17",
	 * "commercialDistribute" : "2",
	 * "netricohAccount" : "nr00000001",
	 * "tenantId" : "tenant_id1",
	 * "zuoraAccountId" : "zuora_account_id1",
	 * "contractStartDate" : "2018-11-17",
	 * "createDateTime" : 1542337750000,
	 * "updateDateTime" : 1542337750000
	 * }
	 *
	 * @param extendItem 拡張項目
	 * @return String テナントID
	 */
	public String getTenantIdFromExtendItem(String extendItem) {
		if (null == extendItem)
			return null;
		if ("".equals(extendItem))
			return null;

		ObjectMapper mapper = new ObjectMapper();
		JsonNode root;
		try {
			root = mapper.readTree(extendItem);
			JsonNode retnode = root.get("tenantId");
			return retnode != null ? retnode.asText() : null;
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * 日付文字列（yyyyMMdd）をDate型に変換
	 * @param yyyyMMdd 日付文字列（yyyyMMdd）
	 * @return Date 変換結果
	 * @throws ParseException
	 */
	public Date toDate(String yyyyMMdd) throws ParseException {
		if (null == yyyyMMdd || "".equals(yyyyMMdd))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false);
		return sdf.parse(yyyyMMdd);
	}

	/**
	 * Date型の引数を日付文字列（yyyyMMdd）に変換
	 * @param date 日付（yyyy/MM/dd 00:00:00.000）
	 * @return 日付文字列（yyyyMMdd）
	 */
	public String dateToString(Date date) {
		if (null == date)
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
}
