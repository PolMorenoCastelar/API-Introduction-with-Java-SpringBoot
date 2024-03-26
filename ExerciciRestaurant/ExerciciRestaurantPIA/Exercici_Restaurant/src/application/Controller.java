package application;

import domain.*;
import persistence.Repositori;


public class Controller {
    private static Repositori repositori=new Repositori();
    public static String createRestaurant(String name) throws Exception{
        Restaurant restaurant = new Restaurant(name);
        repositori.add(restaurant);
        return restaurant.getId();
    }

    public static int addTable(int clients, String id) throws Exception{
        Restaurant restaurant = repositori.findRestaurantById(id);
        restaurant.addTable(clients);
        return restaurant.checkAvailableClients();
    }
}
