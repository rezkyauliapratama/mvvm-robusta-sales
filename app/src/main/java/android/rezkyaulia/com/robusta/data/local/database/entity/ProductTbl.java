package android.rezkyaulia.com.robusta.data.local.database.entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "ProductTbl",indexes = {
        @Index(value = "ProductId", unique = true)
})
public class ProductTbl  {
    private static final long serialVersionUID = 1L;
    @Id
    @Property(nameInDb = "ProductId")
    private Long ProductId;

    @Property(nameInDb = "ProductCode")
    private String ProductCode;

    @Property(nameInDb = "ProductName")
    private String ProductName;

    @Property(nameInDb = "ProductUm")
    private String ProductUm;

    @Property(nameInDb = "ProductCreated")
    private String ProductCreated;


public Long getProductId() {
    return this.ProductId;
}

public void setProductId(Long ProductId) {
    this.ProductId = ProductId;
}

public String getProductCode() {
    return this.ProductCode;
}

public void setProductCode(String ProductCode) {
    this.ProductCode = ProductCode;
}

public String getProductName() {
    return this.ProductName;
}

public void setProductName(String ProductName) {
    this.ProductName = ProductName;
}

public String getProductUm() {
    return this.ProductUm;
}

public void setProductUm(String ProductUm) {
    this.ProductUm = ProductUm;
}

public String getProductCreated() {
    return this.ProductCreated;
}

public void setProductCreated(String ProductCreated) {
    this.ProductCreated = ProductCreated;
}

    public ProductTbl(String productName) {
        ProductName = productName;
    }

    @Generated(hash = 72871010)
    public ProductTbl(Long ProductId, String ProductCode, String ProductName,
            String ProductUm, String ProductCreated) {
        this.ProductId = ProductId;
        this.ProductCode = ProductCode;
        this.ProductName = ProductName;
        this.ProductUm = ProductUm;
        this.ProductCreated = ProductCreated;
    }

    @Generated(hash = 266615731)
    public ProductTbl() {
    }

    @Override
    public String toString() {
        return getProductName();
    }

}
