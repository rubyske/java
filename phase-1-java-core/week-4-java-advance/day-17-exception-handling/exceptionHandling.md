# 📘 DAY 17 – EXCEPTION HANDLING (Backend Java)

## 1️⃣ Apa itu Exception?

Exception adalah kondisi **error saat program berjalan (runtime)** yang mengganggu alur normal aplikasi.

Dalam backend Java:

* Exception **pasti terjadi** (input user, network, database)
* Yang penting bukan menghindari, tapi **mengelola dengan benar**

---

## 2️⃣ Kenapa Exception Handling Wajib di Backend?

Tanpa exception handling:

* Aplikasi crash
* User dapat error mentah
* Data bisa tidak konsisten

Dengan exception handling:

* Aplikasi tetap stabil
* Error terkontrol
* Mudah debugging

---

## 3️⃣ Contoh Exception Umum di Backend Java

| Exception             | Penyebab                    |
| --------------------- | --------------------------- |
| NullPointerException  | Object belum diinisialisasi |
| ArithmeticException   | Pembagian 0                 |
| NumberFormatException | Parsing gagal               |
| ArrayIndexOutOfBounds | Index salah                 |

---

## 4️⃣ Struktur try-catch

```java
try {
    // kode berpotensi error
} catch (Exception e) {
    // handle error
}
```

Contoh:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Terjadi error perhitungan");
}
```

---

## 5️⃣ Multiple Catch

```java
try {
    Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Format angka salah");
} catch (Exception e) {
    System.out.println("Error umum");
}
```

📌 Catch spesifik **harus di atas** catch umum

---

## 6️⃣ finally Block

`finally` selalu dieksekusi, baik error maupun tidak.

```java
try {
    // logic
} catch (Exception e) {
    // handle
} finally {
    System.out.println("Selesai proses");
}
```

Backend use case:

* Close connection
* Close file
* Logging

---

## 7️⃣ throw vs throws

### `throw`

Digunakan untuk **melempar exception secara manual**

```java
if (amount <= 0) {
    throw new IllegalArgumentException("Nominal tidak valid");
}
```

### `throws`

Digunakan pada method signature

```java
void readFile() throws IOException {
    // logic
}
```

---

## 8️⃣ Custom Exception

Digunakan agar error **jelas dan bermakna**

```java
public class SaldoTidakCukupException extends RuntimeException {
    public SaldoTidakCukupException(String message) {
        super(message);
    }
}
```

Penggunaan:

```java
if (saldo < amount) {
    throw new SaldoTidakCukupException("Saldo tidak mencukupi");
}
```

---

## 9️⃣ Best Practice Exception Backend Java

* Jangan swallow exception
* Jangan catch Exception langsung (kecuali global)
* Pesan error harus jelas
* Gunakan custom exception

---

# 🧪 TUGAS PROGRAM – DAY 17

## ✅ Tugas 1 – try-catch

Buat program pembagian angka dan handle `ArithmeticException`

---

## ✅ Tugas 2 – Validasi dengan throw

Buat method `validateAmount(double amount)`

* Jika <= 0 → throw `IllegalArgumentException`

---

## ✅ Tugas 3 – Custom Exception

* Buat `SaldoTidakCukupException`
* Lempar exception saat saldo < nominal

---

## 📌 Kesimpulan Day 17

* Exception adalah hal normal di backend
* Tangani error, jangan dihindari
* Custom exception = backend profesional

➡️ Lanjut ke **Day 18 – Collection (List, Set, Map)**
