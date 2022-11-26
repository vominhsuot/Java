
package demosuot.buoi9;

import java.util.Scanner;


public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String address;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name= sc.nextLine();
        System.out.println("Age: ");
        age= sc.nextInt();
        sc.nextLine();
        System.out.println("Address: ");
        address= sc.nextLine();
    }
    public static void title(){
        System.out.format("%-10s%-20s%-20s%-20s\n", "", "Name", "Age", "Address");
    }
    public String xuat(){
        return String.format("%-10s%-20s%-20d%-20s", "",  name, age, address);
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }

    @Override
    public int compareTo(Person o) {
        return age-o.getAge();
    }
    
    
    
}
