package com.example.a207_1.mylaptop;

/**
 * Created by 207-1 on 27/02/2018.
 */

public class Users {
    private String email;
    private String password;

    private String[][] data = new String[][]{
            {"kenny_16@kharisma.ac.id","kennyivan"},
            {"billy_16@kharisma.ac.id","billytanyawan"},
            {"ivan_16@kharisma.ac.id","ivandarmawan"},
            {"yanoris_16@kharisma.ac.id","yanorisarnold"}
    };

    public Users(String tv_emailmember) {
        this.email = tv_emailmember;
        this.cariUsers();

    }

    private void cariUsers() {
        for(int i=0; i<this.data.length; i++){
            if (this.email.equals(this.data[i][0])){
                this.password = this.data[i][1];
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
