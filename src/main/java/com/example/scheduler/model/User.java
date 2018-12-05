package com.example.scheduler.model;
import java.util.Objects;

public class User
{
    private Integer uid;
    private Integer gid;
    private String name;
    private String comment;
    private String home;
    private String shell;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", gid=" + gid +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", home='" + home + '\'' +
                ", shell='" + shell + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid &&
                gid == user.gid &&
                Objects.equals(name, user.name) &&
                Objects.equals(comment, user.comment) &&
                Objects.equals(home, user.home) &&
                Objects.equals(shell, user.shell);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, gid, name, comment, home, shell);
    }
}
