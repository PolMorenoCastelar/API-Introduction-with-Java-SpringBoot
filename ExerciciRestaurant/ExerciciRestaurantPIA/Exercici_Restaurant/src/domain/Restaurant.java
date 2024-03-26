package domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static final int MAX_CAPACITY = 24;
    private static int counter = 0;
    private static String id = "";
    private String name = "";
    private static int numClients;
    public static List<Table> tableList;

    public Restaurant(String name){
        if(name != null)
            this.name = name;

        id = ""+counter++;
        numClients = 0;
        tableList = new ArrayList<Table>();
    }
    public static int checkAvailableClients(){
        if((MAX_CAPACITY - numClients) >= 0)
            return (MAX_CAPACITY - numClients);
        else return 0;
    }

    public void addTable(int clients) throws Exception {
        if ((checkAvailableClients() - clients) < 0)
            throw new Exception();

        Table table = new Table(clients);
        tableList.add(table);
        numClients += clients;
        System.out.println(showClientsPerTable());
    }

    public String showClientsPerTable(){
        StringBuilder tableInfo = new StringBuilder();
        int i = 1;
        for(Table t : tableList)
        {
            tableInfo.append("Table ").append(i).append(":").append(t.getClients());
            tableInfo.append("\n");
            i++;
        }
        return tableInfo.toString();
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return this.name;
    }

}
