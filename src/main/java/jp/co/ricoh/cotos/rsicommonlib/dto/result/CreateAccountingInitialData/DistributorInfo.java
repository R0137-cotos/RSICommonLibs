package jp.co.ricoh.cotos.rsicommonlib.dto.result.CreateAccountingInitialData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 一次店または二次店の販売店情報
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistributorInfo {

	/**OE届け先コード**/
	private String oeDeliveryCd;

	/**販売店名**/
	private String distributorCd;

	/**MoM会社ID**/
	private String distributorMomCmpId;

	/**商流順**/
	private String dealerFlowOrder;

	/**販売店名**/
	private String dealerName;

	/**RINGS届先コード**/
	private String ringsTodokesakiCd;

	/**OE届け先コード(OE届先コードがない場合)**/
	private String subOeDeliveryCd;

	/**RINGS届先コード(OE届先コードがない場合)**/
	private String subRingsTodokesakiCd;

}
