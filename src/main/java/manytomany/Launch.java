
package manytomany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Launch {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Project.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
//		adding datat to db
//		Employee ajay = new Employee(1,"ajay");
//		Employee vijay = new Employee(2,"vijay");
//		Project googleDocx = new Project(101,"googleDocx");
//		Project GoogleSlide = new Project(102,"GoogleSlide");
//		
//		List<Project> pr1 = new ArrayList<Project>();
//		pr1.add(googleDocx);
//		pr1.add(GoogleSlide);
//		
//		ajay.setProject(pr1);
//		vijay.setProject(pr1);
//		session.save(GoogleSlide);
//		session.save(googleDocx);
//		session.save(ajay);
//		session.save(vijay);
		
//	fetching emp data from db
//		Employee emp= session.get(Employee.class, 2);
//		System.out.println(emp);
//		
//		List<Project> list= emp.getProject();
//		Iterator<Project> itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		fetching project data from db
		
		Project pro = session.get(Project.class, 101);
		System.out.println(pro);
		
//		List<Employee> emp= pro.getEmployee();
//		Iterator<Employee> itr= emp.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		t.commit();
	}

}
