package jp.co.ricoh.cotos.rsicommonlib.dto.result.ImportApplicationInfo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * 
 * 品種マスタ参照用DTO
 * 
 */

@Entity
@Data
public class ItemMasterDto {

	@Id
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
