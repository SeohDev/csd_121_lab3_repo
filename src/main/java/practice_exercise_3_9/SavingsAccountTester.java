package practice_exercise_3_9;

public class SavingsAccountTester
{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(2000, 10);
        System.out.println("Expected each year: ~$220 in interest");
        account.getInterest();
        account.balCheck();

    }

    
}
