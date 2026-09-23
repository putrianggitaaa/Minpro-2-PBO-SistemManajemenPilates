# Sistem Manajemen Pilates - Geets Pilates Studio
**Putri Anggita Melasari | 2509116010**

## Deskripsi Program
Sistem Manajemen Pilates Geets Pilates Studio merupakan sebuah program yang dirancang untuk membantu proses pengelolaan data pada sebuah studio Pilates secara sederhana.
Program ini menyediakan beberapa menu yang dapat digunakan untuk mengelola informasi terkait Member, Instruktur, Jenis Kelas, dan Data Kelas Pilates. 
Sistem ini dapat membantu pengelola untuk memanajemen proses bisnis yang terdapat dalam Geets Pilates Studio.

## Struktur Packages dan Class 
Program Sistem Manajemen Pilates menerapkan konsep MVC (Model, View, Controller) dengan membagi struktur program ke dalam beberapa package, yaitu model, service, dan main. 
Pembagian ini digunakan untuk memisahkan pengelolaan data, proses pengolahan data, serta bagian utama yang menjalankan program.


<img width="421" height="317" alt="image" src="https://github.com/user-attachments/assets/dd358f8d-136c-418e-9f1f-6ffbca08d668" />


Berikut adalah penjelasan dari masing-masing package dan class yang ada didalam packages tersebut:
### 1. Package 'model'
Package `model` digunakan untuk merepresentasikan data atau objek yang terdapat dalam sistem. Package ini terdiri dari beberapa class, yaitu:

* **a. Member.java**

  Member.java adalah class model yang berisi data member atau pelanggan yang terdaftar. Atribut yang berada dalam class ini, yaitu ID Member, nama, nomor telepon, usia, dan jenis kelamin.
  
*  **b. Instruktur.java**

Instruktur.java adalah class model yang berisi data instruktur yang bekerja di studio. Atribut yang berada dalam class ini, yaitu ID Instruktur, nama Instruktur, nomor telepon, spesialisasi, jenis kelamin, dan domisili.

*  **c. JenisKelas.java**
  
  JenisKelas.java adalah class model yang berisi data jenis kelas yang terdaftar. Atribut yang berada dalam class ini, yaitu ID jenis, Nama Kelas, Level, Durasi.

*  **d. JenisKelasPrivate.java**

JenisKelasPrivate.java adalah class model yang berisi data khusus jenis kelas private yang terdaftar. Atribut yang berada dalam class ini, yaitu jenis sesi.

*  **e. JenisKelasPublik.java**

JenisKelasPublik.java adalah class model yang berisi data khusus jenis kelas publik yang terdaftar. Atribut yang berada dalam class ini, yaitu kapasitas.

*  **f. KelasPilates**

KelasPilates.java adalah class model yang berisi data kelas yang akan dilaksanakan beserta member yang melaksanakan kelas, instruktur yang memandu kelas, serta jenis kelas nya. Class ini juga memuat waktu kapan kelas tersebut dilaksanakan. Atribut yang berada dalam class ini, yaitu ID Kelas, ID Member, ID Instruktur, ID Jenis, Tanggal, Waktu, dan status.

### 2. Package service

Package `service` digunakan untuk menangani proses dan logika yang terdapat dalam program. Package ini terdiri dari:

* **a. Service.java**
  
Class `Service` menangani proses utama yaitu CRUD pada data member, instruktur, jenis kelas, dan kelas Pilates. Class ini  mengatur proses penambahan data, perubahan data, dan penghapusan data.

* **b. InputValidator.java**

Class 'InputValidator` digunakan untuk melakukan validasi terhadap input pengguna, dalam program ini menggunakan validasi input sebagai berikut:

* Input Integer
  
  Digunakan untuk memvalidasi input agar pengguna hanya dapat memasukkan inputan dengan tipe data integer.
* Input String
  
  Digunakan untuk memvalidasi input agar pengguna tidak dapat mengosongkan inputan.
* Input Pilihan
  
  Digunakan untuk memvalidasi input agar pengguna memilih nomor pilihan menu dengan benar.
* Input Status
  
  Digunakan untuk memvalidasi input agar pengguna dapat memilih status kelas pilates dengan benar yang terdiri dari Terjadwal, Selesai, dan Batal.
* Input Nomor Telepon
  
  Digunakan untuk memvalidasi input nomor telepon sehingga pengguna dapat memasukkan nomor telepon dengan rentang 10-12 karakter saja.
* Input Usia
  
  Digunakan untuk memvalidasi input usia sehingga pengguna hanya dapat memasukkan usia dengan rentang 1-100 saja.
* Input Kapasitas

  
  Digunakan untuk memvalidasi input kapasitas sehingga pengguna dapat memasukkan kapasitas kelas tidak lebih dari 25 orang.


### 3. Package main

Package `main` berisi class `PilatesMinpro2` yang digunakan sebagai entry point atau titik awal program. Class ini digunakan untuk menjalankan program dan mengatur alur utama interaksi pengguna dengan sistem. Bagian `main` juga menghubungkan pengguna dengan proses yang terdapat pada `Service`, sehingga pengguna dapat memilih menu dan menjalankan fitur-fitur yang tersedia pada program.

## Alur Program
Alur program dimulai ketika pengguna menjalankan program melalui class Pilates.java sebagai class utama. Setelah program dijalankan, sistem akan menampilkan halaman utama  yang berisi beberapa pilihan menu.
Pengguna dapat memilih menu dengan menginput angka sesuai dengan pilihan yang tersedia. Sistem kemudian menggunakan percabangan switch-case untuk menentukan proses yang akan dijalankan.

Jika pengguna memilih menu Member, sistem akan mengarahkan pengguna ke proses lihat atau tambah data member. Jika memilih Instruktur, sistem akan mengarahkan pengguna ke proses lihat atau tambah data instruktur. Jika memilih Jenis Kelas, sistem akan mengarahkan pengguna ke proses lihat atau tambah data Jenis Kelas. Apabila pengguna memilih menu daftar kelas, maka akan diarahkan ke lihat daftar kelas yang sudah ada, menambahkan daftar kelas baru, menghapus daftar kelas yang sudah ada, dan melakukan update pada data daftar kelas. 

Program akan terus berjalan dan menampilkan kembali menu utama selama pengguna belum memilih menu Keluar. Dengan demikian, pengguna dapat melakukan beberapa proses pengelolaan data dalam satu kali menjalankan program.

## Penerapan Encapsulation

Konsep encapsulation diterapkan pada class Member, Instruktur, JenisKelas, JenisKelasPrivate, JenisKelasPublik, dan KelasPilates dengan menjadikan atribut-atribut di dalamnya sebagai private. Atribut tersebut tidak dapat diakses secara langsung dari class lain, sehingga akses data dilakukan melalui getter dan setter yang telah disediakan. Selain itu, class Service juga menerapkan encapsulation pada atribut seperti daftarMember, daftarInstruktur, daftarJenisKelas, dan daftarKelas, sedangkan class InputValidator menerapkannya pada atribut scanner. Penggunaan encapsulation berfungsi untuk melindungi dan membatasi akses langsung terhadap data, sehingga perubahan maupun pengambilan data harus dilakukan melalui method yang telah ditentukan dan data menjadi lebih terkontrol.  

## Penerapan Inheritance

Inheritance dalam program ini diterapkan dengan membuat class JenisKelas.java yang bertindak sebagai Superclass dan class JenisKelasPrivate.java serta JenisKelasPublik.java yang bertindak sebagai Subclass. Kedua class yang bertindak sebagai Subclass tersebut mewarisi atribut dari Superclass nya, yaitu JenisKelas.java. Pada JenisKelasPrivate.java terdapat tambahan atribut khusus yaitu jenisSesi dan untuk JenisKelasPublik.java terdapat tambahan atribut khusus yaitu kapasitas. Pada masing-masing Subclass, diterapkan keyword 'super' untuk mengakses atribut dari Superclass nya. Selain itu, terdapat penerapan keyword 'final' pada atribut kapasitas dibagian InputValidator yang bertujuan untuk membatasi modifikasi pada atribut kapasitas sehingga pengguna dapat memasukkan kapasitas maksimal 25.

## Penerapan Polymorphism 

Polymorphism dalam program ini diterapkan melalui method overriding pada class JenisKelasPrivate dan JenisKelasPublik yang merupakan Subclass dari JenisKelas. Kedua Subclass tersebut memiliki method yang sama dengan Superclass, tetapi dapat memberikan implementasi yang berbeda sesuai dengan karakteristik masing-masing jenis kelas. Dengan demikian, ketika method tersebut dipanggil melalui objek JenisKelas, program dapat menjalankan implementasi method sesuai dengan jenis objek yang digunakan. Penerapan polymorphism ini membuat program lebih fleksibel karena satu method dapat memiliki perilaku yang berbeda pada masing-masing Subclass.

## Dokumentasi Program 
Adapun dokumentasi dari alur program yaitu sebagai berikut:

### Tampilan Menu Utama

<img width="560" height="276" alt="image" src="https://github.com/user-attachments/assets/9f24b780-4369-461f-8b09-e1c7a4b8515e" />

Ketika program dijalankan, pengguna akan diberikan beberapa pilihan menu yang dapat digunakan untuk mengelola data. Terdapat menu member yang berfungsi untuk mengelola data member, menu Instruktur yang digunakan untuk mengelola data instruktur, menu jenis kelas yang digunakan untuk mengelola jenis kelas yang tersedia, serta menu pendaftaran kelas yang digunakan untuk mengelola daftar kelas yang akan dilaksanakan di studio pilates ini.

### Menu Member

<img width="523" height="232" alt="image" src="https://github.com/user-attachments/assets/eb119f87-0417-479e-b689-8b81ce2b4249" />

Menu member berisi 2 sub menu yaitu lihat dan tambah member yang fungsinya sebagai berikut:

* **1. Tambah Member**

<img width="517" height="382" alt="image" src="https://github.com/user-attachments/assets/b2370b67-6dc1-4df6-9912-314440e0dcbf" />


Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan ID member, nama member, nomor telepon, usia dan jenis kelamin member tersebut.

* **2. Lihat Member**

<img width="537" height="423" alt="image" src="https://github.com/user-attachments/assets/0b38ed01-e904-4a16-83e9-88bc863ffb7b" />


Pada sub menu ini, pengguna dapat melihat daftar member yang telah terdaftar pada sistem.

* **3. Kembali**

<img width="557" height="335" alt="image" src="https://github.com/user-attachments/assets/a46b10a8-69cd-40ba-ba02-a911879235f5" />


Pada sub menu ini, pengguna dapat kembali ke menu utama program.

### Menu Instruktur

* **1. Tambah Instruktur**
* **2. Lihat Instruktur**
* **3. Kembali**
  
### Menu Jenis Kelas

* **1. Tambah Jenis Kelas**
* **2. Lihat Jenis Kelas**
* **3. Kembali**

### Menu Daftar Kelas

* **1. Tambah Instruktur**
* **2. Lihat Instruktur**
* **3. Kembali**
  
### Menu Keluar dari Program
