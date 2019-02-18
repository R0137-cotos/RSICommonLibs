package jp.co.ricoh.cotos.rsicommonlib.entity.ZuoraGetExportInvoice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;
import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import jp.co.ricoh.cotos.util.ExpectedNotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 売上計算結果WORKテーブルのエンティティ
 * \@ExpectedNotNullを付与したフィールドは、\@ApiModelPropertyを定義しないとnullチェックに失敗する可能性があります。
 * @author z00se03039
 */
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "sales_calc_result_work")
public class SalesCalcResultWork extends EntityBase {

	public enum CotosProcessingFlg {

		未処理("0"), 処理済み("1"), 処理不可("E1"), 計上不可("E2");

		private final String text;

		private CotosProcessingFlg(final String text) {
			this.text = text;
		}

		@Override
		@JsonValue
		public String toString() {
			return this.text;
		}

		@JsonCreator
		public static CotosProcessingFlg fromString(String string) {
			return Arrays.stream(values()).filter(v -> v.text.equals(string)).findFirst().orElseThrow(() -> new IllegalArgumentException(String.valueOf(string)));
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sales_calc_result_work_seq")
	@SequenceGenerator(name = "sales_calc_result_work_seq", sequenceName = "sales_calc_result_work_seq", allocationSize = 1)
	@ApiModelProperty(value = "ID", required = true, position = 1, allowableValues = "range[0,9999999999999999999]")
	private long id;

	/**請求情報 ID*/
	@ApiModelProperty(value = "請求情報 ID", required = false, position = 2, allowableValues = "range[0,9999999999999999999]")
	@JsonProperty("Invoice.Id")
	private String invoiceId;

	/**請求日*/
	@ApiModelProperty(value = "請求日", required = false, position = 3)
	@JsonProperty("Invoice.InvoiceDate")
	private Date invoicedate;

	/**請求金額（税抜き）*/
	@ApiModelProperty(value = "請求金額（税抜き）", required = false, position = 4, allowableValues = "range[0,9999999999999999999]")
	@JsonProperty("Invoice.AmountWithoutTax")
	private BigDecimal amountwithouttax;

	/**請求情報作成日*/
	@ApiModelProperty(value = "請求情報作成日", required = false, position = 5)
	@JsonProperty("Invoice.CreatedDate")
	private Date createddate;

	/**請求明細 ID*/
	@ApiModelProperty(value = "請求明細 ID", required = false, position = 6, allowableValues = "range[0,9999999999999999999]")
	@JsonProperty("InvoiceItem.Id")
	private String invoiceitemId;

	/**請求明細 課金日*/
	@ApiModelProperty(value = "請求明細 課金日", required = false, position = 7)
	@JsonProperty("InvoiceItem.ChargeDate")
	private Date invoiceitemChargedate;

	/**請求明細 単価*/
	@ApiModelProperty(value = "請求明細 単価", required = false, position = 8, allowableValues = "range[0,9999999999999999999]")
	@JsonProperty("InvoiceItem.UnitPrice")
	@ExpectedNotNull
	private BigDecimal invoiceitemUnitprice;

	/**請求明細 数量*/
	@ApiModelProperty(value = "請求明細 数量", required = false, position = 9, allowableValues = "range[0,99999]")
	@JsonProperty("InvoiceItem.Quantity")
	private Integer invoiceitemQuantity;

	/**請求明細 金額*/
	@ApiModelProperty(value = "請求明細 金額", required = false, position = 10, allowableValues = "range[0,9999999999999999999]")
	@JsonProperty("InvoiceItem.ChargeAmount")
	@ExpectedNotNull
	private BigDecimal invoiceitemChargeamount;

	/**請求明細 作成日*/
	@ApiModelProperty(value = "請求明細 作成日", required = false, position = 11)
	@JsonProperty("InvoiceItem.CreatedDate")
	private Date invoiceitemCreateddate;

	/**品名*/
	@Size(max = 255)
	@ApiModelProperty(value = "品名", required = false, position = 12, allowableValues = "range[0,255]")
	@JsonProperty("ProductRatePlanCharge.Name")
	private String productrateplanchargeName;

	/**リコー品種コード*/
	@Size(max = 255)
	@JsonProperty("ProductRatePlanCharge.PRC_EDPCode__c")
	@Column(name = "productrateplancharge_prc_edpcode_c")
	@ApiModelProperty(value = "リコー品種コード", required = false, position = 13, allowableValues = "range[0,255]")
	@ExpectedNotNull
	private String productrateplanchargePrcEdpcodeC;

	/**サービス期間.開始日*/
	@ApiModelProperty(value = "サービス期間.開始日", required = false, position = 14)
	@JsonProperty("InvoiceItem.ServiceStartDate")
	@ExpectedNotNull
	private Date invoiceitemServicestartdate;

	/**サービス期間.終了日*/
	@ApiModelProperty(value = "サービス期間.終了日", required = false, position = 15)
	@JsonProperty("InvoiceItem.ServiceEndDate")
	@ExpectedNotNull
	private Date invoiceitemServiceenddate;

	/**月額DB　契約ID*/
	@Size(max = 255)
	@ApiModelProperty(value = "月額DB　契約ID", required = false, position = 16, allowableValues = "range[0,255]")
	@JsonProperty("Subscription.SUB_SubscriptionRegionalId__c")
	@ExpectedNotNull
	private String rjManagementNumber;

	/**使用量*/
	@ApiModelProperty(value = "使用量", required = false, position = 17, allowableValues = "range[0,99999]")
	@JsonProperty("Usage.Quantity")
	private Integer usageQuantity;

	/**COTOS処理フラグ*/
	@ApiModelProperty(value = "COTOS処理フラグ", required = false, position = 16, allowableValues = "range[0,255]")
	private CotosProcessingFlg cotosProcessingFlg;

	/**
	 * 契約情報と紐づけるためのキー。
	 * リコー品種コードとRJ管理番号をハイフンでつなぐ
	 * @return
	 */
	@JsonIgnore
	public String getContractMergeKey() {
		return getProductrateplanchargePrcEdpcodeC() + "-" + getRjManagementNumber();
	}

}
