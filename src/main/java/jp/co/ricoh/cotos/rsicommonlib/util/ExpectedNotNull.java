package jp.co.ricoh.cotos.rsicommonlib.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 物理的にはNullを許容しますが、Not Nullを想定しているフィールドを示します。
 * @author z00se03039
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExpectedNotNull {

}
