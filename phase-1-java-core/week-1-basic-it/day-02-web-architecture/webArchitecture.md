# Day 2 – Cara Kerja Web (Web Architecture)

## Tujuan Pembelajaran

Pada hari kedua ini, tujuan utamanya adalah **memahami bagaimana aplikasi web bekerja dari ujung ke ujung**, mulai dari user hingga backend server. Ini adalah fondasi wajib sebelum belajar HTTP, REST, dan API.

---

## 1. Apa itu Web Architecture?

**Web Architecture** adalah cara komponen dalam aplikasi web saling berkomunikasi.

Komponen utamanya:

1. Client
2. Internet
3. Server
4. Database

Semua aplikasi web modern (termasuk backend Java) mengikuti pola ini.

---

## 2. Client–Server Concept

### Apa itu Client?

**Client** adalah pihak yang mengirim permintaan (request).

Contoh client:

* Browser (Chrome, Firefox)
* Mobile App
* Frontend Web
* Postman

Client **tidak memproses data bisnis**, hanya meminta dan menampilkan hasil.

### Apa itu Server?

**Server** adalah pihak yang menerima request dan memprosesnya.

Tugas server:

* Menjalankan backend application
* Mengolah logika bisnis
* Mengakses database
* Mengirim response ke client

> Backend developer bekerja di sisi **server**.

---

## 3. Alur Kerja Client–Server

Contoh alur sederhana:

1. User membuka website
2. Browser mengirim request ke server
3. Server memproses request
4. Server mengakses database (jika perlu)
5. Server mengirim response ke client
6. Browser menampilkan hasil

Semua proses ini terjadi dalam hitungan milidetik.

---

## 4. Peran Browser dalam Web

Browser berfungsi sebagai:

* Client
* Request sender
* Response renderer

Yang dilakukan browser:

* Mengirim HTTP request
* Menerima HTTP response
* Menampilkan HTML / JSON

Browser **tidak tahu logika backend**, hanya menampilkan hasil.

---

## 5. Apa itu Web Server?

**Web Server** adalah software yang menerima request dari client.

Contoh Web Server:

* Apache
* Nginx
* Tomcat
* WebLogic

Fungsi web server:

* Menerima request HTTP
* Meneruskan ke backend application
* Mengirim response kembali

> Dalam Java backend, server sering berjalan di Tomcat atau WebLogic.

---

## 6. Backend Application dalam Arsitektur Web

Backend application:

* Berjalan di atas web server
* Ditulis menggunakan Java
* Mengandung logika bisnis

Tugas backend:

* Validasi data
* Proses bisnis
* Akses database
* Menyusun response

---

## 7. Gambaran Arsitektur Web Sederhana

```
User
 ↓
Browser (Client)
 ↓ HTTP Request
Web Server
 ↓
Backend Application (Java)
 ↓
Database
```

Semua komunikasi dilakukan melalui **HTTP**.

---

## 8. Contoh Kasus Nyata

### Kasus: Login User

1. User input username & password
2. Browser kirim request ke server
3. Backend validasi data
4. Backend cek database
5. Backend kirim response sukses / gagal

Frontend hanya menampilkan hasil, **keputusan ada di backend**.

---

## 9. Output yang Diharapkan Day 2

Setelah Day 2, kamu harus:

* Paham konsep client–server
* Mengerti peran browser
* Mengerti fungsi web server
* Bisa menjelaskan alur request–response
* Siap masuk ke materi HTTP

---

## Catatan Penting

> Jika kamu paham arsitektur web, maka:
>
> * HTTP akan terasa mudah
> * REST API tidak membingungkan
> * Debugging backend jadi lebih masuk akal

---

📌 *Lanjut ke Day 3: HTTP Fundamental*
