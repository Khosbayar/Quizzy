package khosbayar.com.quizzy.viewmodels;

import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.Observable;

import io.reactivex.disposables.CompositeDisposable;

public class LoginViewModel extends Observable {
    private Context context;
    public ObservableField<String> username;
    public ObservableField<String> password;
    public ObservableInt progressBar;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public LoginViewModel(Context context) {
        this.context = context;
        username = new ObservableField<>("");
        password = new ObservableField<>("");
        progressBar = new ObservableInt(View.GONE);
    }

    public void onSignUp(View view) {
        //context.startActivity();
    }

    public void onSignIn(View view) {
        /** TODO -- USE DISPOSABLE TO GET THE SIGN IN -- **/

    }
}
