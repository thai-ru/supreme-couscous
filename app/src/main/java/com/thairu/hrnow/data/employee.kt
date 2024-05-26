package com.thairu.hrnow.data

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//
//@Parcelize
@Entity(tableName = "employees")

data class Employee(

    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name= "id")
    var id: Int,

    @ColumnInfo(name = "employeeId")
    var employeeId: Long,

    @ColumnInfo(name = "employeeName")
    var employeeName: String,

    @ColumnInfo(name = "designation")
    var employeeDesignation: String,

    @ColumnInfo(name = "salary")
    var employeeSalary: Float,

    @ColumnInfo(name = "experience")
    var employeeExperience: Float,

    @ColumnInfo(name = "email")
    var employeeEmail: String,

    @ColumnInfo(name = "phone")
    var employeePhone: Long,
)
//{
//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.readLong(),
//        parcel.readString(),
//        parcel.readString(),
//        parcel.readFloat(),
//        parcel.readFloat(),
//        parcel.readString(),
//        parcel.readLong()
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(id)
//        parcel.writeLong(employeeId)
//        parcel.writeString(employeeName)
//        parcel.writeString(employeeDesignation)
//        parcel.writeFloat(employeeSalary)
//        parcel.writeFloat(employeeExperience)
//        parcel.writeString(employeeEmail)
//        parcel.writeLong(employeePhone)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Employee> {
//        override fun createFromParcel(parcel: Parcel): Employee {
//            return Employee(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Employee?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
