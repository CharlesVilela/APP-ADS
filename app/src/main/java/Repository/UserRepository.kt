package Repository

import DAO.UserDao
import Model.User

// Um repositório para gerencia consultas
class UserRepository(private val userDao : UserDao) {

    val allUser = userDao.getAllUser()

//    @Suppress("RedundantSuspendModifier")
//    @WorkerThread
    fun insert(user: User){
        userDao.insert(user)
    }

    fun update(user: User): Int {
        return userDao.update(user)
    }

    fun delete(user: User): Int {
       return userDao.delete(user)
    }

    fun logar(email: String, password: String): User {
        val user = userDao.getLoginUser(email, password)
        return user
    }


}