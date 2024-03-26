package domain;

public class Table {
    private static int counter = 0;
    private static String id = "";
    private int numClients;

    public Table (int numClients) throws Exception {
        id = ""+counter++;
        this.numClients = numClients;
    }

    public int getClients() {
        return numClients;
    }
}
