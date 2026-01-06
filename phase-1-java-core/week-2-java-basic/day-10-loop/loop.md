# Day 10 – Loop (for, while, do-while)

## Tujuan Pembelajaran

Hari ke-10 fokus pada **perulangan (loop)**. Loop adalah fondasi backend untuk:

* Memproses data banyak (list, array, database result)
* Validasi berulang
* Perhitungan dan agregasi data

---

## 1. Apa Itu Loop?

**Loop** adalah mekanisme untuk menjalankan blok kode **berulang kali** selama kondisi terpenuhi.

Contoh nyata di backend:

* Menghitung total transaksi
* Menampilkan daftar data
* Validasi input berulang

---

## 2. for Loop

Digunakan jika **jumlah perulangan sudah jelas**.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Struktur:

```java
for (inisialisasi; kondisi; increment/decrement)
```

---

## 3. while Loop

Digunakan jika **kondisi lebih penting daripada jumlah perulangan**.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

⚠️ Jangan lupa increment → kalau tidak = infinite loop.

---

## 4. do-while Loop

Kode **pasti dijalankan minimal satu kali**.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## 5. Perbedaan for, while, do-while

| for               | while           | do-while         |
| ----------------- | --------------- | ---------------- |
| Jumlah loop jelas | Kondisi dinamis | Minimal 1x jalan |

---

## 6. Loop di Backend (Real Case)

```java
int[] transaksi = {10000, 20000, 30000};
int total = 0;

for (int t : transaksi) {
    total += t;
}

System.out.println(total);
```

---

## 7. Kesalahan Umum Pemula

❌ Infinite loop
❌ Salah kondisi
❌ Lupa increment

---

## 8. Output yang Diharapkan

* Bisa memilih loop yang tepat
* Tidak membuat infinite loop
* Bisa mengolah data sederhana

---

# 🧪 TUGAS PROGRAM – LOOP & LOGIKA

Kerjakan **tanpa input user** dan **pakai main method**.

---

## 🔹 TUGAS 1 — Hitung Total Saldo

**Soal:**
Diberikan data saldo:

```java
int[] saldo = {100_000, 200_000, 150_000, 50_000};
```

Hitung dan tampilkan **total saldo**.

📌 Gunakan `for` atau `enhanced for`.

---

## 🔹 TUGAS 2 — Validasi Angka Genap & Ganjil

**Soal:**
Buat program yang menampilkan angka **1 sampai 10**, lalu tentukan:

* "Genap"
* "Ganjil"

Contoh output:

```
1 Ganjil
2 Genap
```

📌 Gunakan `for` + `if`.

---

## 🔹 TUGAS 3 — Simulasi Percobaan Login

**Soal:**
Simulasikan percobaan login maksimal **3 kali**.

Data:

* username benar: `admin`
* password benar: `12345`

Aturan:

* Jika benar → tampilkan "Login berhasil" dan berhenti
* Jika salah → tampilkan "Login gagal"
* Jika 3 kali gagal → tampilkan "Akun diblokir"

📌 Gunakan `while` atau `for`.

---

## Catatan Penting

> Loop + Conditional = 80% logic backend.

---

📌 *Setelah ini kita akan masuk Phase 3 (Method & OOP dasar)*
