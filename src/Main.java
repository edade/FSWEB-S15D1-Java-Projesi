import model.Contact;
import model.GroceryList;
import model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        GroceryList groceryList = new GroceryList();
//        int choice;
//        do{
//            System.out.println("istediğiniz işlem 0:quit, 1:ekleme, 2:çıkarma");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 1:
//                    System.out.println("eklenecek eleman ");
//                    String itemsToAdd = scanner.nextLine();
//                    groceryList.addItems(itemsToAdd);
//                    break;
//                case 2:
//                    System.out.println("silinecek eleman");
//                    String itemsToRemove = scanner.nextLine();
//                    groceryList.removeItems(itemsToRemove);
//                    break;
//                default:
//                    System.out.println("0 1 2den birini seçin ");
//                    break;
//            }
//            groceryList.printSorted();
//        }
//        while(choice !=0);
//        scanner.close();
        Contact c1 = new Contact("Eda", "143433232");
        Contact c2 = new Contact("Ahmet", "2343933232");
        Contact c3 = new Contact("Esra", "3343999932");
        Contact c4 = new Contact("Aslı", "4343123332");
        Contact c5 = new Contact("Yavuz", "5343546532");

        MobilePhone mp = new MobilePhone("6453549098");
        System.out.println("kullanıcı ekleme işlemi");
        mp.addNewContact(c1);
        mp.addNewContact(c2);
        mp.addNewContact(c3);
        mp.addNewContact(c4);
        mp.addNewContact(c5);
        mp.printContacts();

        System.out.println("kullanıcı güncelleme işlemi");
        mp.updateContact(c2,new Contact("Saadet", "1112223344"));
        mp.printContacts();

        System.out.println("kullanıcı silme işlemi");
        mp.removeContact(c3);
        mp.printContacts();

        System.out.println("findContact ");
        int contact1 = mp.findContact(c1);
        System.out.println(contact1);
        int contact2 = mp.findContact("Eda");
        System.out.println(contact2);








    }
}