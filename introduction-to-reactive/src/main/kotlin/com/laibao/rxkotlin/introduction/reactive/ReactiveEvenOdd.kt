package com.laibao.rxkotlin.introduction.reactive

import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

/**
 * @author laibao wang
 */
fun main(args: Array<String>) {
    var subject: Subject<Int> = PublishSubject.create()
    subject.map({it -> isEven(it) })
            .subscribe({println("The number is ${(if (it) "Even" else "Odd")}" )})
    subject.onNext(4)
    subject.onNext(9)
}

fun isEven(n:Int):Boolean = ((n % 2) == 0)