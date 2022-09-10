
package model;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Test 
{
    public static void displayEmployees()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Employee> employees=session.createQuery("from model.Employees").list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void addEmployee()
    {
        Transaction tx=null;
        try
        {
            Employee e=new Employee();
            e.setEmployeeid(126);
            e.setEmployeename("Praful");

            SessionFactory factory=NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.save(e);
            tx.commit();
            System.out.println("Employee Data saved Successfully!!!");
        }
        catch(Exception e)
        {
            tx.rollback();
        }
    }
    
    public static void deleteEmployee()
    {
        Transaction tx=null;
        try
        {
            Employee e=new Employee();
            e.setEmployeeid(123);

            SessionFactory factory=NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.delete(e);
            tx.commit();
            System.out.println("Employee Deleted Succesfully!");
        }
        catch(Exception e)
        {
            System.out.println(e);
            tx.commit();
        }
    }
    
    public static void updateEmployee()
    {
        Transaction tx=null;
        try
        {
            Employee e=new Employee();
            e.setEmployeeid(125);
            e.setEmployeename("Pritesh");

            SessionFactory factory=NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.saveOrUpdate(e);
            tx.commit();
            System.out.println("Employee Updated Succesfully!");
        }
        catch(Exception e)
        {
            System.out.println(e);
            tx.commit();
        }
    }
    
    public static void getAllEmployees()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Employee> employees=session.createCriteria(Employee.class).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.eq("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById2(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.lt("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById3(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.gt("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById4(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.ge("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById5(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.le("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeById6(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.ne("employeeid",empid)).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeByName1()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.like("employeename","%p%")).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void getEmployeeByName2()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        List<Employee> employees=ctx.add(Restrictions.ilike("employeename","%p%")).list();
        
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    
    public static void getEmployeeByIdAndName()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employee.class);
        
        Criterion ct1=Restrictions.gt("employeeid", 123);
        Criterion ct2=Restrictions.ilike("employeename", "%P%");
        
        Criterion ct3=Restrictions.and(ct1,ct2);
        
        List<Employee> employees=ctx.add(ct3).list();
        for(Employee employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        displayEmployees();
        //addEmployee();
        //deleteEmployee();
        //updateEmployee();
        //getAllEmployees();
        //getEmployeeById(124);
        //getEmployeeById2(126);
        //getEmployeeById3(123);
        //getEmployeeById4(124);
        //getEmployeeById5(125);
        //getEmployeeById6(125);
        //getEmployeeByName1();
        //getEmployeeByName2();
        //getEmployeeByIdAndName();
        
    }
}
