//❤️❤️️ SocialSpark App - Made with love and tears  by Noluthando
//🎒🥲Course: IMAD5112 Assignment1
//🥰This app will give my girl Cora social suggestions based on the time of the day🤳📲

package com.example.socialspark

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //💕❤️ I do not touch here
    //💮💮 This will set up all the things my app needs
    private lateinit var editTextTimeOfDay: EditText
    private lateinit var buttonGetSuggestion: Button
    private lateinit var buttonReset: Button
    private lateinit var textViewSuggestion: TextView

    //🏷️🏷️TAG that I use to find my logs
    private val TAG = "SocialSparkApp"

    //📲🤳This will work first when Cora opens the app_ like a good morning
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: App has started! ❤️😍")

        //This right here will connect my buttons and text to the screen
        editTextTimeOfDay = findViewById(R.id.editTextTimeOfDay)
        buttonGetSuggestion = findViewById(R.id.buttonGetSuggestion)
        buttonReset = findViewById(R.id.buttonReset)
        textViewSuggestion = findViewById(R.id.textViewSuggestion)

        Log.d(TAG, "onCreate: All views connected successfully 😍❤️📲")

        //Here I will be setting up  my button click actions Pressa wena🤳😂
        buttonGetSuggestion.setOnClickListener {
            Log.d(TAG, " buttonGetSuggestion clicked💕📲")
            getSocialSpark()
        }

        buttonReset.setOnClickListener {
            Log.d(TAG, "buttonRest clicked 🔂🔁")
            resetApp()
        }

    }

    // 🌟🥰 getSocialSpark - one of my favourite part, this does all the work
    private fun getSocialSpark() {

        // 💕 This is for reading Coras input from the text field
val userInput = editTextTimeOfDay.text.toString().trim().lowercase()
        Log.d(TAG, "getSocialSpark: User entered - $userInput")

        // 🚨 If they (Cora) didn't type anything, remind them or her!
        // 💅 Making sure Cora  actually typed something
        if (userInput.isEmpty()) {
            textViewSuggestion.text = "⚠️ Oops! Please enter a time of day first girlie 🌸"
            Log.d(TAG, "getSocialSpark: Empty input detected!")
            return
        }

        // 🤔  just to Check what time of day Cora entered⌚
        val suggestion: String

        if (userInput == "morning") {
            suggestion =
                "🌅 Good morning girlie! Send a sweet Good Morning text to a family member right now 💌"
            Log.d(TAG, "getSocialSpark: Morning suggestion shown")

        } else if (userInput == "mid-morning") {
            suggestion =
                "☕🪟 Mid-morning vibes! Reach out to a colleague with a quick Thank You message 🙏💕"
            Log.d(TAG, "getSocialSpark: Mid-morning suggestion shown")

        } else if (userInput == "afternoon") {
            suggestion =
                "🌤️ Afternoon bestie! Share a funny meme or an interesting link with your friend 😂💖"
            Log.d(TAG, "getSocialSpark: Afternoon suggestion shown")

        } else if (userInput == "afternoon snack time") {
            suggestion =
                "🍰🍪 Snack time! Send a cute little Thinking of You message to someone special 🥰🌸"
            Log.d(TAG, "getSocialSpark: Afternoon snack time suggestion shown")

        } else if (userInput == "dinner") {
            suggestion =
                "🍽️⌚ Dinner time! Call a friend or relative for a quick 5-minute catch-up 📞💕"
            Log.d(TAG, "getSocialSpark: Dinner suggestion shown")

        } else if (userInput == "night") {
            suggestion =
                "🌙 Evening girlie! Leave a thoughtful comment on a friend's post before bed 💫💖"
            Log.d(TAG, "getSocialSpark: Night suggestion shown")

        } else {
            suggestion =
                "🤔 Hmm I don't know that time! Try: morning, mid-morning, afternoon, afternoon snack time, dinner, or night 💅"
            Log.d(TAG, "getSocialSpark: Unrecognised input - $userInput")
        }

        // ✨ this is time to show the results BESTIE💕📲
        textViewSuggestion.text = suggestion

    }

    // 🔄this is for removing everything and start afresh
    private fun resetApp() {
        editTextTimeOfDay.text.clear()
        textViewSuggestion.text = ""
        Log.d(TAG, "resetApp: App has been reset 🌸")
    }

}