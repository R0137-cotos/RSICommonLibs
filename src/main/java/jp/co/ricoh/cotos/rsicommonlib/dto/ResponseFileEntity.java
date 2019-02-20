package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * レスポンスをファイルに書き出すためのDto.
 * 売上計算結果取得バッチでも同じものを読み込む。
 * @author z00se03039
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFileEntity {

	public enum RequestFileTipe {
		InvoceItem, ProcessedUsage
	}

	private RequestFileTipe requestFileTipe;

	private String id;

	private String success;

}
