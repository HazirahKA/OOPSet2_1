import javax.swing.*;
import java.util.ArrayList;

public class BankingApp {
    public static void main(String[] args) {

        ArrayList<Account> bankaccounts=new ArrayList<>();
        SavingAccount[] savingsAccounts=new SavingAccount[2];

        Account bankaccount;
        SavingAccount savingsAccount;

        double balance;
        int taxRate,accNum;
        String name,address;
        boolean checkBook;

        savingsAccount =new SavingAccount(new Person("John Reynolds",
                "Mountain View"),1234,4500,2);

        bankaccounts.add(savingsAccount);
        savingsAccounts[0]=savingsAccount;

        savingsAccount =new SavingAccount(new Person("Deirdre Burke",
                "Sea View"),3322,4800,1.74);

        savingsAccounts[1]=savingsAccount;

        bankaccount =new CurrentAccount(new Person("Mary Moriarty",
                "Lakeside Drive"),4321,5670,true);
        bankaccounts.add(bankaccount);

        String answer="";
        while(JOptionPane.showConfirmDialog(
                null,"Are you finished?")==JOptionPane.NO_OPTION){

            name= JOptionPane.showInputDialog("Enter Account Holder Name");
            address = JOptionPane.showInputDialog("Enter Account Holder Address");
            accNum =Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
            balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
            answer = JOptionPane.showInputDialog(("Savings Account(S) or Current Account(C)"));
            if (answer.equals("S")) {
                taxRate = Integer.parseInt(JOptionPane.showInputDialog("Enter tax rate"));
                bankaccount = new SavingAccount(new Person(name, address), accNum, balance, taxRate);
            }
            else if(answer.equals("C")) {
                checkBook = Boolean.parseBoolean(JOptionPane.showInputDialog("Do you want a check book"));
                bankaccount = new CurrentAccount(new Person(name, address), accNum, balance, checkBook);
            }
            else JOptionPane.showMessageDialog(null, "Invalid choice");

            bankaccounts.add(bankaccount);

        }

        JTextArea jta=new JTextArea("Bank Accounts\n\n");

        for(Account bkacc:bankaccounts){
            jta.append(bkacc.toString());
        }

        JOptionPane.showMessageDialog(null,jta);

        filterAccounts(savingsAccounts,4000);
        display(bankaccounts);


    }

    public static void display(ArrayList<Account> bankaccounts){
        JTextArea jta=new JTextArea("Accounts \n\n");
        for(Account bk:bankaccounts){
            jta.append(bk.toString());
        }
        JOptionPane.showMessageDialog(null, jta);
    }

    public static void filterAccounts(SavingAccount[] bankaccounts,int thresamount){
        JTextArea jta=new JTextArea("Accounts with Balance > € " + thresamount +"\n\n");
        for(SavingAccount bk:bankaccounts){
            if (bk.getBalance()>thresamount){
                jta.append(bk.toString() +"\n");
            }
        }
        JOptionPane.showMessageDialog(null, jta);
    }
}
