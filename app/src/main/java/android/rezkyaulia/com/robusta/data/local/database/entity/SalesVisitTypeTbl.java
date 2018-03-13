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
@Entity(nameInDb = "SalesVisitTypeTbl",indexes = {
        @Index(value = "Id", unique = true)
})
public class SalesVisitTypeTbl {
    @Id
    @Property(nameInDb = "Id")
    @SerializedName("TypeId")
    private Long Id;

    @Property(nameInDb = "TypeName")
    @SerializedName("TypeName")
    private String TypeName;

    @Property(nameInDb = "TypeCreated")
    @SerializedName("TypeCreated")
    private String TypeCreated;

    public SalesVisitTypeTbl(String typeName) {
        TypeName = typeName;
    }

    @Generated(hash = 555645333)
    public SalesVisitTypeTbl(Long Id, String TypeName, String TypeCreated) {
        this.Id = Id;
        this.TypeName = TypeName;
        this.TypeCreated = TypeCreated;
    }

    @Generated(hash = 1944452917)
    public SalesVisitTypeTbl() {
    }

    @Override
    public String toString() {
        return getTypeName();
    }

    public Long getId() {
    return this.Id;
}

public void setId(Long Id) {
    this.Id = Id;
}

public String getTypeName() {
    return this.TypeName;
}

public void setTypeName(String TypeName) {
    this.TypeName = TypeName;
}

public String getTypeCreated() {
    return this.TypeCreated;
}

public void setTypeCreated(String TypeCreated) {
    this.TypeCreated = TypeCreated;
}


}
