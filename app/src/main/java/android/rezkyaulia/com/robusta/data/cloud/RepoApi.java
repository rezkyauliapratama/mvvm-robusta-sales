package android.rezkyaulia.com.robusta.data.cloud;

import android.rezkyaulia.com.robusta.data.model.LoginRequest;

import io.reactivex.Observable;
import io.reactivex.Single;


/**
 * Created by Rezky Aulia Pratama on 3/8/2018.
 */

public class RepoApi {

    public RepoApi() {
    }

    public Single<LoginApi.Response> getLogin (LoginRequest loginRequest){
        return Single.create(emitter -> {
            try {
                emitter.onSuccess(API.getInstance().login().get(loginRequest));
            }catch (Exception e){
                emitter.onError(e);
            }


        });
//        return Observable.fromCallable(() -> API.getInstance().login().get(loginRequest));
    }
}
