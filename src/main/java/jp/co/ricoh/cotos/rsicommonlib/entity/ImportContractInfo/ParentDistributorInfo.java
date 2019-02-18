package jp.co.ricoh.cotos.rsicommonlib.entity.ImportContractInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jp.co.ricoh.cotos.commonlib.entity.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "parent_distributor_info")
@Data
@EqualsAndHashCode(callSuper = true)
public class ParentDistributorInfo extends EntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parent_distributor_info_seq")
	@SequenceGenerator(name = "parent_distributor_info_seq", sequenceName = "parent_distributor_info_seq", allocationSize = 1)
	private long id;

	/**基本情報*/
	@ManyToOne(optional = false)
	@JoinColumn(name = "basic_contents_id", referencedColumnName = "id")
	@JsonIgnore
	private BasicContents basicContents;

	/**母店販売店コード*/
	private String parentDistributorCd;

	/**母店名*/
	private String parentDistributorNm;

	/**OE届け先コード*/
	private String parentOeDeliveryCd;

	/**Rings得意先コード*/
	private String parentRingsCustomerCd;

	/**取引先コード（手数料用）*/
	private String parentDistributorRtcCd;

	/**MoM会社ID*/
	private String distributorMomCmpId;

	/**MoM販売店識別コード*/
	private String distributorMomShikiCd;

	/**MoM組織ID*/
	private String distributorMomSoshikiId;

	/**MoMデポコード*/
	private String distributorMomDepoCd;

}
