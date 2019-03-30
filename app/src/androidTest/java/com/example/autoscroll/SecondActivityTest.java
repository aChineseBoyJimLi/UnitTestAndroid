package com.example.autoscroll;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> activityActivityTestRule = new ActivityTestRule<>(SecondActivity.class);
    private SecondActivity secondActivity = null;

    @Before
    public void setUp() throws Exception {
        secondActivity = activityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void onCreate() {
        Log.d("TAG", "onCreate");
    }

    @Test
    public void testInputText(){
        secondActivity.findViewById(R.id.mail);
        secondActivity.findViewById(R.id.pwd);
        secondActivity.findViewById(R.id.btn);

        Espresso.onView(withId(R.id.mail)).perform(typeText("123"));
        Espresso.onView(withId(R.id.pwd)).perform(typeText("password"));

        Espresso.onView(withId(R.id.btn)).perform(click());
    }
}