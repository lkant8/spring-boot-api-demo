package org.mcode8.sample.spring.app.service

import org.mcode8.sample.spring.app.model.MpUser
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class MpUserManagementService {

    var userList: MutableList<MpUser?>? = ArrayList(
        Arrays.asList(
            MpUser("Saurabh kumar", "Product manager"," A product manager is the person who identifies the customer need and the larger business objectives that a product or feature will fulfill, articulates what success looks like for a product, and rallies a team to turn that vision into a reality"),
            MpUser("Sahil saini", "IOS Developer","An iOS developer is responsible for developing applications for mobile devices powered by Apple's iOS operating system")
        )
    )

    fun getMpUser() : MutableList<MpUser?>? {
        return userList
    }

    fun addMpUser( mpUser: MpUser?){
        userList?.add(mpUser)
    }


}