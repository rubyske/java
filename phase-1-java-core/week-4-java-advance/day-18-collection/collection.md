# 📘 DAY 18 – COLLECTION (List, Set, Map)

## 1️⃣ Apa itu Collection?

Collection adalah **struktur data** di Java untuk menyimpan dan mengelola banyak data/object.

Dalam backend Java:

* Hampir semua data (user, transaksi, response API) disimpan dalam collection
* Collection = fondasi Repository & Service

---

## 2️⃣ Kenapa Collection Penting di Backend?

Tanpa collection:

* Data sulit dikelola
* Tidak fleksibel

Dengan collection:

* Data dinamis
* Mudah diproses
* Mudah dikombinasikan dengan Stream API

---

## 3️⃣ Jenis Collection Utama

### 🔹 List

* Data berurutan
* Boleh duplikat
* Bisa diakses pakai index

Contoh implementasi:

```java
List<String> users = new ArrayList<>();
users.add("admin");
users.add("admin");
```

Use case backend:

* List user
* List transaksi

---

### 🔹 Set

* Data unik
* Tidak ada duplikat
* Tidak menjamin urutan

Contoh:

```java
Set<String> roles = new HashSet<>();
roles.add("ADMIN");
roles.add("ADMIN");
```

Use case backend:

* Role user
* Permission

---

### 🔹 Map

* Key – Value
* Key harus unik
* Sangat sering dipakai di backend

Contoh:

```java
Map<String, String> userMap = new HashMap<>();
userMap.put("username", "admin");
userMap.put("email", "admin@mail.com");
```

Use case backend:

* Response JSON
* Cache data

---

## 4️⃣ Perbandingan List, Set, Map

| Collection | Duplikat    | Index | Key-Value |
| ---------- | ----------- | ----- | --------- |
| List       | Ya          | Ya    | Tidak     |
| Set        | Tidak       | Tidak | Tidak     |
| Map        | Value boleh | Tidak | Ya        |

---

## 5️⃣ Iterasi Collection

### For-each

```java
for (String user : users) {
    System.out.println(user);
}
```

### Iterator

```java
Iterator<String> it = users.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

## 6️⃣ Best Practice Collection di Backend

* Gunakan interface (`List`, `Set`, `Map`)
* Hindari implementasi langsung di signature
* Pilih collection sesuai kebutuhan

---

# 🧪 TUGAS PROGRAM – DAY 18

## ✅ Tugas 1 – List

Buat `List<String>` berisi nama user dan tampilkan semua

---

## ✅ Tugas 2 – Set

Buat `Set<String>` role user dan buktikan tidak ada duplikat

---

## ✅ Tugas 3 – Map

Buat `Map<String, Object>` untuk data user:

* username
* email
* saldo

---

## 📌 Kesimpulan Day 18

* Collection = fondasi data backend
* List → data berurutan
* Set → data unik
* Map → struktur JSON

➡️ Lanjut ke **Day 19 – Stream API**
