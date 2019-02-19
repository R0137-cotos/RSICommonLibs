package jp.co.ricoh.cotos.rsicommonlib.dto.parameter.CreateAccountingInitialData;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ContractDto {

	@Id
	private long id;

	/**RJ管理番号**/
	private String rjManageNumber;

	/**契約ID**/
	private long contractId;

	/**契約明細ID**/
	private String contractDetailId;

	/**商流区分**/
	private String commercialFlowDiv;

	/**費用種別**/
	private String costType;

	/**品種区分**/
	private String itemType;

	/**サービス期間開始日**/
	private String serviceTermStart;

	/**サービス期間終了日**/
	private String serviceTermEnd;

	/**WEB受注注文番号**/
	private String webOrderNumber;

	/**リコー品種コード**/
	private String ricohItemCode;

	/**品種名**/
	private String itemContractName;

	/**仕入取引先コード**/
	private String bpCd;

	/**得意先コード**/
	private String billingCustomerSpCode;

	/**数量**/
	private String quantity;

	/**仕切価格**/
	private String partitionPrice;

	/**見積金額**/
	private String amountSummary;

	/**RJ仕入価格**/
	private String rjPurchasePrice;

	/**RJ仕切価格**/
	private String rjDividingPrice;

	/**母店売価**/
	private String motherStorePrice;

	/**R原価**/
	private String rCost;

	/**OE届け先コード1**/
	private String oeDeliveryCd1;

	/**OE届け先コード2**/
	private String oeDeliveryCd2;

	/**販売店コード1**/
	private String distributorCd1;

	/**販売店コード2**/
	private String distributorCd2;

	/**MoM会社ID1**/
	private String distributorMomCmpId1;

	/**MoM会社ID2**/
	private String distributorMomCmpId2;

	/**商流順1**/
	private String dealerFlowOrder1;

	/**商流順2**/
	private String dealerFlowOrder2;

	/**販売店名1**/
	private String dealerName1;

	/**販売店名2**/
	private String dealerName2;

	/**RINGS得意先コード1**/
	private String ringsCustomerCd1;

	/**RINGS得意先コード2**/
	private String ringsCustomerCd2;

	/**RINGS届先コード1**/
	private String ringsTodokesakiCd1;

	/**RINGS届先コード2**/
	private String ringsTodokesakiCd2;

	/**OE届け先コード3**/
	private String oeDeliveryCd3;

	/**OE届け先コード4**/
	private String oeDeliveryCd4;

	/**RINGS届先コード3**/
	private String ringsTodokesakiCd3;

	/**RINGS届先コード4**/
	private String ringsTodokesakiCd4;

	/** 拡張項目 */
	private String extendsParameter;

	/** 拡張項目(契約担当SA社員) */
	private String empExtendsParameter;

}
