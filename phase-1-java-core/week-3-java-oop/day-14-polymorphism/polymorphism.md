# Day 14 – Polymorphism (Overriding & Dynamic Binding)

## 🎯 Tujuan Pembelajaran

Pada hari ini kamu akan memahami:

* Apa itu **Polymorphism**
* Hubungan Polymorphism dengan Inheritance
* **Method Overriding**
* **Dynamic Binding**
* Kenapa polymorphism sangat penting di backend Java (Spring)

Polymorphism adalah **jantung OOP backend Java**.

---

## 1️⃣ Apa itu Polymorphism?

**Polymorphism** berarti:

> Satu tipe parent, banyak bentuk perilaku

Dalam Java:

* Reference → parent
* Object → child
* Method yang dipanggil → milik child

---

## 2️⃣ Contoh Sederhana

```java
Employee emp = new BackendDeveloper();
emp.work();
```

Yang dipanggil:

* ❌ BUKAN `Employee.work()`
* ✅ `BackendDeveloper.work()`

➡️ Inilah **polymorphism**.

---

## 3️⃣ Syarat Terjadinya Polymorphism

1. Ada **Inheritance**
2. Ada **Method Overriding**
3. Reference parent → object child

Tanpa 3 ini → bukan polymorphism.

---

## 4️⃣ Method Overriding

Overriding adalah:

> Child mengganti implementasi method parent

### Aturan Overriding

* Nama method sama
* Parameter sama
* Return type sama
* Access modifier **tidak boleh lebih sempit**

---

## 5️⃣ Contoh Overriding

### Parent

```java
public class Employee {
    public void work() {
        System.out.println("Employee bekerja");
    }
}
```

### Child

```java
public class BackendDeveloper extends Employee {
    @Override
    public void work() {
        System.out.println("Backend Developer mengembangkan backend");
    }
}
```

---

## 6️⃣ Dynamic Binding (Runtime)

Dynamic binding artinya:

* Method dipilih **saat runtime**
* BUKAN saat compile

Java menentukan method berdasarkan:

> Object yang dibuat (`new`)

---

## 7️⃣ Kenapa Polymorphism Penting di Backend?

Contoh dunia nyata (Spring Boot):

```java
UserService service = new UserServiceImpl();
service.process();
```

* Controller **tidak peduli** implementasi
* Mudah diganti
* Mudah di-test

➡️ Ini polymorphism.

---

## 8️⃣ Studi Kasus Backend

### Parent

```java
public class Payment {
    public void pay() {
        System.out.println("Pembayaran umum");
    }
}
```

### Child

```java
public class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Bayar dengan kartu kredit");
    }
}

public class EWalletPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Bayar dengan e-wallet");
    }
}
```

### MainApp

```java
public class MainApp {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();

        payment = new EWalletPayment();
        payment.pay();
    }
}
```

---

## 9️⃣ TUGAS LATIHAN DAY 14

### 📝 Tugas 1

Buat parent class `Notification`:

* method `send()`

---

### 📝 Tugas 2

Buat child class:

* `EmailNotification`
* `SmsNotification`

Override method `send()`

---

### 📝 Tugas 3

Buat `MainApp`:

* Gunakan reference `Notification`
* Panggil method `send()`

---

## 🔟 Kesimpulan Day 14

* Polymorphism = fleksibilitas
* Reference parent → object child
* Method dipilih saat runtime
* Ini **inti Spring & backend modern**

---

## 🚀 Next Step

👉 **Day 15 – OOP Practice (Studi Kasus Sederhana)**

Semua konsep OOP akan digabung 💪
