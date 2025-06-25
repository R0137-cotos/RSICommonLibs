package jp.co.ricoh.cotos.rsicommonlib.dto;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jp.co.ricoh.cotos.commonlib.entity.EnumType.ApplicationStatus;
import lombok.Data;

/**
 * Contractの拡張項目に格納するための、JSON変換用Dto
 *
 */
@Data
public class BasicContentsJsonDto {

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

	/**基本情報ID*/
	private long id;

	/**対象システム*/
	private String targetSys;

	/**bplats注文番号*/
	private String bplatsRequestNo;

	/**メーカー管理番号*/
	private String makerManageNo;

	/**契約名称サービス名*/
	private String contractNm;

	/**申込日*/
	@Temporal(TemporalType.DATE)
	private Date orderDate;

	/**サービス開始日*/
	@Temporal(TemporalType.DATE)
	private Date serviceStartDate1;

	/**解約予定日*/
	@Temporal(TemporalType.DATE)
	private Date cancelExpectDate;

	/**申請ステータス*/
	private ApplicationStatus applicationStatus;

	/**契約作成日*/
	@Temporal(TemporalType.DATE)
	private Date contractCreateDate;

	/**更新期間*/
	private String updateInterval;

	/**課金開始日*/
	@Temporal(TemporalType.DATE)
	private Date paymentStartDate;

	/**商流区分*/
	private String commercialDistribute;

	/**NetRicoh会員ID*/
	private String netricohAccount;

	/**テナントID*/
	private String tenantId;

	/**zuoraアカウントId*/
	private String zuoraAccountId;

	/**契約開始日*/
	@Temporal(TemporalType.DATE)
	private Date contractStartDate;

	/**申請作成日*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDateTime;

	/**申請更新日*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDateTime;

}
