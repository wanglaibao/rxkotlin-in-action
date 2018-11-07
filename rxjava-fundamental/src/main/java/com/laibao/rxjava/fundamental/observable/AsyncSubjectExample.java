package com.laibao.rxjava.fundamental.observable;

import rx.Observer;
import rx.subjects.AsyncSubject;

/**
 * @author laibao wang
 */
public class AsyncSubjectExample {

    public static void main(String[] args) {
        AsyncSubject<String> subject = AsyncSubject.create();

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

        subject.onNext("金戈来了啊111111111111111");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("终于结束了啊");
    }
}
