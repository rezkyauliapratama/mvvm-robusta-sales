package android.rezkyaulia.com.robusta.data.local.database.dao;

import android.rezkyaulia.com.robusta.data.local.database.Facade;
import android.rezkyaulia.com.robusta.data.local.database.entity.BranchTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.BranchTblDao;

import java.util.List;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */

public class DaoBranch {


    private BranchTblDao dao;
    DaoBranch(Facade facade) {
        this.dao = facade.session.getBranchTblDao();
    }

    public long add(BranchTbl object) {
        return dao.insertOrReplace(object);
    }

    public void add(List<BranchTbl> object) {
        dao.insertOrReplaceInTx(object);
    }

    public List<BranchTbl> getAll() {
        return dao.queryBuilder().list();
    }

    public BranchTbl get(long id) {
        return dao.queryBuilder().where(BranchTblDao.Properties.BranchId.eq(id)).unique();
    }


    public void removeAll() {
        dao.deleteAll();
    }

    public void remove(BranchTbl object) {
        dao.delete(object);
    }

    public long size(){
        return dao.count();
    }
}
