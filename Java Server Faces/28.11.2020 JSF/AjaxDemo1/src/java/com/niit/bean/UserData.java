
package com.niit.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserData 
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getMessageString()
    {
        if(name==null)
        {
            return "";
        }
        else
        {
            return "Hello "+name;
        }
    }
    
}
