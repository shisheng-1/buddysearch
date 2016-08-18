package com.buddysearch.presentation.manager;

import com.buddysearch.presentation.domain.dto.User;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public interface AuthManager {

    void signInGoogle(GoogleSignInAccount acct, SignInCallback signInCallback);

    void signOut(SignOutCallback signOutCallback);

    boolean isSignedIn();

    User getCurrentUser();

    interface SignInCallback {

        void onSignInSuccess();

        void onSignInError();
    }

    interface SignOutCallback {

        void onSignOutSuccess();

        void onSignOutError();
    }
}