
package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@ManagedBean
public class UserData implements Validator
{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException 
    {
        String username=(String)value;
        
        if(!(username.length()>=4))
        {
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL, "INvalid username length", "abc");
            throw new ValidatorException(fm);
        }
    }    
}
