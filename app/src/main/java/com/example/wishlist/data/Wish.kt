package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long=0L,
    @ColumnInfo(name = "wish-title")
    val title:String="",
    @ColumnInfo(name = "wish-description ")
    val description:String=""
)

val wishList= listOf<Wish>(
    Wish(0,"asd","asdad"),
    Wish(0,"asd","asdad"),
    Wish(0,"asd","asdad"),
    Wish(0,"asd","asdad")
)
