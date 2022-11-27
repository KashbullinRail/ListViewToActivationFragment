package com.example.listviewtoactivationfragment.model

import com.github.javafaker.Faker

class CatsService {

    val cats: List<Cat> = (1..40).map {
        Cat(
            id = it,
            name = Faker.instance().cat().name(),
            discription = Faker.instance().lorem().paragraph(12)
        )
    }

}