package a3.clientrestfuldb;

/**
 *
 * @author Queralt
 */

public class A3ClientRestfulDB {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        NewJerseyClient customer = new NewJerseyClient();
        System.out.println(customer.findAll_XML(String.class));
        System.out.println(customer.find_XML(String.class, "2"));
    }
}