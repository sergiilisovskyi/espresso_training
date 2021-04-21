package org.amfoss.templeapp.androidTest.ui;


import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.rule.ActivityTestRule;

import org.amfoss.templeapp.R;
import org.amfoss.templeapp.home.LoginActivity;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class BasicTest {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityTestRule =
            new ActivityTestRule<>(LoginActivity.class, false, false);

    @Test
    public void basicFlowTest() {
        loginActivityTestRule.launchActivity(null);

        onView(withId(R.id.email_button))
                .perform(click());

        onView(withId(R.id.button_next)).check(ViewAssertions.matches(isDisplayed()));

        onView(withId(R.id.email)).check(ViewAssertions.matches(isDisplayed()));
        onView(withText("Next")).check(ViewAssertions.matches(isDisplayed()));
    }


}
