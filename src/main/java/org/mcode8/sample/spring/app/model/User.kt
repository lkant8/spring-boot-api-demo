package org.mcode8.sample.spring.app.model

/**
 * This is a model of the user object with its attributes.
 */
class User {
    @JvmField
    var username: String? = null
    @JvmField
    var userId: String? = null

    constructor()
    constructor(username: String?, userId: String?) {
        this.username = username
        this.userId = userId
    }
}

data class MpUser(
    var name:String?=null,
    var Job:String?=null,
    var Description:String?=null,
)