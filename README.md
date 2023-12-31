# Konversi Panjang

Program ini adalah aplikasi sederhana yang digunakan untuk mengkonversi panjang dari kilometer ke meter dan sentimeter. Aplikasi ini dibangun menggunakan bahasa pemrograman Java.

## Cara Menggunakan Program

1. Pastikan Anda telah menginstal Java Development Kit (JDK) pada komputer Anda.
2. Unduh atau salin source code program ini ke dalam berkas Java yang sesuai, misalnya `KonversiPanjang.java`.
3. Buka IDE java dan Compile berkas Java.
4. Program akan mengeksekusi dan mengkonversi panjang dari kilometer menjadi meter dan sentimeter.

## Deskripsi Fungsi

Program ini terdiri dari dua fungsi utama:

1. `kilometerToMeter(double km)`: Fungsi ini menerima panjang dalam kilometer sebagai parameter dan mengembalikan panjang dalam meter.

2. `kilometerToCentimeter(double km)`: Fungsi ini juga menerima panjang dalam kilometer sebagai parameter dan mengembalikan panjang dalam sentimeter.

## Contoh Penggunaan

Dalam contoh kode program ini, panjang kilometer ditetapkan ke nilai 5.5. Kemudian, fungsi `kilometerToMeter` dan `kilometerToCentimeter` digunakan untuk mengkonversi panjang tersebut ke meter dan sentimeter. Hasilnya dicetak ke layar.

double panjangKilometer = 5.5;
double panjangMeter = kilometerToMeter(panjangKilometer);
double panjangCentimeter = kilometerToCentimeter(panjangKilometer);

System.out.println(panjangKilometer + " kilometer = " + panjangMeter + " meter");
System.out.println(panjangKilometer + " kilometer = " + panjangCentimeter + " cm");

## Lisensi
Program ini tersedia di bawah lisensi MIT. Anda bebas menggunakan, mengubah, dan mendistribusikannya sesuai dengan ketentuan lisensi tersebut.