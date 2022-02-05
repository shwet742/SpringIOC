import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student =(Student) applicationContext.getBean("std");
	    //student.setStu_id(102);
		//student.setStu_name("tushar");
		System.out.println(student);
	}

}
/* <constructor-arg name="stu_id" value="102"></constructor-arg>
      <constructor-arg name="stu_name" value="tushar"></constructor-arg>
   */