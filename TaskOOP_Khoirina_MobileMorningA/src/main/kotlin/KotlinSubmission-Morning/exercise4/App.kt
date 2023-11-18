package `KotlinSubmission-Morning`.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

fun main() {
    try {
        val a = readInt("Masukkan angka pertama: ")
        val b = readInt("Masukkan angka kedua: ")

        val result = divide(a, b)
        println("Hasil pembagian: $result")
    } catch (e: NumberFormatException) {
        println("Masukan tidak valid. Mohon masukkan angka yang benar.")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }
}

fun readInt(prompt: String): Int {
    print(prompt)
    return readLine()?.toInt() ?: throw NumberFormatException("Input tidak valid")
}

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Pembagian dengan nol tidak diizinkan.")
    }
    return a / b
}


