package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "DeviceTbl",indexes = {
        @Index(value = "DeviceId", unique = true)
})
public class DeviceTbl {
    @Id
    @Property(nameInDb = "DeviceId")
    private Long DeviceId;

    @Property(nameInDb = "DeviceName")
    private String DeviceName;

    @Property(nameInDb = "DeviceMacAddress")
    private String DeviceMacAddress;

    @Property(nameInDb = "DeviceStatus")
    private boolean DeviceStatus;

    @Property(nameInDb = "DeviceCreated")
    private String DeviceCreated;

@Generated(hash = 1068740695)
public DeviceTbl(Long DeviceId, String DeviceName, String DeviceMacAddress,
        boolean DeviceStatus, String DeviceCreated) {
    this.DeviceId = DeviceId;
    this.DeviceName = DeviceName;
    this.DeviceMacAddress = DeviceMacAddress;
    this.DeviceStatus = DeviceStatus;
    this.DeviceCreated = DeviceCreated;
}

@Generated(hash = 700266332)
public DeviceTbl() {
}

public Long getDeviceId() {
    return this.DeviceId;
}

public void setDeviceId(Long DeviceId) {
    this.DeviceId = DeviceId;
}

public String getDeviceName() {
    return this.DeviceName;
}

public void setDeviceName(String DeviceName) {
    this.DeviceName = DeviceName;
}

public String getDeviceMacAddress() {
    return this.DeviceMacAddress;
}

public void setDeviceMacAddress(String DeviceMacAddress) {
    this.DeviceMacAddress = DeviceMacAddress;
}

public boolean getDeviceStatus() {
    return this.DeviceStatus;
}

public void setDeviceStatus(boolean DeviceStatus) {
    this.DeviceStatus = DeviceStatus;
}

public String getDeviceCreated() {
    return this.DeviceCreated;
}

public void setDeviceCreated(String DeviceCreated) {
    this.DeviceCreated = DeviceCreated;
}

}
