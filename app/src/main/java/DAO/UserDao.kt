package DAO

import Model.User
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User): Int

    @Delete
    fun delete(user: User): Int

    @Query("SELECT * FROM user")
    fun getAllUser(): LiveData<List<User>>

    @Query("SELECT * FROM user WHERE email == :email AND password == :password")
    fun getLoginUser(email: String, password: String): User


}