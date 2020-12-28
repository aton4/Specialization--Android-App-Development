package com.example.loginapp;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExpressoTests {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void noEmailandPasswordLengthLessThan8()
    {
        activityRule.getScenario().onActivity(activity ->
        {
            onView(withId(R.id.emailInput)).perform(typeText("rand"));
            onView(withId(R.id.passwordInput)).perform(typeText("rand"));

            onView(withId(R.id.loginButton)).perform(click());

            onView(withText("The provided password is too short")).inRoot(withDecorView(not(activity.getWindow().getDecorView()))).check(matches(isDisplayed()));
            return;

        });
    }


}
