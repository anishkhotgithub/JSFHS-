package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "PasswordValidator")
public class PasswordValidator implements Validator
{
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException 
    {
        String password=(String)value;
        
        Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$_]).{8,16}");
        Matcher m=p.matcher(password);
        
        if(!m.find())
        {
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL,"Weak Password","abc");
            throw new ValidatorException(fm);
        }
    }   
}
