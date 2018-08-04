package javaBase.Serializable;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author 作者:刘辰光 E-mail: liuchg@xz-soft.com
 * @date 创建时间：2018年7月7日 下午8:17:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class Person implements Serializable {
	private String name;
	private int age;

	// 此处没有提供无参构造
	public Person(String name, int age) {
		System.out.println("有参数的构造器");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// 将name实例变量值反转后写入二进制流
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}

	private void readObject(java.io.ObjectInputStream in) throws Exception {
		// 将读取的字符串反转后赋给name变量
		this.name = ((StringBuffer) in.readObject()).reverse().toString();
		this.age = in.readInt();
	}
}
