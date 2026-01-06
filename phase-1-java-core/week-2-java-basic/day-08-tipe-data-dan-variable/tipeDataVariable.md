# Day 8 – Tipe Data & Variabel Java

## Tujuan Pembelajaran

Di hari ke-8, kamu akan memahami **cara Java menyimpan data**. Ini krusial karena Java adalah **strongly typed language** dan kesalahan di sini sering jadi sumber bug.

---

## 1. Apa Itu Tipe Data?

**Tipe data** menentukan:

* Jenis nilai yang bisa disimpan
* Besar memori yang digunakan
* Operasi yang bisa dilakukan

Contoh:

```java
int umur = 21;
```

Artinya variabel `umur` hanya boleh menyimpan **angka bulat**.

---

## 2. Apa Itu Variabel?

**Variabel** adalah tempat untuk menyimpan data sementara di memori.

Struktur penulisan:

```java
tipeData namaVariabel = nilai;
```

Contoh:

```java
String nama = "Badru";
int umur = 21;
```

---

## 3. Primitive Data Type

Primitive adalah tipe data **dasar** yang menyimpan nilai langsung.

| Tipe    | Ukuran | Contoh            |
| ------- | ------ | ----------------- |
| byte    | 1 byte | byte a = 10;      |
| short   | 2 byte | short b = 100;    |
| int     | 4 byte | int c = 1000;     |
| long    | 8 byte | long d = 10000L;  |
| float   | 4 byte | float e = 1.5f;   |
| double  | 8 byte | double f = 2.5;   |
| char    | 2 byte | char g = 'A';     |
| boolean | 1 bit  | boolean h = true; |

📌 `int` dan `double` adalah yang **paling sering dipakai** di backend.

---

## 4. Non-Primitive Data Type

Non-primitive menyimpan **referensi ke objek**, bukan nilai langsung.

Contoh:

```java
String nama = "Backend Java";
int[] angka = {1,2,3};
```

Jenis umum:

* String
* Array
* Class
* Interface

---

## 5. Perbedaan Primitive vs Non-Primitive

| Primitive             | Non-Primitive        |
| --------------------- | -------------------- |
| Simpan nilai langsung | Simpan alamat memori |
| Tidak punya method    | Punya method         |
| Ukuran tetap          | Ukuran dinamis       |

---

## 6. Aturan Penamaan Variabel (Best Practice)

✅ Gunakan camelCase

```java
int totalUser;
```

❌ Jangan:

```java
int total_user;
int TotalUser;
```

Aturan:

* Tidak boleh diawali angka
* Tidak boleh pakai keyword Java
* Nama harus deskriptif

---

## 7. Kesalahan Umum Pemula

❌ Salah tipe data

```java
int umur = "21"; // error
```

❌ Lupa inisialisasi

```java
int nilai;
System.out.println(nilai); // error
```

---

## 8. Contoh Program Lengkap

```java
public class DataDemo {
    public static void main(String[] args) {
        String nama = "Badru";
        int umur = 21;
        double saldo = 150000.50;
        boolean aktif = true;

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(saldo);
        System.out.println(aktif);
    }
}
```

---

## 9. Output yang Diharapkan

* Paham perbedaan primitive & non-primitive
* Bisa menentukan tipe data yang tepat
* Tidak salah deklarasi variabel

---

## Catatan Penting

> Java memaksa kamu disiplin soal tipe data. Ini alasan kenapa sistem backend Java **jarang error runtime**.

---

📌 *Lanjut ke Day 9 – src.Conditional (if, else, switch)*
