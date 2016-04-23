package com.etiennelawlor.rxsignin.fragments;

import android.support.v4.app.Fragment;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by etiennelawlor on 6/13/15.
 */
public abstract class BaseFragment extends Fragment {

    // region Member Variables
    protected CompositeSubscription compositeSubscription = new CompositeSubscription();
    // endregion

    // region Lifecycle Methods
    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeSubscription.unsubscribe();
    }
    // region
}
