package com.example.timur.testing_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // объявление данных
        val int = 0
        val float = 0f
        val double = 0.0
        var string = ""
        val boolean = true

        val days = 30
        val hours = 9

        // за сколько часов ученик станет Junior-разработчиком
        val totalHours = days * hours

        string = "Ученик который после $totalHours часов станет android-разработчиком"
        profile_description.text = string

        // нажатие на кнопку
        var counts = 0

        val listOfStudents = listOf("Артем", "Максим", "Петр", "Самвел", "Андрей", "Олег")

        var students = ""

        var index = 0

        // ООП
        val student = Student("Тимур", "Хайрнасов")

        val studentFirstName = student.getFirstName()
        val studentLastName = student.getLastName()

        val studentFullName = studentFirstName + studentLastName

        profile_name.text = studentFullName


        profile_btn.setOnClickListener {

            //            counts++

//            //
//            if (counts == 10) {
//                string = "Кнопка была нажата десять раз"
//            } else {
//                string = "Кнопка была нажата $counts раз"
//            }
//
//            //
//            when (counts) {
//                10 -> {
//                    string = "Кнопка была нажата десять раз"
//                }
//                20 -> {
//                    string = "Кнопка была нажата двадцать раз"
//                }
//                30 -> {
//                    string = "Кнопка была нажата тридцать раз"
//                }
//                else -> {
//                    string = "Кнопка была нажата $counts раз"
//                }
//            }
//            profile_description.text = string

            if(listOfStudents.size > index){
                students += listOfStudents[index] + " "
                profile_students.text = students
                index++
            }
        }


    }
}