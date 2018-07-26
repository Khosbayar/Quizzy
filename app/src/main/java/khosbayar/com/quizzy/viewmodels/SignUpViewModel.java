package khosbayar.com.quizzy.viewmodels;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.Observable;

import khosbayar.com.quizzy.R;

public class SignUpViewModel extends Observable {
    public ObservableField<String> username;
    public ObservableField<String> email;
    public ObservableField<String> password;
    public ObservableField<String> confirmPassword;
    public ObservableInt progressBar;

    private Context context;

    public SignUpViewModel(Context context) {
        this.context = context;
        progressBar = new ObservableInt(View.GONE);
        username = new ObservableField<>("");
        password = new ObservableField<>("");
        email = new ObservableField<>("");
        confirmPassword = new ObservableField<>("");
    }

    private boolean isValid() {
        String errorString = "";
        if (username.toString().isEmpty()) {
            errorString += "\nUsername should not be empty";
        }
        if (password.toString().isEmpty()) {
            errorString += "\nPassword should not be empty";
        }
        if (!password.toString().equals(confirmPassword)) {
            errorString += "\nPassword should be the same as confirm password";
        }

        if (errorString.isEmpty()) return true;
        showErrorDialog(errorString);
        return false;
    }

    public void onSignUp(View view) {
        if (isValid()) {
            /** TODO -- Create the user **/
        }
    }

    private void showErrorDialog(String string) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Error Filling In Details")
                .setMessage(string)
                .setCancelable(true)
                .setPositiveButton(R.string.yes_button, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
