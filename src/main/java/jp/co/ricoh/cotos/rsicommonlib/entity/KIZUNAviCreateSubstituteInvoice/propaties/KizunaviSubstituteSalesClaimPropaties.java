package jp.co.ricoh.cotos.rsicommonlib.entity.KIZUNAviCreateSubstituteInvoice.propaties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "cotos.kizunavi.substituteSalesClaim")
public class KizunaviSubstituteSalesClaimPropaties {
	public static final String ARG_DATE_FORMAT = "yyyyMMdd";
	private String costTypeColumnString;
	private String pageSeparateString;
	private int customerAddressOnelineLength;
	private int itemContractNameOnelineLength;
	private int onePageDetailCount;
	private String formFilePath;
}
