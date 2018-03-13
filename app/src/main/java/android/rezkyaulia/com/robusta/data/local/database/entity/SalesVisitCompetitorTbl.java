package android.rezkyaulia.com.robusta.data.local.database.entity;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "SalesVisitCompetitorTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesVisitCompetitorTbl {
    @Id
    @Property(nameInDb = "_id")
    @SerializedName("_id")
    private Long _id;


    @Property(nameInDb = "SalesVisitCompId")
    @SerializedName("ActcompId")
    private Long SalesVisitCompId;

    @Property(nameInDb = "SalesVisitDetailId")
    @SerializedName("ActcompActivitydetId")
    private Long SalesVisitDetailId;

    @Property(nameInDb = "CompetitorProdId")
    @SerializedName("ActcompComprodId")
    private Long CompetitorProdId;

    @Property(nameInDb = "_detid")
    @SerializedName("_detid")
    private Long _detid;




@Generated(hash = 658071734)
public SalesVisitCompetitorTbl(Long _id, Long SalesVisitCompId,
        Long SalesVisitDetailId, Long CompetitorProdId, Long _detid) {
    this._id = _id;
    this.SalesVisitCompId = SalesVisitCompId;
    this.SalesVisitDetailId = SalesVisitDetailId;
    this.CompetitorProdId = CompetitorProdId;
    this._detid = _detid;
}

@Generated(hash = 1736722491)
public SalesVisitCompetitorTbl() {
}




public Long getSalesVisitDetailId() {
    return this.SalesVisitDetailId;
}

public void setSalesVisitDetailId(Long SalesVisitDetailId) {
    this.SalesVisitDetailId = SalesVisitDetailId;
}

public Long get_id() {
    return this._id;
}

public void set_id(Long _id) {
    this._id = _id;
}

public Long getSalesVisitCompId() {
    return this.SalesVisitCompId;
}

public void setSalesVisitCompId(Long SalesVisitCompId) {
    this.SalesVisitCompId = SalesVisitCompId;
}


public Long getCompetitorProdId() {
    return this.CompetitorProdId;
}

public void setCompetitorProdId(Long CompetitorProdId) {
    this.CompetitorProdId = CompetitorProdId;
}



public Long get_detid() {
    return this._detid;
}



public void set_detid(Long _detid) {
    this._detid = _detid;
}


}
