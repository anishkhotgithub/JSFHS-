
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;



@ManagedBean
@RequestScoped
public class EmployeeData 
{
    @Length(min = 4,max = 10,message = "Incorrect Length")
    @NotEmpty(message = "Username is required")
    private String username;
    
    @Min(value = 5,message = "Minimum Age is 5")
    @Max(value=120,message = "Maximum age is 120")
    private int age;
    
    @DecimalMin(value="10000.50",message = "Minimum salary is 10000.50")
    @DecimalMax(value="1000000.50",message = "Minimum salary is 1000000.50")
    private double salary;
    
    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$_]).{8,16}",message = "Password is weak")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
