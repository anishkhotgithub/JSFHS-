
import entity.Employee;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Test2 
{
    public static void getEmployeeDetails()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Employee> employees=session.createSQLQuery("select * from employees").addEntity(Employee.class).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    //Positional Parameters
    public static void getEmployeeById1(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        SQLQuery query=session.createSQLQuery("select * from employees where employeeid=?").addEntity(Employee.class);
        List<Employee> employees=query.setParameter(0, id).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    //Named Parameters
    public static void getEmployeeById2(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        SQLQuery query=session.createSQLQuery("select * from employees where employeeid= :empid").addEntity(Employee.class);
        List<Employee> employees=query.setParameter("empid", id).list();
        
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
        //getEmployeeById1(124);
        getEmployeeById2(125);
    }
}
