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
@Entity(nameInDb = "ProvinceTbl",indexes = {
        @Index(value = "ProvinceId", unique = true)
})
public class ProvinceTbl {
    @Id
    @Property(nameInDb = "ProvinceId")
    private Long ProvinceId;

    @Property(nameInDb = "ProvinceName")
    private String ProvinceName;

    public ProvinceTbl(String name) {
        ProvinceName = name;
    }

public Long getProvinceId() {
    return this.ProvinceId;
}

public void setProvinceId(Long ProvinceId) {
    this.ProvinceId = ProvinceId;
}

public String getName() {
    return this.ProvinceName;
}

public void setName(String Name) {
    this.ProvinceName = Name;
}


    @Override
    public String toString() {
        return getName();
    }

    public String getProvinceName() {
        return this.ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    protected ProvinceTbl(Parcel in) {
        this.ProvinceId = (Long) in.readValue(Long.class.getClassLoader());
        this.ProvinceName = in.readString();
    }

    @Generated(hash = 1088848449)
    public ProvinceTbl(Long ProvinceId, String ProvinceName) {
        this.ProvinceId = ProvinceId;
        this.ProvinceName = ProvinceName;
    }

    @Generated(hash = 477370973)
    public ProvinceTbl() {
    }


}
