package jp.co.ricoh.cotos.rsicommonlib.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import jp.co.ricoh.cotos.commonlib.migrate.entity.ContractInfo.OrderType;

/**
 *
 * 注文識別フラグENUMコンバーター
 *
 */

@Converter(autoApply = true)
public class OrderTypeConverter implements AttributeConverter<OrderType, String> {
	@Override
	public String convertToDatabaseColumn(OrderType orderType) {
		if (orderType == null)
			return null;
		return orderType.toString();
	}

	@Override
	public OrderType convertToEntityAttribute(String value) {
		if (value == null)
			return null;
		return OrderType.fromString(value); // IllegalArgumentExceptionはContractType.fromString側で投げている
	}
}
