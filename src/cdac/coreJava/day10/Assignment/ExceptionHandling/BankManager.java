package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;
import java.util.HashMap;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    boolean withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient balance");
            return false;
        }
        balance -= amt;
        return true;
    }

    void showBalance() {
        System.out.println("Balance for account " + accountNumber + ": " + (int) balance);
    }
}

public class BankManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts.length < 1) {
                System.out.println("Invalid input");
                continue;
            }

            String operation = parts[0].toLowerCase();

            try {
                switch (operation) {
                    case "createaccount":
                        if (parts.length < 4) {
                            System.out.println("Invalid input");
                            break;
                        }
                        int accNo = Integer.parseInt(parts[1]);
                        String name = parts[2];
                        double bal = Double.parseDouble(parts[3]);
                        accounts.put(accNo, new BankAccount(accNo, name, bal));
                        break;

                    case "deposit":
                        if (parts.length < 3) {
                            System.out.println("Invalid input");
                            break;
                        }
                        accNo = Integer.parseInt(parts[1]);
                        double depAmt = Double.parseDouble(parts[2]);
                        if (accounts.containsKey(accNo)) {
                            accounts.get(accNo).deposit(depAmt);
                        } else {
                            System.out.println("Account not found");
                        }
                        break;

                    case "withdraw":
                        if (parts.length < 3) {
                            System.out.println("Invalid input");
                            break;
                        }
                        accNo = Integer.parseInt(parts[1]);
                        double wAmt = Double.parseDouble(parts[2]);
                        if (accounts.containsKey(accNo)) {
                            accounts.get(accNo).withdraw(wAmt);
                        } else {
                            System.out.println("Account not found");
                        }
                        break;

                    case "balance":
                        if (parts.length < 2) {
                            System.out.println("Invalid input");
                            break;
                        }
                        accNo = Integer.parseInt(parts[1]);
                        if (accounts.containsKey(accNo)) {
                            accounts.get(accNo).showBalance();
                        } else {
                            System.out.println("Account not found");
                        }
                        break;

                    default:
                        System.out.println("Invalid operation");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format");
            }
        }
    }
}