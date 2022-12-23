package com.mdasrafulalam78.navigationcomponentdemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Trainee(val name:String, val id:Int, val department:String): Parcelable