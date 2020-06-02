package com.mfy.butterknife;

import androidx.annotation.UiThread;

public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder(){

        @Override
        public void unbind() {

        }
    };
}
