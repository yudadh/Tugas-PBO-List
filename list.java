package com.yuda.BelajarJava.collection;

import java.util.*;  // import library

public class list {

    public static void main(String[] args) {

        List<String> buah = new ArrayList<>(); //penggunaan ArrayList

        buah.add("Nanas");     //menambahkan objek ke dalam collecction
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Jambu Biji");
        buah.add("Apel");


        for(int i = 0; i < buah.size(); i++) {                     // perulangan untuk menampilkan isi collection
            System.out.println("Index " + i +" buah "+buah.get(i));
        }
        buah.add(0,"Jeruk"); // menambah objek dengan index dan element
        buah.remove(5);             // menghapus objek dengan index

        System.out.println("==============================");

        for(int i = 0; i < buah.size(); i++) {
            System.out.println("Index " + i +" buah "+buah.get(i));
        }

    }
}
