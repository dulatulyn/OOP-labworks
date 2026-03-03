package labwork2.problem3;

public class Main {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(67, 5);

        s.deposit(1000);
        s.addInterest();

        s.print();

        CheckingAccount c = new CheckingAccount(67);

        c.deposit(100);
        c.withdraw(10);
        c.deposit(50);
        c.withdraw(5);
        c.deposit(20);

        System.out.println("Before fee");
        c.print();

        c.deductFee();

        System.out.println("After fee");
        c.print();
    }
}