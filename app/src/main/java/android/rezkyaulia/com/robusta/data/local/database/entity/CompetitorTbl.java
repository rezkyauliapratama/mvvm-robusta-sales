package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "CompetitorTbl",indexes = {
        @Index(value = "CompId", unique = true)
})
public class CompetitorTbl {
    private static final long serialVersionUID = 1L;
    @Id
    @Property(nameInDb = "CompId")
    private Long CompId;

    @Property(nameInDb = "CompName")
    private String CompName;

    @Property(nameInDb = "CompDesc")
    private String CompDesc;

    @Property(nameInDb = "CompCreated")
    private String CompCreated;

    @Property(nameInDb = "UpdateBy")
    private String UpdateBy;

@Generated(hash = 526424181)
public CompetitorTbl(Long CompId, String CompName, String CompDesc,
        String CompCreated, String UpdateBy) {
    this.CompId = CompId;
    this.CompName = CompName;
    this.CompDesc = CompDesc;
    this.CompCreated = CompCreated;
    this.UpdateBy = UpdateBy;
}

@Generated(hash = 916664875)
public CompetitorTbl() {
}

public Long getCompId() {
    return this.CompId;
}

public void setCompId(Long CompId) {
    this.CompId = CompId;
}

public String getCompName() {
    return this.CompName;
}

public void setCompName(String CompName) {
    this.CompName = CompName;
}

public String getCompDesc() {
    return this.CompDesc;
}

public void setCompDesc(String CompDesc) {
    this.CompDesc = CompDesc;
}

public String getCompCreated() {
    return this.CompCreated;
}

public void setCompCreated(String CompCreated) {
    this.CompCreated = CompCreated;
}

public String getUpdateBy() {
    return this.UpdateBy;
}

public void setUpdateBy(String UpdateBy) {
    this.UpdateBy = UpdateBy;
}


}
