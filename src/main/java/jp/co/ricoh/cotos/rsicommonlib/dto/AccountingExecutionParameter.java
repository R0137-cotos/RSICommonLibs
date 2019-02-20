package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 計上処理で使用するパラメータ情報
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountingExecutionParameter {

	/** 計上処理の元となる売上計算結果WORKのEntity */
	private SalesCalcResultWorkForRsiRunning work;

	/** 処理実行日（yyyyMMdd） */
	private String startupDate;

	/** システム日付（yyyyMMdd） */
	private String sysDate;

	/** システム日付（yyyyMMdd） */
	private String sysTime;

	/** 基準日（yyyyMMdd）（月額、年額） */
	private String baseDateFixed;

	/** 基準日（yyyyMMdd）（従量） */
	private String baseDateFee;

	/** 消費税情報（月額、年額） */
	private TaxRateInfo taxRateInfoFixed;

	/** 消費税情報（従量） */
	private TaxRateInfo taxRateInfoFee;

	/** 販売店情報（母店） */
	private DistributorInfoForAccountingCreateRsiRunnging distributorInfoMother;

	/** 販売店情報（接点店） */
	private DistributorInfoForAccountingCreateRsiRunnging distributorInfo;

}
