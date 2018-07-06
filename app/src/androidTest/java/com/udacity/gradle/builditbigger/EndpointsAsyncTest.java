package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.example.android.javajokes.javaJokes;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTest{

    @Test
    public void testAsyncTaskNotEmpty() throws InterruptedException {
        final CountDownLatch signal = new CountDownLatch(1);
        final String[] jokeString = {null};
        final EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setListener(new EndpointsAsyncTask.EndpointsAsyncTaskListener() {
            @Override
            public void onComplete(String jokeStr) {
                assertNotNull(jokeStr);
                if (jokeStr != null){
                    assertFalse(TextUtils.isEmpty(jokeStr));
                    jokeString[0] = jokeStr;
                    signal.countDown();
                }
            }
        });
        task.execute();
        signal.await();
        assertFalse(TextUtils.isEmpty(jokeString[0]));
    }

    @Test
    public void testAsyncTaskIncludedJoke() throws InterruptedException {
        final CountDownLatch signal = new CountDownLatch(1);
        final String[] jokeString = {null};
        final EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setListener(new EndpointsAsyncTask.EndpointsAsyncTaskListener() {
            @Override
            public void onComplete(String jokeStr) {
                assertNotNull(jokeStr);
                if (jokeStr != null){
                    assertFalse(TextUtils.isEmpty(jokeStr));
                    jokeString[0] = jokeStr;
                    signal.countDown();
                }
            }
        });
        task.execute();
        signal.await();
        javaJokes jokes = new javaJokes();
        ArrayList<String> jokesList = jokes.getJokes();
        assertTrue(jokesList.contains(jokeString[0]));
    }

    /*public void testAsyncTaskIncludedJoke() throws Exception {
        final String[] jokeStr = {null};
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setListener(new EndpointsAsyncTask.EndpointsAsyncTaskListener() {
            @Override
            public void onComplete(String jokeString) {
                jokeStr[0] = jokeString;
            }
        }).execute();

        javaJokes jokes = new javaJokes();
        ArrayList<String> jokesList = jokes.getJokes();
        for(int i=0;i<jokesList.size();i++) {
            assertEquals(jokeStr[0], jokesList.get(i));
        }
    }*/
}
