package bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserData 
{

    private int userid;
    private String username;
    private static UserData currentuser;
    private static ArrayList<UserData> users=new ArrayList<>();
    private static boolean edit=false;

    
    public UserData() {
    }

    public UserData(int userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<UserData> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<UserData> users) {
        this.users = users;
    }
    
    public  boolean isEdit() {
        return edit;
    }

    public  void setEdit(boolean aEdit) {
        edit = aEdit;
    }
    
    public String addUser()
    {
        userid=users.isEmpty()? 1: users.get(users.size()-1).getUserid()+1;
        
        UserData ud=new UserData(userid,username);
        users.add(ud);
        return "index?faces-redirect=true";
    }
    
    public String delete(UserData user)
    {
        users.remove(user);
        return "index?faces-redirect=true";
    }
    
    public String update(UserData user)
    {
        currentuser=user;
        edit=true;
        return "index?faces-redirect=true";
    }
    
    public String cancel()
    {
        edit=false;
        return "index?faces-redirect=true";
    }

    public UserData getCurrentuser() {
        return currentuser;
    }

    public void setCurrentuser(UserData currentuser) {
        this.currentuser = currentuser;
    }
    
    public String updateUser(UserData user)
    {
        int index=0;
        
        for (UserData user1 : users) 
        {
            if(user1.userid==user.userid)
            {
                break;
            }
            index++;
        }
        
        edit=false;
        users.remove(index);
        users.add(index,user);
        return "index?faces-redirect=true";
    }
    
}
