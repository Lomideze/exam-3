package com.example.exam3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exam3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val items = mutableListOf<ItemData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_person, getString(R.string.edit_profile), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_location, getString(R.string.address), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_notifications, getString(R.string.notification), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_payment, getString(R.string.payment), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_security, getString(R.string.security), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_language, getString(R.string.language), getString(R.string.english)))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_dark_mode, getString(R.string.dark_mode), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_privacy, getString(R.string.privacy_policy), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_help, getString(R.string.help_center), ""))
        items.add(ItemData(R.drawable.ic_arrow_right, R.drawable.ic_baseline_people, getString(R.string.invite_friends), ""))
        items.add(ItemData(0, R.drawable.ic_baseline_logout, getString(R.string.logout), ""))

        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = ItemAdapter(items)

    }
}