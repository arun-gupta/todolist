/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.sample.todolist;

/**
 *
 * @author arungup
 */
public class Task {
    User user;
    int id;
    String title;
    String detail;

    public Task(User user, int id, String title, String detail) {
        this.user = user;
        this.id = id;
        this.title = title;
        this.detail = detail;
    }
    
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
    
}
