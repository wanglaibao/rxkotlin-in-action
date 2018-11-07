package com.laibao.rxjava.fundamental.observable;

import rx.Observer;
import rx.subjects.ReplaySubject;

/**
 * @author laibao wang
 */
public class ReplaySubjectExample {

    public static void main(String[] args) {
        ReplaySubject<String> subject = ReplaySubject.create();

        subject.subscribe(new Observer<String>() {
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

        subject.onNext("金戈");
    }
}
