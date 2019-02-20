package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 一次店または二次店の販売店情報
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DistributorInfoForAccountingCreateRsiRunnging {

	/** MoM会社ID */
	private String momCmpId;

	/** MoMデポコード */
	private String momDepoCd;

	/** 販売店コード */
	private String distributorCd;

	/** 販売店名 */
	private String dealerName;

	/** OE届け先コード */
	private String oeDeliveryCd;

	/** RINGS届先コード */
	private String ringsTodokesakiCd;

	/** OE届け先コード*/
	private String subOeDeliveryCd;

	/**RINGS届先コード*/
	private String subRingsTodokesakiCd;
}
