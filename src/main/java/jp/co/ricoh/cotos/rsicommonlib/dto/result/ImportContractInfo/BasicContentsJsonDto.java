package jp.co.ricoh.cotos.rsicommonlib.dto.result.ImportContractInfo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import io.swagger.annotations.ApiModelProperty;
import jp.co.ricoh.cotos.rsicommonlib.entity.ImportContractInfo.BasicContents.ApplicationStatus;
import lombok.Data;

/**
 * Contractの拡張項目に格納するための、JSON変換用DTO
 *
 */
@Entity
@Data
public class BasicContentsJsonDto {

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

	/**基本情報ID*/
	@Id
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
