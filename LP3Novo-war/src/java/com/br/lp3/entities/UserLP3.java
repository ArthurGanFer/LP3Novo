package com.br.lp3.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 31338283
 */
public class UserLP3 implements Serializable {

    private long id_user;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private Date birthday;

    public UserLP3() {
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserLP3{" + "id_user=" + id_user + ", username=" + username + ", password=" + password + ", fullname=" + fullname + ", email=" + email + ", birthday=" + birthday + '}';
    }
    
}
