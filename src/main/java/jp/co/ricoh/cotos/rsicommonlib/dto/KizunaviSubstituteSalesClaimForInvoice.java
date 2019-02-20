package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * KIZUNAvi代売請求を表すEntity
 * 帳票に出力したい項目が増えた場合、
 * 該当プロパティの@JsonIgnoreを削除すれば出力されるようになります。
 * 参考：KIZUNAviCreateSubstituteInvoice#convertToReportSourcePageDto
 */
@Data
public class KizunaviSubstituteSalesClaimForInvoice {

	/**
	 * 登録日時
	 */
	private Date createdAt;

	/**
	 * 登録者
	 */
	private String createdUserId;

	/**
	 * 更新日時
	 */
	private Date updatedAt;

	/**
	 * 更新者
	 */
	private String updatedUserId;

	/**
	 * version
	 */
	private long version;

	/*
	 * 代売請求ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kizunavi_substitute_sales_claim_seq")
	@SequenceGenerator(name = "kizunavi_substitute_sales_claim_seq", sequenceName = "kizunavi_substitute_sales_claim_seq", allocationSize = 1)
	@JsonIgnore
	private long id;

	/*
	 * 計上ID
	 */
	@JsonIgnore
	private long accountingId;

	/**
	 * RJ管理番号
	 */
	@JsonIgnore
	private String rjManagementNumber;

	/**
	 * 契約ID
	 */
	@JsonIgnore
	private long contractId;

	/**
	 * 契約明細ID
	 */
	@JsonIgnore
	private long contractDetailId;
	/**
	 * 請求年月
	 */
	@JsonIgnore
	private Date claimDate;

	/**
	 * 請求書番号
	 */
	private String invoiceNumber;
	/**
	 * サービス期間開始日
	 */
	@JsonIgnore
	private Date serviceStartDate;
	/**
	 * サービス期間終了日
	 */
	@JsonIgnore
	private Date serviceEndDate;
	/**
	 * 品種名
	 */
	@JsonIgnore
	private String itemContractName;

	/**
	 * 品種名1
	 */
	@Transient
	private String itemContractName1;

	/**
	 * 品種名2
	 */
	@Transient
	private String itemContractName2;

	/**
	 * リコー品種コード
	 */
	@JsonIgnore
	private String ricohItemCode;
	/**
	 * 品種区分
	 */
	@JsonIgnore
	private String itemType;
	/**
	 * 費用種別
	 */
	@JsonIgnore
	private String costType;
	/**
	 * 商流区分
	 */
	@JsonIgnore
	private String dealerFlow;
	/**
	 * テナントID
	 */
	@JsonIgnore
	private String tenantId;
	/**
	 * 顧客情報_郵便番号
	 */
	private String customerPostalCode;
	/**
	 * 顧客情報_住所
	 */
	@JsonIgnore
	private String customerAddress;
	/**
	 * 顧客情報_住所_1
	 */
	@Transient
	private String customerAddress1;
	/**
	 * 顧客情報_住所_2
	 */
	@Transient
	private String customerAddress2;

	/**
	 * 顧客情報_会社名
	 */
	private String customerCompanyName;
	/**
	 * 顧客情報_電話番号
	 */
	@JsonIgnore
	private String customerTel;
	/**
	 * 取引日
	 */
	@Column(name = "trading_day")
	@JsonIgnore
	private Date tradingDayOrg;
	/**
	 * 取引日文字列(帳票出力用)
	 */
	@Transient
	private String tradingDay;

	/**
	 * 注文番号
	 */
	@JsonIgnore
	private String orderNumber;
	/**
	 * R請求書摘要
	 */
	@JsonIgnore
	private String rInvoiceSummary;
	/**
	 * 作成日
	 */
	@JsonIgnore
	private Date createdDate;
	/**
	 * 数量
	 */
	private int quantity;
	/**
	 * E/U請求単価
	 */
	private BigDecimal euBillingUnitPrice;
	/**
	 * E/U請求金額（税抜）
	 */
	private BigDecimal euBillingUnitPriceTaxOut;
	/**
	 * E/U請求金額（消費税額）
	 */
	private BigDecimal euBillingUnitPriceTax;

	/**
	 * E/U請求金額（税込）(帳票出力用)
	 */
	@Transient
	private BigDecimal euBillingUnitPriceTaxIn;

	/**
	 * お買上金額合計（税抜）(帳票出力用)
	 */
	@Transient
	private BigDecimal unitPriceTaxOutTotal;

	/**
	 * お買上金額合計（消費税）(帳票出力用)
	 */
	@Transient
	private BigDecimal unitPriceTaxTotal;

	/**
	 * お買上金額合計（税込）(帳票出力用)
	 */
	@Transient
	private BigDecimal unitPriceTaxInTotal;

	/**
	 * E/U請求消費税区分
	 */
	@JsonIgnore
	private String euBillingUnitPriceTaxClass;
	/**
	 * E/U請求消費税率区分
	 */
	@JsonIgnore
	private String euBillingUnitPriceTaxRateClass;
	/**
	 * 一次店_R会社コード
	 */
	@JsonIgnore
	@Column(name = "primary_r_company_code")
	private String primaryRCompanyCode;
	/**
	 * 一次店_R会社名
	 */
	@JsonIgnore
	@Column(name = "primary_r_company_name")
	private String primaryRCompanyName;
	/**
	 * 一次店_販売店ID
	 */
	@JsonIgnore
	private String primaryDealerContractId;
	/**
	 * 一次店_販売店名
	 */
	@JsonIgnore
	private String primaryDistributorName;
	/**
	 * 一次店_販売店摘要
	 */
	@JsonIgnore
	private String primaryDealerSummary;
	/**
	 * 一次店_仕入単価
	 */
	@JsonIgnore
	private BigDecimal primaryPurchasePrice;
	/**
	 * 一次店_仕入金額（税抜）
	 */
	@JsonIgnore
	private BigDecimal primaryPurchaseTaxOut;
	/**
	 * 一次店_仕入金額（消費税額）
	 */
	@JsonIgnore
	private BigDecimal primaryPurchaseTax;
	/**
	 * 一次店_仕入消費税区分
	 */
	@JsonIgnore
	private String primaryPurchaseTaxClass;
	/**
	 * 一次店_仕入消費税率区分
	 */
	@JsonIgnore
	private String primaryPurchaseTaxRateClass;
	/**
	 * 一次店_売上単価
	 */
	@JsonIgnore
	private BigDecimal primaryUnitPrice;
	/**
	 * 一次店_売上金額（税抜）
	 */
	@JsonIgnore
	private BigDecimal primaryUnitPriceTaxOut;
	/**
	 * 一次店_売上金額（消費税額）
	 */
	@JsonIgnore
	private BigDecimal primaryUnitPriceTax;
	/**
	 * 一次店_売上消費税区分
	 */
	@JsonIgnore
	private String primaryUnitPriceTaxClass;
	/**
	 * 一次店_売上消費税率区分
	 */
	@JsonIgnore
	private String primaryUnitPriceTaxRateClass;
	/**
	 * 二次店_R会社コード
	 */
	@JsonIgnore
	@Column(name = "secondary_r_company_code")
	private String secondaryRCompanyCode;

	/**
	 * 二次店_R会社名
	 */
	@JsonIgnore
	@Column(name = "secondary_r_company_name")
	private String secondaryRCompanyName;
	/**
	 * 二次店_販売店ID
	 */
	@JsonIgnore
	private String secondaryDealerContractId;
	/**
	 * 二次店_販売店名
	 */
	@JsonIgnore
	private String secondaryDistributorName;
	/**
	 * 二次店_販売店摘要
	 */
	@JsonIgnore
	private String secondaryDealerSummary;
	/**
	 * 二次店_売上単価
	 */
	@JsonIgnore
	private BigDecimal secondaryUnitPrice;
	/**
	 * 二次店_売上金額（税抜）
	 */
	@JsonIgnore
	private BigDecimal secondaryUnitPriceTaxOut;
	/**
	 * 二次店_売上金額（消費税額）
	 */
	@JsonIgnore
	private BigDecimal secondaryUnitPriceTax;
	/**
	 * 二次店_売上消費税区分
	 */
	@JsonIgnore
	private String secondaryUnitPriceTaxClass;
	/**
	 * 二次店_売上消費税率区分
	 */
	@JsonIgnore
	private String secondaryUnitPriceTaxRateClass;

	/**
	 * R会社コード(帳票出力用)
	 */
	@Transient
	@JsonIgnore
	private String RCompanyCode;

	/**
	 * 販売店(帳票出力用)
	 */
	@Transient
	private String distributorName;

	/**
	 * ページ(帳票出力用)
	 */
	@Transient
	private String page;

	/**
	 * ご請求金額(帳票出力用)
	 */
	@Transient
	private BigDecimal totalPrice;

}
