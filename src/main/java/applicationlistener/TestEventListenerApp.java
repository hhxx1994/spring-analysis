package applicationlistener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventListenerApp {

    public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
          
        //HelloBean hello = (HelloBean) context.getBean("helloBean");  
        //hello.setApplicationContext(context);  
        EmailEvent event = new EmailEvent("hello","boylmx@163.com","this is a email text!");  
        context.publishEvent(event);  
        //System.out.println();  
    }

}  