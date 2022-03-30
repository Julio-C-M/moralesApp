package com.julioc.moralesapp


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BreakingBadService {

    @GET( value= "character/{character-id}")
    fun getCharacterById(
        @Path("character-id") CharacterId: Int
    ): Call<GetCharacterByIdResponse>
}