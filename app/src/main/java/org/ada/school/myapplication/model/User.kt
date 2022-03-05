package org.ada.school.myapplication.model

/**
 * @author Santiago Carrillo
 * 5/03/22.
 */
data class User(val username: String, val email: String) {


    fun getInfo(): String {
        return "$username | $email"
    }
}
