package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jp.co.ricoh.cotos.rsicommonlib.entity.BasicContents;
import lombok.Data;

/**
 * ContractPicSaEmpの拡張項目に格納するための、JSON変換用DTO
 * @author z00se03039
 *
 */
@Data
public class BranchCustomerInfoJsonDto {

	/**
	 * 登録日時
	 */
	private Date createdAt;

	/**
	 * 登録者
	 */
	private String createdUserId;

	/**
	 * 更新日時
	 */
	private Date updatedAt;

	/**
	 * 更新者
	 */
	private String updatedUserId;

	/**
	 * version
	 */
	private long version;

	private long id;

	/**基本情報*/
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
