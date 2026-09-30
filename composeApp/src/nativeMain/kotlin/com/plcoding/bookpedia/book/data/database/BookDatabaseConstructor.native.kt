package com.plcoding.bookpedia.book.data.database

@Suppress(names = ["NO_ACTUAL_FOR_EXPECT"])
actual object BookDatabaseConstructor :
    androidx.room.RoomDatabaseConstructor<com.plcoding.bookpedia.book.data.database.FavoriteBookDatabase> {
    actual override fun initialize(): com.plcoding.bookpedia.book.data.database.FavoriteBookDatabase {
        TODO("Not yet implemented")
    }
}