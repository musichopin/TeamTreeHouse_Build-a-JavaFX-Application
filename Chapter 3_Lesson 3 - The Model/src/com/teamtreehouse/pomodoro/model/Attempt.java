package com.teamtreehouse.pomodoro.model;

public class Attempt {
    private String mMessage; /*for tracking the user input*/
    private int mRemainingSeconds;
    private AttemptKind mKind; /*focus or break*/

    public Attempt(AttemptKind kind, String message) {
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
