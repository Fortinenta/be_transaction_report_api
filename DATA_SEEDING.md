# Dokumentasi Data Awal (Data Seeding)

Dokumen ini menjelaskan bagaimana data awal (seed data) dimuat ke dalam database saat aplikasi pertama kali dijalankan.

## Konfigurasi

Proses ini dikendalikan oleh file dan properti berikut:

1.  **File Skrip SQL:** `src/main/resources/data.sql`
    -   File ini berisi semua perintah SQL `INSERT` untuk membuat data sampel.
    -   Skrip ini bersifat idempoten, artinya dapat dijalankan berulang kali tanpa menimbulkan error duplikasi data.

2.  **File Konfigurasi:** `src/main/resources/application.properties`
    -   `spring.sql.init.mode=always`: Memastikan `data.sql` selalu dijalankan setiap kali aplikasi dimulai.
    -   `spring.jpa.hibernate.ddl-auto=update`: Memungkinkan Hibernate untuk membuat atau memperbarui skema database berdasarkan entitas JPA Anda.
    -   `spring.jpa.defer-datasource-initialization=true`: **Penting!** Properti ini menunda eksekusi `data.sql` hingga setelah Hibernate selesai membuat semua tabel, sehingga mencegah error "relation does not exist".

## Data Sampel

Berikut adalah data sampel yang dimasukkan oleh skrip `data.sql`.

### Pengguna (Users)

Dua pengguna sampel telah dibuat untuk tujuan pengujian.

| Username  | Password | Email                 | Peran (Roles) |
| :-------- | :------- | :-------------------- | :------------ |
| `admin`   | `password` | `admin@company.com`   | ADMIN, STAFF  |
| `staff01` | `password` | `staff01@company.com` | STAFF         |

**Catatan:** Kata sandi `password` di-hash menggunakan BCrypt di dalam skrip. Anda harus menggunakan kata sandi `password` saat login melalui API.

### Data Lainnya

Skrip ini juga membuat data sampel untuk:
-   **Roles**: ADMIN dan STAFF.
-   **Customers**: 2 pelanggan sampel.
-   **Taxes**: PPN (11%) dan Service Charge (5%).
-   **Products**: 3 produk sampel (Laptop, Mouse, Keyboard) dengan konfigurasi pajak yang berbeda.

Data transaksi (`transactions` dan `transaction_items`) sengaja tidak dibuat agar Anda dapat mengujinya langsung melalui endpoint API.
