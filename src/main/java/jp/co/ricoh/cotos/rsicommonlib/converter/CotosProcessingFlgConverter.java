package jp.co.ricoh.cotos.rsicommonlib.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork.CotosProcessingFlg;

@Converter(autoApply = true)
public class CotosProcessingFlgConverter implements AttributeConverter<CotosProcessingFlg, String> {

	@Override
	public String convertToDatabaseColumn(CotosProcessingFlg cotosProcessingFlg) {
		if (cotosProcessingFlg == null)
			return null;
		return cotosProcessingFlg.toString();
	}

	@Override
	public CotosProcessingFlg convertToEntityAttribute(String value) {
		if (value == null)
			return null;
		return CotosProcessingFlg.fromString(value);
	}
}