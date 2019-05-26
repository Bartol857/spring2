package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad8 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
    }
}
