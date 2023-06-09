package programming_project_3_13;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{
   private int freeTransaction;
   private double fee;
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initBal the initial balance
   */
   public BankAccount(double initBal, double fee, int freeTransaction)
   {
      balance = initBal;
      this.fee = fee;
      this.freeTransaction = freeTransaction;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
      for (int i = 0; i < (freeTransaction <= 0 ? 1 : 0); i++) {
         balance -= fee;
      }
      freeTransaction--;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
      for (int i = 0; i < (freeTransaction <= 0 ? 1 : 0); i++) {
         balance -= fee;
      }
      freeTransaction--;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}

