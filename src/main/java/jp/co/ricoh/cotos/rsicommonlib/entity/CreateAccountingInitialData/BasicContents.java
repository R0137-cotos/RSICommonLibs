package jp.co.ricoh.cotos.rsicommonlib.entity.CreateAccountingInitialData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicContents extends EntityBase {

	/**基本情報ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basic_contents_seq")
	@SequenceGenerator(name = "basic_contents_seq", sequenceName = "basic_contents_seq", allocationSize = 1)
	private long id;

	/**bplats注文番号*/
	private String bplatsRequestNo;

	/**メーカー管理番号*/
	private String makerManageNo;

	/**COTOS管理情報*/
	@OneToOne(mappedBy = "basicContents")
	private CotosManagementInfo cotosManagementInfo;

}
