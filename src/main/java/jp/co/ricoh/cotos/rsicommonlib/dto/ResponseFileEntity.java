package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * レスポンスをファイルに書き出すためのDto.
 * 売上計算結果取得バッチでも同じものを読み込む。
 * @author z00se03039
 *
 */
@Data
@NoArgsConstructor
public class ResponseFileEntity {

	public enum RequestFileTipe {
		InvoceItem, ProcessedUsage
	}

	private RequestFileTipe requestFileTipe;

	private String id;

	private String success;

	public ResponseFileEntity(RequestFileTipe requestFileTipe, ExportResponseBodyForZuoraRequest exportResponseBody) {
		this.requestFileTipe = requestFileTipe;
		this.id = exportResponseBody.getId();
		this.success = exportResponseBody.getSuccess();
	}

}
