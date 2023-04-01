package com.example.latihan2_chapter3_seriable

import android.os.Parcel
import android.os.Parcelable

data class Parcelizable(
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val age: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(address)
        parcel.writeString(age)
    }

    companion object CREATOR : Parcelable.Creator<Parcelizable> {
        override fun createFromParcel(parcel: Parcel): Parcelizable {
            return Parcelizable(parcel)
        }

        override fun newArray(size: Int): Array<Parcelizable?> {
            return arrayOfNulls(size)
        }
    }
}