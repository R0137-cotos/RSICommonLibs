package jp.co.ricoh.cotos.rsicommonlib.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CommonMasterDetailDto {

	@Id
	private long id;

	/**コード値**/
	private String codeValue;

}
