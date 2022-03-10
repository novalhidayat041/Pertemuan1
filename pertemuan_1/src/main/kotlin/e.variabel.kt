fun main(args: Array<String>) {
    /**
     * Variabel adalah sebuah tempat/wadah didalam memori komputer untuk menyimpan data seperti
    data nama pengguna, kata sandi, data waktu, jumlah makanan dan lain-lain sebagainya. Terdapat 2 type system dalam variabel yaitu statis dan dinamis.
     */
    var dynamicVar = 2
    println("Contoh dynamic variabel = " + dynamicVar)

    /**
     * Berdasarkan contoh diatas maka secara otomatis compiler Kotlin akan mengenali bahwa variabel
    dynamicVar bertipe Int, hal ini identik dengan gaya bahasa pemrograman PHP dan Ruby.
     */

    var staticVar: Char = 'A'
    println("Contoh static variabel = $staticVar")

    /**
     * Berdasarkan contoh kode diatas dapat diketahui bahwa variabel staticVar memiliki tipe data
    Char.
     */
}