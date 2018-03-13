package android.rezkyaulia.com.robusta.data.cloud;

import android.content.Context;

import okhttp3.Headers;

/**
 * Created by Shiburagi on 14/12/2016.
 */

public class API {

    private static final String TAG = API.class.getSimpleName();

    Context context;
    // Static member class member that holds only one instance of the
    // SingletonExample class
    private static class SingletonHolder {
        public static API singletonInstance =
                new API();
    }

    // Providing Global point of access
    public static API getInstance() {
        return SingletonHolder.singletonInstance;
    }

    API() {
        loginApi = new LoginApi(this);


    }

    private final LoginApi loginApi;


    private final String protocol ="http://";
    private final String domain = "156.67.216.158/salesmmp/apiandroid";
    private final String path = protocol.concat(domain);

    public String getPath() {
        return path;
    }



    Headers.Builder getUserHeader() {
        return new Headers.Builder()
                .add("Content-Type", "application/json");
    }



    public LoginApi login() {
        return loginApi;
    }

}
