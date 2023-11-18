package `KotlinSubmission-Morning`.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan: String = "Khoirina"
    val namaBelakang: String = "Azyyati"
    val umur: Int = 21
    val status: Boolean = true

    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Umur: $umur")
    println("Status: ${if (status) "Jomblo?" else "Menikah"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Masapuan: $groupId")
    println("Mobile: $groupMember")
    println("Morning A: $session")
    return Unit
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Rina","Fina", "Salsabil", "Jodhy", "Yayang", "Adi")
    val myName = teamMembers[1]
    return teamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentorCount = 3
    val groupMemberCount = myTeam().size

    return mentorCount + groupMemberCount
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("Masapuan: $myTeam")

    val totalMember = totalMember()
    println("Total 6 Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Masapuan", listOf("Rina","Fina", "Salsabil", "Jodhy", "Yayang", "Adi"), "Morning A")

}