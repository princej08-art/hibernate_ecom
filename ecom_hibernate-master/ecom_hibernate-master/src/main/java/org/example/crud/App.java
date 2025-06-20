package org.example.crud;

import org.example.Entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SessionFactory sf = new Configuration().configure().
                addAnnotatedClass(Category.class).
                addAnnotatedClass(OrderDetails.class).
                addAnnotatedClass(Orders.class).
                addAnnotatedClass(Product.class).
                addAnnotatedClass(Users.class).
                buildSessionFactory();

        new Insert(sf);
    }
}
