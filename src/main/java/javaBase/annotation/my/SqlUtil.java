/**
 * 
 */
package javaBase.annotation.my;

import java.lang.reflect.Method;

/**
 * @author Administrator
 *
 */
public class SqlUtil {
	public static void getSqlInfo(Class<?> clazz){
		String sql="sql is:";
		 Method[]  methods=clazz.getMethods();
		 for(Method method:methods){
			 if(method.isAnnotationPresent(Sql.class)){
			Sql sq=method.getAnnotation(Sql.class);
			sql=sql+  sq.value();
				 System.out.println(sql);
			 }
		 }
	}

}

