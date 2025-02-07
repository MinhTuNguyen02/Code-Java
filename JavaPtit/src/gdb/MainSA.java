
package gdb;

class SavingsAccount{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance*annualInterestRate/12);
    }
    
    public static void modifyInterestRate(double a){
        annualInterestRate=a;
    }

    @Override
    public String toString() {
        return getClass().getName()+"[Balance: "+savingsBalance+"]";
    }
}
public class MainSA {
    public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount(2000.00);
        SavingsAccount saver2=new SavingsAccount(3000.00);
        
        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1);
        System.out.println(saver2);
        
        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1);
        System.out.println(saver2);
    }
}
