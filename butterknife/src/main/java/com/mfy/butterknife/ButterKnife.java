package com.mfy.butterknife;

import android.app.Activity;

import java.lang.reflect.Constructor;

public class ButterKnife {

    public static Unbinder bind(Activity activity) {
        try {
            Class<? extends Unbinder> aClass = (Class<? extends Unbinder>) Class.forName(activity.getClass().getName() + "_ViewBinding");
            Constructor<? extends Unbinder> bindConstructor = aClass.getDeclaredConstructor(activity.getClass());
            Unbinder unbinder = bindConstructor.newInstance(activity);
            return unbinder;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unbinder.EMPTY;
    }
}
