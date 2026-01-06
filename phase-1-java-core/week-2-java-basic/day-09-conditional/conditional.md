# Day 9 – src.Conditional (if, else, switch)

## Tujuan Pembelajaran

Hari ke-9 fokus pada **pengambilan keputusan dalam program Java**. src.Conditional adalah inti dari **business logic backend**.

---

## 1. Apa Itu src.Conditional?

**src.Conditional** adalah mekanisme untuk menjalankan kode **berdasarkan kondisi tertentu**.

Contoh nyata di backend:

* Login berhasil / gagal
* Saldo cukup / tidak cukup
* Role USER / ADMIN

---

## 2. if Statement

Digunakan jika hanya ada **satu kondisi**.

```java
int umur = 21;

if (umur >= 18) {
    System.out.println("Boleh daftar");
}
```

---

## 3. if – else

Digunakan jika ada **dua kemungkinan kondisi**.

```java
int saldo = 50000;

if (saldo >= 100000) {
    System.out.println("Saldo cukup");
} else {
    System.out.println("Saldo tidak cukup");
}
```

---

## 4. if – else if – else

Digunakan jika ada **lebih dari dua kondisi**.

```java
int nilai = 85;

if (nilai >= 85) {
    System.out.println("Grade A");
} else if (nilai >= 70) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

---

## 5. Operator Perbandingan

| Operator | Arti                    |
| -------- | ----------------------- |
| >        | lebih dari              |
| <        | kurang dari             |
| >=       | lebih dari sama dengan  |
| <=       | kurang dari sama dengan |
| ==       | sama dengan             |
| !=       | tidak sama dengan       |

⚠️ Jangan salah:

```java
==  // membandingkan
=   // assignment
```

---

## 6. Operator Logika

| Operator | Arti |   |    |
| -------- | ---- | - | -- |
| &&       | AND  |   |    |
|          |      |   | OR |
| !        | NOT  |   |    |

Contoh:

```java
if (umur >= 18 && statusAktif) {
    System.out.println("Akses diterima");
}
```

---

## 7. switch Statement

Digunakan jika kondisi berbasis **nilai tertentu**.

```java
int menu = 2;

switch (menu) {
    case 1:
        System.out.println("Transfer");
        break;
    case 2:
        System.out.println("Cek Saldo");
        break;
    default:
        System.out.println("Menu tidak tersedia");
}
```

📌 `break` wajib agar tidak jatuh ke case berikutnya.

---

## 8. src.Conditional di Backend (Real Case)

```java
if (saldo >= nominal && isActive) {
    System.out.println("Transaksi berhasil");
} else {
    System.out.println("Transaksi gagal");
}
```

---

## 9. Kesalahan Umum Pemula

❌ Salah operator

```java
if (umur = 18) { }
```

❌ Lupa kurung kurawal
❌ Kondisi terlalu kompleks

---

## 10. Output yang Diharapkan

* Bisa menentukan kondisi dengan benar
* Bisa memilih if atau switch
* Bisa menulis business logic sederhana

---

## Catatan Penting

> src.Conditional yang rapi = backend yang mudah dirawat.

---

📌 *Lanjut ke Day 10 – Loop (Perulangan)*
