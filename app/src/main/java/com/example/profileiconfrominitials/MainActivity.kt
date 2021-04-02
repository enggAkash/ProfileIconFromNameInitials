package com.example.profileiconfrominitials

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.profileiconfrominitials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // CUSTOM SHAPE DRAWABLE
        /*val emailAdapterShapeDrawable = EmailAdapterWithShapeDrawable(getEmails())
        binding.emailRv.adapter = emailAdapterShapeDrawable*/

        // Using Library
        val emailAdapterLibrary = EmailAdapterWithLibrary(getEmails())
        binding.emailRv.adapter = emailAdapterLibrary
    }


    private fun getEmails(): ArrayList<Email> {
        val list = arrayListOf<Email>()

        list.add(
            Email(
                "Learning Strugglers",
                "https://lh3.googleusercontent.com/a-/AOh14Gg3tmO5jek1fTs9KLDdchu76y1VhzzVGzvKgX-jCg=s40",
                "Know the signs to spot a fraudulent SMS! Look out for inconsistencies",
                "If you have difficulties viewing this mail, click here",
                "11:26 AM"
            )
        )

        list.add(
            Email(
                "Kotak Bank",
                null,
                "Important Information: Kotak System Downtime (23rd Mar 2021 from 00:10 AM to 06:30 AM)",
                "Dear Customer, To provide you with seamless banking experience, our systems will undergo maintenance on March 23, 2021 from 00:10 AM IST. to 06:30 AM IST.",
                "Mar 20"
            )
        )

        list.add(
            Email(
                "American Express",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiv3jLWucd3hYMytPjakJdGKQfAGI8g49R4w&usqp=CAU",
                "Discontinuation of ezeClick for online purchases",
                "Dear AKASH KUMAR, American Express® ezeClick, a one ID online payment solution, is being discontinued from 31 December 2020.",
                "Dec 2"
            )
        )

        list.add(
            Email(
                "Standard Chartered Bank",
                "https://lh3.googleusercontent.com/a-/AOh14Gg3tmO5jek1fTs9KLDdchu76y1VhzzVGzvKgX-jCg=s40",
                "Know the signs to spot a fraudulent SMS! Look out for inconsistencies",
                "If you have difficulties viewing this mail, click here",
                "11:26 AM"
            )
        )

        list.add(
            Email(
                "Kotak Bank",
                null,
                "Important Information: Kotak System Downtime (23rd Mar 2021 from 00:10 AM to 06:30 AM)",
                "Dear Customer, To provide you with seamless banking experience, our systems will undergo maintenance on March 23, 2021 from 00:10 AM IST. to 06:30 AM IST.",
                "Mar 20"
            )
        )

        list.add(
            Email(
                "American Express",
                null,
                "Discontinuation of ezeClick for online purchases",
                "Dear AKASH KUMAR, American Express® ezeClick, a one ID online payment solution, is being discontinued from 31 December 2020.",
                "Dec 2"
            )
        )

        list.add(
            Email(
                "LastPass",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbMjRXDunmH8VHfOccLiYah2FtPxEQB75O_g&usqp=CAU",
                "Reminder: Changes to LastPass Free + Limited-time Offer",
                "Changes to LastPass Free + 25% off the plan of your choice",
                "Mar 3"
            )
        )

        list.add(
            Email(
                "Google My Business",
                null,
                "Billin, are you open on Maha Shivaratri?",
                "Let customers know your special hours for March When your business has an irregular schedule, like holidays or special events, you can enter special hours in advance to let customers know when you’re open.",
                "Mar 1"
            )
        )

        list.add(
            Email(
                "JetBrains",
                null,
                "Get them before time’s up – JetBrains tools for half the price",
                "We wish to invite you back to the JetBrains family with a limited time offer. JetBrains is offering a 50% discount on monthly subscriptions for all personal tools. This offer once availed will be valid for 6 months. Hurry up, the offer ends on Monday, April 5!",
                "1:50 PM"
            )
        )

        return list
    }
}