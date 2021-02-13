package com.fizhu.visitablepatterandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.fizhu.visitablepatterandroid.base.BaseAdapter
import com.fizhu.visitablepatterandroid.data.Banner
import com.fizhu.visitablepatterandroid.data.Gopay
import com.fizhu.visitablepatterandroid.data.MainMenu
import com.fizhu.visitablepatterandroid.data.Menu
import com.fizhu.visitablepatterandroid.databinding.ActivityMainBinding
import com.fizhu.visitablepatterandroid.ui.adapter.VisitorElemntFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val _adapter by lazy {
        BaseAdapter(
            VisitorElemntFactory(
                onClickBanner = ::bannerOnclick
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRv()
        initView()
    }

    private fun initRv() {
        binding.rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = _adapter
        }
    }

    private fun initView() {
        val gopay = Gopay(1000000)
        val menus = MainMenu(
            listOf(
                Menu(0, "Menu 1"),
                Menu(0, "Menu 2"),
                Menu(0, "Menu 3"),
                Menu(0, "Menu 4"),
                Menu(0, "Menu 5"),
                Menu(0, "Menu 6")
            )
        )
        val banner = Banner("")

        _adapter.addItems(listOf(gopay, menus, banner))
    }

    private fun bannerOnclick(banner: Banner) {
        Toast.makeText(this, "Banner", Toast.LENGTH_SHORT).show()
    }
}