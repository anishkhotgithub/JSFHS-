
import entity.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Test1 
{
    public static void getEmployeeDetails()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Employee> employees=session.createQuery("from entity.Employee").list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    //Positional Parameters.
    public static void getEmployeeeById1(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("from entity.Employee where employeeid=?");
        List<Employee> employees=query.setParameter(0, id).list();
        
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    //Named Parameters
    public static void getEmployeeeById2(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("from entity.Employee where employeeid= :i");
        List<Employee> employees=query.setParameter("i", id).list();
        
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        //getEmployeeDetails();
        //getEmployeeeById1(124);
        getEmployeeeById2(124);
    }
}
