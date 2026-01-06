# Day 4 – REST Concept

## Tujuan Pembelajaran

Hari keempat fokus pada **REST (Representational State Transfer)**, yaitu standar desain API yang paling umum digunakan pada backend modern, termasuk **Backend Java (Spring Boot)**.

Jika HTTP adalah "bahasanya", maka REST adalah **aturan mainnya**.

---

## 1. Apa itu REST?

**REST** adalah konsep arsitektur untuk membangun **API** yang terstruktur, konsisten, dan mudah dipahami.

REST **bukan framework**, bukan bahasa, tapi **cara berpikir dalam mendesain API**.

REST memanfaatkan:

* HTTP Method
* URL
* Status Code
* JSON

---

## 2. Apa itu REST API?

**REST API** adalah API yang mengikuti prinsip REST.

Ciri utama REST API:

* Menggunakan HTTP Method (GET, POST, PUT, DELETE)
* Menggunakan URL sebagai resource
* Menggunakan JSON sebagai format data
* Bersifat stateless

Contoh:

```
GET /users
POST /users
GET /users/1
```

---

## 3. Resource dan Endpoint

### Resource

**Resource** adalah objek utama yang diakses oleh API.

Contoh resource:

* User
* Product
* Order
* Transaction

### Endpoint

**Endpoint** adalah alamat URL untuk mengakses resource.

Contoh:

* /users
* /products
* /orders

> Endpoint harus **kata benda**, bukan kata kerja.

❌ /getUsers
✅ /users

---

## 4. HTTP Method dalam REST

| Method | Fungsi      | Contoh Endpoint |
| ------ | ----------- | --------------- |
| GET    | Ambil data  | GET /users      |
| POST   | Tambah data | POST /users     |
| PUT    | Update data | PUT /users/1    |
| DELETE | Hapus data  | DELETE /users/1 |

REST menggabungkan **endpoint + method** untuk menentukan aksi.

---

## 5. JSON (JavaScript Object Notation)

**JSON** adalah format data standar dalam REST API.

Contoh JSON:

```json
{
  "id": 1,
  "username": "badru",
  "email": "badru@mail.com"
}
```

Ciri JSON:

* Ringkas
* Mudah dibaca
* Didukung semua bahasa

---

## 6. HTTP Status Code

Status code menunjukkan **hasil request**.

### Status Code Umum:

| Kode | Arti                  | Kapan Digunakan      |
| ---- | --------------------- | -------------------- |
| 200  | OK                    | Request berhasil     |
| 201  | Created               | Data berhasil dibuat |
| 400  | Bad Request           | Request salah        |
| 401  | Unauthorized          | Belum login          |
| 403  | Forbidden             | Tidak punya akses    |
| 404  | Not Found             | Data tidak ada       |
| 500  | Internal Server Error | Error di server      |

> Status code = bahasa komunikasi backend ke client.

---

## 7. Stateless dalam REST

REST bersifat **stateless**, artinya:

* Server tidak menyimpan state client
* Setiap request harus lengkap

Biasanya menggunakan:

* Token (JWT)
* Authorization Header

Ini membuat sistem:

* Scalable
* Mudah dikembangkan

---

## 8. Contoh REST API Nyata

### Ambil Data User

```
GET /users/1
```

Response:

```json
{
  "id": 1,
  "username": "badru"
}
```

### Tambah User

```
POST /users
```

Body:

```json
{
  "username": "andi",
  "password": "123456"
}
```

---

## 9. Best Practice REST API

* Gunakan kata benda untuk endpoint
* Gunakan HTTP method dengan benar
* Gunakan status code yang sesuai
* Konsisten dalam struktur response

---

## 10. Output yang Diharapkan Day 4

Setelah Day 4, kamu harus:

* Paham konsep REST
* Bisa mendesain endpoint REST sederhana
* Mengerti peran JSON & status code
* Siap praktik API dengan Java

---

## Catatan Penting

> REST API yang baik membuat frontend bahagia dan backend lebih mudah di-maintain.

---

📌 *Lanjut ke Day 5 – Algoritma Dasar & Logika*
