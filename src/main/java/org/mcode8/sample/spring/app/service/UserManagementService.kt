package org.mcode8.sample.spring.app.service

import org.mcode8.sample.spring.app.model.User
import org.springframework.stereotype.Service
import java.util.*

@Service
 class UserManagementService {
    private var userList: MutableList<User?>? = ArrayList(
        Arrays.asList(
            User("Joy", "1234-scdw2-2fcevw342-2323"),
            User("Chandler", "3454-2csfdfd-sfdvsdjv-7623")
        )
    )

    fun getUserLists(): MutableList<User?>? {
        return userList
    }

    fun addUserList(user: User) {
        userList?.add(user)
    }

    fun getUerId(username: String): String? {
        for (user in userList!!) {
            if (user?.username!!.lowercase(Locale.getDefault()) == username) {
                return user.userId
            } else if (user.username == username) {
                return user.userId
            }
        }
        return ""
    }
    companion object{}
}