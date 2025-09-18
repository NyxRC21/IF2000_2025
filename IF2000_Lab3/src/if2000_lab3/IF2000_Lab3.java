/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_lab3;

import domain.Client;
import logic.CheckingAccount;
import logic.Logbook;
import logic.SavingAccount;
import logic.Sinpe;

/**
 *
 * @author Daniel Ríos
 */
public class IF2000_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Client p1 = new Client("1", "Tony", "6440-4537", "Cartago");
        Client p2 = new Client("2", "Cris", "6002-0578", "San Ramón");

        SavingAccount acc1 = new SavingAccount("2025-09-18", 6, 5, "001", p1, 15000, "BCR");
        CheckingAccount acc2 = new CheckingAccount("002", p2, 15000, "BCR", 5);

        acc1.deposit(200);
        acc2.withdraw(100);

        acc1.interestCalculation();
        acc2.interestCalculation();

        Sinpe.transfer(acc1, acc2, 300);

        System.out.println("Tony's Balance (Savings): " + acc1.getBalance());
        System.out.println("Cris's Balance (Checking): " + acc2.getBalance());

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        Logbook.show();
    }
}
