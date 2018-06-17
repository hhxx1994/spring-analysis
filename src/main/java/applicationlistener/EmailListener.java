package applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailListener implements ApplicationListener {
  
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof EmailEvent){  
            EmailEvent emailEvent = (EmailEvent)event;  
            emailEvent.print();  
            System.out.println("the source is:"+emailEvent.getSource());  
            System.out.println("the address is:"+emailEvent.address);  
            System.out.println("the email's context is:"+emailEvent.text);  
        }  
          
    }  
  
}  