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
@Entity(nameInDb = "SalesVisitProductTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesVisitProductTbl {
    @Id
    @Property(nameInDb = "_id")
    @SerializedName("_id")
    private Long _id;

    @Property(nameInDb = "SalesVisitProdId")
    @SerializedName("ActprodId")
    private Long SalesVisitProdId;

    @Property(nameInDb = "SalesVisitDetailId")
    @SerializedName("ActprodActivitydetId")
    private Long SalesVisitDetailId;

    @Property(nameInDb = "ProductId")
    @SerializedName("ActprodProductId")
    private Long ProductId;

    @Property(nameInDb = "Quantity")
    @SerializedName("ActprodQuantity")
    private int Quantity;

    @Property(nameInDb = "Price")
    @SerializedName("ActprodPrice")
    private int Price;

    @Property(nameInDb = "_detid")
    @SerializedName("_detid")
    private Long _detid;


@Generated(hash = 1334705137)
public SalesVisitProductTbl(Long _id, Long SalesVisitProdId,
        Long SalesVisitDetailId, Long ProductId, int Quantity, int Price,
        Long _detid) {
    this._id = _id;
    this.SalesVisitProdId = SalesVisitProdId;
    this.SalesVisitDetailId = SalesVisitDetailId;
    this.ProductId = ProductId;
    this.Quantity = Quantity;
    this.Price = Price;
    this._detid = _detid;
}

@Generated(hash = 2081323043)
public SalesVisitProductTbl() {
}


public Long getSalesVisitDetailId() {
    return this.SalesVisitDetailId;
}

public void setSalesVisitDetailId(Long SalesVisitDetailId) {
    this.SalesVisitDetailId = SalesVisitDetailId;
}

public Long getProductId() {
    return this.ProductId;
}

public void setProductId(Long ProductId) {
    this.ProductId = ProductId;
}

public int getQuantity() {
    return this.Quantity;
}

public void setQuantity(int Quantity) {
    this.Quantity = Quantity;
}

public int getPrice() {
    return this.Price;
}

public void setPrice(int Price) {
    this.Price = Price;
}

public Long get_id() {
    return this._id;
}

public void set_id(Long _id) {
    this._id = _id;
}

public Long getSalesVisitProdId() {
    return this.SalesVisitProdId;
}

public void setSalesVisitProdId(Long SalesVisitProdId) {
    this.SalesVisitProdId = SalesVisitProdId;
}


public Long get_detid() {
    return this._detid;
}


public void set_detid(Long _detid) {
    this._detid = _detid;
}


}
