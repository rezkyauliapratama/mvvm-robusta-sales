package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "LocHistoryTbl",indexes = {
        @Index(value = "LochistId", unique = true)
})
public class LocHistoryTbl {
    @Id
    @Property(nameInDb = "LochistId")
    private Long LochistId;

    @Property(nameInDb = "LochistSalesId")
    private Long LochistSalesId;

    @Property(nameInDb = "LochistDeviceId")
    private Long LochistDeviceId;

    @Property(nameInDb = "LochistLatitude")
    private double LochistLatitude;

    @Property(nameInDb = "LochistLongitude")
    private double LochistLongitude;

    @Property(nameInDb = "LochistDatetime")
    private String LochistDatetime;


@Generated(hash = 2136060158)
public LocHistoryTbl(Long LochistId, Long LochistSalesId, Long LochistDeviceId,
        double LochistLatitude, double LochistLongitude,
        String LochistDatetime) {
    this.LochistId = LochistId;
    this.LochistSalesId = LochistSalesId;
    this.LochistDeviceId = LochistDeviceId;
    this.LochistLatitude = LochistLatitude;
    this.LochistLongitude = LochistLongitude;
    this.LochistDatetime = LochistDatetime;
}

@Generated(hash = 845302439)
public LocHistoryTbl() {
}


public Long getLochistId() {
    return this.LochistId;
}

public void setLochistId(Long LochistId) {
    this.LochistId = LochistId;
}

public Long getLochistSalesId() {
    return this.LochistSalesId;
}

public void setLochistSalesId(Long LochistSalesId) {
    this.LochistSalesId = LochistSalesId;
}

public Long getLochistDeviceId() {
    return this.LochistDeviceId;
}

public void setLochistDeviceId(Long LochistDeviceId) {
    this.LochistDeviceId = LochistDeviceId;
}

public double getLochistLatitude() {
    return this.LochistLatitude;
}

public void setLochistLatitude(double LochistLatitude) {
    this.LochistLatitude = LochistLatitude;
}

public double getLochistLongitude() {
    return this.LochistLongitude;
}

public void setLochistLongitude(double LochistLongitude) {
    this.LochistLongitude = LochistLongitude;
}

public String getLochistDatetime() {
    return this.LochistDatetime;
}

public void setLochistDatetime(String LochistDatetime) {
    this.LochistDatetime = LochistDatetime;
}
}
