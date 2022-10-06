import java.util.Scanner;
public class BankingSystem extends Thread {
public void run(){
  
System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to HBL United");
System.out.println("\n\t\t\t\t\t\t\t\n\t\twhat do you want");
}
public static void main(String[] args){
  BankingSystem bs=new BankingSystem();
  bs.start();
  try{
    Thread.sleep(100);
  }
  catch(Exception e){
}

  BankAccount b=new BankAccount();
  try{

  b.Method();
}
  catch(Exception e){
}

b.showMenu();
}
}

class SignUp extends Thread{
    public void Method(){
        System.out.println("\n\t\tdo you want to\n A login\t\t\t\tB sign up");
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(c=='A'){
           boolean g = false;
            while (!g) {
            System.out.println("Enter your Username ");
            String n=s.next();
            

            System.out.println("Enter your Email");
           
            String k=s.next();

            System.out.println("Enter your password");
           
            String e=s.next();
            if("Haresh".equals(n) && "haresh@gmail.com".equals(k) && "21sw".equals(e)){
                System.out.println("User successfuly login");
              g=true;
            }

else{
                System.out.println("sorry user Name or password is incorrect" );
                System.out.println("try again");
              
            }
           }
        }
        else if(c=='B'){
            System.out.println("1: Enter your name");
            String a=s.next();
            s.nextLine();
            System.out.println("Enter your Email\n");
            String b=s.next();

            System.out.println("Enter your number\n");
            long j=s.nextLong();
          
            System.out.println("Enter Your password");
            String l=s.next();
            System.out.print("wait your account is creating");
             for(int i=1;i<=5;i++){
              System.out.print(".");
             try{
             Thread.sleep(1000);}
              catch(Exception e){
             }
              }
            System.out.println("\nAccount created Successfuly");
           try{
           Thread.sleep(2000);
}
catch(Exception e){ }
        

 boolean g = false;
            while (!g) {
            System.out.println("\nLOGIN TO YOUR ACCOUNT");
            System.out.println("Enter your Name ");
            String n=s.next();
      

            System.out.println("Enter your Email");
           
            String k=s.next();

            System.out.println("Enter your password");
          
            String e=s.next();
            if("Haresh".equals(n) && "haresh@gmail.com".equals(k)&&"21sw".equals(e)){
                System.out.println("User successfuly login");
              g=true;
            }
          
        
else{
                System.out.println("sorry user Name or password is incorrect" );
                System.out.println("try again");
                }
              }
           }
}
}

class BankAccount extends SignUp
{
  static int balance;
static int previousTransaction;
  static void deposit(int amount)
    {
      if(amount !=0)
        {
          balance=balance + amount;
        previousTransaction = -amount;
     }
  }
  static void withdraw(int amount){
    if(amount<=balance){             //if amount is not equal to Zero then only run this if body.
       balance=balance-amount;
         previousTransaction = -amount;   // - because we are withdrawing amount so to inicate withdraw I put the -ve sign.
       }

    else{
      System.out.println("Insufficient balance:");
    System.out.println("Please Recharge Your Account");
    }

  }
  static void getPreviousTransaction()
    {
    if(previousTransaction > 0)
    {
    System.out.println("Deposited: "+previousTransaction);
    }
    else if(previousTransaction < 0)
    {
    System.out.println("Withdrawn: "+Math.abs(previousTransaction));
    }
    else{
    System.out.println("No Transaction occured");
    } 
}
  static void showMenu()
{

System.out.println("\n\t\t\t\tWelcome to HBL United");
char option='\0';
Scanner sc = new Scanner(System.in);
do
{
  
  System.out.println("\n");
  System.out.println("\t\tA. Check Balance");
  System.out.println("\t\tB. Deposit");
  System.out.println("\t\tC. Withdraw");
  System.out.println("\t\tD. previous Transaction");
  System.out.println("\t\tE. Exit");
  System.out.println("=============================================================================================");
  System.out.println("\t\tEnter an option");
  System.out.println("=============================================================================================");
  option=sc.next().charAt(0);
  System.out.println("\n");
  switch(option)
  {
  case 'A':
  System.out.println("----------------------------------------------------------------------------");
  System.out.println("\t\tBalance = "+balance);
  System.out.println("-----------------------------------------------------------------------------");
  System.out.println("\n");
  break;
  
  case 'B':
  System.out.println("-----------------------------------------------------------------------------");
  System.out.println("\t\tEnter an amount to deposit");
  System.out.println("-----------------------------------------------------------------------------");
  int amount=sc.nextInt();
  deposit(amount);
  System.out.println("\n");
  break;
  
  case 'C':
  System.out.println("-----------------------------------------------------------------------------");
  System.out.println("\t\tEnter an amount to Withdraw");
  System.out.println("-----------------------------------------------------------------------------");
  int amount2=sc.nextInt();
  withdraw(amount2);
  System.out.println("\n");
  break;
  
  case 'D':
  System.out.println("-----------------------------------------------------------------------------");
  getPreviousTransaction();
  System.out.println("-----------------------------------------------------------------------------");
  System.out.println("\n");
  break;
  
  case 'E':
  System.out.println("******************************************************************************");
  break;
  
  default:
  System.out.println("invalid option ! ! please enter again");
  break;
  }
  }
  while(option!='E');
  System.out.println("Thank you for using our Service");
}
}



