package com.arkivanov.sample.masterdetail.shared.utils

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.lifecycle.doOnDestroy
import com.badoo.reaktive.disposable.scope.DisposableScope

internal fun ComponentContext.disposableScope(): DisposableScope {
    val scope = DisposableScope()
    lifecycle.doOnDestroy(scope::dispose)

    return scope
}