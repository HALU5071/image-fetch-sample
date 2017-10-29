package io.moatwel.imagedownloadsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPicasso = findViewById<ImageView>(R.id.image_picasso)
        val viewGlide = findViewById<ImageView>(R.id.image_glide)
        val textGlide = findViewById<TextView>(R.id.text_glide)
        textGlide.text = getString(R.string.str_glide, BuildConfig.GLIDE_VERSION)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Glide.with(this)
                    .load(imageUrl)
                    .into(viewGlide)

            Picasso.with(this)
                    .load(imageUrl)
                    .into(viewPicasso)
        }
    }

    companion object {
        const val imageUrl = "http://1.bp.blogspot.com/_wAsDFkhcyFk/TLSfTJezCVI/AAAAAAAABjc/qBdyNEC2J_Q/s1600/Android-wallpaper%2B%281%29.png"
    }
}
