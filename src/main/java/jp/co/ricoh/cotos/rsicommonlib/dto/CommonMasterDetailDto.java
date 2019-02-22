package jp.co.ricoh.cotos.rsicommonlib.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CommonMasterDetailDto {

	@Id
	private long id;

	/**コード値**/
	private String codeValue;

}
