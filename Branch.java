import java.util.ArrayList;

public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer>customers;
    
    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean newCustomer(String name, double initialTransaction){
        Customer acustomer = findCustomer(name);
        if (acustomer == null){
            customers.add(new Customer(name,initialTransaction));
            return true;
        }
        return false;
    }
    
    public boolean addCustomerTransaction(String name, double transaction){
        Customer acustomer = findCustomer(name);
        if(acustomer!=null){
            acustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    
    private Customer findCustomer(String name){
        for (Customer acustomer:customers){
            if(acustomer.getName().equals(name)){
                return acustomer;
            }
        }
        return null;
    } 
    
    
}
