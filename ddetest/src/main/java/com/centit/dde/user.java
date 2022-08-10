package com.centit.dde;

public class user
{
    private String userName;
    private String address;
    private Integer id;

    public user() {
        System.out.println("----------init----------");
    }

    public user(String userName, String address, Integer id) {
        this.userName = userName;
        this.address = address;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
