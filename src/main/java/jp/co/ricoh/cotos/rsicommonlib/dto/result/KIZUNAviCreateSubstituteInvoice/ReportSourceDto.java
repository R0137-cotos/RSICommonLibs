package jp.co.ricoh.cotos.rsicommonlib.dto.result.KIZUNAviCreateSubstituteInvoice;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportSourceDto {
	/*
	 * 出力PDFファイルパス
	 */
	private String fileName;

	/*
	 * 帳票ページDTO配列
	 */
	private List<ReportSourcePageDto> reportList;
}