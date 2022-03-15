package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageview = findViewById<ImageView>(R.id.target)

        Glide.with(this).load(R.drawable.ic_launcher_background).override(50,50)
            .placeholder(R.drawable.ic_launcher_foreground).centerCrop()
            .thumbnail(Glide.with(this).asDrawable().sizeMultiplier(0.1f)).into(imageview)

        var receivedata = "{\"id\":\"stageus\", \"pw\":\"1234\", \"name\":\"minseok\"}"

        val jsonobject = JSONObject(receivedata)

        var user_1 = User_Data(
            jsonobject.getString("id"),
            jsonobject.getString("pw"),
            jsonobject.getString("name"))

        Log.d("asdfasdf",user_1.id)
        Log.d("asdfasdf",user_1.pw)
        Log.d("asdfasdf",user_1.name)


    }
}