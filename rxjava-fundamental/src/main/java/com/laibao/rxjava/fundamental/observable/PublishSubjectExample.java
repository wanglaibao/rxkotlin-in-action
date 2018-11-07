package com.laibao.rxjava.fundamental.observable;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

/**
 * @author laibao wang
 */
public class PublishSubjectExample {

    public static void main(String[] args) {
        testOnNextMethodOne();
        System.out.println();
        testOnNextMethodTwo();
    }

    private static void testOnNextMethodTwo() {
        final PublishSubject<Boolean> subject = PublishSubject.create();

        subject.subscribe(new Observer<Boolean>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no!Something wrong happened!" + e.getMessage());
            }

            @Override
            public void onNext(Boolean s) {
                System.out.println("Observable Completed "+s);
            }
        });

        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }
                subscriber.onCompleted();
            }
        }).doOnCompleted(new Action0() {
            @Override
            public void call() {
                subject.onNext(true);
            }
        }).subscribe();
    }

    private static void testOnNextMethodOne() {
        PublishSubject<String> publishSubject = PublishSubject.create();

        Subscription subscription = publishSubject.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no!Something wrong happened!" + e.getMessage());
            }

            @Override
            public void onNext(String message) {
                System.out.println(message);
            }
        });

        publishSubject.onNext("Hello World");
    }
}
