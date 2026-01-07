# Day 12 – Encapsulation (Access Modifier)

## 🎯 Tujuan Pembelajaran

Pada hari ini kamu akan memahami:

* Apa itu **Encapsulation**
* Kenapa atribut harus `private`
* Fungsi **getter & setter**
* Dampak encapsulation terhadap keamanan dan kestabilan backend Java

Encapsulation adalah **fondasi penting backend Java** dan hampir **SELALU dipakai di project nyata**.

---

## 1️⃣ Apa itu Encapsulation?

**Encapsulation** adalah konsep OOP untuk:

> ❝ Membungkus data (atribut) dan membatasi akses langsung dari luar class ❞

Dalam backend:

* Data **tidak boleh diubah sembarangan**
* Akses harus lewat **aturan (method)**

### Analogi Dunia Nyata

ATM Bank:

* Kamu **tidak bisa langsung ambil saldo** dari server
* Harus lewat proses: PIN → Validasi → Transaksi

➡️ Itulah encapsulation.

---

## 2️⃣ Masalah Jika Tidak Menggunakan Encapsulation

```java
public class Account {
    public double balance;
}
```

Masalah:

* Siapa pun bisa menulis:

```java
account.balance = -999999;
```

❌ **Bahaya untuk sistem backend**

---

## 3️⃣ Access Modifier di Java

| Modifier  | Akses                                   |
| --------- | --------------------------------------- |
| public    | Bisa diakses dari mana saja             |
| private   | HANYA bisa diakses di class itu sendiri |
| protected | Satu package / turunan                  |
| default   | Satu package                            |

📌 Backend Java **hampir selalu menggunakan `private` untuk atribut**.

---

## 4️⃣ Contoh Encapsulation yang BENAR

### Class Account

```java
package src;

public class Account {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Saldo tidak boleh negatif");
        } else {
            this.balance = balance;
        }
    }
}
```

✅ Data aman
✅ Ada validasi
✅ Siap dipakai backend

---

## 5️⃣ Getter & Setter Itu Apa?

| Method | Fungsi                      |
| ------ | --------------------------- |
| Getter | Mengambil data              |
| Setter | Mengubah data dengan aturan |

Kenapa tidak akses langsung?

* Agar bisa:

    * Validasi
    * Logging
    * Security

---

## 6️⃣ Encapsulation di Dunia Backend Nyata

Contoh kasus:

* Update saldo
* Update email user
* Update status akun

Semua **HARUS lewat method**, bukan akses langsung.

❌ SALAH:

```java
user.email = "hack@gmail.com";
```

✅ BENAR:

```java
user.setEmail("hack@gmail.com");
```

---

## 7️⃣ TUGAS LATIHAN DAY 12

### 📝 Tugas 1 – Encapsulation User

Buat class `User` dengan:

* private `username`
* private `email`
* getter & setter
* validasi email tidak boleh kosong

---

### 📝 Tugas 2 – Encapsulation Account

Tambahkan:

* method `deposit(double amount)`
* method `withdraw(double amount)`

Rules:

* Tidak boleh tarik saldo lebih besar dari balance

---

### 📝 Tugas 3 – Simulasi Backend

Buat `MainApp`:

* Buat User
* Buat Account
* Hubungkan User dengan Account
* Lakukan deposit & withdraw

---

## 8️⃣ Kesimpulan Day 12

* Encapsulation = keamanan data
* Atribut **HARUS private**
* Getter & Setter = pintu resmi data
* Ini adalah **standar backend Java profesional**

---

## 🚀 Next Step

👉 **Day 13 – Inheritance (extends & super)**

Di sini kamu mulai bangun **hierarki class seperti sistem enterprise** 💪
