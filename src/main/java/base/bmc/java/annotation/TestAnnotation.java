/**
 * 
 */
package base.bmc.java.annotation;
/** 
 * @author  作者:闭门车 E-mail: hao_3602g@163.com
 * @date 创建时间：2017年5月17日 下午5:50:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/**
 * @author Administrator
 *
 */
public class TestAnnotation {
	@HelloAnnotation(name="111",comments = "deprecated method", date = "Nov 27 2016")
    void method(){
    }
	@HelloAnnotation(name="222",comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }
	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author 闭门车  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnnotation t=new TestAnnotation();
		t.method();
		TestAnnotation.oldMethod();
		System.out.println("end");
	}

}

