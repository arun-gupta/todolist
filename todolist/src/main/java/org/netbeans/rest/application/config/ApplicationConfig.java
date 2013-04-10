/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import org.glassfish.sample.todolist.TaskResource;

/**
 *
 * @author arungup
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
    @Override
     public Set<Class<?>> getClasses() {
         HashSet<Class<?>> set = new HashSet<>(2);
         set.add(MOXyJsonProvider.class);
         set.add(TaskResource.class);
         return set;
     }
}
