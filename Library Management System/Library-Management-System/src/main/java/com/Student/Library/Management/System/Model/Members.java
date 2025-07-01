package com.Student.Library.Management.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Members {
    @Id
    private int memberId;
    private String mName;
    private String email;
    private Date membership_date;
    public void setMemberId(int memberId){
        this.memberId=memberId;
    }
    public void setMname(String m_name){
        this.mName=mName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMembership_date(Date membership_date) {
        this.membership_date = membership_date;
    }
    public int getMemberId(){
        return memberId;
    }
    public String getMname(){
        return mName;
    }

    public String getEmail() {
        return email;
    }

    public Date getMembership_date() {
        return membership_date;
    }
}
