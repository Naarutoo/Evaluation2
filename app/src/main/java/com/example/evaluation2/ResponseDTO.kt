package com.example.evaluation2


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ResponseDTO(

	@field:SerializedName("resultCount")
	val resultCount: Int? = null,

	@field:SerializedName("results")
	val results: List<ResultsDTO?>? = null
)