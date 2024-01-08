/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.challenges.data


import com.example.challenges.R
import com.example.challenges.model.Challenge

/**
 * [Datasource] generates a list of [Challenge]
 */
class Datasource() {
    fun loadChallenges(): List<Challenge> {
        return listOf<Challenge>(
            Challenge(R.string.challenge1, R.drawable.image1, R.string.explanation1, "DAY 1"),
            Challenge(R.string.challenge2, R.drawable.image2, R.string.explanation2, "DAY 2"),
            Challenge(R.string.challenge3, R.drawable.image3, R.string.explanation3, "DAY 3"),
            Challenge(R.string.challenge4, R.drawable.image4, R.string.explanation4, "DAY 4"),
            Challenge(R.string.challenge5, R.drawable.image5, R.string.explanation5, "DAY 5"),
            Challenge(R.string.challenge6, R.drawable.image6, R.string.explanation6, "DAY 6"),
            Challenge(R.string.challenge7, R.drawable.image7, R.string.explanation7, "DAY 7"),
            Challenge(R.string.challenge8, R.drawable.image8, R.string.explanation8, "DAY 8"),
            Challenge(R.string.challenge9, R.drawable.image9, R.string.explanation9, "DAY 9"),
            Challenge(R.string.challenge10, R.drawable.image10, R.string.explanation10, "DAY 10"),
            Challenge(R.string.challenge11, R.drawable.image11, R.string.explanation11, "DAY 11"),
            Challenge(R.string.challenge12, R.drawable.image12, R.string.explanation12, "DAY 12"),
            Challenge(R.string.challenge13, R.drawable.image13, R.string.explanation13, "DAY 13"),
            Challenge(R.string.challenge14, R.drawable.image14, R.string.explanation14, "DAY 14"),
            Challenge(R.string.challenge15, R.drawable.image15, R.string.explanation15, "DAY 15"),
            Challenge(R.string.challenge16, R.drawable.image16, R.string.explanation16, "DAY 16"),
            Challenge(R.string.challenge17, R.drawable.image17, R.string.explanation17, "DAY 17"),
            Challenge(R.string.challenge18, R.drawable.image18, R.string.explanation18, "DAY 18"),
            Challenge(R.string.challenge19, R.drawable.image19, R.string.explanation19, "DAY 19"),
            Challenge(R.string.challenge20, R.drawable.image20, R.string.explanation20, "DAY 20"),
            Challenge(R.string.challenge21, R.drawable.image21, R.string.explanation21, "DAY 21"),
            Challenge(R.string.challenge22, R.drawable.image22, R.string.explanation22, "DAY 22"),
            Challenge(R.string.challenge23, R.drawable.image23, R.string.explanation23, "DAY 23"),
            Challenge(R.string.challenge24, R.drawable.image24, R.string.explanation24, "DAY 24"),
            Challenge(R.string.challenge25, R.drawable.image25, R.string.explanation25, "DAY 25"),
            Challenge(R.string.challenge26, R.drawable.image26, R.string.explanation26, "DAY 26"),
            Challenge(R.string.challenge27, R.drawable.image27, R.string.explanation27, "DAY 27"),
            Challenge(R.string.challenge28, R.drawable.image28, R.string.explanation28, "DAY 28"),
            Challenge(R.string.challenge29, R.drawable.image29, R.string.explanation29, "DAY 29"),
            Challenge(R.string.challenge30, R.drawable.image30, R.string.explanation30, "DAY 30"))
    }
}
