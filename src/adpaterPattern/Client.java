package adpaterPattern;

public class Client {
    public static void main(String[] args) {
        ClientInterface clientAdapter = new Adapter(new ACompany(), new BCompany());
        clientAdapter.start();
        clientAdapter.sort();
        clientAdapter.printPretty();
    }
}
