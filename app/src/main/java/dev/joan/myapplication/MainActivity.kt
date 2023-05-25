package dev.joan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.joan.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacciNumbersUpTo100()

    }
    fun fibonacciNumbersUpTo100() {
        var a = 0
        var b = 1
        var c: Int

        var num_list= mutableListOf<Int>(a,b)
        while (true) {
            c = a + b
            if (c > 100)
                break

            num_list.add(c)

            a = b
            b = c
        }
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=NumbersRVAdapter(num_list)
        binding.rvNumbers.adapter=numbersAdapter
    }


}







