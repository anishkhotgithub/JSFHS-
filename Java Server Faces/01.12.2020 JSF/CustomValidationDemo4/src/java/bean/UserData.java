package bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@ManagedBean
public class UserData 
{
    private String username;
    private String password;
    private String mobile;
    
    @Max(value = 60,message = "Invalid Age Max age is 60")
    @Min(value = 18,message = "Invalid Age Min age is 18")
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void validateMobile(FacesContext context,UIComponent component,Object value) throws ValidatorException
    {
        String mobile=(String)value;
        
        Pattern p=Pattern.compile("^\\d{10}$");
        Matcher m=p.matcher(mobile);
        
        if(!m.find())
        {
            ((UIInput)component).setValid(false);
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL,"abc","Invalid Mobile Number");
            context.addMessage(component.getClientId(), fm);
        }            
    }
    
    public void validatePassword(FacesContext context,UIComponent component,Object value) throws ValidatorException
    {
        String password=(String)value;
        
        Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%_]).{8,16}");
        Matcher m=p.matcher(password);
        
        if(!m.find())
        {
            ((UIInput)component).setValid(false);
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL,"abc","Weak Password");
            context.addMessage(component.getClientId(), fm);
        }            
    }
}
