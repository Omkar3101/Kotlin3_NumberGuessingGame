
//Project 3 : Number Guessgin Game
/*
Create a small interactive guess the number game using loops.
Program generates a random number  between  1 and 10.
Users has to guess the number.
game continues until the user guesses correctly.

//import random library
import kotlin.random.Random

fun main() {
    println("Guess the Number")
    //Initialized Variables
    val numGuess = Random.nextInt(1,11)
    var userGuess: Int
    var attempts = 0

    //Using do While loop
    do {
        print("Enter your guess (1-10): ")
        userGuess = readLine()?.toIntOrNull()?:0
        attempts++

        when {
            userGuess < numGuess -> println("Too low! Try again.")
            userGuess > numGuess -> println("Too high! Try again.")
            else -> println("Congratulations! You guessed it in $attempts attempts.")
        }
    } while (userGuess != numGuess)
}



//Limited Attempts Mode
import kotlin.random.Random

fun main() {
    val numGuess = Random.nextInt(1,101)
    var attempts = 0
    val maxAttempts = 10

    println("Guess the number between 1 and 100! You have $maxAttempts attempts.")

    while (attempts < maxAttempts) {
        print("Enter your guess: ")
        val userGuess = readLine()?.toIntOrNull()?:0
        attempts++

        when {
            userGuess < numGuess -> println("Too low! Attempts left: ${maxAttempts - attempts}.")
            userGuess > numGuess -> println("Too high! Attempts left:  ${maxAttempts - attempts}")
            else -> {
                println("Congratulations! You guessed it in $attempts attempts.")
                return
            }
        }
    }
    println("Game Over! the correct number was $numGuess")
}


//Difficulty Levels
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
    }
    println("Game Over! The correct number was $numGuess")
}
*/

//Hint System
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

/*
//Time-Based Challenge

import kotlin.math.max
import kotlin.random.Random
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun main() {
    val numGuess = Random.nextInt(1,101)
    val maxTime = 10_000L //10 seconds in millisecond
    var startTime = System.currentTimeMillis() //Track start time
    var attempts = 0

    println("Guess the number between 1 and 100! You have 10 seconds.")

    while (true) {
        if (System.currentTimeMillis() - startTime > maxTime) {
            println("Time's up! The correct number was $numGuess.")
            return
        }

        print("Enter your guess: ")
        val userGuess = readLine()?.toIntOrNull()?: continue
        attempts ++

        when {
            userGuess < numGuess -> println("Too low!")
            userGuess > numGuess -> println("Too high!")
            else -> {
                println("Congratulation! You guessed it in $attempts attempts.")
                return
            }
        }
    }
}

 */