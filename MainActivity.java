package com.example.quadraticashtonoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setaResult().setText(
                        (

                                (getX1(setX1()) * (getY3(setY3()) - getY2(setY2()))) + (getX2(setX2()) * (getY1(setY1()) - getY3(setY3())))
                                        +  (getX3(setX3()) * (getY2(setY2()) - getY1(setY1())))

                                )
                                /
                                (
                                        (getX1(setX1()) - getX2(setX2())) * (getX1(setX1()) - getX3(setX3())) * (getX2(setX2()) - getX3(setX3()))

                                        )


                        + "");


                setbResult().setText(
                        (

                        (getY2(setY2()) - getY1(setY1())) / (getX2(setX2()) - getX1(setX1()))
                        )
                        -
                                (
                                        (

                                                (getX1(setX1()) * (getY3(setY3()) - getY2(setY2()))) + (getX2(setX2()) * (getY1(setY1()) - getY3(setY3())))
                                                        +  (getX3(setX3()) * (getY2(setY2()) - getY1(setY1())))

                                        )
                                                /
                                                (
                                                        (getX1(setX1()) - getX2(setX2())) * (getX1(setX1()) - getX3(setX3())) * (getX2(setX2()) - getX3(setX3()))

                                                )



                                        )
                        * (getX1(setX1()) + getX2(setX2()))
                        + " "
                );


                setcResult().setText(

                        getY1(setY1()) - (((

                                (getX1(setX1()) * (getY3(setY3()) - getY2(setY2()))) + (getX2(setX2()) * (getY1(setY1()) - getY3(setY3())))
                                        +  (getX3(setX3()) * (getY2(setY2()) - getY1(setY1())))

                        )
                                /
                                (
                                        (getX1(setX1()) - getX2(setX2())) * (getX1(setX1()) - getX3(setX3())) * (getX2(setX2()) - getX3(setX3()))

                                )) * Math.pow((getX1(setX1())), 2)) - (((

                                (getY2(setY2()) - getY1(setY1())) / (getX2(setX2()) - getX1(setX1()))
                        )
                                -
                                (
                                        (

                                                (getX1(setX1()) * (getY3(setY3()) - getY2(setY2()))) + (getX2(setX2()) * (getY1(setY1()) - getY3(setY3())))
                                                        +  (getX3(setX3()) * (getY2(setY2()) - getY1(setY1())))

                                        )
                                                /
                                                (
                                                        (getX1(setX1()) - getX2(setX2())) * (getX1(setX1()) - getX3(setX3())) * (getX2(setX2()) - getX3(setX3()))

                                                )



                                )
                                        * (getX1(setX1()) + getX2(setX2()))) * getX1(setX1()))




                         + " "
                );






            }
        });


    }




    private double getX1(EditText x1) {
        return Double.parseDouble(x1.getText().toString());
    }
    private double getY1(EditText y1) {
        return Double.parseDouble(y1.getText().toString());
    }

    private android.widget.EditText setX1() {
        EditText x1 = (EditText) findViewById(R.id.x1);
        return x1;
    }

    private android.widget.EditText setY1() {
        EditText y1 = (EditText) findViewById(R.id.y1);
        return y1;
    }

    private double getX2(EditText x2) {
        return Double.parseDouble(x2.getText().toString());
    }
    private double getY2(EditText y2) {
        return Double.parseDouble(y2.getText().toString());
    }

    private android.widget.EditText setX2() {
        EditText x2 = (EditText) findViewById(R.id.x2);
        return x2;
    }

    private android.widget.EditText setY2() {
        EditText y2 = (EditText) findViewById(R.id.y2);
        return y2;
    }

    private double getX3(EditText x3) {
        return Double.parseDouble(x3.getText().toString());
    }
    private double getY3(EditText y3) {
        return Double.parseDouble(y3.getText().toString());
    }

    private android.widget.EditText setX3() {
        EditText x3 = (EditText) findViewById(R.id.x3);
        return x3;
    }

    private android.widget.EditText setY3() {
        EditText y3 = (EditText) findViewById(R.id.y3);
        return y3;
    }







    public android.widget.TextView setaResult() {
        TextView Resulta = (TextView) findViewById(R.id.Resulta);
        return  Resulta;
    }
    public android.widget.TextView setbResult() {
        TextView Resultb = (TextView) findViewById(R.id.Resultb);
        return  Resultb;
    }
    public android.widget.TextView setcResult() {
        TextView Resultc = (TextView) findViewById(R.id.Resultc);
        return  Resultc;
    }

}

