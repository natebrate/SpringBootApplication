package com.example.WebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
  this the class for the staff info Table
 */
@Entity
public class Staff {
    // initiate variables
        private int StaffID;
        private String Fname;
        private String Lname;
        private boolean Role;
        private int password;
        private final String username = Fname + "\t" + Lname; //username is first name + last name

        protected Staff()
        {
            /*empty constructor*/
        }

        protected Staff(int StaffID, String Fname, String Lname, boolean Role, int password) {
            super();
            this.StaffID = StaffID;
            this.Fname = Fname;
            this.Lname = Lname;
            this.Role = Role;
            this.password = password;
        }

    // GETTERS AND SETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStaffID() {
            return StaffID;
        }

    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getFname() {
            return Fname; }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
            return Lname;
        }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

        public boolean getRole()
        {
            return Role;
        }

    public void setRole(boolean admin) {
        Role = admin;
    }

    public String adminCredentials()
        {
            if (getRole())
            {
                return "ADMIN";
            }
            else
                return "";
        }

}


