
package com.niit.bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserData 
{
    private String username;
    ArrayList<String> users=new ArrayList<String>();

    public UserData() 
    {
        users.add("amit");
        users.add("ashok");
        users.add("abhishek");
        users.add("amol");
        users.add("aniket");
    }
    
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getValidateUsername()
    {
        boolean status=false;
        for (String user : users) 
        {
            if(user.equals(username))
            {
                status=true;
            }
        }
        if(status)
        return "Username is already exist!!!";
        else
        return "";    
    }
}
