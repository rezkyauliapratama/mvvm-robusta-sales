package android.rezkyaulia.com.robusta.data.local.database;


import android.rezkyaulia.com.robusta.data.local.database.entity.DaoSession;

/**
 * Created by Shiburagi on 07/12/2016.
 */

public class Facade {

    private static Facade instance;
    public final DaoSession session;

    public static void init(DaoSession daoSession) {
        instance = new Facade(daoSession);
    }

    public static Facade getInstance() {
        return instance;
    }




    Facade(DaoSession daoSession) {
        this.session = daoSession;


    }

    public DaoSession getSession() {
        return session;
    }

}
