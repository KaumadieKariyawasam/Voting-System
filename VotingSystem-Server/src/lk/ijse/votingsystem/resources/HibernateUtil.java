/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.resources;

import java.io.File;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.entity.Commission;
import lk.ijse.votingsystem.entity.Election;
import lk.ijse.votingsystem.entity.ElectionDetail;
import lk.ijse.votingsystem.entity.Vote;
import lk.ijse.votingsystem.entity.Voter;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author HP
 */
public class HibernateUtil {
   
     private static final SessionFactory sessionFactory;
    
    private static StandardServiceRegistry registry;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            
            // (1) 
            
            File hibernateProperties = new File("settings/hibernate.properties");
           
            registry = new StandardServiceRegistryBuilder().loadProperties(hibernateProperties).build();
            
            // (2)
            sessionFactory = new MetadataSources(registry)
                   .addAnnotatedClass(Voter.class)
                    .addAnnotatedClass(Candidate.class)
                    .addAnnotatedClass(Commission.class)
                    .addAnnotatedClass(Election.class)
                    .addAnnotatedClass(ElectionDetail.class)
                    .addAnnotatedClass(Vote.class)
                 //   .addAnnotatedClass(ElectionDetail_PK.class)
                    .buildMetadata().buildSessionFactory();
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            System.out.println("ttttttttttttttttttttttttttttt");
            StandardServiceRegistryBuilder.destroy(registry);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
