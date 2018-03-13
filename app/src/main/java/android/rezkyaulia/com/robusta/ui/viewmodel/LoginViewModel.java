package android.rezkyaulia.com.robusta.ui.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.os.AsyncTask;
import android.rezkyaulia.com.robusta.data.cloud.API;
import android.rezkyaulia.com.robusta.data.cloud.LoginApi;
import android.rezkyaulia.com.robusta.data.cloud.RepoApi;
import android.rezkyaulia.com.robusta.data.model.LoginRequest;

import com.google.gson.Gson;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by Rezky Aulia Pratama on 3/8/2018.
 */

public class LoginViewModel extends ViewModel {
    private final CompositeDisposable disposables = new CompositeDisposable();
    LoginApi loginApi;
    RepoApi repoApi;
    public LoginViewModel() {
        loginApi = API.getInstance().login();
        repoApi = new RepoApi();
    }

    public void login(String email, String password) {
        if (email.length() > 0 && password.length() > 0){
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setUserUsername("sales1");
            loginRequest.setUserPassword("1234");
            Timber.e("loginReq : "+new Gson().toJson(loginRequest));
            repoApi.getLogin(loginRequest)
                    .subscribeOn(Schedulers.io())
                    .subscribe(
                            new SingleObserver<LoginApi.Response>() {
                                @Override
                                public void onSubscribe(Disposable d) {

                                }

                                @Override
                                public void onSuccess(LoginApi.Response response) {
                                    Timber.e("onSuccess : "+new Gson().toJson(response));

                                }

                                @Override
                                public void onError(Throwable e) {
                                    Timber.e("onError : "+new Gson().toJson(e));

                                }
                            });
//            new loadtask().execute(loginRequest);
            /*disposables.add(loginApi.get(loginRequest)
                    .subscribeOn(Schedulers.io())
                    .subscribe(
                            greeting -> {
                                Timber.e("Login Response : "+new Gson().toJson(greeting));
                            },
                            throwable -> {
                                Timber.e("ERROR : "+new Gson().toJson(throwable));
                            }
                    ));
*/

        }
    }

    private class loadtask extends AsyncTask<LoginRequest,Void,Void> {


        @Override
        protected Void doInBackground(LoginRequest... params) {
            Timber.e("params : "+new Gson().toJson(params[0]));
         /*   disposables.add(loginApi.get(params[0])
                    .subscribeOn(Schedulers.io())
                    .subscribe(
                            greeting -> {
                                Timber.e("Login Response : "+new Gson().toJson(greeting));
                            },
                            throwable -> {
                                Timber.e("ERROR : "+new Gson().toJson(throwable));
                            }
                    ));*/


            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);


        }
    }
}
