package com.br.lp3.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author 31338283
 */
@Entity
@Table(name = "UserLP3")
public class UserLP3 implements Serializable {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    
    @Column(name = "username")
    @Size(max = 10)
    private String username;
    
    @Column(name = "password")
    @Size(max = 32)
    private String password;
    
    @Column(name = "fullname")
    @Size(max = 100)
    private String fullname;
    
    @Column(name = "email")
    @Size(max = 150)
    private String email;
    
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
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
