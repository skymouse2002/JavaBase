/**
 * 
 */
package base.bmc.java.annotation;
/** 
 * @author  作者:闭门车 E-mail: hao_3602g@163.com
 * @date 创建时间：2017年6月19日 下午5:22:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/**
 * @author Administrator
 *
 */
public @interface FruitProvider {
    /**
     * 供应商编号
     * @return
     */
    public int id() default -1;
    
    /**
     * 供应商名称
     * @return
     */
    public String name() default "";
    
    /**
     * 供应商地址
     * @return
     */
    public String address() default "";
}

