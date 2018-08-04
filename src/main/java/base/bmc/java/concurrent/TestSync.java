package base.bmc.java.concurrent;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/** 
  * @author  作者:刘辰光 E-mail: liuchg@xz-soft.com
  * @date 创建时间：2018年6月24日 下午4:29:33 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
  */
public class TestSync {
  public static void main(String[] args) {
	SynchronousQueue<String> syncQueue=new SynchronousQueue();
	syncQueue.add("");
	syncQueue.isEmpty();
	syncQueue.offer("");
	syncQueue.peek();
	syncQueue.poll();
	try {
		syncQueue.poll(1000, TimeUnit.MICROSECONDS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
