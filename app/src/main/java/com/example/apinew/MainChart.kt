package com.example.apinew

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate

/**
 * A simple [Fragment] subclass.
 */
class MainChart : Fragment() {

    //lateinit var Pie_id : PieChart
    lateinit var Pie_id : PieChart

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_main_chart, container, false)
        // Inflate the layout for this fragment

        Pie_id = view.findViewById(R.id.pie_id)

        Pie_Chart(Pie_id)

        return view
    }

    fun Pie_Chart( chart: PieChart){

        //ปิด Description
        chart.description.isEnabled = false

        //สุ่มข้อมูล 5 อัน
        val listStudent = Student.getSampleStudentData(5)

        val entries: ArrayList<PieEntry> = ArrayList()
        for (student in listStudent) {
            entries.add(PieEntry(student.score, student.name))
        }

        val dataset = PieDataSet(entries, "Student")

        //กำหนดให้มีช่องว่างตรงกลางได้
        dataset.selectionShift = 10f
        dataset.valueTextSize = 5f

        //ตั้งค่า color
//        dataset.setColors(ColorTemplate.COLORFUL_COLORS) // set the color

        //เซ้ทช่องว่างความห่างของข้อมูล
        dataset.setSliceSpace(3f)

        //กำหนดข้อมูล
        val data = PieData(dataset)
        chart.setData(data)

        //กำหนดให้มีช่องว่างตรงกลางได้
        chart.setHoleRadius(30F)
        chart.setTransparentCircleRadius(40F)

        //กำหนด animation
        chart.animateY(3000)

//        dataset.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE)
        dataset.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE)

        //เส้นที่โยงออกมา
        dataset.setValueLinePart1Length(0.5f)
        dataset.setValueLinePart2Length(0.5f)

        //กำหนดให้แสดงเป็น %
        chart.setUsePercentValues(true)
        dataset.setValueFormatter(PercentFormatter(chart))

        // entry label styling
        chart.setEntryLabelColor(Color.WHITE)

        //ข้อความตรงกลางแผนภูมิ
        chart.setCenterText("My Android");
        chart.setCenterTextSize(5F)

    }
}