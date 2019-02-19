package jp.co.ricoh.cotos.rsicommonlib.dto.ZuoraGetExportInvoice;

import lombok.Data;

/**
 * 売上計算結果抽出のレスポンスボディ。
 * @author z00se03039
 *
 */
@Data
public class ExportResponseBody {
	public static String STATUS_COMPLETED_STR = "Completed";
	String Format;
	String Query;
	boolean Encrypted;
	String CreatedById;
	String CreatedDate;
	String Name;
	String FileId;
	String Size;
	String Id;
	String Status;
	String UpdatedById;
	String UpdatedDate;
	boolean Zip;
}