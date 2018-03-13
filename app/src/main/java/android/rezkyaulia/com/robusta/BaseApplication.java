package android.rezkyaulia.com.robusta;

import android.app.Application;
import android.rezkyaulia.com.robusta.data.local.database.Facade;
import android.rezkyaulia.com.robusta.data.local.database.FacadeOpenHelper;
import android.rezkyaulia.com.robusta.data.local.database.entity.DaoMaster;
import android.rezkyaulia.com.robusta.data.local.database.entity.DaoSession;

import com.rezkyaulia.android.light_optimization_data.NetworkClient;

import org.greenrobot.greendao.database.Database;

import timber.log.Timber;

/**
 * Created by Rezky Aulia Pratama on 3/8/2018.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        String databaseName = "salestool-db";
        FacadeOpenHelper helper = new FacadeOpenHelper(this, databaseName);

        String password = "e=mc^2,y=mx+c";
        Timber.e("database name : %s", databaseName);
        Database db = helper.getWritableDb();

        DaoSession daoSession = new DaoMaster(db).newSession();
        Facade.init(daoSession);
        Timber.plant(new Timber.DebugTree());
        NetworkClient.getInstance().client(this);

    }
}
