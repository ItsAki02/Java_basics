package bank.bank;

public class Bank {
    public static void main(String[] args) {
        Account account1= new Account();
        account1.name = "Akanksha";
        account1.email = "akanksha021817@gmail.com";
        account1.setPassword("Akanksha@123");
    
        System.out.println(account1.getPassword() );
      
    }
}

class Account{
    public String name;
    protected String email;
    private String password;

      public String getPassword(){
            return this.password;
        }
        public void setPassword(String pass){
            this.password = pass;
        }
}
