package jp.co.ricoh.cotos.rsicommonlib.dto;

import lombok.Data;

/**
 * アクセストークン取得のレスポンスボディ。
 * @author z00se03039
 *
 */
@Data
public class ExportResponseBodyForAccessToken {
	String AccessToken;
	String TokenType;
	String ExpiresIn;
	String Scope;
	String Jti;
}
