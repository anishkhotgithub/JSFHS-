package myPackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class HandleEvent3 implements PhaseListener
{
    static int count=1;
    
    @Override
    public void afterPhase(PhaseEvent pe) 
    {
        try 
        {
            if(count>1)
            pe.getFacesContext().getExternalContext().redirect("error.xhtml");
            else
            count++;
        }
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }

    @Override
    public void beforePhase(PhaseEvent pe) 
    {
        System.out.println("Before Phase");
    }

    @Override
    public PhaseId getPhaseId() 
    {
        return PhaseId.ANY_PHASE;
    }    
}
