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
fun main() {
    println("GUESS THE NUMBER")
    println("Choose difficulty level:(1) Easy (2) Medium (3) Hard")
    val difficulty = readLine()?.toIntOrNull()?:1
    val (range, maxAttempts) = when (difficulty) {
        1 -> 50 to 10
        2 -> 100 to 7
        else -> 500 to  5
    }

    val numGuess = Random.nextInt(1, range + 1)
    var attempts = 0

    println("Guess the number between 1 and $range! You have $maxAttempts attempts.")

    while (attempts < maxAttempts) {
        print("Enter your guess: ")
        val userGuess = readLine()?.toIntOrNull()?:0
        attempts++

        when{
            userGuess < numGuess -> println("Too low! Attempts left: ${maxAttempts - attempts}")
            userGuess > numGuess -> println("Too high! Attempts left: ${maxAttempts - attempts}")
            else -> {
                println("\uD83C\uDF89 Congratulations! You guessed it in $attempts attempts.")
                return
            }
        }
        //Hint System for hard level : Number is even or odd
        var ranNum = Random.nextInt(1,11)
        if (attempts == 3 && range == 500) {
            val hint = if (numGuess % 2 == 0) "even" else "odd"
            println("Hint: The number is $hint number.")
            println("Hint: The number is between this range ${numGuess-ranNum} and ${numGuess+ranNum}")
        }
    }
    println("Game Over! The correct number was $numGuess")
}
```

## Future Improvement
* Leaderboard System – Track best times and scores.
* Multiplayer Mode – Compete with friends.
* Advanced Hint System – Provide smarter clues.
* Graphical UI Version – Build a visual interface instead of a console-based game.


## License
This project is licensed under the MIT License – see the [LICENSE](https://github.com/Omkar3101/Kotlin3_NumberGuessingGame/blob/main/LICENSE) file for details.

## Let's Connect
* [Linkedin](https://www.linkedin.com/in/omkar3101)
* [Github]( https://github.com/Omkar3101 )
