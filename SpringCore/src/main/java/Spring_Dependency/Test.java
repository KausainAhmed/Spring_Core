package Spring_Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Prescription.xml");
	Prescription pre=(Prescription) context.getBean("pre");
	System.out.println(pre);
}
}
