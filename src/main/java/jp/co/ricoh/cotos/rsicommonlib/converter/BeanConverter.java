package jp.co.ricoh.cotos.rsicommonlib.converter;

import java.text.ParseException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.ricoh.cotos.commonlib.entity.accounting.Accounting;
import jp.co.ricoh.cotos.commonlib.entity.contract.CustomerContract;
import jp.co.ricoh.cotos.rsicommonlib.entity.KizunaviSubstituteSalesClaimWorkTable;
import jp.co.ricoh.cotos.rsicommonlib.entity.KIZUNAviCreateSubstituteSalesClaim.KizunaviSubstituteSalesClaim;
import jp.co.ricoh.cotos.rsicommonlib.util.KIZUNAviCreateSubstituteSalesClaimUtil;

/**
 *
 * ビーン変換クラス
 *
 */
@Component
public class BeanConverter {

	@Autowired
	KIZUNAviCreateSubstituteSalesClaimUtil appUtil;

	/**
	 * 課金計上テーブルのEntityをKIZUNAvi代売請求WorkTableのEntityに変換する
	 * @param accounting 課金計上テーブルのEntity
	 * @param customerContract 契約情報の中で保持する顧客情報を表すEntity
	 * @return KizunaviSubstituteSalesClaimWorkTable KIZUNAvi代売請求WorkTableのEntity
	 * @throws ParseException
	 */
	public KizunaviSubstituteSalesClaimWorkTable toKizunaviSubstituteSalesClaimWorkTable(Accounting accounting, CustomerContract customerContract) throws ParseException {
		KizunaviSubstituteSalesClaimWorkTable entity = new KizunaviSubstituteSalesClaimWorkTable();
		// No	項目名	物理項目名	データ取得元．項目名	項目編集内容	備考
		// 1	代売請求ID		（追加時に自動採番）		当該TBLの主キー
		// 2	登録日時		システム日時
		// 3	登録者		（固定値：バッチID）
		// 4	更新日時		－
		// 5	更新者		－
		// 6	version		（追加時に自動採番）
		// 7	計上ID		計上.計上ID		計上TBLのID（主キー）
		entity.setAccountingId(accounting.getId());
		// 8	RJ管理番号		計上.RJ管理番号		契約毎にユニークとなる番号（RSIでは月額DBの主キー）
		entity.setRjManagementNumber(accounting.getRjManageNumber());
		// 9	契約ID		計上.契約ID		契約TBLのID（主キー）
		entity.setContractId(accounting.getContractId());
		// 10	契約明細ID		計上.契約明細ID		契約詳細TBLのID（主キー）
		entity.setContractDetailId(accounting.getContractDetailId());
		// 11	請求年月		計上.請求年月		年月日のうち、日は 1日固定
		entity.setClaimDate(appUtil.toDate(accounting.getBillingDate()));
		// 12	請求書番号		"計上.RJ管理番号、計上.請求年月	計上.RJ管理番号 ＋ ”-” ＋ 計上.請求年月（YYYYMM）
		entity.setInvoiceNumber(appUtil.formatInvoiceNumber(accounting.getRjManageNumber(), accounting.getBillingDate()));
		// 13	サービス期間開始日		計上.サービス期間開始日
		entity.setServiceStartDate(appUtil.toDate(accounting.getSrvStartDate()));
		// 14	サービス期間終了日		計上.サービス期間終了日
		entity.setServiceEndDate(appUtil.toDate(accounting.getSrvEndDate()));
		// 15	品種名		計上.品種名
		entity.setItemContractName(accounting.getProductTypeName());
		// 16	リコー品種コード		計上.品種コード
		entity.setRicohItemCode(accounting.getProductTypeCd());
		// 17	品種区分		計上.品種区分		なし/基本/オプション
		entity.setItemType(accounting.getItemType().toString());
		// 18	費用種別		計上.費用種別		1:初期費/2:月額(定額)/3:年額/4:月額(従量)
		entity.setCostType(accounting.getCostType().toString());
		// 19	商流区分		計上.商流区分		1:直売/2:代売_接点店/3:代売_母店_接点店
		entity.setDealerFlow(accounting.getDealerFlow().toString());
		// 20	テナントID		計上.拡張項目（拡張項目から テナントID を取得）
		entity.setTenantId(appUtil.getTenantIdFromExtendItem(accounting.getExtendItem()));
		// 21	顧客情報_郵便番号		顧客(契約用).郵便番号
		entity.setCustomerPostalCode(customerContract.getPostNumber());
		// 22	顧客情報_住所		顧客(契約用).住所
		entity.setCustomerAddress(customerContract.getAddress());
		// 23	顧客情報_会社名		顧客(契約用).企業名
		entity.setCustomerCompanyName(customerContract.getCompanyName());
		// 24	顧客情報_電話番号		顧客(契約用).会社代表電話番号
		entity.setCustomerTel(customerContract.getPhoneNumber());
		// 25	取引日		計上.取引年月日
		entity.setTradingDay(appUtil.toDate(accounting.getTransactionDate()));
		// 26	注文番号		計上.注文番号
		entity.setOrderNumber(accounting.getWebOrderNo());
		// 27	R請求書摘要		計上.R請求書摘要
		entity.setRInvoiceSummary(accounting.getChgBillingText());
		// 28	作成日		計上.データ作成日
		entity.setCreatedDate(appUtil.toDate(accounting.getFfmDataCreateDate()));
		// 29	数量		計上.売上数量
		entity.setQuantity(accounting.getFfmUserSalesCnt());
		// 30	E/U請求単価		計上.ユーザ売上単価
		entity.setEuBillingUnitPrice(accounting.getFfmUserSalesPrice());
		// 31	E/U請求金額（税抜）		計上.ユーザ売上金額
		entity.setEuBillingUnitPriceTaxOut(accounting.getFfmUserSalesAmt());
		// 32	E/U請求金額（消費税額）		計上.ユーザ売上消費税額
		entity.setEuBillingUnitPriceTax(accounting.getFfmUserSalesTaxPrice());
		// 33	E/U請求消費税区分		計上.ユーザ売上消費税区分
		entity.setEuBillingUnitPriceTaxClass(accounting.getFfmUserSalesTaxType());
		// 34	E/U請求消費税率区分		計上.ユーザ売上消費税率区分
		entity.setEuBillingUnitPriceTaxRateClass(accounting.getFfmUserSalesTaxRate());
		// 35	一次店_R会社コード		計上.一次店_R会社コード
		entity.setPrimaryRCompanyCode(accounting.getChgRCompanyCode1st());
		// 36	一次店_R会社名		計上.一次店_R会社名
		entity.setPrimaryRCompanyName(accounting.getChgRCompanyName1st());
		// 37	一次店_販売店ID		計上.一次店_販売店ID		販売店識別+『-』+デポコード  XXXXX-XX
		entity.setPrimaryDealerContractId(accounting.getChgShopId1st());
		// 38	一次店_販売店名		計上.一次店_販売店名		販売店名＋デボ名
		entity.setPrimaryDistributorName(accounting.getChgShopName1st());
		// 39	一次店_販売店摘要		計上.一次店_販売店摘要
		entity.setPrimaryDealerSummary(accounting.getChgShopText1st());
		// 40	一次店_仕入単価		計上.RJ売上単価
		entity.setPrimaryPurchasePrice(accounting.getFfmRjSalesPrice());
		// 41	一次店_仕入金額（税抜）		計上.RJ売上金額
		entity.setPrimaryPurchaseTaxOut(accounting.getFfmRjSalesAmt());
		// 42	一次店_仕入金額（消費税額）		計上.RJ売上消費税額
		entity.setPrimaryPurchaseTax(accounting.getFfmRjSalesTaxPrice());
		// 43	一次店_仕入消費税区分		計上.RJ売上消費税区分
		entity.setPrimaryPurchaseTaxClass(accounting.getFfmRjSalesTaxType());
		// 44	一次店_仕入消費税率区分		計上.RJ売上消費税率区分
		entity.setPrimaryPurchaseTaxRateClass(accounting.getFfmRjSalesTaxRate());
		// 45	一次店_売上単価
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.販売店売上単価
		// else
		//		     計上.ユーザ売上単価"
		entity.setPrimaryUnitPrice("3".equals(accounting.getDealerFlow()) ? accounting.getFfmShopSalesPrice() : accounting.getFfmUserSalesPrice());
		// 46	一次店_売上金額（税抜）
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.販売店売上金額
		// else
		//		     計上.ユーザ売上金額"
		entity.setPrimaryUnitPriceTaxOut("3".equals(accounting.getDealerFlow()) ? accounting.getFfmShopSalesAmt() : accounting.getFfmUserSalesAmt());
		// 47	一次店_売上金額（消費税額）
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.販売店売上消費税額
		// else
		//		     計上.ユーザ売上消費税額"
		entity.setPrimaryUnitPriceTax("3".equals(accounting.getDealerFlow()) ? accounting.getFfmShopSalesTaxPrice() : accounting.getFfmUserSalesTaxPrice());
		// 48	一次店_売上消費税区分
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.販売店売上消費税区分
		// else
		//		     計上.ユーザ売上消費税区分"
		entity.setPrimaryUnitPriceTaxClass("3".equals(accounting.getDealerFlow()) ? accounting.getFfmShopSalesTaxType() : accounting.getFfmUserSalesTaxType());
		// 49	一次店_売上消費税率区分
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.販売店売上消費税率区分
		// else
		//		     計上.ユーザ売上消費税率区分"
		entity.setPrimaryUnitPriceTaxRateClass("3".equals(accounting.getDealerFlow()) ? accounting.getFfmShopSalesTaxRate() : accounting.getFfmUserSalesTaxRate());
		// 50	二次店_R会社コード
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.二次店_R会社コード
		// else
		//		     NULL"
		entity.setSecondaryRCompanyCode("3".equals(accounting.getDealerFlow()) ? accounting.getChgRCompanyCode2st() : null);
		// 51	二次店_R会社名
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.二次店_R会社名
		// else
		//		     NULL"
		entity.setSecondaryRCompanyName("3".equals(accounting.getDealerFlow()) ? accounting.getChgRCompanyName2st() : null);
		// 52	二次店_販売店ID
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.二次店_販売店ID
		// else
		//		     NULL"		販売店識別+『-』+デポコード  XXXXX-XX
		entity.setSecondaryDealerContractId("3".equals(accounting.getDealerFlow()) ? accounting.getChgShopId2st() : null);
		// 53	二次店_販売店名
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.二次店_販売店名
		// else
		//		     NULL"		販売店名＋デボ名
		entity.setSecondaryDistributorName("3".equals(accounting.getDealerFlow()) ? accounting.getChgShopName2st() : null);
		// 54	二次店_販売店摘要
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.二次店_販売店摘要
		// else
		//		     NULL"
		entity.setSecondaryDealerSummary("3".equals(accounting.getDealerFlow()) ? accounting.getChgShopText2st() : null);
		// 55	二次店_売上単価
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.ユーザ売上単価
		// else
		//		     NULL"
		entity.setSecondaryUnitPrice("3".equals(accounting.getDealerFlow()) ? accounting.getFfmUserSalesPrice() : null);
		// 56	二次店_売上金額（税抜）
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.ユーザ売上金額
		// else
		//		     NULL"
		entity.setSecondaryUnitPriceTaxOut("3".equals(accounting.getDealerFlow()) ? accounting.getFfmUserSalesAmt() : null);
		// 57	二次店_売上金額（消費税額）
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.ユーザ売上消費税額
		// else
		//		     NULL"
		entity.setSecondaryUnitPriceTax("3".equals(accounting.getDealerFlow()) ? accounting.getFfmUserSalesTaxPrice() : null);
		// 58	二次店_売上消費税区分
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.ユーザ売上消費税区分
		// else
		//		     NULL"
		entity.setSecondaryUnitPriceTaxClass("3".equals(accounting.getDealerFlow()) ? accounting.getFfmUserSalesTaxType() : null);
		// 59	二次店_売上消費税率区分
		// if (計上.商流区分 = ""3:代売_母店_接点店"")
		//		     計上.ユーザ売上消費税率区分
		// else
		//		     NULL"
		entity.setSecondaryUnitPriceTaxRateClass("3".equals(accounting.getDealerFlow()) ? accounting.getFfmUserSalesTaxRate() : null);
		return entity;
	}

	/**
	 * KIZUNAvi代売請求WorkTableのEntityをKIZUNAvi代売請求のEntityに変換
	 * @param work KIZUNAvi代売請求WorkTableのEntity
	 * @return KizunaviSubstituteSalesClaim KIZUNAvi代売請求のEntity
	 */
	public static KizunaviSubstituteSalesClaim toKizunaviSubstituteSalesClaim(KizunaviSubstituteSalesClaimWorkTable work) {
		KizunaviSubstituteSalesClaim entity = new KizunaviSubstituteSalesClaim();
		BeanUtils.copyProperties(work, entity, "id");
		return entity;
	}
}
