package SpringCore_Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("Properties.xml");
MyDao myDb = (MyDao) context.getBean("myDao");
System.out.println(myDb);
	}

}
