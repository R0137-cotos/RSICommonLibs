package jp.co.ricoh.cotos.rsicommonlib.dto.result.ImportContractInfo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import jp.co.ricoh.cotos.rsicommonlib.entity.ImportContractInfo.BasicContents;
import lombok.Data;

/**
 * ContractPicSaEmpの拡張項目に格納するための、JSON変換用DTO
 * @author z00se03039
 *
 */
@Data
public class BranchCustomerInfoJsonDto {

	@ApiModelProperty(value = "登録日時", required = true, position = 101, readOnly = true)
	private Date createdAt;

	@ApiModelProperty(value = "登録者", required = true, position = 102, allowableValues = "range[0,255]", readOnly = true)
	private String createdUserId;

	@ApiModelProperty(value = "更新日時", required = true, position = 103, readOnly = true)
	private Date updatedAt;

	@ApiModelProperty(value = "更新者", required = true, position = 104, allowableValues = "range[0,255]", readOnly = true)
	private String updatedUserId;

	@Version
	@ApiModelProperty(value = "version", required = true, position = 105, allowableValues = "range[0,9999999999999999999]")
	private long version;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_customer_info_seq")
	@SequenceGenerator(name = "branch_customer_info_seq", sequenceName = "branch_customer_info_seq", allocationSize = 1)
	private long id;

	/**基本情報*/
	@ManyToOne(optional = false)
	@JoinColumn(name = "basic_contents_id", referencedColumnName = "id")
	@JsonIgnore
	private BasicContents basicContents;

	/**支社コード*/
	private String branchCustoemrCd;

	/**支社名*/
	private String branchCustoemrNm;

	/**課所コード*/
	private String officeCd;

	/**課所名*/
	private String officeNm;

	/**営業コード*/
	private String employeeCd;

	/**営業名*/
	private String employeeNm;

	/**担当営業電話番号*/
	private String employeePhoneNumber;

	/**担当営業メールアドレス*/
	private String employeeMailAddress;

	/**販売店コード*/
	private String distributorCd;

	/**販売店名*/
	private String distributorNm;

	/**OE届け先コード*/
	private String oeDeliveryCd;

	/**販売店区分*/
	private String distributorCustomerType;

	/**販売店担当営業*/
	private String distributorEmployeeNm;

	/**販売店担当営業メールアドレス*/
	private String distributorEmployeeMailAddress;

	/**基本情報ID*/
	private long basicContentsId;
}
