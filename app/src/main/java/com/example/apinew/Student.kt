package com.example.apinew

class Student(var name: String, var score: Float) {

    companion object {
        fun getSampleStudentData(size: Int): ArrayList<Student> {
            val student: ArrayList<Student> = ArrayList()
            for (i in 1 until size) {
                student.add(Student("Coffee $i", Math.random().toFloat() * 100))
            }
            return student
        }
    }
}