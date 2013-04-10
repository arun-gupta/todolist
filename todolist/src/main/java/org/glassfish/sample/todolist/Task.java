/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.sample.todolist;

import java.io.StringReader;
import javax.json.Json;
import javax.json.stream.JsonParser;

/**
 *
 * @author arungup
 */
public class Task {
//    User user;
    int id;
    String title;
    
    public Task(String string) {
        JsonParser parser = Json.createParser(new StringReader(string));
        parser.next();
        parser.next();
        parser.next();
        id = parser.getInt();
        parser.next();
        parser.next();
        title = parser.getString();
    }

    public Task(int id, String title) {
//        this.user = user;
        this.id = id;
        this.title = title;
    }
    
    

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

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
    
    public String toString() {
        return "{ \"id\": " + id + ", \"title\": " + title + "}";
    }
    
}
