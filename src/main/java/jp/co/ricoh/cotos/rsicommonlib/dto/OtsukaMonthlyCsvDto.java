package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;

import jp.co.ricoh.cotos.rsicommonlib.dto.OtsukaMonthlyCsvDto.OtsukaMonthlyCsvPK;
import lombok.Data;

/**
 * 大塚商会様送付用 利用データ標準ファイルデータDTO.
 */
@Data
@Entity
@IdClass(OtsukaMonthlyCsvPK.class)
@JsonPropertyOrder({ "サービス契約識別キー1", "サービス契約識別キー2", "サービス契約識別キー3", "契約番号", "設置先管理番号", "サービス契約ID", "サービス契約オプションID", "サービスコード", "料金プランコード", "オプションコード", "料金コード", "利用データ種別", "量", "利用年月", "利用年月日", "利用時間", "付帯情報1", "付帯情報2", "付帯情報3", "ファイル作成プログラム", "ファイル作成ユーザー", "ファイル作成日時" })
public class OtsukaMonthlyCsvDto implements Serializable {
	private static final long serialVersionUID = 1L;

	/** サービス契約識別キー1. */
	@Id
	@Column(name = "W_NUMBER")
	@JsonProperty("サービス契約識別キー1")
	@JsonRawValue
	private String contractIdentificationKey1;

	/** サービス契約識別キー2. */
	@Id
	@Column(name = "PRODUCT_TYPE_CD")
	@JsonProperty("サービス契約識別キー2")
	@JsonRawValue
	private String contractIdentificationKey2;

	/** サービス契約識別キー3. */
	@Transient
	@JsonProperty("サービス契約識別キー3")
	@JsonRawValue
	private String contractIdentificationKey3;

	/** 契約番号. */
	@Transient
	@JsonProperty("契約番号")
	@JsonRawValue
	private String contractNumber;

	/** 設置先管理番号. */
	@Transient
	@JsonProperty("設置先管理番号")
	@JsonRawValue
	private String installationLocationNumber;

	/** サービス契約ID. */
	@Transient
	@JsonProperty("サービス契約ID")
	@JsonRawValue
	private String contractId;

	/** サービス契約オプションID. */
	@Transient
	@JsonProperty("サービス契約オプションID")
	@JsonRawValue
	private String contractOptionId;

	/** サービスコード. */
	@Column(name = "SERVICE_CODE")
	@JsonProperty("サービスコード")
	@JsonRawValue
	private String serviceCode;

	/** 料金プランコード. */
	@Transient
	@JsonProperty("料金プランコード")
	@JsonRawValue
	private String ratePlanCode;

	/** オプションコード. */
	@Transient
	@JsonProperty("オプションコード")
	@JsonRawValue
	private String optionCode;

	/** 料金コード. */
	@Transient
	@JsonProperty("料金コード")
	@JsonRawValue
	private String rateCode;

	/** 利用データ種別. */
	@Column(name = "USE_DATA_TYPE_LABEL")
	@JsonProperty("利用データ種別")
	@JsonRawValue
	private String useDataTypeLabel;

	/** 量. */
	@Column(name = "FFM_USER_SALES_CNT")
	@JsonProperty("量")
	@JsonRawValue
	private int salesCount;

	/** 利用年月. */
	@Column(name = "USAGE_YEAR_MONTH")
	@JsonProperty("利用年月")
	@JsonRawValue
	private String serviceUsageYearMonth;

	/** 利用年月日. */
	@Transient
	@JsonProperty("利用年月日")
	@JsonRawValue
	private String serviceUsageDate;

	/** 利用時間. */
	@Transient
	@JsonProperty("利用時間")
	@JsonRawValue
	private String serviceUsageTime;

	/** 付帯情報1. */
	@Column(name = "COMPANY_NAME")
	@JsonProperty("付帯情報1")
	@JsonRawValue
	private String additionalInfo1;

	/** 付帯情報2. */
	@Column(name = "RJ_MANAGE_NUMBER")
	@JsonProperty("付帯情報2")
	@JsonRawValue
	private String additionalInfo2;

	/** 付帯情報3. */
	@Column(name = "PRODUCT_TYPE_NAME")
	@JsonProperty("付帯情報3")
	@JsonRawValue
	private String additionalInfo3;

	/** ファイル作成プログラム. */
	@Transient
	@JsonProperty("ファイル作成プログラム")
	@JsonRawValue
	private String createdApplication;

	/** ファイル作成ユーザー. */
	@Transient
	@JsonProperty("ファイル作成ユーザー")
	@JsonRawValue
	private String createdUser;

	/** ファイル作成日時. */
	@Column(name = "FILE_CREATED_DATE_TIME")
	@JsonProperty("ファイル作成日時")
	@JsonRawValue
	private String createdDateTime;

	@Data
	@Embeddable
	public static class OtsukaMonthlyCsvPK implements Serializable {
		private static final long serialVersionUID = 1L;

		/** サービス契約識別キー1. */
		@Column(name = "W_NUMBER")
		private String contractIdentificationKey1;

		/** サービス契約識別キー2. */
		@Column(name = "PRODUCT_TYPE_CD")
		private String contractIdentificationKey2;
	}
}
