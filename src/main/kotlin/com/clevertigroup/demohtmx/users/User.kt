package com.clevertigroup.demohtmx.users

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(val id:String?=null, val name: String = "", val username: String = "")
