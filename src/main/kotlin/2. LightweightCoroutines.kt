import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        repeat(1_000_000) {
            launch {
                print(".")
            }
        }
    }
//    repeat(1_000_000) {
//        Thread() { print("${Thread.currentThread()}") }.start()
//    }
}