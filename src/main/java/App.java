import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = (Cat) applicationContext.getBean("catty");
        Cat cat1 = (Cat) applicationContext.getBean("catty");
        System.out.println(bean.getMessage());
        System.out.println(cat.getMessage());
        System.out.println(bean.equals(bean1));
        System.out.println(cat.equals(cat1));
    }
}