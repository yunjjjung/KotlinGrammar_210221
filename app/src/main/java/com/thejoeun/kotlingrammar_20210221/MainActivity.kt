package com.thejoeun.kotlingrammar_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        변수로 => 정수를 담을 공간 JAVA : int num1;
        var num1 : Int

//        변수에 값 대입
        num1 = 10
        num1 = 20

//        상수로 => 정수를 담을 공간 . JAVA : final int num2;

        val num2 : Int
        num2 = 10
//        num2 = 20   // num2는 value(상수)이므로 한번 대입하고 나면 변경 불가

//      Int Double String Boolean 자료형 자동 대입 예제

        val num3 = 30 // num3는 Int로 설정
        val num4 = 3.14 // num4는 Double로 알아서 설정
        val teacherName = "조경진" // String으로 설정
        val isMale = true   //Boolean 자동 할당

//        변수에 담긴 강사 이름 로그로 출력
        Log.d("강사이름",teacherName)

        //    확인 버튼이 눌리면 할일
        okBtn.setOnClickListener {


//        messageEdt에 적혀있는 문구를 가져오자
            val inputMessage = messageEdt.text.toString()

//        inputMessage를 토스트로 출력
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

//        messageTxt의 문구로 반영.
            messageTxt.text = inputMessage

//          적힌 문구가  "안녕하세요" 라면 => 로그로 "인사문구 입력됨" 출력
//          그렇지 않다면 => 로그로 "일반문구 입력됨" 출력

            if(inputMessage == "안녕하세요" || inputMessage == "반갑습니다") {
                Log.d("메인화면", "인사문구 입력됨")
            }
            else {
                Log.d("메인화면", "일반문구 입력됨")
            }

        }
    }













}