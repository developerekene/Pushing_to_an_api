package com.example.uploadimageapp

data class UploadResponse(
    val error: Boolean,
    val message: String,
    val image: String
)