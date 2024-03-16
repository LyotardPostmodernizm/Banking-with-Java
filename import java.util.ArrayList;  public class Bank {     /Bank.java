import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch>branches;
    
    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }
    
    public boolean addBranch(String name){
        Branch abranch = findBranch(name);
        if(abranch==null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    
       public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        
        Branch abranch = findBranch(branchName);
        if (abranch != null) {
            abranch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    
    private Branch findBranch(String name){
        for (Branch abranch: branches){
            if(abranch.getName().equals(name)){
                return abranch;
            }
        }
        return null;
    }
    public boolean addCustomer(String nameBranch, String nameCustomer, double initialTransaction){
        Branch abranch = findBranch(nameBranch);
        if(abranch!=null){
            abranch.addCustomerTransaction(nameCustomer,initialTransaction);
            return true;
        }
        return false;
        
        
    }
    public boolean listCustomers(String name, boolean print){
        
        for (Branch abranch:branches){
            if(abranch.getName().equals(name)){
                
                int i;
                int j;
                if(print){
                    System.out.println("Customer details for branch " + name);
                    i=1;
                    for(Customer acustomer: abranch.getCustomers()){
                            System.out.println("Customer: "+acustomer.getName() + "["+Integer.toString(i)+"]");
                            i++;
                            System.out.println("Transactions");
                            j=1;
                            for(double transaction: acustomer.getTransactions()){
                                System.out.println("["+Integer.toString(j)+"]" + " Amount " +transaction);
                                j++;
                            }
                            
                    }
                    
                }
                else{
                    i=1;
                    System.out.println("Customer details for branch " + name);
                    for(Customer acustomer: abranch.getCustomers()){
                            System.out.println("Customer: "+acustomer.getName() + "["+Integer.toString(i)+"]");
                            i++;
                }
                
                
            }
        }
        
        
        
    }
    return false;
    
    
    
    
    
  }
}
