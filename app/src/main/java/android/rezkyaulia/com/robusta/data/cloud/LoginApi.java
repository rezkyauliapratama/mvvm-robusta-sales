package android.rezkyaulia.com.robusta.data.cloud;

import android.rezkyaulia.com.robusta.data.model.ApiResponse;
import android.rezkyaulia.com.robusta.data.model.LoginRequest;
import android.rezkyaulia.com.robusta.data.model.LoginResponse;

import com.google.gson.Gson;
import com.rezkyaulia.android.light_optimization_data.NetworkClient;
import com.rezkyaulia.android.light_optimization_data.RequestListener.ParsedCallback;

import java.io.IOException;

import io.reactivex.Single;
import okhttp3.Headers;
import timber.log.Timber;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */

public class LoginApi {
    private String path ;

    private final API api;

    LoginApi(API api) {
        this.api = api;
        path = this.api.getPath().concat("/users");
    }

    public LoginApi.Response get(LoginRequest loginRequest) {
        Headers.Builder builder = api.getUserHeader();
        Timber.e("loginRequest : " + new Gson().toJson(loginRequest));
        Timber.e("Header : " + new Gson().toJson(builder));

        try {
            return NetworkClient.getInstance()
                    .withUrl(path.concat("/login.json"))
                    .as(Response.class)
                    .setHeaders(builder.build())
                    .setJsonPojoBody(loginRequest)
                    .getSyncFuture();

        } catch (IOException e) {
            Timber.e("ERROR IOException : " + e.getMessage());


        } catch (Exception e) {
            Timber.e("ERROR Exception : " + e.getMessage());


        }

        return  null;
    }

    public void get(LoginRequest loginRequest, ParsedCallback<Response> callback) {
        Headers.Builder builder = api.getUserHeader();
        Timber.e("loginRequest : " + new Gson().toJson(loginRequest));
        Timber.e("Header : " + new Gson().toJson(builder));

        try {
            NetworkClient.getInstance()
                    .withUrl(path.concat("/login.json"))
                    .as(Response.class)
                    .setHeaders(builder.build())
                    .setJsonPojoBody(loginRequest)
                    .getAsFuture(callback);
        } catch (IOException e) {
            Timber.e("ERROR IOException : " + e.getMessage());
        } catch (Exception e) {
            Timber.e("ERROR Exception : " + e.getMessage());

        }

    }

    public class Response extends ApiResponse<LoginResponse> {
    }
}
