package jp.co.ricoh.cotos.rsicommonlib.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Zuoraのプロパティクラス。
 * 環境変数は全てここに定義する。
 * 定数もstaticで合わせて定義する。
 * @author z00se03039
 *
 */
@Component
@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "cotos.zuora.export")
public class ZuoraRequestExportPropaties {
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String INVOICEITEM_REQUESTBODY_RESOURCE_PATH = "classpath:json/invoiceitemRequestBody.json";
	public static final String PROCESSEDUSAGE_REQUESTBODY_RESOURCE_PATH = "classpath:json/processedusageRequestBody.json";
	public static final String ZOQL_ARG_STRING = "ARGS_";
	public static final MediaType REQUEST_CONTENT_TYPE = MediaType.APPLICATION_JSON_UTF8;
	private String apiPath;
	private String apiAccessKeyId;
	private String apiSecretAccessKey;
	private String entityId;

}
