package view;
import application.Controller;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
       String ID = Controller.createRestaurant(restaurantInfo());
       addClients(ID);

    }
    private static String restaurantInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Restaurant name:");
        String name = sc.nextLine();
        return name;
    }
    private static void addClients(String ID){
        char r='y';
        while(r=='y'||r=='Y') {
            Scanner sc = new Scanner(System.in);
            System.out.println("How  many clients do you want to add");
            int clientnum = sc.nextInt();
            try {System.out.println("Places left="+Controller.addTable(clientnum,ID));} catch (Exception e) {System.out.println("Capacity overpassed");}
            System.out.println("Do you want to add more? y/n");
            r = sc.next().charAt(0);
        }
    }



}
