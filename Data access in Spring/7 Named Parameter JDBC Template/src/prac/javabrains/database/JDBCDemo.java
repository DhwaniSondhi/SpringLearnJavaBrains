package prac.javabrains.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prac.javabrains.database.dao.JDBCDaoImpl;
import prac.javabrains.database.model.Circle;

public class JDBCDemo {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		JDBCDaoImpl dao=(JDBCDaoImpl)context.getBean("jdbcDaoImpl", JDBCDaoImpl.class);
		//System.out.println(dao.getCircleCount());
		/*System.out.println(dao.getCircleName(1));
		System.out.println(dao.getCircleForId(1).getName());
		System.out.println(dao.getAllCircles().size());
		for(Circle circle:dao.getAllCircles()) {
			System.out.println(circle.getNament)());
		}
		Circle circle=dao.getCircle(1);
		System.out.println(circle.getName());
		  
		 */
		dao.insertCircle(new Circle(1, "First"));
		dao.insertCircle(new Circle(2, "Second"));
		dao.insertCircle(new Circle(3, "Third"));
		dao.insertCircle(new Circle(4, "Fourth"));
		dao.insertCircle(new Circle(5, "Fifth"));
		//dao.createTriangleTable();
		System.out.print(dao.getCircleCount());
	}
}
