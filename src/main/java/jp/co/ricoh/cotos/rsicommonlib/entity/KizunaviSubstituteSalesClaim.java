package jp.co.ricoh.cotos.rsicommonlib.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * KIZUNAvi代売請求を表すEntity
 */
@Entity
@Table(name = "kizunavi_substitute_sales_claim")
@EqualsAndHashCode(callSuper = true)
@Data
public class KizunaviSubstituteSalesClaim extends EntityBase {

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
	@JsonProperty("計上ID")
	private long accountingId;
	/**
	 * RJ管理番号
	 */
	@JsonProperty("RJ管理番号")
	private String rjManagementNumber;
	/**
	 * 契約ID
	 */
	@JsonProperty("契約ID")
	private long contractId;
	/**
	 * 契約明細ID
	 */
	@JsonProperty("契約明細ID")
	private long contractDetailId;
	/**
	 * 請求年月
	 */
	@JsonProperty("請求年月")
	private Date claimDate;
	/**
	 * 請求書番号
	 */
	@JsonProperty("請求書番号")
	private String invoiceNumber;
	/**
	 * サービス期間開始日
	 */
	@JsonProperty("サービス期間開始日")
	private Date serviceStartDate;
	/**
	 * サービス期間終了日
	 */
	@JsonProperty("サービス期間終了日")
	private Date serviceEndDate;
	/**
	 * 品種名
	 */
	@JsonProperty("品種名")
	private String itemContractName;
	/**
	 * リコー品種コード
	 */
	@JsonProperty("リコー品種コード")
	private String ricohItemCode;
	/**
	 * 品種区分
	 */
	@JsonProperty("品種区分")
	private String itemType;
	/**
	 * 費用種別
	 */
	@JsonProperty("費用種別")
	private String costType;
	/**
	 * 商流区分
	 */
	@JsonProperty("商流区分")
	private String dealerFlow;
	/**
	 * テナントID
	 */
	@JsonProperty("テナントID")
	private String tenantId;
	/**
	 * 顧客情報_郵便番号
	 */
	@JsonProperty("顧客情報_郵便番号")
	private String customerPostalCode;
	/**
	 * 顧客情報_住所
	 */
	@JsonProperty("顧客情報_住所")
	private String customerAddress;
	/**
	 * 顧客情報_会社名
	 */
	@JsonProperty("顧客情報_会社名")
	private String customerCompanyName;
	/**
	 * 顧客情報_電話番号
	 */
	@JsonProperty("顧客情報_電話番号")
	private String customerTel;
	/**
	 * 顧客情報_ MoM企業ID
	 */
	@JsonProperty("顧客情報_ MoM企業ID")
	private String customerMomCompanyId;
	/**
	 * 取引日
	 */
	@JsonProperty("取引日")
	private Date tradingDay;
	/**
	 * 注文番号
	 */
	@JsonProperty("注文番号")
	private String orderNumber;
	/**
	 * R請求書摘要
	 */
	@JsonProperty("R請求書摘要")
	private String rInvoiceSummary;
	/**
	 * 作成日
	 */
	@JsonProperty("rInvoiceSummary")
	private Date createdDate;
	/**
	 * 数量
	 */
	@JsonProperty("数量")
	private Long quantity;
	/**
	 * E/U請求単価
	 */
	@JsonProperty("E/U請求単価")
	private BigDecimal euBillingUnitPrice;
	/**
	 * E/U請求金額（税抜）
	 */
	@JsonProperty("E/U請求金額（税抜）")
	private BigDecimal euBillingUnitPriceTaxOut;
	/**
	 * E/U請求金額（消費税額）
	 */
	@JsonProperty("E/U請求金額（消費税額）")
	private BigDecimal euBillingUnitPriceTax;
	/**
	 * E/U請求消費税区分
	 */
	@JsonProperty("E/U請求消費税区分")
	private String euBillingUnitPriceTaxClass;
	/**
	 * E/U請求消費税率区分
	 */
	@JsonProperty("E/U請求消費税率区分")
	private String euBillingUnitPriceTaxRateClass;
	/**
	 * 一次店_R会社コード
	 */
	@JsonProperty("一次店_R会社コード")
	@Column(name = "primary_r_company_code")
	private String primaryRCompanyCode;
	/**
	 * 一次店_R会社名
	 */
	@JsonProperty("一次店_R会社名")
	@Column(name = "primary_r_company_name")
	private String primaryRCompanyName;
	/**
	 * 一次店_販売店ID
	 */
	@JsonProperty("一次店_販売店ID")
	private String primaryDealerContractId;
	/**
	 * 一次店_販売店名
	 */
	@JsonProperty("一次店_販売店名")
	private String primaryDistributorName;
	/**
	 * 一次店_販売店摘要
	 */
	@JsonProperty("一次店_販売店摘要")
	private String primaryDealerSummary;
	/**
	 * 一次店_ MoM企業ID
	 */
	@JsonProperty("一次店_ MoM企業ID")
	private String primaryMomCompanyId;
	/**
	 * 一次店_仕入単価
	 */
	@JsonProperty("一次店_仕入単価")
	private BigDecimal primaryPurchasePrice;
	/**
	 * 一次店_仕入金額（税抜）
	 */
	@JsonProperty("一次店_仕入金額（税抜）")
	private BigDecimal primaryPurchaseTaxOut;
	/**
	 * 一次店_仕入金額（消費税額）
	 */
	@JsonProperty("一次店_仕入金額（消費税額）")
	private BigDecimal primaryPurchaseTax;
	/**
	 * 一次店_仕入消費税区分
	 */
	@JsonProperty("一次店_仕入消費税区分")
	private String primaryPurchaseTaxClass;
	/**
	 * 一次店_仕入消費税率区分
	 */
	@JsonProperty("一次店_仕入消費税率区分")
	private String primaryPurchaseTaxRateClass;
	/**
	 * 一次店_売上単価
	 */
	@JsonProperty("一次店_売上単価")
	private BigDecimal primaryUnitPrice;
	/**
	 * 一次店_売上金額（税抜）
	 */
	@JsonProperty("一次店_売上金額（税抜）")
	private BigDecimal primaryUnitPriceTaxOut;
	/**
	 * 一次店_売上金額（消費税額）
	 */
	@JsonProperty("一次店_売上金額（消費税額）")
	private BigDecimal primaryUnitPriceTax;
	/**
	 * 一次店_売上消費税区分
	 */
	@JsonProperty("一次店_売上消費税区分")
	private String primaryUnitPriceTaxClass;
	/**
	 * 一次店_売上消費税率区分
	 */
	@JsonProperty("一次店_売上消費税率区分")
	private String primaryUnitPriceTaxRateClass;
	/**
	 * 二次店_R会社コード
	 */
	@JsonProperty("二次店_R会社コード")
	@Column(name = "secondary_r_company_code")
	private String secondaryRCompanyCode;

	/**
	 * 二次店_R会社名
	 */
	@JsonProperty("二次店_R会社名")
	@Column(name = "secondary_r_company_name")
	private String secondaryRCompanyName;
	/**
	 * 二次店_販売店ID
	 */
	@JsonProperty("二次店_販売店ID")
	private String secondaryDealerContractId;
	/**
	 * 二次店_販売店名
	 */
	@JsonProperty("二次店_販売店名")
	private String secondaryDistributorName;
	/**
	 * 二次店_販売店摘要
	 */
	@JsonProperty("二次店_販売店摘要")
	private String secondaryDealerSummary;
	/**
	 * 二次店_ MoM企業ID
	 */
	@JsonProperty("二次店_ MoM企業ID")
	private String secondaryMomCompanyId;
	/**
	 * 二次店_売上単価
	 */
	@JsonProperty("二次店_売上単価	")
	private BigDecimal secondaryUnitPrice;
	/**
	 * 二次店_売上金額（税抜）
	 */
	@JsonProperty("二次店_売上金額（税抜）")
	private BigDecimal secondaryUnitPriceTaxOut;
	/**
	 * 二次店_売上金額（消費税額）
	 */
	@JsonProperty("二次店_売上金額（消費税額）")
	private BigDecimal secondaryUnitPriceTax;
	/**
	 * 二次店_売上消費税区分
	 */
	@JsonProperty("二次店_売上消費税区分")
	private String secondaryUnitPriceTaxClass;
	/**
	 * 二次店_売上消費税率区分
	 */
	@JsonProperty("二次店_売上消費税率区分")
	private String secondaryUnitPriceTaxRateClass;

}
