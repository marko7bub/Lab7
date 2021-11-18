package db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Autorization autorization = new Autorization();
        if (autorization.autorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
