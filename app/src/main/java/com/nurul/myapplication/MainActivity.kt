package com.nurul.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Pakaian Adat Indonesia"

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.aceh,"Pakaian Ulee Balang","Serambi Mekah, Aceh",
            "Di sini baju tradisionalnya bernama Ulee Balang. Dahulu baju adat ini hanya dikenakan oleh para bangsawan saja " +
                    "karena bahannya mewah disertai sulam emas dan aksesoris berupa logam mulia asli." +
                    "Desainnya berwarna cantik. Selain itu bajunya dilengkapi sarung juga baik untuk laki dan perempuan " +
                    "UUlee Balang sendiri ada untuk pria, Linto Baro dan untuk wanita Daro Baro."))

        data?.add(DataModel(R.drawable.sumut,"Pakaian Adat Sumatra Utara ","Sumatera Utara",
            "Kain tenunlah yang paling merajai di sini yang dinamakan kain ulos dan selalu ada di setiap acara adat. " +
                    "Selain itu ada banyak lagi baju adatnya semisal Sitolu Tuho Boolean, Ragi Idup, Situlo Tuho Nagok, Sibolang Pamontari serta sederet baju lain."))

        data?.add(DataModel(R.drawable.lampung,"Pakaian Adat Lampung","Lampung",
            "Pakaian tradisionalnya berwarna putih dengan lengan panjang. " +
                    "Bawahannya mengenakan celana hitam yang panjang" +
                    "Adatnya mengenakan sarung tumpal yang bersulamkan emas, sehingga terlihat mewah. "+
                    "Di samping itu, mereka juga memakai kain berhias ringgit membuat tampilan lebih anggun."))

        data?.add(DataModel(R.drawable.jogjakarta,"Pakaian Adat Dodotan ","Yogyakarta",
            "Baju adatnya dinamakan dodotan dengan kain dodot 5 meter bermotif smene raja. " +
                   "Sementara untuk tata riasnya mengenakan Paes Ageng dengan dahi wanita dihias warna hitam berpinggiran emas"+
                    "Bagi pengantin pria memakai ukel ngore, cunduk mentul dan kuluk."))


        data?.add(DataModel(R.drawable.sumsel,"Pakaian Adat Sumatra Selatan","Sumatra Selatan",
            "Berbekal kejayaan Sriwijaya lalu, maka baju adat dari provinsi ini pun menampilkan keanggunan dan keagungan kerajaan."+
                    " Tak cuma itu, bajunya juga menyiratkan kebesaran masyarakatnya. Karenanya dibuat segagah dan seanggun mungkin."))


        data?.add(DataModel(R.drawable.bengkulu,"Pakaian Adat Bengkulu","Bengkulu",
            "Masih ada sedikit percampuran dengan bangsa Melayu membuat baju adatnya pun masih memiliki nuansa khas Melayu"+
                "Bersulam emas serta lengkap dengan mahkotanya. Bajunya disebut Melayu Bengkulu."+
        "Bagi si wanita bajunya adalah baju kurung berkain beludru dengan hiasan koin emas"+
        " Bagi prianya celana dengan sarung, jas hitam, alas kaki dan penutup kepala."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("deskripsi", item?.deskripsi)
                startActivity(intent)
            }

        })


    }
}