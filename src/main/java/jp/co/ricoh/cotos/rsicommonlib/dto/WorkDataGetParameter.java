package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * ジョブステップ３の処理で使用するパラメータ情報
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkDataGetParameter {

	/** 計上データのデータ番号の開始値 */
	private long startNo;

	/** 計上データのデータ番号の終了値 */
	private long endNo;

	/** 商品グループマスタID */
	private long productGrpMasterId;

	/** 請求年月（yyyyMM01） */
	private String billingDate;

}
