package com.test;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Singleton;

/**
 * Created by synycs on 12/9/16.
 */
public class Application extends ResourceConfig {

    public Application(){
        register(JacksonFeature.class);
        packages("com.test");
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(new User("abc","aa")).to(User.class);
            }
        });

    }
}
