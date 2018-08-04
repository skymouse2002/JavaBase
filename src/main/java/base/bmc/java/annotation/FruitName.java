/**
 * 
 */
package base.bmc.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
/** 
 * @author  作者:闭门车 E-mail: hao_3602g@163.com
 * @date 创建时间：2017年6月19日 下午5:04:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/**
 * @author Administrator
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
	public String name() default "";
//	String value() default "";
}

