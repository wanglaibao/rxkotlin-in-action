package com.laibao.rxjava.fundamental.observable;

import rx.Observer;
import rx.subjects.BehaviorSubject;

/**
 * @author laibao wang
 */
public class BehaviorSubjectExample {

    public static void main(String[] args) {
        BehaviorSubject behaviorSubject = BehaviorSubject.create();

        behaviorSubject.subscribe(new Observer() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no!Something wrong happened!" + e.getMessage());
            }

            @Override
            public void onNext(Object object) {
                System.out.println(object);
            }
        });

        behaviorSubject.onNext("this is the hello world example");
    }
}
