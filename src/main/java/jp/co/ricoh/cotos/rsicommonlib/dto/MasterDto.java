package jp.co.ricoh.cotos.rsicommonlib.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 *
 * MoM参照用DTO
 *
 */

@Entity
@Data
public class MasterDto {

	@Id
	private long id;

	/**
	 * 基本情報ID
	 */
	private long basicId;

	/**
	 * 契約者情報ID
	 */
	private long contractorId;

	/**
	 * 契約担当者情報ID
	 */
	private long branchCustomerId;

	/**
	 * 販売店情報ID
	 */
	private Long distributorId;

	/**
	 * 母店情報
	 */
	private Long parentId;

	/**
	 * 顧客_MoM顧客システム連携ID
	 */
	private String mclMomRelId;

	/**
	 * 顧客_企事部設定区分
	 */
	private String prflKjbSetKbn;

	/**
	 * 事業所ID
	 */
	private String prflMomJgsId;

	/**
	 * 担当社員ID
	 */
	private String empId;

	/**
	 * 販売店_企事部システム連携ID
	 */
	private String cuicCompanyId;

	/**
	 * 母店_企事部システム連携ID
	 */
	private String parentCuicCompanyId;

	/**
	 * 販売店_販社コード
	 */
	private String hanshCd;

	/**
	 * 販売店_RINGS得意先コード
	 */
	private String ringsTkiskCd;

	/**
	 * 母店_販社コード
	 */
	private String parentHanshCd;

	/**
	 * 母店_RINGS得意先コード
	 */
	private String parentRingsTkiskCd;

}
