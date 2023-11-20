package jp.co.ricoh.cotos.rsicommonlib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "契約番号", "取引日", "Ｒ会社コード１", "会社名１", "Ｒ販売店１ID", "販売店１名称", "販売店１摘要", "契約先会社名", "契約先郵便番号", "契約先住所", "契約先電話番号", "注文№", "Ｒ請求書用摘要", "テナントＩＤ", "売上期間開始日", "売上期間終了日", "Ｒ商品コード", "Ｒプラン名", "数量", "販売店１仕入単価", "販売店１仕入金額", "販売店１仕入消費税額", "販売店１売上単価", "販売店１売上金額", "販売店１売上消費税額", "請求書№", "作成日", "Ｒ会社コード２", "会社名２", "Ｒ販売店２ID", "販売店２名称", "販売店２摘要", "販売店２売上単価", "販売店２売上金額", "販売店２売上消費税額" })
public class KizunaviCsvDto {

	/**契約番号*/
	@JsonProperty("契約番号")
	private String rjManagementNumber;

	/**取引日*/
	@JsonProperty("取引日")
	private String tradingDay;

	/**Ｒ会社コード１*/
	@JsonProperty("Ｒ会社コード１")
	private String ricohCompanyCd1;

	/**会社名１*/
	@JsonProperty("会社名１")
	private String ricohCompanyName1;

	/**Ｒ販売店１ID*/
	@JsonProperty("Ｒ販売店１ID")
	private String ricohDealerContractId1;

	/**販売店１名称*/
	@JsonProperty("販売店１名称")
	private String dealerName1;

	/**販売店１摘要*/
	@JsonProperty("販売店１摘要")
	private String dealerSummary1;

	/**契約先会社名*/
	@JsonProperty("契約先会社名")
	private String customerCompanyName;

	/**契約先郵便番号*/
	@JsonProperty("契約先郵便番号")
	private String customerPostalCode;

	/**契約先住所*/
	@JsonProperty("契約先住所")
	private String customerAddress;

	/**契約先電話番号*/
	@JsonProperty("契約先電話番号")
	private String customerTel;

	/**注文№*/
	@JsonProperty("注文№")
	private String orderNumber;

	/**Ｒ請求書用摘要*/
	@JsonProperty("Ｒ請求書用摘要")
	private String ricohInvoiceSummary;

	/**テナントＩＤ*/
	@JsonProperty("テナントＩＤ")
	private String tenantId;

	/**売上期間開始日*/
	@JsonProperty("売上期間開始日")
	private String serviceStartDate;

	/**売上期間終了日*/
	@JsonProperty("売上期間終了日")
	private String serviceEndDate;

	/**Ｒ商品コード*/
	@JsonProperty("Ｒ商品コード")
	private String ricohItemCode;

	/**Ｒプラン名*/
	@JsonProperty("Ｒプラン名")
	private String itemContractName;

	/**数量*/
	@JsonProperty("数量")
	private Long quantity;

	/**販売店１仕入単価*/
	@JsonProperty("販売店１仕入単価")
	private Double dealerPurchasePrice1;

	/**販売店１仕入金額*/
	@JsonProperty("販売店１仕入金額")
	private Integer dealerPurchaseTaxOut1;

	/**販売店１仕入消費税額*/
	@JsonProperty("販売店１仕入消費税額")
	private Integer dealerPurchaseTax1;

	/**販売店１売上単価*/
	@JsonProperty("販売店１売上単価")
	private Double dealerUnitPrice1;

	/**販売店１売上金額*/
	@JsonProperty("販売店１売上金額")
	private Integer dealerUnitPriceTaxOut1;

	/**販売店１売上消費税額*/
	@JsonProperty("販売店１売上消費税額")
	private Integer dealerUnitPriceTax1;

	/**請求書№*/
	@JsonProperty("請求書№")
	private String invoiceNumber;

	/**作成日*/
	@JsonProperty("作成日")
	private String createdDate;

	/**Ｒ会社コード２*/
	@JsonProperty("Ｒ会社コード２")
	private String ricohCompanyCd2;

	/**会社名２*/
	@JsonProperty("会社名２")
	private String ricohCompanyName2;

	/**Ｒ販売店２ID*/
	@JsonProperty("Ｒ販売店２ID")
	private String ricohDealerContractId2;

	/**販売店２名称*/
	@JsonProperty("販売店２名称")
	private String dealerName2;

	/**販売店２摘要*/
	@JsonProperty("販売店２摘要")
	private String dealerSummary2;

	/**販売店２売上単価*/
	@JsonProperty("販売店２売上単価")
	private Double dealerUnitPrice2;

	/**販売店２売上金額*/
	@JsonProperty("販売店２売上金額")
	private Integer dealerUnitPriceTaxOut2;

	/**販売店２売上消費税額*/
	@JsonProperty("販売店２売上消費税額")
	private Integer dealerUnitPriceTax2;

}
