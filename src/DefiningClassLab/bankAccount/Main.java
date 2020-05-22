package DefiningClassLab.bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String command = input[0];

        Map<Integer, BankAccount> allAccounts = new HashMap<>();

        while (!"End".equals(command)) {
            String output=null;

            switch (command) {
                case "Create":

                    BankAccount account = new BankAccount();
                    allAccounts.put(account.getId(), account);

                    output=String.format("Account ID%d created",account.getId());
                    break;
                case "Deposit": {
                    int accountId = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);

                    BankAccount current = allAccounts.get(accountId);
                    if (current == null) {
                        output="Account does not exist";
                    } else {
                        current.deposit(amount);
                        allAccounts.put(accountId, current);
                        output=String.format("Deposited %.0f to ID%d",amount,accountId);
                    }
                    break;
                }
                case "SetInterest":
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(input[1]);
                    int age = Integer.parseInt(input[2]);

                    BankAccount current = allAccounts.get(accountId);
                    if (current == null) {
                        output="Account does not exist";
                    } else {
                        output=String.format("%.2f",current.getAfterYears(age));
                        allAccounts.put(accountId, current);
                    }
                    break;

            }
            if (output!=null) {
                System.out.println(output);
            }

            input = scanner.nextLine().split(" ");
            command = input[0];
        }


    }
}
