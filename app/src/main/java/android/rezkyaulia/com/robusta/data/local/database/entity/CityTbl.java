package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "CityTbl",indexes = {
        @Index(value = "CityId", unique = true)
})
public class CityTbl {
    private static final long serialVersionUID = 1L;
    @Id
    @Property(nameInDb = "CityId")
    private Long CityId;

    @Property(nameInDb = "CityProvinceId")
    private Long CityProvinceId;

    @Property(nameInDb = "CityName")
    private String CityName;

    public CityTbl(String cityName) {
        CityName = cityName;
    }

    @Generated(hash = 1204956804)
    public CityTbl(Long CityId, Long CityProvinceId, String CityName) {
        this.CityId = CityId;
        this.CityProvinceId = CityProvinceId;
        this.CityName = CityName;
    }

    @Generated(hash = 194849650)
    public CityTbl() {
    }

    public Long getCityId() {
    return this.CityId;
}

    @Override
    public String toString() {
        return getCityName();
    }

    public void setCityId(Long CityId) {
    this.CityId = CityId;
}

public Long getCityProvinceId() {
    return this.CityProvinceId;
}

public void setCityProvinceId(Long CityProvinceId) {
    this.CityProvinceId = CityProvinceId;
}

public String getCityName() {
    return this.CityName;
}

public void setCityName(String CityName) {
    this.CityName = CityName;
}

}
