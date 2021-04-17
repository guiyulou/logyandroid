package com.me.louguiyu


sealed class Outcome<T> {
    data class Progress<T>(var loading: Boolean) : Outcome<T>()
    data class Success<T>(var data: T) : Outcome<T>()
    data class Failure<T>(var e: Throwable) : Outcome<T>()
    data class NetworkFailure<T>(var e: Throwable) : Outcome<T>()
    data class InvalidToken<T>(var e: Throwable) : Outcome<T>()

    companion object {
        fun <T> loading(isLoading: Boolean): Outcome<T> = Progress(isLoading)

        fun <T> success(data: T): Outcome<T> = Success(data)

        fun <T> fail(e: Throwable): Outcome<T> = Failure(e)

        fun <T> networkFail(e: Throwable): Outcome<T> = NetworkFailure(e)

        fun <T> invalidToken(e: Throwable): Outcome<T> = InvalidToken(e)
    }
}