package version3manytomany.post;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacebookPage chefPage = new FacebookPage("Master Chef"); // subject 1
        FacebookPage runPage = new FacebookPage("Running for Life"); // subject 2
        StockExchangeOfThailand set = new StockExchangeOfThailand(); // subject 3

        // observer 1
        User kwan = new User("Kwan");
        kwan.follow(chefPage);  // follow subject 1
        kwan.follow(runPage);   // follow subject 2
        kwan.follow(set);       // follow subject 3

        // observer 2
        User ploy = new User("Ploy");
        ploy.follow(chefPage);  // follow subject 1

        // observer 3, 4
        BackupService chefBK = new BackupService("backup-chef.txt", chefPage);
        BackupService setBK = new BackupService("backup-set.txt", set);

        Scanner scanner = new Scanner(System.in);
        double price = 0;
        while (true) {
            System.out.print("Chef Page: ");
            String message = scanner.nextLine();
            chefPage.post("ChefPage: " + message);
            System.out.print("Run Page: ");
            message = scanner.nextLine();
            runPage.post("RunPage: " + message);

            set.updateStock("KU", price++);
        }
    }
}
