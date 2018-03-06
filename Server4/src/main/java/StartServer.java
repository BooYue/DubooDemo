import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("服务器4已启动.......");
        System.in.read();

    }
}
