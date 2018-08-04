package javaBase.gc.chapter3;
/** 
  * @author  作者:刘辰光 E-mail: liuchg@xz-soft.com
  * @date 创建时间：2018年7月22日 下午6:20:41 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
  */
public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK=null;
	
	public void isAlive() {
		System.out.println("yes, i am still alive:)");
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method executed");
		FinalizeEscapeGC.SAVE_HOOK=this;
	}


	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		SAVE_HOOK=null;
		System.gc();
		Thread.sleep(500);
        if(SAVE_HOOK!=null) {
        	SAVE_HOOK.isAlive();
        }else {
        	System.out.println("no,i am dead");
        }
        SAVE_HOOK=null;
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK!=null) {
        	SAVE_HOOK.isAlive();
        }else {
        	System.out.println("no,i am dead");
        }
	}

}
