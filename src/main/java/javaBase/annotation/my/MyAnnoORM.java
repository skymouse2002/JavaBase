/**
 * 
 */
package javaBase.annotation.my;
/** 
 * @author  作者:闭门车 E-mail: hao_3602g@163.com
 * @date 创建时间：2017年6月19日 下午6:05:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/**
 * @author Administrator
 *
 */
public class MyAnnoORM {

	
	@Sql("select 1 from dual")
	public void getList(){
		
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
		SqlUtil.getSqlInfo(MyAnnoORM.class);
		MyAnnoORM my=new MyAnnoORM();
		my.getList();
	}

}

