package jp.co.ricoh.cotos.rsicommonlib.dto.result.CreateAccountingInitialData;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CommonMasterDetailDto {

	@Id
	private long id;

	/**コード値**/
	private String codeValue;

}
