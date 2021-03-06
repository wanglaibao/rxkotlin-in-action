package com.laibao.rxjava.fundamental.observable;

import rx.Observer;
import rx.subjects.BehaviorSubject;

/**
 * @author laibao wang
 */
public class BehaviorSubjectExample {

    public static void main(String[] args) {
        BehaviorSubject<String> behaviorSubject = BehaviorSubject.create();

        behaviorSubject.subscribe(new Observer<String>() {
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

        behaviorSubject.onNext("this is the hello world example");
    }
}
