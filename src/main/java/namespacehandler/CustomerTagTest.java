package namespacehandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTagTest {
	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("classpath:application.xml");
		User user = beans.getBean("testBean", User.class);
		System.out.println(user);
	}
}   