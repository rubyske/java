# Day 5 – Logika & Algoritma Dasar

## Tujuan Pembelajaran

Hari kelima bertujuan membangun **cara berpikir backend developer** melalui logika dan algoritma dasar. Tanpa logika yang kuat, bahasa dan framework tidak akan banyak membantu.

---

## 1. Apa itu Logika Pemrograman?

**Logika pemrograman** adalah kemampuan menyusun langkah-langkah yang **benar, urut, dan konsisten** untuk menyelesaikan masalah.

Ciri logika yang baik:

* Input jelas
* Proses terdefinisi
* Output bisa diprediksi

> Backend developer bekerja dengan **aturan dan kondisi**, bukan sekadar tampilan.

---

## 2. Apa itu Algoritma?

**Algoritma** adalah urutan langkah logis untuk menyelesaikan suatu masalah.

Syarat algoritma:

1. Memiliki awal dan akhir
2. Langkah-langkah jelas
3. Menghasilkan output

Contoh algoritma sederhana:

* Hitung total belanja
* Validasi login
* Cek saldo sebelum transfer

---

## 3. Flowchart

**Flowchart** adalah representasi visual dari algoritma.

Simbol umum:

* Oval : Start / End
* Persegi panjang : Proses
* Belah ketupat : Decision (kondisi)
* Panah : Alur proses

### Contoh Flowchart Login (Deskripsi):

1. Start
2. Input username & password
3. Cek ke database
4. Jika valid → Login sukses
5. Jika tidak valid → Login gagal
6. End

Flowchart membantu melihat **alur logika tanpa coding**.

---

## 4. Pseudocode

**Pseudocode** adalah penulisan algoritma dengan bahasa manusia + struktur mirip kode.

Contoh pseudocode login:

```
START
INPUT username, password
IF username dan password valid THEN
  OUTPUT "Login berhasil"
ELSE
  OUTPUT "Login gagal"
END IF
END
```

Pseudocode digunakan sebelum menulis kode Java.

---

## 5. Studi Kasus Sederhana (Backend Oriented)

### Studi Kasus 1: Validasi Login

**Masalah:**
User ingin login ke sistem.

**Logika:**

1. Terima input username & password
2. Jika salah satu kosong → gagal
3. Cek kecocokan ke database
4. Jika cocok → sukses
5. Jika tidak → gagal

---

### Studi Kasus 2: Transfer Saldo

**Masalah:**
User ingin transfer saldo ke user lain.

**Logika:**

1. Input saldo pengirim
2. Input nominal transfer
3. Jika saldo < nominal → gagal
4. Jika saldo cukup → transfer berhasil

---

## 6. Pentingnya Logika untuk Backend Java

Dalam backend Java, logika digunakan untuk:

* Validasi request
* Business rule
* Error handling
* Pengambilan keputusan

Framework **tidak menggantikan logika**, hanya membantu implementasi.

---

## 7. Output yang Diharapkan Day 5

Setelah Day 5, kamu harus:

* Paham konsep logika & algoritma
* Bisa membuat flowchart sederhana
* Bisa menulis pseudocode
* Siap masuk ke Java Core

---

## Catatan Penting

> Backend developer yang kuat bukan yang hafal syntax, tapi yang **rapi berpikir**.

---

📌 *Phase 1 selesai. Siap lanjut ke Phase berikutnya (Java Core).*
;;;;;;;;;;;;;;;;;;;;;;;;