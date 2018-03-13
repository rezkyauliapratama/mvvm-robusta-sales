package android.rezkyaulia.com.robusta.data.local.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.rezkyaulia.com.robusta.data.local.database.entity.DaoMaster;

/**
 * Created by Shiburagi on 30/10/2017.
 */

public class FacadeOpenHelper extends DaoMaster.OpenHelper{

    public FacadeOpenHelper(Context context, String name) {
        super(context, name);
    }

    public FacadeOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
}
