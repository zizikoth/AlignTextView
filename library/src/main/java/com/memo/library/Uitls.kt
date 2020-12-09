package com.memo.library

import android.content.res.Resources

val Float.dp2px
    get():Float = Resources.getSystem().displayMetrics.density * this + 0.5f

val Int.dp2px
    get():Float = this.toFloat().dp2px

val Float.sp2px
    get() = Resources.getSystem().displayMetrics.scaledDensity * this + 0.5f

val Int.sp2px
    get() = this.toFloat().sp2px