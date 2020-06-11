package javaBase.juc;

import java.util.function.Supplier;

public class TestThreadLocal {
	public static void main(String[] args) {
        User bank = new User();
        Thread first = new Thread(() -> bank.add(2), "萧一");
        Thread second = new Thread(() -> bank.add(2), "萧二");
        Thread third = new Thread(() -> bank.add(2), "萧三");
        first.start();
        second.start();
        third.start();
    }

}
class User {
//    private int age = 5;
//    public void add(int num) {
//        String threadName = Thread.currentThread().getName();
//        System.out.println(threadName + "当前年龄是：" + this.age);
//        this.age += num;
//        System.out.println(threadName + "增加" + num + " 年龄之后，现在年龄：" + this.age);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    ThreadLocal<Integer> age = ThreadLocal.withInitial(new Supplier<Integer>() {
        @Override
        public Integer get() {
            return 5;
        }
    });
    public void add(int num) {
        String threadName = Thread.currentThread().getName();
         System.out.println(threadName + "当前年龄是：" + age.get());
         age.set(age.get()+num); //age+=num;
         System.out.println(threadName + "增加" + num + " 年龄之后，现在年龄：" + age.get());
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

}