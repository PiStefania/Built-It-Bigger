package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokes.javaJokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    //get a joke and send back
    @ApiMethod(name = "tellAJoke")
    public MyBean tellAJoke() {
        MyBean response = new MyBean();
        javaJokes jokes = new javaJokes();
        response.setData(jokes.randomJokeGenerator());
        return response;
    }
}
