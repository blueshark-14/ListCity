package com.example.simpleparadox.listycity;
import android.app.Activity;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class ShowActivityTest {
    private Solo solo;
    @Rule
    public ActivityTestRule<MainActivity> rule =

            new ActivityTestRule<>(MainActivity.class, true, true);
    /**
     * Runs before all tests and creates solo instance.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        solo = new Solo(InstrumentationRegistry.getInstrumentation(),rule.getActivity());
    }
    /**
     * Gets the Activity
     * @throws Exception
     */
    @Test
    public void start() throws Exception{
        Activity activity = rule.getActivity();
    }
    /**
     * Add a city to the listview and check the city name using assertTrue
     * Clear all the cities from the listview and check again with assertFalse
     */
    @Test
    public  void newFunctest(){
        ListView listView = (ListView)solo.getView(R.id.city_list);
        View view = listView.getChildAt(0);
        solo.clickOnView(view);
        solo.assertCurrentActivity("Goal NOT FOUND!!!!!!", ShowActivity.class);
    }
    @Test
    public  void newFunctest2(){
        ListView listView = (ListView)solo.getView(R.id.city_list);
        View view = listView.getChildAt(0);
        solo.clickOnView(view);

        TextView textView = (TextView)solo.getView(R.id.textView);
        String cityname = textView.getText().toString();
        assertEquals("Edmonton", cityname);

        solo.assertCurrentActivity("GOAL  NOT FOUND !!!!!", ShowActivity.class);
    }
    @Test
    public  void newFunctest3(){
        ListView listView = (ListView)solo.getView(R.id.city_list);
        View view = listView.getChildAt(0);
        solo.clickOnView(view);

        Button button = (Button)solo.getView(R.id.button);
        solo.clickOnView(button);

        solo.assertCurrentActivity("404", MainActivity.class);
    }
    @After
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }
}


    /**
     * Check item taken from the listview
     */

/**
 * Close activity after each test
 * @throws Exception
}
**/
