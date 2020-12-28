package com.example.WebApp;

import javax.persistence.*;

/*
  this the class for the staff info Table
 */

@Entity //let be known it is an entity
@Table(name = "Staff") //name the table as followed
public class Staff {

    //initiate variables
    @Column(name = "StaffID")
    private int StaffID;

    private String Fname;
    private String Lname;
    private String Role;
    private String password;
    private String username = Fname + Lname; //username is first name + last name
    private boolean enabled;

        protected Staff()
        {
            /*empty constructor*/
        }

        protected Staff(int StaffID, String Fname, String Lname, String Role, String password, String username, boolean enabled) {
            super();
            this.StaffID = StaffID;
            this.Fname = Fname;
            this.Lname = Lname;
            this.Role = Role;
            this.password = password;
            this.username = username;
            this.enabled = enabled;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
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

        public String getUsername() {
            return username;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public void setUsername(String username){
                this.username = Fname + Lname;
        }

        public String getRole() {
                return Role;
        }

        public void setRole(String Role) {
            this.Role = Role;
        }

    public String toString(){
        return "StaffID: "+ this.StaffID
                + ". Age:"+ this.Fname
                + ". Id:"+ this.Lname
                + ". Role"+ this.Role
                + ". password"+ this.password
                + ".username"+ this.username
                + ".enabled"+ this.enabled;
    } //example


}


