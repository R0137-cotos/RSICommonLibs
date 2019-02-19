package jp.co.ricoh.cotos.rsicommonlib.dto.CreateAccountingInitialData;

import java.util.Date;

import lombok.Data;

@Data
public class BasicContentsDto {

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

	/**bplats注文番号*/
	private String bplatsRequestNo;

	/**メーカー管理番号*/
	private String makerManageNo;

	/**COTOS管理情報*/
	private CotosManagementInfo cotosManagementInfo;

}
