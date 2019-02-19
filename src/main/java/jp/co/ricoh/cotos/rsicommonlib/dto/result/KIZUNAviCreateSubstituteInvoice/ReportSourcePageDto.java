package jp.co.ricoh.cotos.rsicommonlib.dto.result.KIZUNAviCreateSubstituteInvoice;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*
 * 帳票ページDTO
 */
public class ReportSourcePageDto {
	/*
	 * SVFフォームファイルパス
	 */
	private String formFilePath;

	/*
	 * 帳票データ部マッピング
	 */
	private Map<String, List<String>> dataMapList;
}