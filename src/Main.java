import model.GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do{
            System.out.println("istediğiniz işlem 0:qiut, 1:ekleme, 2:çıkarma");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("eklenecek eleman ");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("silinecek eleman");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
                default:
                    System.out.println("0 1 2den birini seçin ");
                    break;
            }
            groceryList.printSorted();
        }
        while(choice !=0);
        scanner.close();
    }
}