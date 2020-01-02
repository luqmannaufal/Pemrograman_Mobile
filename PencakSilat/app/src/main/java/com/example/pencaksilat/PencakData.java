package com.example.pencaksilat;

import java.util.ArrayList;

public class PencakData {

    public static String [] [] data = new String[][] {
            {"0","Pencak Silat PSHT ", "PSHT telah ada di Indonesia sebelum Indonesia merdeka. " +
                    "Aliran pencak silat ini didirikan tahun 1903 oleh Ki Ngabehi Soeromihardjo atau yang dikenal dengan Eyang Suro. Mulanya, Eyang Suro " +
                    "menamakan aliran pencak silatnya Djojo Gendilo Tjipto Muljo. Pada tahun 1917, ia baru mendirikan " +
                    "perguruan silat bernama Persaudaraan Setia Hati di Desa Winongo, Madiun", "https://i.postimg.cc/DZcWCpKb/p1.jpg"},
            {"1","Pencak Silat Pagar Nusa", "Dahulu kala, di lingkungan pesantren Nahdlatul Ulama (NU), terdapat banyak aliran silat. " +
                    "Keberagaman tersebut membuat dibentuknya Pagar Nusa sebagai wadah " +
                    "perkumpulan pencak silat di bawah NU tahun 1986. Di antara ragam yang ada, ada nama Pagar Nusa Gasmi, Pagar " +
                    "Nusa Batara Perkasa, Padar Nusa Satria Perkasa Sejati (Saperti), dan lain sebagainya", "https://i.postimg.cc/3xBxQ4cP/p2.jpg"},
            {"2","Pencak Silat Kera Sakti", "Pencak silat Kera Sakti didirikan oleh R.Totong Kiemdarto " +
                    "pada 1980 di Kota Madiun. Pencak silat ini mengajarkan kungfu atau kuntauw " +
                    "(Bahasa Hokkian yang populer di Indonesia) serta jurus kera " +
                    "aliran utara dan selatan (nan pie ho jien). Sang pendiri mempelajari gerakan tersebut " +
                    "dari pendekar aliran kungfu China yang ada di Indonesia", "https://i.postimg.cc/WzGPmxRQ/p3.jpg"},
            {"3","Pencak Silat Perisai Diri", "Secara resmi, Perisai Diri didirikan 2 Juli 1955 di Surabaya " +
                    "oleh RM Soebandiman Dirdjoatmodjo, putra bangsawan Keraton Paku Alam. Sebelum mendirikan " +
                    "Perisai Diri secara resmi, ia melatih silat di lingkungan Perguruan Taman Siswa " +
                    "atas permintaan Ki Hajar Dewantoro yang juga merupakan pamannya", "https://i.postimg.cc/GtJZTYGR/p4.jpg"},
            {"4","Pencak Silat Merpati Putih", "Merpati putih awalnya diajarkan khusus pada Komando " +
                    "Pasukan Khusus (Kopassus)  di tiap kesatuan ABRI. Namun, jenis " +
                    "pencak silat ini terus berkembang dan banyak dipelajari masyarakat Indonesia", "https://i.postimg.cc/KjFWbzVH/p5.jpg"},
    };
    public static ArrayList<Pencak> getListData(){
        ArrayList<Pencak> list = new ArrayList<>();
        for (String[] PencakSilatData : data) {
            Pencak pencak = new Pencak();
            pencak.setId(Integer.parseInt(PencakSilatData[0]));
            pencak.setName(PencakSilatData[1]);
            pencak.setDescription(PencakSilatData[2]);
            pencak.setPhoto(PencakSilatData[3]);

            list.add(pencak);
        }
        return list;
    }

}

