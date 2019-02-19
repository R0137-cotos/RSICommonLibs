package jp.co.ricoh.cotos.rsicommonlib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 消費税率情報を表すDto
 */
@Data
public class TaxRateInfo {

	/**
	 * 行番号
	 */
	@JsonProperty(value = "行番号")
	private long rownum;

	/**
	 * マスタ名称
	 */
	@JsonProperty(value = "マスタ名称")
	private String articleName;

	/**
	 * コードの名称
	 */
	@JsonProperty(value = "コードの名称")
	private String displayValue;

	/**
	 * コード値（消費税率）
	 */
	@JsonProperty(value = "コード値（消費税率）")
	private String codeValue;

}
