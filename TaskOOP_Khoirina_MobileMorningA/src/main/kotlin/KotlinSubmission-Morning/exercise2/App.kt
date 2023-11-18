package `KotlinSubmission-Morning`.exercise2

import java.time.LocalDate
import java.time.Month

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val evenNumbers = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }

    println(evenNumbers)



    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    */
    val monthsMap = mapOf(
    "Jan" to "January",
    "Feb" to "February",
    "Mar" to "March",
    "Apr" to "April",
    "May" to "May",
    "Jun" to "June",
    "Jul" to "July",
    "Aug" to "August",
    "Sep" to "September",
    "Oct" to "October",
    "Nov" to "November",
    "Dec" to "December"
    )
    val september = monthsMap["Sep"]
    println(september)


    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    */
    val monthDay = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    monthDay.forEach { (initial, full) ->
        println("$initial -> $full")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */

    val currentMonth = LocalDate.now().month
    val birthMonth = Month.SEPTEMBER

    val monthNow = currentMonth.toString().toLowerCase().capitalize()
    val birthMonthName = birthMonth.toString().toLowerCase().capitalize()

    println("It's $monthNow now, I was born in $birthMonthName")


}