package com.laibao.rxjava.fundamental.reactiveextensions;

import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * @author laibao wang
 */
public class ObservableExample {

    public static void main(String[] args) {
        List<Tweet> tweetList = Arrays.asList(new Tweet(1,"金戈"),new Tweet(2,"前程"),new Tweet(3,"阿拉丁"));
        Observable<Tweet> observable = Observable.from(tweetList);
        observable.subscribe((Tweet tweet) -> System.out.println(tweet.getName()));
    }
}
