package fr.uvsq.ds.projet.mailclient;

import fr.uvsq.ds.projet.mail.ejb.Bonjour;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NamingException
    {
        InitialContext ic = new InitialContext();
        
        Bonjour b = (Bonjour) ic.lookup("bonjour");
        
        System.out.println(b.bonjour());
        
        
    }
}
