import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your 4 digits pin number to access your bank account");
        System.out.println();
        System.out.println("\n");
        int pinNo = scn.nextInt();
        System.out.println("\n");
        bankAccount obj1 = new bankAccount();
        obj1.menu();
    }

    public static class bankAccount {
        double bal;
        double prevTrans;

        public void deposit(double amount) {
            if (amount != 0) {
                bal = bal + amount;
                System.out.println("You deposited: " + amount);
                System.out.println();
                System.out.println("Your updated balance is: " + bal);
                prevTrans = amount;
                System.out.println();
                System.out.println("*************************");
            }
        }

        public void withdraw(double amount) {
            if (bal <= 0) {
                System.out.println(
                        "Your account is empty, Plese add some balance to continue to get benifitted from our services");
                System.out.println();
                System.out.println("*************************");
            } else if (amount > bal) {
                System.out.println(
                        "You don't have sufficient balance to withdraw this amount, please enter the amount again");
                System.out.println();
                System.out.println("*************************");
            } else if (amount != 0) {
                bal = bal - amount;
                System.out.println("You withdrawn: " + amount);
                System.out.println();
                System.out.println("Your updated balance is: " + bal);
                prevTrans = (-1) * amount;
                System.out.println();
                System.out.println("*************************");
            }
        }

        void prevTrans() {
            if (prevTrans > 0) {
                System.out.println();
                System.out.println("You deposited: " + prevTrans);
            } else if (prevTrans < 0) {
                System.out.println();
                System.out.println("You withdrawn: " + prevTrans);
            } else {
                System.out.println();
                System.out.println("No transection happened");
            }
            System.out.println();
            System.out.println("*************************");
        }

        public void menu() {
            int num;
            Scanner scn = new Scanner(System.in);
            System.out.println("Welcome to our bank!!");
            System.out.println();
            System.out.println("Please select any one option below: ");
            System.out.println();
            System.out.println("*************************");
            System.out.println("\n");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Previous transection");
            System.out.println("5. Exit");
            System.out.println("\n");
            System.out.println("*************************");
            System.out.println("");

            do {
                num = scn.nextInt();
                System.out.println();
                switch (num) {
                    case 1:
                        System.out.println("*************************");
                        System.out.println();
                        System.out.println("Your current balance is: " + bal);
                        System.out.println();
                        System.out.println("*************************");
                        System.out.println("\n");
                        break;

                    case 2:
                        System.out.println("*************************");
                        System.out.println();
                        System.out.println("Please enter how much amount you want to deposit");
                        System.out.println();
                        double amountD = scn.nextInt();
                        System.out.println();
                        deposit(amountD);
                        System.out.println("\n");
                        break;

                    case 3:
                        System.out.println("*************************");
                        System.out.println();
                        System.out.println("Please enter how much amount you want to withdraw");
                        System.out.println();
                        double amountW = scn.nextInt();
                        System.out.println();
                        withdraw(amountW);
                        System.out.println("\n");
                        break;

                    case 4:
                        System.out.println("*************************");
                        System.out.println();
                        System.out.println("Previous Transection: ");
                        prevTrans();
                        break;

                    case 5:
                        System.out.println("*************************");
                        System.out.println();
                        break;

                    default:
                        System.out.println("You are pressing the wrong key, please press the correct key to preceed");
                        break;
                }
            } while (num != 5);

            System.out.println("Thanks for choosing our services!!");
            System.out.println();
            System.out.println("*************************");
        }
    }
}