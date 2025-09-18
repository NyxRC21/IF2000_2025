/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.time.LocalDateTime;
import domain.Account;
/**
 *
 * @author Daniel Ríos
 */
public class Logbook {
    private static String[] events = new String[100];
    private static int counter = 0;

    public static void register(String event, Account account, double amount) {
        if (counter < events.length) {
            String record = (counter + 1) + " | " + event +
                            " | Date: " + LocalDateTime.now() +
                            " | Account: " + account.getAccountNumber() +
                            " | Amount: " + amount;
            events[counter] = record;
            counter++;
        }
    }

    public static void show() {
        System.out.println("\n--- LOG ---");
        for (int i = 0; i < counter; i++) {
            System.out.println(events[i]);
        }
    }
}