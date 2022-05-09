package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonWriter
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityBindingBinding
import com.example.myapplication.databinding.DialogBelajarLayoutBinding
import com.example.myapplication.fragment.CustomDialogFragment
import org.json.JSONArray
import org.json.JSONObject

class BindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnDatastore.setOnClickListener {
            val intent = Intent(this, DatastoreActivity::class.java)
            startActivity(intent)
        }



        val jsonobj = JSONObject().apply {
            put("id",1)
            put("nama", "firman")

            val tiket = JSONObject().apply {
                put("kelas", "ekonomii")
                put("domestik", true)
            }

            put("tiket", tiket)
            put("bagasi", JSONObject.NULL)

            val isiTas = JSONArray().apply {
                val baju = JSONObject().apply {
                    put("nama_barang", "baju")
                    put("qty", 10)
                }

                put(baju)

                val celana = JSONObject().apply {
                    put("nama_barang", "celana")
                    put("qty", 10)
                }

                put(celana)

                val buku = JSONObject().apply {
                    put("nama_barang", "buku")
                    put("qty", 10)
                }

                put(buku)

                val parfum = JSONObject().apply {
                    put("nama_barang", "parfum")
                    put("qty", 10)
                }

                put(parfum)
            }
            put("isi_tas", isiTas)
        }
        Log.i("jsonobject", jsonobj.toString(2))




        binding.btnRoom.setOnClickListener {
            val intent = Intent(this, RoomActivity::class.java)
            startActivity(intent)
        }

        binding.btnPreference.setOnClickListener{
            val intent = Intent(this, PreferenceActivity::class.java)
            startActivity(intent)
        }


        binding.btnDialog.setOnClickListener {

            //create dialog without fragment

//            val dialogBinding = DialogBelajarLayoutBinding.inflate(layoutInflater)
//            val dialogBuilder = AlertDialog.Builder(this)
//            dialogBuilder.setView(dialogBinding.root)
//            val dialog = dialogBuilder.create()
//
//            dialogBinding.btnDialog.setOnClickListener {
//                Toast.makeText(this, "ini dialog", Toast.LENGTH_SHORT).show()
//                dialog.dismiss()
//            }
//            dialog.show()

            //create dialog via fragment
            val dialogFragment = CustomDialogFragment("firman")
            dialogFragment.show(supportFragmentManager,"dialog")

        }

        binding.btnNavComp.setOnClickListener {
            val intent = Intent(this, NavComponentActivity::class.java)
            startActivity(intent)
        }

        binding.btnNavDrawer.setOnClickListener {
            val intent = Intent(this, NavDrawerActivity::class.java)
            startActivity(intent)
        }

        binding.btnNavBar.setOnClickListener {
            val intent = Intent(this, BottomNavActivity::class.java)
            startActivity(intent)
        }

        binding.btnViewPager.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {



//            val npm = binding.etNpm.text.toString().toInt()
//            val ipk = binding.etIpk.text.toString().toDouble()
//            val nama = binding.etNama.text.toString()
//            val intent = Intent(this, IntentActivity::class.java)

//            val bundle = Bundle()
//
//            bundle.apply {
//                putString("stringBundle",textString)
//                putInt("intBundle", textNumber)
//                putDouble("doubleBundle", textNumber.toDouble())
//            }
//
//            intent.apply {
//                putExtra("dataInt",textNumber)
//                putExtra("dataString",textString)
//                putExtra("dataDouble",textNumber.toDouble())
//                putExtras(bundle)
//            }

//            val mahasiswa = Mahasiswa(npm,nama,ipk)
//
//            intent.putExtra("dataMahasiswa",mahasiswa)
//
//            startActivity(intent)
        }





    }
}