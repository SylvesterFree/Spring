package org.Sylvester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("Assignment.xml");
        Person p = (Person) context.getBean("Person");
        p.Info();
    }
}
