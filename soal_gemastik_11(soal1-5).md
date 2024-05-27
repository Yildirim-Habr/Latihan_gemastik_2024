# 1. Urutan Aneh

### Deskripsi

Buatlah program yang melakukan pengurutan N (2≤N≤1000) buah bilangan seperti pada contoh kasus di bawah ini.

### Format Masukan

+ Baris pertama berisi satu buah bilangan N. 

+ Baris kedua berisi N buah bilangan bulat Xi. 

+ Setiap bilangan dipastikan hanya antara 0-100.

### Format Keluaran

N buah baris berisi urutan bilangan sesuai dengan contoh

### Contoh Masukan

```

10

1 11 12 2 13 23 31 62 71 81

```

### Contoh Keluaran

```

1

11

31

71

81

2

12

62

13

23

```

# 2. Pohon

### Deskripsi

Untuk menghilangkan penat Pak Blangkon sering sekali jalan-jalan ke pekarangan di belakang rumahnya. Saat berada di posisi tertentu Pak Blangkon menyadari bahwa di sekelilingnya ada N buah pohon. Namun, karena terbatasnya pandangan hanya beberapa pohon saja yang bisa terlihat oleh Pak Blankon, karena pohon tertentu berada tepat di belakang pohon lainnya saat pandangan tertuju pada arah tertentu. Jika dilihat dari atas dalam koordinat dua dimensi, Pak Blangkon ada di posisi (x,y) sedangkan pohon-pohonnya ada di posisi (pi,qi). Seperti contoh pada gambar di bawah ini:

![Pohon](https://image.ibb.co/d297Uz/pohon.png)

Seperti terlihat pada gambar di atas dari 8 pohon, hanya 5 yang bisa dilihat secara langsung oleh Pak Blangkon, sedangkan tiga pohon lainnya terhalang oleh pohon di depannya. Jika diketahui lokasi Pak Blangkon beserta N buah pohon, buatlah program untuk menghitung banyaknya pohon yang bisa terlihat secara langsung oleh Pak Blangkon.

### Format Masukan

Baris pertama adalah N, X dan Y yang menyatakan banyaknya pohon dan posisi Pak Blangkon di mana 2 ≤ N ≤ 100. N baris berikutnya berisi pi dan qi yang menyatakan posisi pohon ke-i, di mana 0 ≤ X,Y,pi,qi ≤ 1000.

### Format Keluaran

Banyaknya pohon yang dapat dilihat Pak Blangkon.

### Contoh Masukan

```

8 4 2

1 5

2 1

2 4

3 3

6 3

6 6

7 7

10 5

```

### Contoh Keluaran

```

5

```

# 3. Pertandingan

### Deskripsi

Dalam sebuah pertandingan olahraga, Budi diberikan kesempatan untuk memilih urutan pemain yang harus dilawannya. Asumsikan ada N orang lawan yang masing-masing memiliki tingkat kemahiran Ai. Setelah Budi berhasil mengalahkan pemain ke-i, tingkat kemahirannya akan bertambah sebanyak Bi yang akan digunakan untuk melawan pemain selanjutnya. Perlu diingat bahwa Budi hanya bisa mengalahkan pemain dengan tingkat kemahiran yang lebih rendah atau sama dengan dirinya sendiri. Jika Budi memiliki tingkat kemahiran awal M, tentukan pemain manakah yang harus dilawan Budi secara berurutan sampai dia tidak bisa lagi mengalahkan lawannya sehingga Budi mendapatkan tingkat kemahiran yang maksimal.

### Format Masukan

+ Baris pertama dua buah bilangan N dan M (1≤N, M≤100)

+ Baris kedua N buah bilangan Ai (1≤Ai≤1000)

+ Baris ketiga N buah bilangan Bi (1≤Bi≤1000)

### Format Keluaran

+ Tingkat kemahiran maksimal yang akan didapatkan Budi.

### Contoh Masukan 1

```

4 2

8 9 3 2

5 4 1 3

```

Contoh Keluaran 1

```

6

```

Contoh Masukan 2

```

5 3

8 4 5 6 7

9 8 7 5 6

```

Contoh Keluaran 2

```

3

```

Contoh Masukan 3

```

5 9

2 3 6 7 8

3 4 2 2 3

```

Contoh Keluaran 3

```

23

```
# Tarung

### Deskripsi

Terdapat N petarung. Petarung ke-i memiliki kekuatan Pi. Jika dua petarung i dan j bertarung, maka petarung dengan kekuatan lebih tinggi akan menang, dan kekuatan dari petarung pemenang tersebut menjadi abs(Pi - Pj). Jika kekuatan mereka sama, maka petarung dengan indeks lebih kecil akan menang namun kekuatannya akan menjadi 0.

Mula-mula, petarung pertama akan melawan petarung kedua. Pemenangnya akan melawan petarung ketiga, dan seterusnya hingga petarung ke-N. Juara akhirnya adalah pemenang dari pertarungan terakhir.

Anda adalah petarung dengan indeks 1 dan ingin memenangkan pertandingan. Anda dapat mengubah urutan petarung-petarung lainnya (petarung indeks 2 sampai dengan N). Bisakah Anda memenangkan pertandingan?

### Format Masukan

Masukan diberikan dalam format berikut:
```
N
P1 P2 … PN
```
### Format Keluaran

Jika terdapat permutasi yang sehingga Anda dapat memenangkan pertandingan, keluarkan:
```
menang
Q1 Q2 … QN
```
dengan Q merupakan permutasi dari P.

Jika ada banyak kemungkinan, keluarkan yang mana saja.

Jika tidak ada permutasi yang memungkinkan Anda menang, keluarkan:

```
kalah
```

### Contoh Masukan 1

```
5
3 4 2 -4 1
```

### Contoh Keluaran 1

```
menang
3 1 2 -4 4
```

### Contoh Masukan 2

```
2
3 4
```

### Contoh Keluaran 2

```
kalah
```

### Batasan (1)

+ 1 ≤ N ≤ 10
+ -109 ≤ Pi ≤ 109

### Batasan (2)

+ 1 ≤ N ≤ 100.000
+ -109 ≤ Pi ≤ 109

# 3 Angka Zig-Zag

### Deskripsi

Petruk menuliskan N buah bilangan bulat berbeda, A1, A2, ..., AN, pada sebuah kertas. Kemudian, kertas tersebut diberikan ke Bagong. Bagong kemudian bertanya, "apa ini?". Petruk menjawab, "ini adalah kertas yang bertuliskan N buah bilangan bulat berbeda.". Tiba-tiba Gareng menghampiri mereka berdua, dan seketika melihat tulisan yang ada di kertas tersebut.

Dengan isengnya, Gareng menyeletuk, "ada berapa subbarisan zig-zag 3 bilangan yang bisa dibentuk dari N buah bilangan ini?". Gareng menjelaskan bahwa tiga buah bilangan a, b, c dikatakan subbarisan zig-zag 3 bilangan jika dan hanya jika memenuhi syarat: "a > b dan b < c" atau "a < b dan b > c". Petruk dan Bagong lalu terdiam kebingungan.

Sebagai peserta Gemastik 2018, bantulah Petruk dan Bagong menjawab pertanyaan yang diajukan oleh Gareng.

### Format Masukan

Baris pertama berisi sebuah bilangan T, yang menyatakan banyaknya kasus uji.

Setiap kasus uji diberikan dalam format berikut:

```
N
A1 A2 … AN
```

### Format Keluaran

T buah baris, masing-masing berisi jawaban dari pertanyaan yang diajukan oleh Gareng.

### Contoh Masukan

```
2
5
2 8 1 5 7
4
2 8 1 5
```

### Contoh Keluaran

```
8
4
```

### Penjelasan

Untuk contoh kasus uji pertama di atas, subbarisan zig-zag 3 bilangan yang bisa dibentuk adalah :

+ 2, 8, 1
+ 2, 8, 5
+ 2, 8, 7
+ 2, 1, 5
+ 2, 1, 7
+ 8, 1, 5
+ 8, 1, 7
+ 8, 5, 7

### Batasan (1)

+ 1 ≤ T ≤ 100
+ 3 ≤ N ≤ 100
+ 1 ≤ Ai ≤ 10.000

Dijamin seluruh Ai berbeda-beda

### Batasan (2)

+ 1 ≤ T ≤ 100
+ 3 ≤ N ≤ 1.000
+ 1 ≤ Ai ≤ 10.000

Dijamin seluruh Ai berbeda-beda
