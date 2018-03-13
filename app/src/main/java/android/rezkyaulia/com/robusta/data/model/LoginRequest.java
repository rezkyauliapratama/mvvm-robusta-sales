package android.rezkyaulia.com.robusta.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */

public class LoginRequest {
    @SerializedName(value = "UserUsername")
    private String UserUsername;

    @SerializedName(value = "UserPassword")
    private String UserPassword;

    public LoginRequest() {
    }

    public LoginRequest(String userUsername, String userPassword) {
        UserUsername = userUsername;
        UserPassword = userPassword;
    }

    public String getUserUsername() {
        return UserUsername;
    }

    public void setUserUsername(String userUsername) {
        UserUsername = userUsername;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
