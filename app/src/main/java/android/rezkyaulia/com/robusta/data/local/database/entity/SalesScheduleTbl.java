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
@Entity(nameInDb = "SalesScheduleTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesScheduleTbl {
    @Id (autoincrement = true)
    @Property(nameInDb = "_id")
    private Long _id;


    @Property(nameInDb = "ScheduleId")
    private Long ScheduleId;

    @Property(nameInDb = "ScheduleSalesId")
    private Long ScheduleSalesId;

    @Property(nameInDb = "ScheduleSubject")
    private String ScheduleSubject;

    @Property(nameInDb = "ScheduleStart")
    private String ScheduleStart;

    @Property(nameInDb = "ScheduleEnd")
    private String ScheduleEnd;

    @Property(nameInDb = "ScheduleLocation")
    private String ScheduleLocation;

    @Property(nameInDb = "ScheduleCreated")
    private String ScheduleCreated;


@Generated(hash = 239821477)
public SalesScheduleTbl(Long _id, Long ScheduleId, Long ScheduleSalesId,
        String ScheduleSubject, String ScheduleStart, String ScheduleEnd,
        String ScheduleLocation, String ScheduleCreated) {
    this._id = _id;
    this.ScheduleId = ScheduleId;
    this.ScheduleSalesId = ScheduleSalesId;
    this.ScheduleSubject = ScheduleSubject;
    this.ScheduleStart = ScheduleStart;
    this.ScheduleEnd = ScheduleEnd;
    this.ScheduleLocation = ScheduleLocation;
    this.ScheduleCreated = ScheduleCreated;
}

@Generated(hash = 1030223833)
public SalesScheduleTbl() {
}


public Long getScheduleId() {
    return this.ScheduleId;
}

public void setScheduleId(Long ScheduleId) {
    this.ScheduleId = ScheduleId;
}

public Long getScheduleSalesId() {
    return this.ScheduleSalesId;
}

public void setScheduleSalesId(Long ScheduleSalesId) {
    this.ScheduleSalesId = ScheduleSalesId;
}

public String getScheduleSubject() {
    return this.ScheduleSubject;
}

public void setScheduleSubject(String ScheduleSubject) {
    this.ScheduleSubject = ScheduleSubject;
}

public String getScheduleStart() {
    return this.ScheduleStart;
}

public void setScheduleStart(String ScheduleStart) {
    this.ScheduleStart = ScheduleStart;
}

public String getScheduleEnd() {
    return this.ScheduleEnd;
}

public void setScheduleEnd(String ScheduleEnd) {
    this.ScheduleEnd = ScheduleEnd;
}

public String getScheduleLocation() {
    return this.ScheduleLocation;
}

public void setScheduleLocation(String ScheduleLocation) {
    this.ScheduleLocation = ScheduleLocation;
}

public String getScheduleCreated() {
    return this.ScheduleCreated;
}

public void setScheduleCreated(String ScheduleCreated) {
    this.ScheduleCreated = ScheduleCreated;
}

public Long get_id() {
    return this._id;
}

public void set_id(Long _id) {
    this._id = _id;
}

}
