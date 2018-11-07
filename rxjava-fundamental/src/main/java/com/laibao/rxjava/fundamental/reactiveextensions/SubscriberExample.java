package com.laibao.rxjava.fundamental.reactiveextensions;

import rx.Observable;
import rx.Subscriber;

import java.util.Arrays;
import java.util.List;

/**
 * @author laibao wang
 */
public class SubscriberExample {

    public static void main(String[] args) {
        List<Tweet> tweetList = Arrays.asList(new Tweet(1,"Java"),new Tweet(2,"Kotlin"),new Tweet(3,"Scala"),new Tweet(4,"Groovy"));

        Observable<Tweet> observable = Observable.from(tweetList);

        Subscriber<Tweet> subscriber = new Subscriber<Tweet>() {
            @Override
            public void onCompleted() {
                System.out.println("搞定啦");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("出丑了"+e.getMessage());
            }

            @Override
            public void onNext(Tweet tweet) {
                    if (tweet.getName().equalsIgnoreCase("Scala")) {
                        unsubscribe();
                    }
                    System.out.println(tweet.getName());
            }
        };
        observable.subscribe(subscriber);
    }
}
