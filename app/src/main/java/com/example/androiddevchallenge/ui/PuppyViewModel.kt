/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.ui.data.Gender
import com.example.androiddevchallenge.ui.data.Puppy

class PuppyViewModel : ViewModel() {
    val puppies = listOf(
        Puppy(
            id = 1,
            name = "Lilly",
            nickName = "Cute Cat",
            gender = Gender.FEMALE,
            ageInMonth = 6,
            lengthInFeet = 1f,
            distanceInMiles = 10,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1610244130620-fd348aa7854e?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHw%3D&auto=format&fit=crop&w=300&q=100"
        ),
        Puppy(
            id = 2,
            name = "Dondo",
            nickName = "The King",
            gender = Gender.MALE,
            ageInMonth = 8,
            lengthInFeet = 1.2f,
            distanceInMiles = 12,
            color = "Black",
            imageUrl = "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHw%3D&auto=format&fit=crop&w=300&q=60"
        ),
        Puppy(
            id = 3,
            name = "Furry",
            nickName = "Cute Furry",
            gender = Gender.FEMALE,
            ageInMonth = 8,
            lengthInFeet = 0.8f,
            distanceInMiles = 16,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1591856419156-3979c9edd30f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTB8fHxlbnwwfHx8&auto=format&fit=crop&w=300&q=60"
        ),
        Puppy(
            id = 4,
            name = "Daisy",
            nickName = "Sweet Princess",
            gender = Gender.FEMALE,
            ageInMonth = 10,
            lengthInFeet = 0.9f,
            distanceInMiles = 19,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1577447217290-a609cd45101f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTh8fHxlbnwwfHx8&auto=format&fit=crop&w=300&q=60"
        )
    )

    private var _clickedPuppy: Puppy? = null

    val clickedPuppy get() = _clickedPuppy ?: puppies.first()

    fun onPuppyClicked(puppy: Puppy) {
        this._clickedPuppy = puppy
    }
}
