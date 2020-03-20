package com.example.apinew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

/**
 * A simple [Fragment] subclass.
 */
class menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)
        // Inflate the layout for this fragment

        val button1: Button = view.findViewById(R.id.btn1);
        val button2: Button = view.findViewById(R.id.btn2);
        val button3: Button = view.findViewById(R.id.btn3);
        val button4: Button = view.findViewById(R.id.btn4);
        val button5: Button = view.findViewById(R.id.btn5);
        val button6: Button = view.findViewById(R.id.btn6);



        button1.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_recycler_view = Recycler_view()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_recycler_view, "fragment_recycler_view")
            transaction.addToBackStack("fragment_recycler_view")
            transaction.commit()
        }
        button2.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_recycler_view2 = Recycler_view2()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_recycler_view2, "fragment_recycler_view2")
            transaction.addToBackStack("fragment_recycler_view2")
            transaction.commit()
        }

        button3.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_recycler_view3 = Recycler_view3()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_recycler_view3, "fragment_recycler_view3")
            transaction.addToBackStack("fragment_recycler_view3")
            transaction.commit()
        }
        button4.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_recycler_view4 = Recycler_view4()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_recycler_view4, "fragment_recycler_view4")
            transaction.addToBackStack("fragment_recycler_view4")
            transaction.commit()
        }

        button5.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_recycler_view5 = Recycler_view5()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_recycler_view5, "fragment_recycler_view5")
            transaction.addToBackStack("fragment_recycler_view5")
            transaction.commit()
        }

        button6.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_LONG).show()
            val fragment_main_chart = MainChart()
            val fm = fragmentManager
            val transaction: FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_main_chart, "fragment_main_chart")
            transaction.addToBackStack("fragment_main_chart")
            transaction.commit()
        }
        return view;

    }

}
