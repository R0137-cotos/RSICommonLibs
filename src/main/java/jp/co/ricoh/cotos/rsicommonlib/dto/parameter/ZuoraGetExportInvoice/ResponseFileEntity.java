package jp.co.ricoh.cotos.rsicommonlib.dto.parameter.ZuoraGetExportInvoice;

import lombok.Data;

/**
 * レスポンスをファイルに書き出すためのエンティティ。
 * 売上計算結果取得バッチでも同じものを読み込む。
 * @author z00se03039
 *
 */
@Data
public class ResponseFileEntity {

	public enum RequestFileTipe {
		InvoceItem, ProcessedUsage
	}

	private RequestFileTipe requestFileTipe;

	private String id;

	private String success;

}
