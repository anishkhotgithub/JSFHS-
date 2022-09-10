
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Student 
{
    private String student_name;
    private String student_id;
    private float subject1;
    private float subject2;
    private float subject3;
    private float per;
    
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public float getSubject1() {
        return subject1;
    }

    public void setSubject1(float subject1) {
        this.subject1 = subject1;
    }

    public float getSubject2() {
        return subject2;
    }

    public void setSubject2(float subject2) {
        this.subject2 = subject2;
    }

    public float getSubject3() {
        return subject3;
    }

    public void setSubject3(float subject3) {
        this.subject3 = subject3;
    }

    public String calculate()
    {
        per=(subject1+subject2+subject3)/300*100;
        return "success";
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }
    
}
