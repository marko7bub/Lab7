package db;

public class DataBase extends db.БазаДаних {
    private БазаДаних dataBase;

    public DataBase() {
        this.dataBase = new БазаДаних();
    }

    public String getUserData() {
        return this.dataBase.отриматиДаніКористувача();
    }

    public String getStatData() {
        return this.dataBase.отриматиСтатистичніДані();
    }
}
