package persistence;
import domain.Restaurant;
import java.util.ArrayList;
import java.util.List;

public class Repositori {
    public static List<Restaurant> allRestaurants= new ArrayList<Restaurant>();

    public void add(Restaurant x) {
        allRestaurants.add(x);
    }
    public Restaurant findRestaurantById(String ID) throws Exception {
        for (Restaurant x:allRestaurants){
            if(x.getId().compareTo(ID)==0) return x;
        }
        throw new Exception("NOT FOUND");
    }
    public void delete(Restaurant x){
        try {
            allRestaurants.remove(x);
        }catch (Exception m){
            System.out.println("NOT FOUND");
        }
    }
}