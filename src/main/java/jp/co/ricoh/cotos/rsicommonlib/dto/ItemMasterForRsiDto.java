package jp.co.ricoh.cotos.rsicommonlib.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Data;

/**
 *
 * 品種マスタ参照用DTO
 *
 */

@Entity
@Data
public class ItemMasterForRsiDto {

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
