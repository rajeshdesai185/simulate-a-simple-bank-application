
import java.util.Scanner;

class BankAccount{
    double balance=0,deposit=0,withraw=0;

    //Balance Check Function
    public void balance(){
         System.out.println("Current balance is : "+balance+"Rs.");
    } 
    //Withrawal Function
    public void withrawal(double amc){
        try {
            if(amc>balance){
                throw new Exception("Not Sufficient Amount");
             } 
             else{   
                balance=balance-amc;
                System.out.println(amc+"Rs. Withraw Successfully");
                System.out.println("Current Balance is "+balance+"Rs.");
            }   
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    //Diposit Function
    public void diposit(double amc){
         balance=balance+amc;
         System.out.println("Amount "+amc+"Rs. deposited Successfully");
         System.out.println("Updated Balance is :"+balance+"Rs.");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount obj=new BankAccount();
        double amc;
        int ch;
        String ans="n";
        
while(ans.equalsIgnoreCase("n")){
        System.out.println("Welcome to HDFC System");
        System.out.println("Press 1 to cheack Balance");
        System.out.println("Press 2 to Deposit");
        System.out.println("Press 3 to Withraw");
        System.out.print("Enter choice :");
        ch=sc.nextInt();
       switch(ch) {
           case 1: obj.balance();
                   break;
           case 2:
                System.out.print("Enter Deposit Amount : ");
                amc=sc.nextDouble();
                obj.diposit(amc);
               break;
           case 3:
                 System.out.print("Enter Amount to Withraw :");
                 amc=sc.nextDouble();
                 obj.withrawal(amc);    
                 break;
           default:
               System.out.println("Invalid choice");
       }
    System.out.print("Do you want to Exit (y/n)? : ");
    sc.nextLine();
    ans=sc.nextLine();
}
}
}