package adpaterPattern;


public class Adapter implements ClientInterface {
    ACompany aCompany;
    BCompany bCompany;

    Adapter(ACompany aCompany, BCompany bCompany) {
        this.aCompany = aCompany;
        this.bCompany = bCompany;
    }

    @Override
    public void start() {
        aCompany.start();
    }

    @Override
    public void sort() {
        bCompany.sort();
    }

    @Override
    public void printPretty() {
        aCompany.printPretty();
    }
}
