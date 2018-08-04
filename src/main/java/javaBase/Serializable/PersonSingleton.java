package javaBase.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/** 
  * @author  作者:刘辰光 E-mail: liuchg@xz-soft.com
  * @date 创建时间：2018年7月6日 上午12:43:27 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
  */
public class PersonSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
    private String name;
    private PersonSingleton(String name) {
        this.name = name;
    };
    private static PersonSingleton person = null;

    public static synchronized PersonSingleton getInstance() {
        if (person == null)
            return person = new PersonSingleton("cgl");
        return person;
    }

    private Object writeReplace() throws ObjectStreamException {
        System.out.println("1 write replace start");
        return this;//可修改为其他对象
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("2 write object start");
        out.defaultWriteObject();
       //out.writeInt(1);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("3 read object start");
        in.defaultReadObject();
       //int i=in.readInt();
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("4 read resolve start");
        return PersonSingleton.getInstance();//不管序列化的操作是什么，返回的都是本地的单例对象
    }

    public static void main(String[] args) throws Exception {

        FileOutputStream out = new FileOutputStream(new File("D://person.dat"));
        ObjectOutputStream op = new ObjectOutputStream(out);
        op.writeObject(PersonSingleton.getInstance());
        op.close();

        FileInputStream in = new FileInputStream(new File("D://person.dat"));
        ObjectInputStream oi = new ObjectInputStream(in);
        Object person = oi.readObject();
        in = new FileInputStream(new File("D://person.dat"));
        oi = new ObjectInputStream(in);
        PersonSingleton person1 = (PersonSingleton) oi.readObject();

        System.out.println("sington person hashcode:" + person.hashCode());
        System.out.println("sington person1 hashcode:" + person1.hashCode());
        System.out.println("singleton getInstance hashcode:" + PersonSingleton.getInstance().hashCode());
        System.out.println("singleton person equals:" + (person == PersonSingleton.getInstance()));
        System.out.println("person equals1:" + (person1 == person));
    }
}
