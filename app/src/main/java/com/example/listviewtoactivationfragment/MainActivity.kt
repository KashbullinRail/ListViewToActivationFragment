package com.example.listviewtoactivationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewtoactivationfragment.model.Cat
import com.example.listviewtoactivationfragment.model.CatsService

class MainActivity : AppCompatActivity(), AppContract {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragContainerView, FragmentCats())
                .commit()
        }
    }

    override val catsService: CatsService
        get() = (applicationContext as App).catsService

    override fun openCatDetailScreen(cat: Cat) {
        val fragment = FragmentCatDetails.newInstance(cat)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragContainerView, fragment)
            .addToBackStack(null)
            .commit()
    }
}