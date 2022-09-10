
package com.niit.bean;

import java.io.InputStream;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CountryDetails 
{
    private String name;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription()
    {
        Properties prop=new Properties();
        try
        {
            InputStream is=getClass().getClassLoader().getResourceAsStream("countries/countrydetails.properties");
            prop.load(is);
        }
        catch(Exception e)
        {
                    System.out.println(e);
        }
            
        if(name!=null)
        {
            return prop.getProperty(name);
        }
        else
        {
            return "";
        }

    }

    
}
