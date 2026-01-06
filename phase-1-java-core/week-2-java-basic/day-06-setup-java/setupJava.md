# Day 6 – Setup Java (JDK & IDE)

## Tujuan Pembelajaran

Hari ke-6 bertujuan menyiapkan **lingkungan kerja Java yang benar dan profesional**. Ini penting agar semua pembelajaran Java Core selanjutnya berjalan lancar tanpa masalah teknis.

---

## 1. Apa itu JDK?

**JDK (Java Development Kit)** adalah paket lengkap untuk mengembangkan aplikasi Java.

JDK berisi:

* **JVM (Java Virtual Machine)** → menjalankan program Java
* **JRE (Java Runtime Environment)** → environment runtime
* **Compiler (javac)** → mengubah kode Java menjadi bytecode
* Library standar Java

> Tanpa JDK, kita **tidak bisa menulis dan menjalankan program Java**.

---

## 2. Kenapa Menggunakan JDK 17?

Alasan menggunakan **JDK 17**:

* Versi **LTS (Long Term Support)**
* Stabil untuk production
* Banyak dipakai di industri backend
* Support Spring Boot modern

> Biasakan dari awal memakai versi Java yang dipakai di dunia kerja.

---

## 3. Apa itu IDE?

**IDE (Integrated Development Environment)** adalah tools untuk menulis, menjalankan, dan mengelola kode.

Fungsi IDE:

* Menulis kode dengan auto-complete
* Menjalankan program
* Debugging
* Manajemen project

---

## 4. Kenapa IntelliJ IDEA?

**IntelliJ IDEA** adalah IDE Java paling populer.

Keunggulan:

* Sangat kuat untuk Java & Spring
* Smart auto-complete
* Debugger sangat baik
* Digunakan luas di industri

> Untuk backend Java, IntelliJ adalah standar de facto.

---

## 5. Instalasi JDK 17 (Konsep)

Langkah umum:

1. Install JDK 17
2. Set environment variable (JAVA_HOME)
3. Pastikan Java terdeteksi

Verifikasi:

```
java --version
```

Jika muncul versi Java, instalasi berhasil.

---

## 6. Instalasi IntelliJ IDEA (Konsep)

Langkah umum:

1. Install IntelliJ IDEA Community Edition
2. Buka IntelliJ
3. Buat project Java baru
4. Pilih JDK 17 sebagai SDK

---

## 7. Program Pertama: Hello World

Contoh program Java pertama:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Penjelasan singkat:

* `class` → wadah program
* `main` → titik awal eksekusi
* `System.out.println` → output ke console

---

## 8. Cara Menjalankan Program

Di IntelliJ:

* Klik tombol ▶ (Run)

Hasil:

```
Hello World
```

Jika output muncul, berarti environment Java kamu **siap digunakan**.

---

## 9. Output yang Diharapkan Day 6

Setelah Day 6, kamu harus:

* Paham fungsi JDK & IDE
* Mengerti kenapa pakai JDK 17
* Berhasil menjalankan Hello World
* Siap masuk ke Java syntax

---

## Catatan Penting

> Masalah Java paling sering bukan di kode, tapi di **setup environment**.

Kalau setup benar, belajar Java akan jauh lebih mudah.

---

📌 *Lanjut ke Day 7 – Struktur Program Java*
;