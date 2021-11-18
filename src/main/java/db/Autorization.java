package db;

public class Autorization extends Авторизація {
    private Авторизація autorization;

    public Autorization() {
        this.autorization = new Авторизація();
    }

    public boolean autorize(DataBase db) {
        return this.autorization.авторизуватися(db);
    }
}
