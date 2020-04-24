package com.theoxao.common

fun repeatUntil(breakAt: () -> Boolean, action: () -> Unit) {
    while (breakAt()) {
        action()
    }
}