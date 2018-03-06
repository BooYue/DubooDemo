import com.edu.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        for(int i = 0; i<10; i++){
            String invoke = demoService.invoke();
            System.out.println("invoke方法执行的结果为："+invoke);
        }


    }
}
