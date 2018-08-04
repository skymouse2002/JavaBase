/**
 * 
 */
package base.bmc.java.annotation;

import base.bmc.java.annotation.FruitColor.Color;

/** 
 * @author  作者:闭门车 E-mail: hao_3602g@163.com
 * @date 创建时间：2017年6月19日 下午5:09:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/**
 * @author Administrator
 *
 */
public class Apple {

	@FruitName(name="apple")
    private String appleName;
	
	public String getAppleColor() {
		return appleColor;
	}
	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}
	public String getAppleProvider() {
		return appleProvider;
	}
	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	@FruitColor(fruitColor=Color.RED)
    private String appleColor;
	
	@FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
	private String appleProvider;
	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author 闭门车  
	 */
	public static void main(String[] args) {

//		Apple a=new Apple();
//		System.out.println(a.toString());
		FruitInfoUtil.getFruitInfo(Apple.class);
	}
	@Override
	public String toString() {
		return "Apple [appleName=" + getAppleName() + ", appleColor=" + appleColor
				+ "]";
	}
	public String getAppleName() {
		return appleName;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

}

