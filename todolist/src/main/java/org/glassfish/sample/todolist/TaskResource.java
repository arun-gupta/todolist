/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.sample.todolist;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author arungup
 */
@Path("task")
public class TaskResource {

//    @PersistenceContext
//    EntityManager em;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TaskResource
     */
    public TaskResource() {
    }

    /**
     * Retrieves representation of an instance of org.glassfish.sample.todolist.TaskResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "Hello World";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String postJson(String payload) {
        System.out.println(payload);
        
        Task task = new Task(payload);
        
//        em.persist(task);
        
        return task.toString();
    }

    /**
     * PUT method for updating or creating an instance of TaskResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
