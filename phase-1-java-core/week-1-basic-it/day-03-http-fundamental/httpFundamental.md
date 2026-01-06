# Day 3 – HTTP Fundamental

## Tujuan Pembelajaran

Hari ketiga bertujuan untuk **memahami HTTP secara menyeluruh** karena HTTP adalah dasar utama komunikasi antara client dan backend. Tanpa HTTP, tidak ada REST API.

---

## 1. Apa itu HTTP?

**HTTP (HyperText Transfer Protocol)** adalah protokol komunikasi antara **client** dan **server**.

Karakteristik HTTP:

* Berbasis request–response
* Stateless (tidak menyimpan state)
* Digunakan di semua aplikasi web

> Setiap komunikasi browser ↔ backend selalu menggunakan HTTP.

---

## 2. Konsep Request dan Response

### HTTP Request

Request adalah **permintaan dari client ke server**.

Request berisi:

* Method (GET, POST, PUT, DELETE)
* URL
* Header
* Body (opsional)

Contoh sederhana:

* Client meminta data user
* Client mengirim data login

### HTTP Response

Response adalah **jawaban dari server ke client**.

Response berisi:

* Status code
* Header
* Body (data)

> Backend developer bertanggung jawab menyusun response yang benar.

---

## 3. HTTP Method (Verb)

### 1️⃣ GET

Digunakan untuk **mengambil data**.

Contoh:

* Ambil data user
* Ambil daftar produk

Ciri:

* Tidak mengubah data
* Tidak memiliki body (umumnya)

---

### 2️⃣ POST

Digunakan untuk **mengirim data baru**.

Contoh:

* Registrasi user
* Login
* Tambah data

Ciri:

* Memiliki body
* Mengubah data di server

---

### 3️⃣ PUT

Digunakan untuk **mengubah data yang sudah ada**.

Contoh:

* Update profil user
* Update alamat

---

### 4️⃣ DELETE

Digunakan untuk **menghapus data**.

Contoh:

* Hapus user
* Hapus produk

---

## 4. Contoh Penggunaan HTTP Method

| Method | Fungsi      | Contoh          |
| ------ | ----------- | --------------- |
| GET    | Ambil data  | GET /users      |
| POST   | Tambah data | POST /users     |
| PUT    | Update data | PUT /users/1    |
| DELETE | Hapus data  | DELETE /users/1 |

---

## 5. HTTP Header

**Header** berisi informasi tambahan tentang request/response.

Contoh header penting:

* Content-Type
* Authorization
* Accept

Header sering digunakan untuk:

* Autentikasi
* Format data
* Informasi client

---

## 6. HTTP Body

**Body** berisi data utama yang dikirim client atau server.

Biasanya menggunakan format:

* JSON

Contoh:

```json
{
  "username": "badru",
  "password": "123456"
}
```

---

## 7. Stateless Concept

HTTP bersifat **stateless**, artinya:

* Setiap request berdiri sendiri
* Server tidak mengingat request sebelumnya

Solusi:

* Token (JWT)
* Session

> Konsep ini penting untuk sistem scalable.

---

## 8. Contoh Alur HTTP Nyata

Kasus: Login User

1. Client kirim POST /login
2. Backend validasi data
3. Backend kirim response
4. Client menampilkan hasil

Semua komunikasi menggunakan HTTP.

---

## 9. Output yang Diharapkan Day 3

Setelah Day 3, kamu harus:

* Paham konsep HTTP
* Bisa membedakan request & response
* Mengerti fungsi HTTP method
* Siap masuk ke REST API

---

## Catatan Penting

> Jika HTTP sudah paham, REST API hanya tinggal aturan dan best practice.

---

📌 *Lanjut ke Day 4: REST Concept*
