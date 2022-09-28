package zadacha3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        String choose = "null";
        while (!choose.equals("x")) {
            System.out.println("1  Vy mojete polojit 600000 com");
            System.out.println("2  Vy mojete uvidet ostatok");
            System.out.println("3 Vy mojete snyat 55000 com");
            choose = sc1.nextLine();
            try {
                switch (choose) {
                    case "1" -> bankAccount.deposit(sc2.nextDouble());
                    case "2" -> System.out.println(bankAccount.getAmount());
                    case "3" -> bankAccount.withDraw(sc2.nextInt());
                    default -> System.out.println("Myndai comanda jok");
                }

            }catch (LimitException e){
                e.getRemainingAmount();
            }



        }
    }
}