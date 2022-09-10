package myPackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class HandleEvent2 implements ValueChangeListener
{
    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException 
    {
        System.out.println("Textbox is changed. Something new is typed or erased.");
    }
        
}
