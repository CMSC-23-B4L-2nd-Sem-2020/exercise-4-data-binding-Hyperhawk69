/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//Cabuslay, Ryan Vincent L.
//2018-12076

package com.example.android.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //variable to bind elements from Activity Main

    private val myInfo: MyInfo = MyInfo() //data class of elements to be input by user

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main) //binds elements from Activity Main

        binding.myInfo = myInfo //binds myInfo

        binding.doneButton.setOnClickListener {
            addInfo(it) //when clicked, processes the inputs
        }

    }

    private fun addInfo(view: View) {
        binding. apply {
            //sets the fields of myInfo from the user input
            myInfo?.name = nameEdit.text.toString()
            myInfo?.nickname = nicknameEdit.text.toString()
            myInfo?.age = ageEdit.text.toString()
            myInfo?.birthday = birthdayEdit.text.toString()
            myInfo?.phone = phoneEdit.text.toString()
            myInfo?.color = colorEdit.text.toString()
            myInfo?.course = courseEdit.text.toString()
            myInfo?.dream = dreamEdit.text.toString()
            myInfo?.crush = crushEdit.text.toString()
            myInfo?.message = messageEdit.text.toString()

            invalidateAll() //refreshes UI with updated values

            //sets the GONE visibility to elements before input
            hello.visibility = View.GONE
            nameLabel.visibility = View.GONE
            nicknameLabel.visibility = View.GONE
            ageLabel.visibility = View.GONE
            birthdayLabel.visibility = View.GONE
            phoneLabel.visibility = View.GONE
            colorLabel.visibility = View.GONE
            courseLabel.visibility = View.GONE
            dreamLabel.visibility = View.GONE
            crushLabel.visibility = View.GONE
            messageLabel.visibility = View.GONE
            nameEdit.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            ageEdit.visibility = View.GONE
            birthdayEdit.visibility = View.GONE
            phoneEdit.visibility = View.GONE
            colorEdit.visibility = View.GONE
            courseEdit.visibility = View.GONE
            dreamEdit.visibility = View.GONE
            crushEdit.visibility = View.GONE
            messageEdit.visibility = View.GONE
            doneButton.visibility = View.GONE

            //sets the VISIBLE visibility to elements after output
            nameText.visibility = View.VISIBLE
            nicknameText.visibility = View.VISIBLE
            ageText.visibility = View.VISIBLE
            birthdayText.visibility = View.VISIBLE
            phoneText.visibility = View.VISIBLE
            colorText.visibility = View.VISIBLE
            courseText.visibility = View.VISIBLE
            dreamText.visibility = View.VISIBLE
            crushText.visibility = View.VISIBLE
            messageText.visibility = View.VISIBLE
            thankYou.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
