package jp.co.ricoh.cotos.rsicommonlib.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import jp.co.ricoh.cotos.rsicommonlib.entity.BasicContents.ApplicationStatus;

/**
 * 申請ステータスENUMコンバーター
 */

@Converter(autoApply = true)
public class ApplicationStatusConverter implements AttributeConverter<ApplicationStatus, String> {
	@Override
	public String convertToDatabaseColumn(ApplicationStatus applicationStatus) {
		if (applicationStatus == null)
			return null;
		return applicationStatus.toString();
	}

	@Override
	public ApplicationStatus convertToEntityAttribute(String value) {
		if (value == null)
			return null;
		return ApplicationStatus.fromString(value); // IllegalArgumentExceptionはContractType.fromString側で投げている
	}
}
