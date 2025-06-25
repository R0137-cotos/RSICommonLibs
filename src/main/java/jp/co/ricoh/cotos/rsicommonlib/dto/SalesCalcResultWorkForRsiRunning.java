package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.ricoh.cotos.commonlib.entity.master.ItemMaster.CostType;
import jp.co.ricoh.cotos.commonlib.entity.master.ItemMaster.ItemType;
import lombok.Data;

/**
 * 売上計算結果WORKを表すDto
 */
@Entity
@Data
public class SalesCalcResultWorkForRsiRunning {

	/**
	 * 行番号
	 */
	@Id
	@JsonProperty(value = "行番号")
	private long rownum;

	/**
	 * 売上計算結果WORKテーブルID
	 */
	@JsonProperty(value = "売上計算結果WORKテーブルID")
	private long salesCalcResultWorkId;

	/**
	 * RJ管理番号
	 */
	@JsonProperty(value = "RJ管理番号")
	private String rjManageNumber;

	/**
	 * 契約ID
	 */
	@JsonProperty(value = "契約ID")
	private long contractId;

	/**
	 * 契約明細ID
	 */
	@JsonProperty(value = "契約明細ID")
	private long contractDetailId;

	/**
	 * 商流区分
	 */
	@JsonProperty(value = "商流区分")
	private String commercialFlowDiv;

	/**
	 * 費用種別
	 */
	@JsonProperty(value = "費用種別")
	private CostType costType;

	/**
	 * 品種区分
	 */
	@JsonProperty(value = "品種区分")
	private ItemType itemType;

	/**
	 * 作成データパターン
	 */
	@JsonProperty(value = "作成データパターン")
	private String ffmDataPtn;

	/**
	 * WEB受注注文番号
	 */
	@JsonProperty(value = "WEB受注注文番号")
	private String webOrderNumber;

	/**
	 * リコー品種コード
	 */
	@JsonProperty(value = "リコー品種コード")
	private String ricohItemCode;

	/**
	 * 品種名
	 */
	@JsonProperty(value = "品種名")
	private String itemContractName;

	/**
	 * 仕入取引先コード
	 */
	@JsonProperty(value = "仕入取引先コード")
	private String bpCd;

	/**
	 * 得意先コード
	 */
	@JsonProperty(value = "得意先コード")
	private String billingCustomerSpCode;

	/**
	 * 数量
	 */
	@JsonProperty(value = "数量")
	private Long quantity;

	/**
	 * 金額
	 */
	@JsonProperty(value = "金額")
	private BigDecimal amountSummary;

	/**
	 * ＲＪ仕切価格
	 */
	@JsonProperty(value = "ＲＪ仕切価格")
	private BigDecimal rjDividingPrice;

	/**
	 * ＳＡ仕切価格
	 */
	@JsonProperty(value = "ＳＡ仕切価格")
	private BigDecimal rjPurchasePrice;

	/**
	 * 仕切価格
	 */
	@JsonProperty(value = "仕切価格")
	private BigDecimal partitionPrice;

	/**
	 * 母店売価(接点店仕切)
	 */
	@JsonProperty(value = "母店売価(接点店仕切)")
	private BigDecimal motherStorePrice;

	/**
	 * Ｒ原価
	 */
	@JsonProperty(value = "Ｒ原価")
	private BigDecimal rCost;

	/**
	 * 原価
	 */
	@JsonProperty(value = "原価")
	private BigDecimal cost;

	/**
	 * 振替先課所コード
	 */
	@JsonProperty(value = "振替先課所コード")
	private String transToServiceOrgCode;

	/**
	 * 届先コード
	 */
	@JsonProperty(value = "届先コード")
	private String deliveryCd;

	/**
	 * 請求明細 数量
	 */
	@JsonProperty("請求明細 数量")
	private Long invoiceitemQuantity;

	/**
	 * 請求明細 金額
	 */
	@JsonProperty("請求明細 金額")
	private BigDecimal invoiceitemChargeamount;

	/**
	 * 請求明細 単価
	 */
	@JsonProperty("請求明細 単価")
	private BigDecimal invoiceitemUnitprice;

	/**
	 * サービス期間.開始日
	 */
	@JsonProperty("サービス期間.開始日")
	private Date invoiceitemServicestartdate;

	/**
	 * 商流順１
	 */
	@JsonProperty("商流順１")
	private Integer motherDealerFlowOrder;

	/**
	 * サービス期間.終了日
	 */
	@JsonProperty("サービス期間.終了日")
	private Date invoiceitemServiceenddate;

	/**
	 * 販売店コード 母店
	 */
	@JsonProperty("販売店コード 母店")
	private String motherDistributorCd;

	/**
	 * 販売店名 母店
	 */
	@JsonProperty("販売店名 母店")
	private String motherDealerName;

	/**
	 * OE届け先コード 母店
	 */
	@JsonProperty("OE届け先コード 母店")
	private String motherOeDeliveryCd;

	/**
	 * MoM会社ID 母店
	 */
	@JsonProperty("MoM会社ID 母店")
	private String motherDistributorMomCmpId;

	/**
	 * MoMデポコード 母店
	 */
	@JsonProperty("MoMデポコード 母店")
	private String motherDistributorMomDepoCd;

	/**
	 * RINGS届先コード(3桁）
	 */
	@JsonProperty("RINGS届先コード(3桁）")
	private String motherRingsTodokesakiCd;

	/**
	 * 商流順２
	 */
	@JsonProperty("商流順２")
	private Integer dealerFlowOrder;

	/**
	 * 販売店コード 接点店
	 */
	@JsonProperty("販売店コード 接点店")
	private String distributorCd;

	/**
	 * 販売店名 接点店
	 */
	@JsonProperty("販売店名 接点店")
	private String dealerName;

	/**
	 * OE届け先コード 接点店
	 */
	@JsonProperty("OE届け先コード 接点店")
	private String oeDeliveryCd;

	/**
	 * MoM会社ID 接点店
	 */
	@JsonProperty("MoM会社ID 接点店")
	private String distributorMomCmpId;

	/**
	 * MoMデポコード 接点店
	 */
	@JsonProperty("MoMデポコード 接点店")
	private String distributorMomDepoCd;

	/**
	 * 拡張項目
	 */
	@JsonProperty("拡張項目")
	private String extendsParameter;

	/**
	 * RINGS得意先コード(販売店)
	 */
	@JsonProperty("RINGS得意先コード(販売店)")
	private String ringsCustomerCd;

	/**
	 * RINGS得意先コード(母店)
	 */
	@JsonProperty("RINGS得意先コード(母店)")
	private String motherRingsCustomerCd;

	/**
	 * RINGS届先コード(3桁）
	 */
	@JsonProperty("RINGS届先コード(3桁）")
	private String ringsTodokesakiCd;

	/**
	 * RINGS届先コード(3桁）(代売(母店/傘下店)でOE届先コードがない場合)
	 */
	@JsonProperty("RINGS届先コード(3桁）")
	private String subMotherRingsTodokesakiCd;

	/**
	 * RINGS届先コード(3桁）(代売(直結店のみ)でOE届先コードがない場合)
	 */
	@JsonProperty("RINGS届先コード(3桁）")
	private String subRingsTodokesakiCd;

	/**
	 * OE届け先コード 母店(代売(母店/傘下店)でOE届先コードがない場合)
	 */
	@JsonProperty("OE届け先コード 母店")
	private String subMotherOeDeliveryCd;

	/**
	 * OE届け先コード 接点店(代売(直結店のみ)でOE届先コードがない場合)
	 */
	@JsonProperty("OE届け先コード 接点店")
	private String subOeDeliveryCd;

	/**
	 * 拡張項目(契約担当SA社員)
	 */
	@JsonProperty("拡張項目(契約担当SA社員)")
	private String empExtendsParameter;

	/**
	 * EDW大塚商会専用商品フラグ
	 */
	@JsonProperty("EDW大塚商会専用商品フラグ")
	private Integer edwOtsukaProductFlg;

	/**
	 * ＲＪ販事本仕入価格
	 */
	@JsonProperty(value = "ＲＪ販事本仕入価格")
	private BigDecimal rjHanjihonPurchasePrice;

	/**
	 * 納品書・請求書印字用コメント <br>
	 * <br>
	 * 【仕入用管理Noの場合】 <br>
	 * 先頭3文字：商品マスタ.仕入先No、末尾9文字：契約情報画面（請求先情報セクション）より入力 <br>
	 * 【任意コメントの場合】 <br>
	 * 最大20Byteのコメント 契約情報画面（請求先情報セクション）より入力
	 *
	 */
	private String purchaseManageNumber;
}
