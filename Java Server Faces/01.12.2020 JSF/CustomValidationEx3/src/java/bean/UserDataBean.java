package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserDataBean 
{
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
