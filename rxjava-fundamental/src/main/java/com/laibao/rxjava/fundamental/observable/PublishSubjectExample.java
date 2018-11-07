package com.laibao.rxjava.fundamental.observable;

import rx.Observer;
import rx.Subscription;
import rx.subjects.PublishSubject;

/**
 * @author laibao wang
 */
public class PublishSubjectExample {

    public static void main(String[] args) {
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
