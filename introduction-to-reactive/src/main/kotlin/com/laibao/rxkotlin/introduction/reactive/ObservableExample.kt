package com.laibao.rxkotlin.introduction.reactive

import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val list:List<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f) //

    val observable: Observable<Any> = list.toObservable();

    //2 named arguments for lambda Subscribers
    observable.subscribeBy(
            onNext = { println(it) },
            onError =  { it.printStackTrace() },
            onComplete = { println("Done!") }
    )

}
