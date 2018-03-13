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
@Entity(nameInDb = "ClientTbl",indexes = {
        @Index(value = "UserclientId", unique = true)
})
public class ClientTbl implements Parcelable {

    @Id
    @Property(nameInDb = "UserclientId")
    private Long UserclientId;

    @Property(nameInDb = "UserclientCustId")
    private Long UserclientCustId;

    @Property(nameInDb = "UserclientName")
    private String UserclientName;

    @Property(nameInDb = "UserclientPosition")
    private String UserclientPosition;

    @Property(nameInDb = "UserclientDept")
    private String UserclientDept;


    @Property(nameInDb = "UserclientPhone")
    private String UserclientPhone;

    @Property(nameInDb = "UserclientMobilePhone")
    private String UserclientMobilePhone;

    @Property(nameInDb = "UserclientEmail")
    private String UserclientEmail;

    @Property(nameInDb = "UserclientCreated")
    private String UserclientCreated;


public Long getUserclientId() {
    return this.UserclientId;
}

public void setUserclientId(Long UserclientId) {
    this.UserclientId = UserclientId;
}

public Long getUserclientCustId() {
    return this.UserclientCustId;
}

public void setUserclientCustId(Long UserclientCustId) {
    this.UserclientCustId = UserclientCustId;
}

public String getUserclientName() {
    return this.UserclientName;
}

public void setUserclientName(String UserclientName) {
    this.UserclientName = UserclientName;
}

public String getUserclientPosition() {
    return this.UserclientPosition;
}

public void setUserclientPosition(String UserclientPosition) {
    this.UserclientPosition = UserclientPosition;
}

public String getUserclientDept() {
    return this.UserclientDept;
}

public void setUserclientDept(String UserclientDept) {
    this.UserclientDept = UserclientDept;
}

public String getUserclientPhone() {
    return this.UserclientPhone;
}

public void setUserclientPhone(String UserclientPhone) {
    this.UserclientPhone = UserclientPhone;
}

public String getUserclientMobilePhone() {
    return this.UserclientMobilePhone;
}

public void setUserclientMobilePhone(String UserclientMobilePhone) {
    this.UserclientMobilePhone = UserclientMobilePhone;
}

public String getUserclientEmail() {
    return this.UserclientEmail;
}

public void setUserclientEmail(String UserclientEmail) {
    this.UserclientEmail = UserclientEmail;
}

public String getUserclientCreated() {
    return this.UserclientCreated;
}

public void setUserclientCreated(String UserclientCreated) {
    this.UserclientCreated = UserclientCreated;
}

    public ClientTbl(String userclientName) {
        UserclientName = userclientName;
    }

    @Override
    public String toString() {
        return getUserclientName();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.UserclientId);
        dest.writeValue(this.UserclientCustId);
        dest.writeString(this.UserclientName);
        dest.writeString(this.UserclientPosition);
        dest.writeString(this.UserclientDept);
        dest.writeString(this.UserclientPhone);
        dest.writeString(this.UserclientMobilePhone);
        dest.writeString(this.UserclientEmail);
        dest.writeString(this.UserclientCreated);
    }

    protected ClientTbl(Parcel in) {
        this.UserclientId = (Long) in.readValue(Long.class.getClassLoader());
        this.UserclientCustId = (Long) in.readValue(Long.class.getClassLoader());
        this.UserclientName = in.readString();
        this.UserclientPosition = in.readString();
        this.UserclientDept = in.readString();
        this.UserclientPhone = in.readString();
        this.UserclientMobilePhone = in.readString();
        this.UserclientEmail = in.readString();
        this.UserclientCreated = in.readString();
    }

    @Generated(hash = 1436360233)
    public ClientTbl(Long UserclientId, Long UserclientCustId,
            String UserclientName, String UserclientPosition, String UserclientDept,
            String UserclientPhone, String UserclientMobilePhone,
            String UserclientEmail, String UserclientCreated) {
        this.UserclientId = UserclientId;
        this.UserclientCustId = UserclientCustId;
        this.UserclientName = UserclientName;
        this.UserclientPosition = UserclientPosition;
        this.UserclientDept = UserclientDept;
        this.UserclientPhone = UserclientPhone;
        this.UserclientMobilePhone = UserclientMobilePhone;
        this.UserclientEmail = UserclientEmail;
        this.UserclientCreated = UserclientCreated;
    }

    @Generated(hash = 605951485)
    public ClientTbl() {
    }

    public static final Creator<ClientTbl> CREATOR = new Creator<ClientTbl>() {
        @Override
        public ClientTbl createFromParcel(Parcel source) {
            return new ClientTbl(source);
        }

        @Override
        public ClientTbl[] newArray(int size) {
            return new ClientTbl[size];
        }
    };
}
