package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "RoomTbl",indexes = {
        @Index(value = "RoomId", unique = true)
})
public class RoomTbl {
    private static final long serialVersionUID = 1L;
    @Id
    @Property(nameInDb = "RoomId")
    private Long RoomId;

    @Property(nameInDb = "RoomName")
    private String RoomName;

    @Property(nameInDb = "RoomDesc")
    private String RoomDesc;

    @Property(nameInDb = "RoomCreated")
    private String RoomCreated;

    @Property(nameInDb = "UpdateBy")
    private String UpdateBy;


public Long getRoomId() {
    return this.RoomId;
}

public void setRoomId(Long RoomId) {
    this.RoomId = RoomId;
}

public String getRoomName() {
    return this.RoomName;
}

public void setRoomName(String RoomName) {
    this.RoomName = RoomName;
}

public String getRoomDesc() {
    return this.RoomDesc;
}

public void setRoomDesc(String RoomDesc) {
    this.RoomDesc = RoomDesc;
}

public String getRoomCreated() {
    return this.RoomCreated;
}

public void setRoomCreated(String RoomCreated) {
    this.RoomCreated = RoomCreated;
}

public String getUpdateBy() {
    return this.UpdateBy;
}

public void setUpdateBy(String UpdateBy) {
    this.UpdateBy = UpdateBy;
}

    public RoomTbl(String roomName) {
        RoomName = roomName;
    }

    @Generated(hash = 1632332823)
    public RoomTbl(Long RoomId, String RoomName, String RoomDesc,
            String RoomCreated, String UpdateBy) {
        this.RoomId = RoomId;
        this.RoomName = RoomName;
        this.RoomDesc = RoomDesc;
        this.RoomCreated = RoomCreated;
        this.UpdateBy = UpdateBy;
    }

    @Generated(hash = 534592112)
    public RoomTbl() {
    }

    @Override
    public String toString() {
        return getRoomName();
    }
}
