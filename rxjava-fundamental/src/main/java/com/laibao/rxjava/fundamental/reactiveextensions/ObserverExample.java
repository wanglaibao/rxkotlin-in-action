package com.laibao.rxjava.fundamental.reactiveextensions;

import rx.Observable;
import rx.Observer;

import java.util.Arrays;
import java.util.List;

/**
 * @author laibao wang
 */
public class ObserverExample {

    public static void main(String[] args) {

        List<Tweet> tweetList = Arrays.asList(new Tweet(1,"金戈"),new Tweet(2,"前程"),new Tweet(3,"阿拉丁"));

        Observable<Tweet> observable = Observable.from(tweetList);

        Observer<Tweet> observer = new Observer<Tweet>() {
            @Override
            public void onCompleted() {
                System.out.println("done");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("出错了啊"+e.getMessage());
            }

            @Override
            public void onNext(Tweet tweet) {
                System.out.println("id : "+tweet.getId()+" and name is "+tweet.getName());
            }
        };

        observable.subscribe(observer);

    }
}
