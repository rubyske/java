# Day 1 – Backend Overview

## Tujuan Pembelajaran

Pada hari pertama ini, tujuan utama adalah **memahami konsep backend secara menyeluruh**, perannya dalam aplikasi, serta membedakannya dengan frontend. Pemahaman ini penting sebelum masuk ke teknis Java dan coding.

---

## 1. Apa itu Backend?

**Backend** adalah bagian dari aplikasi yang berjalan di sisi server dan bertanggung jawab atas:

* Logika bisnis
* Pengolahan data
* Komunikasi dengan database
* Penyediaan API untuk frontend atau client lain

Backend **tidak berhubungan langsung dengan tampilan**, tetapi memastikan data dan proses berjalan benar.

### Contoh:

Ketika user login:

1. Frontend mengirim username & password
2. Backend memverifikasi ke database
3. Backend mengirim hasil (sukses/gagal)

---

## 2. Perbedaan Frontend dan Backend

| Frontend              | Backend                |
| --------------------- | ---------------------- |
| Tampilan UI           | Logika aplikasi        |
| Jalan di browser      | Jalan di server        |
| HTML, CSS, JavaScript | Java, Python, Go       |
| Fokus ke user         | Fokus ke data & proses |

### Analogi Sederhana

* Frontend = kasir
* Backend = sistem gudang & akuntansi

User hanya melihat kasir, tetapi semua proses penting terjadi di backend.

---

## 3. Tugas Seorang Backend Developer

Seorang backend developer bertanggung jawab untuk:

1. **Membuat API**

    * Endpoint untuk frontend
    * REST API

2. **Mengelola Database**

    * CRUD data
    * Menjaga konsistensi & integritas data

3. **Menangani Logika Bisnis**

    * Validasi
    * Perhitungan
    * Alur proses

4. **Keamanan**

    * Autentikasi
    * Otorisasi
    * Proteksi data

5. **Performa & Stabilitas**

    * Optimasi query
    * Error handling

---

## 4. Contoh Sistem yang Menggunakan Backend

### Contoh 1: Sistem Login

* Terima username & password
* Validasi ke database
* Kirim response

### Contoh 2: Sistem Transfer Saldo

* Cek saldo
* Validasi nominal
* Update saldo pengirim & penerima
* Simpan riwayat transaksi

### Contoh 3: Sistem E-Commerce

* Produk
* Keranjang
* Checkout
* Pembayaran

Semua proses di atas **ditangani backend**.

---

## 5. Output yang Diharapkan Hari Ini

Setelah menyelesaikan Day 1, kamu harus:

* Paham apa itu backend
* Bisa menjelaskan perbedaan frontend & backend
* Mengerti peran backend developer
* Punya gambaran sistem backend di dunia nyata

---

## Catatan Penting

> Backend bukan soal framework dulu, tapi **cara berpikir sistem**.

Pemahaman konsep hari ini akan menjadi fondasi untuk:

* HTTP
* REST API
* Java
* Spring Boot

---

📌 *Lanjutkan ke Day 2: Cara Kerja Web (Client–Server & Web Architecture)*
