package ru.omgtu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calc extends AppCompatActivity {
    Button buttonDiv, buttonMul, buttonMinus, buttonPlus, buttonClean,
            buttonEqually, buttonDot, buttonOpenP, buttonCloseP, buttonSqrt, buttonZero,
            buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
            buttonEight, buttonNine;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        buttonDiv = (Button) findViewById(R.id.Div);
        buttonMul = (Button) findViewById(R.id.Mul);
        buttonMinus = (Button) findViewById(R.id.Minus);
        buttonPlus = (Button) findViewById(R.id.Plus);
        buttonClean = (Button) findViewById(R.id.Clean);
        buttonEqually = (Button) findViewById(R.id.Equally);
        buttonDot = (Button) findViewById(R.id.Dot);
        buttonOpenP = (Button) findViewById(R.id.OpenP);
        buttonCloseP = (Button) findViewById(R.id.CloseP);
        buttonSqrt = (Button) findViewById(R.id.Sqrt);
        buttonZero = (Button) findViewById(R.id.Zero);
        buttonOne = (Button) findViewById(R.id.One);
        buttonTwo = (Button) findViewById(R.id.Two);
        buttonThree = (Button) findViewById(R.id.Three);
        buttonFour = (Button) findViewById(R.id.Four);
        buttonFive = (Button) findViewById(R.id.Five);
        buttonSix = (Button) findViewById(R.id.Six);
        buttonSeven = (Button) findViewById(R.id.Seven);
        buttonEight = (Button) findViewById(R.id.Eight);
        buttonNine = (Button) findViewById(R.id.Nine);
        tvResult = (EditText) findViewById(R.id.Result);
    }

    void setComponentListeners() {
        View.OnClickListener oclButtonZero = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "0");
            }
        };
        View.OnClickListener oclButtonOne = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "1");
            }
        };
        View.OnClickListener oclButtonTwo = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "2");
            }
        };
        View.OnClickListener oclButtonThree = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "3");
            }
        };
        View.OnClickListener oclButtonFour = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "4");
            }
        };
        View.OnClickListener oclButtonFive = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "5");
            }
        };
        View.OnClickListener oclButtonSix = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "6");
            }
        };
        View.OnClickListener oclButtonSeven = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "7");
            }
        };
        View.OnClickListener oclButtonEight = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "8");
            }
        };
        View.OnClickListener oclButtonNine = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "9");
            }
        };
        View.OnClickListener oclButtonPlus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "+");
            }
        };
        View.OnClickListener oclButtonMinus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "-");
            }
        };
        View.OnClickListener oclButtonMul = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "*");
            }
        };
        View.OnClickListener oclButtonDiv = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "/");
            }
        };
        View.OnClickListener oclButtonClean = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
                tvResult.setHint("0");
            }
        };
        View.OnClickListener oclButtonDot = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + ".");
            }
        };
        View.OnClickListener oclButtonCloseP = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + ")");
            }
        };
        View.OnClickListener oclButtonOpenP = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "(");
            }
        };
        View.OnClickListener oclButtonSqrt = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "sqrt(");
            }
        };
        View.OnClickListener oclButtonEqually = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MathParser mathParser = new MathParser();
                try {
                    tvResult.setText(mathParser.Parse(tvResult.getText().toString()) + "");
                } catch (Exception e) {
                    tvResult.setText("");
                    tvResult.setHint("Invalid operators or result can not be calculated");
                }
            }
        };

        buttonZero.setOnClickListener(oclButtonZero);
        buttonOne.setOnClickListener(oclButtonOne);
        buttonTwo.setOnClickListener(oclButtonTwo);
        buttonThree.setOnClickListener(oclButtonThree);
        buttonFour.setOnClickListener(oclButtonFour);
        buttonFive.setOnClickListener(oclButtonFive);
        buttonSix.setOnClickListener(oclButtonSix);
        buttonSeven.setOnClickListener(oclButtonSeven);
        buttonEight.setOnClickListener(oclButtonEight);
        buttonNine.setOnClickListener(oclButtonNine);
        buttonPlus.setOnClickListener(oclButtonPlus);
        buttonMinus.setOnClickListener(oclButtonMinus);
        buttonDiv.setOnClickListener(oclButtonDiv);
        buttonMul.setOnClickListener(oclButtonMul);
        buttonDot.setOnClickListener(oclButtonDot);
        buttonSqrt.setOnClickListener(oclButtonSqrt);
        buttonOpenP.setOnClickListener(oclButtonOpenP);
        buttonCloseP.setOnClickListener(oclButtonCloseP);
        buttonClean.setOnClickListener(oclButtonClean);
        buttonEqually.setOnClickListener(oclButtonEqually);
    }

}