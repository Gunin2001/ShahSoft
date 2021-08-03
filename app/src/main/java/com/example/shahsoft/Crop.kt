package com.example.shahsoft

import kotlin.random.Random

data class Crop(
    val CropName: String,
    val Place: String,
    val Time: Int
) {
    companion object{
        val Crop_Name = arrayOf(
            "Apple", "Orange", "Pomegranate", " Papaya", "Grapes" , "Plum"
        )
        val Supply = arrayOf(
            "Lucknow", "Delhi" , "Kanpur", "Kashmir" , "Jammu" , "Gurugram"
        )
        fun genRandomSequence(n : Int) : ArrayList<Crop>{
            val CropArray =  ArrayList<Crop>(n)

            for(i in 1..n)
            {
                CropArray.add(Crop(
                    Crop_Name[Random.nextInt(0,n+1)],
                    Supply[Random.nextInt(0,n+1)],
                    Random.nextInt(0,10)*100
                ))
            }
            return CropArray
        }
    }
}