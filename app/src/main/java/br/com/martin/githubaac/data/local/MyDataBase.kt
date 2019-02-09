package br.com.martin.githubaac.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import br.com.martin.githubaac.data.local.converter.DateConverter
import br.com.martin.githubaac.data.local.dao.UserDao
import br.com.martin.githubaac.data.local.entity.User

@Database(entities = [User::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class MyDataBase: RoomDatabase(){

    abstract fun userDao(): UserDao

    companion object {
        private val INSTANCE : MyDataBase? = null
    }
}