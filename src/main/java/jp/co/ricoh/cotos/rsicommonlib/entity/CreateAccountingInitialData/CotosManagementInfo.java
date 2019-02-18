package jp.co.ricoh.cotos.rsicommonlib.entity.CreateAccountingInitialData;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class CotosManagementInfo extends EntityBase {

	@Id
	private long id;

	/**
	 * 基本情報ID
	 */
	@OneToOne(optional = false)
	@JoinColumn(name = "basic_contents_id", referencedColumnName = "id")
	@ApiModelProperty(value = "基本情報", required = true)
	@JsonIgnore
	private BasicContents basicContents;

	/**イニシャル計上処理フラグ**/
	@JsonProperty("イニシャル計上処理フラグ")
	private String initialCostProcessingFlg;

}
