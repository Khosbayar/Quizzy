package khosbayar.com.quizzy.viewmodels;

import android.content.Context;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.reactivex.disposables.CompositeDisposable;
import khosbayar.com.quizzy.models.Group;

public class GroupViewModel extends Observable {
    public ObservableInt progressBar;
    public ObservableInt groupRecycler;

    private Context context;
    private List<Group> groupList;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public GroupViewModel(Context context) {
        this.context = context;
        this.groupList = new ArrayList<>();
        progressBar = new ObservableInt(View.GONE);
        groupRecycler = new ObservableInt(View.GONE);
        intializeViews();
        fetchGroups();
    }

    private void intializeViews() {
        progressBar.set(View.GONE);
        groupRecycler.set(View.GONE);
    }

    private void fetchGroups() {
        /** TODO -- ADD THE FETCH GROUPS METHOD -- **/
    }

    private void updateGroupsDataList(List<Group> groups) {
        groupList = groups;
        setChanged();
        notifyObservers();
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
