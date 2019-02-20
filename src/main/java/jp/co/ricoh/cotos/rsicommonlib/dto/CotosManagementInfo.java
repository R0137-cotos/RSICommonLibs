package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CotosManagementInfo {

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

	private long id;

	/**
	 * 基本情報ID
	 */
	@JsonIgnore
	private BasicContentsDto basicContentsDto;

	/**イニシャル計上処理フラグ**/
	@JsonProperty("イニシャル計上処理フラグ")
	private String initialCostProcessingFlg;

}
