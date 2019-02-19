package jp.co.ricoh.cotos.rsicommonlib.dto.ImportApplicationInfo;

import lombok.Data;

/**
 *
 * 品種マスタ参照用DTO
 *
 */

@Data
public class ItemMasterDto {

	private long id;

	/**
	 * 契約情報ID
	 */
	private long contractId;

	/**
	 * 費用種別
	 */
	private String costType;

}
