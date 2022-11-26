package demosuot.buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner sc = new Scanner(System.in);
    public static List<Person> persons= new ArrayList<>();
    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Add person");
            System.out.println("2. Show all person");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Person person= new Person();
                    person.input();
                    FileController.writePersonToFile("person.txt", person);
                    System.out.println("done write to file!");
                    break;
                case 2:
                    persons= FileController.readPersonsFromFile("person.txt");
                    Person.title();
                    for (Person p: persons){
                        System.out.println(p.xuat());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong phu hop");
                    break;
            }
        } while (chon != 0);

    }
}
