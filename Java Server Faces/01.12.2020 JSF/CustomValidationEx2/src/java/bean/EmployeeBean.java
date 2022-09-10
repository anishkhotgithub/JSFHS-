
package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class EmployeeBean
{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void validateAge(FacesContext context, UIComponent component, Object value) throws ValidatorException 
    {
        int age=(int)value;
        
        if(!(age>=18 && age<=60))
        {
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_WARN, "abc","Invalid Age");
            ((UIInput)component).setValid(false);
            context.addMessage(component.getClientId(), fm);
        }
    }    
}
