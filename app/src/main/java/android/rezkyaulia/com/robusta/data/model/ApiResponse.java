package android.rezkyaulia.com.robusta.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rezky Aulia Pratama on 9/6/2017.
 */

public class ApiResponse<T>   {

    @SerializedName(value = "ApiStatus")
    @Expose
    public String ApiStatus;
    @SerializedName(value = "ApiMessage")
    @Expose
    public String ApiMessage;

    @SerializedName("ApiElapsed")
    @Expose
    public String ApiElapsed;
    @SerializedName(value = "ApiList")
    @Expose
    public List<T> ApiList=new ArrayList<>();

    @SerializedName(value = "ApiValue",alternate={"data"})
    @Expose
    public T ApiValue;

    @SerializedName(value = "id",alternate={"Id"})
    @Expose
    public long Id;

    @SerializedName(value = "success",alternate={"Success"})
    @Expose
    public boolean Succcess;

    public ApiResponse() {
    }
}
