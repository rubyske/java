# 📘 DAY 16 – METHOD DETAIL (Backend Java)

## 1️⃣ Apa itu Method?

Method adalah kumpulan instruksi (blok kode) yang memiliki **tanggung jawab tertentu** dan dapat dipanggil berulang kali.

Dalam backend Java:

* Hampir seluruh **business logic** ditulis dalam method
* `main()` hanya sebagai entry point

---

## 2️⃣ Kenapa Method Sangat Penting di Backend?

Tanpa method:

* Kode menumpuk di `main`
* Sulit dibaca
* Sulit dites (unit testing)
* Sulit di-maintain

Dengan method:

* Kode terstruktur
* Mudah debugging
* Mudah reusable
* Mudah dikembangkan

---

## 3️⃣ Struktur Dasar Method

```java
accessModifier returnType methodName(parameter) {
    // logic
    return value; // jika returnType bukan void
}
```

Contoh:

```java
int tambah(int a, int b) {
    return a + b;
}
```

---

## 4️⃣ Method Tanpa Parameter

### Kapan digunakan?

* Tidak membutuhkan input
* Biasanya untuk menampilkan info atau proses statis

Contoh:

```java
void showAppInfo() {
    System.out.println("Backend Java Application");
}
```

---

## 5️⃣ Method Dengan Parameter

### Kapan digunakan?

* Logic membutuhkan data dari luar
* Ini **paling sering dipakai di backend**

Contoh:

```java
void login(String username, String password) {
    System.out.println(username + " mencoba login");
}
```

📌 Parameter = data masuk ke method

---

## 6️⃣ Method Dengan Return Value

### Kapan digunakan?

* Method menghasilkan nilai
* Untuk validasi, perhitungan, status

Contoh:

```java
boolean isAdult(int age) {
    return age >= 18;
}
```

📌 Return = data keluar dari method

---

## 7️⃣ `void` vs `return`

| void                      | return              |
| ------------------------- | ------------------- |
| Tidak mengembalikan nilai | Mengembalikan nilai |
| Biasanya side effect      | Biasanya logic      |
| Print, save, log          | Validate, calculate |

Contoh backend:

```java
void saveUser(User user)
boolean validateToken(String token)
```

---

## 8️⃣ Jangan Taruh Semua Logic di `main`

❌ Tidak disarankan:

```java
public static void main(String[] args) {
    int saldo = 100000;
    if (saldo > 50000) {
        System.out.println("Bisa transfer");
    }
}
```

✅ Disarankan:

```java
static boolean canTransfer(int saldo) {
    return saldo > 50000;
}
```

---

## 9️⃣ Best Practice Method di Backend Java

* 1 method = 1 tanggung jawab
* Nama method harus jelas
* Hindari method terlalu panjang (>20 baris)
* Method mudah dites

Contoh nama method yang baik:

```java
calculateTotal()
validateUser()
sendNotification()
```

---

# 🧪 TUGAS PROGRAM – DAY 16

## ✅ Tugas 1 – Method Tanpa Parameter

Buat method:

```java
void showWelcomeMessage()
```

Output:

```
Welcome to Backend Java System
```

---

## ✅ Tugas 2 – Method Dengan Parameter

Buat method:

```java
void greetUser(String name)
```

Output:

```
Hello, Badru Kamal
```

---

## ✅ Tugas 3 – Method Dengan Return

Buat method:

```java
boolean isSaldoCukup(double saldo, double nominal)
```

Rule:

* return `true` jika saldo ≥ nominal
* return `false` jika tidak

---

## ✅ Tugas 4 – Studi Kasus Mini

Buat class `TransactionService` dengan method:

* `validateAmount(double amount)`
* `processTransaction(double saldo, double amount)`

Gunakan parameter & return

---

## 📌 Kesimpulan Day 16

* Method adalah fondasi backend Java
* Parameter = input
* Return = output
* `main()` hanya runner

➡️ Lanjut ke **Day 17 – Exception Handling**
