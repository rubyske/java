# Day 7 – Struktur Program Java

## Tujuan Pembelajaran

Hari ke-7 fokus memahami **struktur dasar program Java**. Ini adalah fondasi wajib agar kamu tidak sekadar bisa menulis kode, tapi **mengerti apa yang kamu tulis**.

---

## 1. Struktur Dasar Program Java

Contoh program Java sederhana:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Struktur ini **akan selalu ada** di setiap program Java.

---

## 2. Class

### Apa itu Class?

**Class** adalah blueprint atau cetakan dari sebuah program Java.

Ciri penting class:

* Semua kode Java **harus berada di dalam class**
* Nama class **harus sama** dengan nama file

Contoh:

```java
public class UserService {
}
```

---

## 3. Method

### Apa itu Method?

**Method** adalah kumpulan instruksi yang dijalankan untuk melakukan suatu tugas.

Contoh method:

```java
public void sayHello() {
    System.out.println("Hello");
}
```

Dalam Java:

* Method **harus berada di dalam class**
* Method digunakan untuk memecah program agar rapi

---

## 4. Main Method

### Apa itu `main` Method?

`main` adalah **titik awal eksekusi program Java**.

```java
public static void main(String[] args) {
}
```

Penjelasan:

* `public` → bisa diakses JVM
* `static` → bisa dijalankan tanpa object
* `void` → tidak mengembalikan nilai
* `String[] args` → parameter input

> Tanpa `main`, program Java **tidak bisa dijalankan**.

---

## 5. Statement

**Statement** adalah perintah yang dijalankan oleh program.

Contoh statement:

```java
System.out.println("Hello World");
```

Setiap statement di Java **harus diakhiri dengan titik koma (`;`)**.

---

## 6. Komentar (Comment)

Komentar digunakan untuk:

* Menjelaskan kode
* Memberi catatan
* Tidak dieksekusi program

### Jenis Komentar

#### 1️⃣ Single-line Comment

```java
// Ini adalah komentar
```

#### 2️⃣ Multi-line Comment

```java
/*
   Ini komentar
   lebih dari satu baris
*/
```

#### 3️⃣ JavaDoc Comment

```java
/**
 * Method untuk menampilkan pesan
 */
```

JavaDoc sering dipakai di **project profesional**.

---

## 7. Kesalahan Umum Pemula

* Lupa titik koma `;`
* Nama class tidak sama dengan file
* Menulis kode di luar class
* Salah penulisan `main`

Contoh salah:

```java
public static main(String[] args) {
}
```

---

## 8. Output yang Diharapkan Day 7

Setelah Day 7, kamu harus:

* Paham struktur program Java
* Mengerti fungsi class & method
* Mengerti fungsi `main`
* Bisa menulis program Java sederhana tanpa error

---

## Catatan Penting

> Java itu **ketat**, tapi itu yang membuat sistem backend Java stabil dan aman.

---

📌 *Lanjut ke Day 8 – Tipe Data & Variabel*
