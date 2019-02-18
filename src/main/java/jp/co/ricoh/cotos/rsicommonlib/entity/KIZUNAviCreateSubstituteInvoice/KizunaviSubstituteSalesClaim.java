package jp.co.ricoh.cotos.rsicommonlib.entity.KIZUNAviCreateSubstituteInvoice;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import jp.co.ricoh.cotos.commonlib.dto.result.CommonMasterResult;
import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import jp.co.ricoh.cotos.commonlib.entity.contract.Contract;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * KIZUNAvi代売請求を表すEntity
 * 帳票に出力したい項目が増えた場合、
 * 該当プロパティの@JsonIgnoreを削除すれば出力されるようになります。
 * 参考：KIZUNAviCreateSubstituteInvoice#convertToReportSourcePageDto
 */
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
public class KizunaviSubstituteSalesClaim extends EntityBase {

	//二次店を使う商流区分
	@JsonIgnore
	public static final String USE_SECONDARY_DEALERFLOW = "3";

	//バッチの最初にKizunaviSubstituteSalesClaimPropatiesの値に書き換える
	//普通はstaticはfinalにするけど 仕様変更があるかもしれない&このクラスの中で収めたいので 書き換えられる形にする
	@JsonIgnore
	public static int customerAddressOnelineLength = 40;

	//バッチの最初にKizunaviSubstituteSalesClaimPropatiesの値に書き換える
	//普通はstaticはfinalにするけど 仕様変更があるかもしれない&このクラスの中で収めたいので 書き換えられる形にする
	@JsonIgnore
	public static int itemContractNameOnelineLength = 30;

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

	//	/**
	//	 * 契約ID
	//	 */
	//	@JsonIgnore
	//	private long contractId;

	/**
	 * 契約
	 */
	@OneToOne(optional = false)
	@JoinColumn(name = "contract_id", referencedColumnName = "id")
	@JsonIgnore
	@ApiModelProperty(value = "契約", required = true, position = 24)
	private Contract contract;

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

	/**
	 * ご請求金額(帳票出力用)
	 * お買上金額合計（税込）をそのまま返す。
	 * @return ご請求金額(帳票出力用)
	 */
	public BigDecimal getTotalPrice() {
		return getUnitPriceTaxInTotal();
	}

	/**
	 * 販売店名
	 * 商流区分 = "3"(代売_母店_接点店)なら二次店_販売店名、それ以外は一次店_販売店名を返す。
	 * @return 販売店名
	 */
	public String getDistributorName() {
		if (KizunaviSubstituteSalesClaim.USE_SECONDARY_DEALERFLOW.equals(dealerFlow)) {
			return getSecondaryDistributorName();
		} else {
			return getPrimaryDistributorName();
		}
	}

	/**
	 * R会社コード
	 * 商流区分 = "3"(代売_母店_接点店)なら二次店_R会社コード、それ以外は一次店_R会社コードを返す。
	 * @return R会社コード
	 */
	//		"	"（※１）
	//		以下の条件でR会社コードを抽出(特定)する。 
	//		　※母店については請求書作成対象外とするために必要な処理となる
	//
	//		if (KIZUNAvi代売請求.商流区分 = ""3:代売_母店_接点店"")
	//		    KIZUNAvi代売請求.二次店_R会社コード
	//		else
	//		    KIZUNAvi代売請求.一次店_R会社コード
	public String getRCompanyCode() {
		if (KizunaviSubstituteSalesClaim.USE_SECONDARY_DEALERFLOW.equals(dealerFlow)) {
			return getSecondaryRCompanyCode();
		} else {
			return getPrimaryRCompanyCode();
		}
	}

	/**
	 * 顧客情報_住所_1
	 * 顧客情報_住所を既定の文字数で2分割し、1つめを返す。
	 * @return 顧客情報_住所_1
	 */
	public String getCustomerAddress1() {
		if (getCustomerAddress() == null)
			return null;
		return splitByZenkaku(getCustomerAddress(), KizunaviSubstituteSalesClaim.customerAddressOnelineLength)[0];
	}

	/**
	 * 顧客情報_住所_2
	 * 顧客情報_住所を既定の文字数で2分割し、2つめを返す。
	 * @return 顧客情報_住所_2
	 */
	public String getCustomerAddress2() {
		if (getCustomerAddress() == null)
			return null;
		return splitByZenkaku(getCustomerAddress(), KizunaviSubstituteSalesClaim.customerAddressOnelineLength)[1];
	}

	/**
	 * 品種名1
	 * 品種名を既定の文字数で2分割し、1つめを返す。
	 * @return 品種名1
	 */
	public String getItemContractName1() {
		if (getItemContractName() == null)
			return null;
		return splitByZenkaku(getItemContractName(), KizunaviSubstituteSalesClaim.itemContractNameOnelineLength)[0];
	}

	/**
	 * 品種名2
	 * 品種名を既定の文字数で2分割し、2つめを返す。
	 * @return 品種名2
	 */
	public String getItemContractName2() {
		if (getItemContractName() == null)
			return null;
		return splitByZenkaku(getItemContractName(), KizunaviSubstituteSalesClaim.itemContractNameOnelineLength)[1];
	}

	/**
	 * 取引日文字列(帳票出力用)
	 * MM/ddのフォーマットで返す。
	 * @return
	 */
	public String getTradingDay() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		return sdf.format(tradingDayOrg);
	}

	/**
	 * E/U請求金額（税込）
	 * E/U請求金額（税抜）とE/U請求金額（消費税） を合算して返す。
	 * @return E/U請求金額（税込）
	 */
	public BigDecimal getEuBillingUnitPriceTaxIn() {
		return getEuBillingUnitPriceTaxOut().add(getEuBillingUnitPriceTax());
	}

	/**
	 * お買上金額合計（税込）(帳票出力用)
	 * お買上金額合計（税抜）(帳票出力用)とお買上金額合計（消費税）(帳票出力用)を合算して返す。
	 * @return お買上金額合計（税込）(帳票出力用)
	 */
	public BigDecimal getUnitPriceTaxInTotal() {
		return getUnitPriceTaxOutTotal().add(getUnitPriceTaxTotal());
	}

	/**
	 * 汎用マスタで定義された、費用種別による表示順を返す
	 * @param commonMasterResult 汎用マスタ(費用種別)
	 * @return 表示順
	 */
	//		（※２）
	//		費用種別（初期費/月額(定額)/年額/月額(従量)）の表示順を 汎用マスタ＞汎用マスタ明細から取得する
	public int getDisplayOrderByCostType(CommonMasterResult commonMasterResult) {
		return commonMasterResult.getCommonMasterDetailResultList().stream().filter(e -> e.getCodeValue().equals(getCostType())).findFirst().get().getDisplayOrder();
	}

	/**
	 * 顧客情報_郵便番号
	 * 7文字の場合、3文字目と4文字目の間にハイフンを付与して返す。
	 * @return 顧客情報_郵便番号
	 */
	public String getCustomerPostalCode() {
		if (customerPostalCode != null && customerPostalCode.length() == 7) {
			return customerPostalCode.substring(0, 3) + "-" + customerPostalCode.substring(3, 7);
		} else {
			return customerPostalCode;
		}
	}

	/**
	 * MoM企事部ID
	 * @return
	 */
	public String getMomCustId() {
		return this.contract.getCustomerContract().getMomCustId();
	}

	/**
	 * 契約ID
	 * @return
	 */
	public long getContactId() {
		return this.contract.getId();
	}

	/**
	 * 文字列を、指定された全角文字数で2分割して返す。
	 * @param s 文字列
	 * @param firstStringLength 全角文字数
	 * @return 分割した文字数配列
	 */
	private String[] splitByZenkaku(String s, int firstStringLength) {
		String[] ret = new String[2];
		StringBuilder first = new StringBuilder();
		StringBuilder second = new StringBuilder();

		Map<String, Double> temp = new HashMap<>();
		temp.put("temp", 0d);

		s.chars().mapToObj(i -> (char) i).forEach(c -> {
			if ((c <= '\u007e') || // 英数字
					(c == '\u00a5') || // \記号
					(c == '\u203e') || // ~記号
					(c >= '\uff61' && c <= '\uff9f') // 半角カナ
			) {
				temp.put("temp", temp.get("temp") + 0.5d);
			} else {
				temp.put("temp", temp.get("temp") + 1d);
			}
			if (firstStringLength < temp.get("temp")) {
				second.append(c.toString());
			} else {
				first.append(c.toString());
			}
		});
		ret[0] = first.toString();
		ret[1] = second.toString();

		return ret;
	}
}
