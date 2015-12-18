package com.example.tejavelagapudi.exressotestsdemo;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by tejavelagapudi on 12/18/15.
 */
public class Espresso extends ActivityInstrumentationTestCase2<MainActivity> {


    private MainActivity mMainActivity;

    public Espresso() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mMainActivity=getActivity();
    }

    public void testChangeText_sameActivity(){
        onView(withId(R.id.button)).perform(click());
    }


}
