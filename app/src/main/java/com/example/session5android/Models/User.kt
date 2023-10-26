package com.example.session5android.Models

data class User(
    val id: Int,
    val userTypeId: Int,
    val fullName: String,
    val gender: Boolean,
    val birthDate: String,
    val familyCount: Int
):java.io.Serializable
