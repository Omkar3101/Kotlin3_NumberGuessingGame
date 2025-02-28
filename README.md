# NumberGuessingGame

A fun and interactive Number Guessing Game built using Kotlin, featuring difficulty modes, hints, and a timer. This project is part of my Kotlin learning journey.

## Features
1. Three Difficulty Modes – Choose between Easy, Medium, and Hard.
2. Hint System – Get hints to guide your guess.
3. Timer Feature – Track how long it takes to guess the correct number.
4. Random Number Generation – Ensures a different game experience every time.



## Technologies Used
1. Kotlin
2. IntelliJ IDEA



##How to Run the Project?

* Clone the Repository
git clone [https://github.com/YourUsername/NumberGuessingGame.git](https://github.com/Omkar3101/Kotlin3_NumberGuessingGame.git)

* Open in IntelliJ IDEA
Select Open Project and navigate to the cloned repository

* Run the Project
Open Main.kt file
Click on Run or use Shift + F10

* Play the Game
1. Select a difficulty level: Easy, Medium, or Hard.
2. Enter your guess and receive feedback.
3. Use hints if needed.
4. See how long it takes to guess the correct number!



## Code Overview
```kotlin
import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    println("Welcome to the Number Guessing Game!")
    
    // Select Difficulty Mode
    println("Select Difficulty: 1. Easy (1-10)  2. Medium (1-50)  3. Hard (1-100)")
    val difficulty = readLine()?.toIntOrNull() ?: 1
    val range = when (difficulty) {
        2 -> 50
        3 -> 100
        else -> 10
    }

    val secretNumber = Random.nextInt(1, range + 1)
    var guess: Int? = null
    var attempts = 0

    val timeTaken = measureTimeMillis {
        while (guess != secretNumber) {
            println("Enter your guess:")
            guess = readLine()?.toIntOrNull()

            when {
                guess == null -> println("Please enter a valid number.")
                guess < secretNumber -> println("Too low! Try again.")
                guess > secretNumber -> println("Too high! Try again.")
                else -> println("Congratulations! You guessed the number in $attempts attempts.")
            }
            attempts++
        }
    }

    println("Time taken: ${timeTaken / 1000} seconds.")
}
```

## Future Improvement
* Leaderboard System – Track best times and scores.
* Multiplayer Mode – Compete with friends.
* Advanced Hint System – Provide smarter clues.
* Graphical UI Version – Build a visual interface instead of a console-based game.


## License
This project is licensed under the MIT License – see the LICENSE file for details.

## Let's Connect
* [Linkedin](https://www.linkedin.com/in/omkar3101)
* [Github]( https://github.com/Omkar3101 )
