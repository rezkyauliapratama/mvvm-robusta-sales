package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "CompetitorProductTbl",indexes = {
        @Index(value = "ComprodId", unique = true)
})
public class CompetitorProductTbl {
    private static final long serialVersionUID = 1L;
    @Id
    @Property(nameInDb = "ComprodId")
    private Long ComprodId;

    @Property(nameInDb = "ComprodCompId")
    private Long ComprodCompId;

    @Property(nameInDb = "ComprodProductId")
    private Long ComprodProductId;

    @Property(nameInDb = "ComprodPrice")
    private int ComprodPrice;

    @Property(nameInDb = "ComprodCreated")
    private String ComprodCreated;

    @Property(nameInDb = "UpdateBy")
    private String UpdateBy;


@Generated(hash = 1745300587)
public CompetitorProductTbl(Long ComprodId, Long ComprodCompId,
        Long ComprodProductId, int ComprodPrice, String ComprodCreated,
        String UpdateBy) {
    this.ComprodId = ComprodId;
    this.ComprodCompId = ComprodCompId;
    this.ComprodProductId = ComprodProductId;
    this.ComprodPrice = ComprodPrice;
    this.ComprodCreated = ComprodCreated;
    this.UpdateBy = UpdateBy;
}

@Generated(hash = 1942011337)
public CompetitorProductTbl() {
}


public Long getComprodId() {
    return this.ComprodId;
}

public void setComprodId(Long ComprodId) {
    this.ComprodId = ComprodId;
}

public Long getComprodCompId() {
    return this.ComprodCompId;
}

public void setComprodCompId(Long ComprodCompId) {
    this.ComprodCompId = ComprodCompId;
}

public Long getComprodProductId() {
    return this.ComprodProductId;
}

public void setComprodProductId(Long ComprodProductId) {
    this.ComprodProductId = ComprodProductId;
}

public int getComprodPrice() {
    return this.ComprodPrice;
}

public void setComprodPrice(int ComprodPrice) {
    this.ComprodPrice = ComprodPrice;
}

public String getComprodCreated() {
    return this.ComprodCreated;
}

public void setComprodCreated(String ComprodCreated) {
    this.ComprodCreated = ComprodCreated;
}

public String getUpdateBy() {
    return this.UpdateBy;
}

public void setUpdateBy(String UpdateBy) {
    this.UpdateBy = UpdateBy;
}



}
