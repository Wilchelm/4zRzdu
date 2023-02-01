package com.example.a4zrzdu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button reset;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;
    private ImageView imageView12;
    private ImageView imageView13;
    private ImageView imageView14;
    private ImageView imageView15;
    private ImageView imageView16;
    private ImageView imageView17;
    private ImageView imageView18;
    private ImageView imageView19;
    private ImageView imageView20;
    private ImageView imageView21;
    private ImageView imageView22;
    private ImageView imageView23;
    private ImageView imageView24;
    private ImageView imageView25;
    private ImageView imageView26;
    private ImageView imageView27;
    private ImageView imageView28;
    private ImageView imageView29;
    private ImageView imageView30;
    private ImageView imageView31;
    private ImageView imageView32;
    private ImageView imageView33;
    private ImageView imageView34;
    private ImageView imageView35;
    private ImageView imageView36;
    private ImageView imageView37;
    private ImageView imageView38;
    private ImageView imageView39;
    private ImageView imageView40;
    private ImageView imageView41;
    private ImageView imageView42;
    private Integer [][] matrix;
    private TextView textView;
    public int pom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matrix = new Integer[6][7];

        textView = findViewById(R.id.textView);

        reset = findViewById(R.id.reset);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageView25 = findViewById(R.id.imageView25);
        imageView26 = findViewById(R.id.imageView26);
        imageView27 = findViewById(R.id.imageView27);
        imageView28 = findViewById(R.id.imageView28);
        imageView29 = findViewById(R.id.imageView29);
        imageView30 = findViewById(R.id.imageView30);
        imageView31 = findViewById(R.id.imageView31);
        imageView32 = findViewById(R.id.imageView32);
        imageView33 = findViewById(R.id.imageView33);
        imageView34 = findViewById(R.id.imageView34);
        imageView35 = findViewById(R.id.imageView35);
        imageView36 = findViewById(R.id.imageView36);
        imageView37 = findViewById(R.id.imageView37);
        imageView38 = findViewById(R.id.imageView38);
        imageView39 = findViewById(R.id.imageView39);
        imageView40 = findViewById(R.id.imageView40);
        imageView41 = findViewById(R.id.imageView41);
        imageView42 = findViewById(R.id.imageView42);

        reset();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(0, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(1, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(2, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(3, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(4, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(5, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pom==0) {
                    if (checkMove(6, 1) == true) {
                        if (winner() == true) {
                            pom = 1;
                        }
                        if (pom == 0) {
                            oponentMove(1);
                            if (winner() == true) {
                                pom = 1;
                            }
                        }
                    }
                }
            }
        });

    }

    public void mark(int player, Pair<Integer,Integer> pair) {
        if (pair.first==0 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView1.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView2.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView3.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView4.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView5.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView6.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView7.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView8.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView9.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView10.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView11.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView12.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView13.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView14.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView15.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView16.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView17.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView18.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView19.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView20.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView21.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView22.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView23.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView24.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView25.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView26.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView27.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView28.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView29.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView30.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView31.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView32.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView33.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView34.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView35.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==0 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView36.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==1 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView37.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==2 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView38.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==3 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView39.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==4 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView40.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==5 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView41.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==6 && player==1) {
            matrix[pair.first][pair.second]=player;
            imageView42.setImageResource(R.drawable.ic_red_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView1.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView2.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView3.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView4.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView5.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView6.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView7.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView8.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView9.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView10.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView11.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView12.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView13.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView14.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView15.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView16.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView17.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView18.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView19.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView20.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView21.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView22.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView23.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView24.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView25.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView26.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView27.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView28.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView29.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView30.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView31.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView32.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView33.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView34.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView35.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==0 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView36.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==1 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView37.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==2 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView38.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==3 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView39.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==4 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView40.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==5 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView41.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==6 && player==2) {
            matrix[pair.first][pair.second]=player;
            imageView42.setImageResource(R.drawable.ic_yellow_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView1.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView2.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView3.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView4.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView5.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView6.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==0 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView7.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView8.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView9.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView10.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView11.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView12.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView13.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==1 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView14.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView15.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView16.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView17.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView18.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView19.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView20.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==2 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView21.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView22.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView23.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView24.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView25.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView26.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView27.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==3 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView28.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView29.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView30.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView31.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView32.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView33.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView34.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==4 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView35.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==0 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView36.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==1 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView37.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==2 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView38.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==3 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView39.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==4 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView40.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==5 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView41.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
        if (pair.first==5 && pair.second==6 && player==0) {
            matrix[pair.first][pair.second]=player;
            imageView42.setImageResource(R.drawable.ic_white_in_blue_foreground);
        }
    }

    public void reset() {
        for (int i=0; i<7; i++) {
            for (int j=6; j>=0; j--) {
                mark(0,new Pair<>(i,j));
            }
        }
        pom=0;
        textView.setText("");
    }

    public void oponentMove(int player) {

        int oponent=4;
        if (player==1) {
            oponent=2;
        }

        if (player==2) {
            oponent=1;
        }

        ArrayList<Pair<Integer,Integer>> list = new ArrayList();
        int counter;

        //if oponent counter 3 then make 4
        //search oponent 3 in row diagonally
        for (int row=5;row>2;row--) {
            for (int col=0; col<4; col++) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-1][col+1]==oponent) {
                    counter++;
                }
                if (matrix[row-2][col+2]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row-2][col+3]!=0 && matrix[row-3][col+3]==0) {
                    mark(oponent,new Pair<>(row-3,col+3));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-1][col-1]==oponent) {
                    counter++;
                }
                if (matrix[row-2][col-2]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row-2][col-3]!=0 && matrix[row-3][col-3]==0) {
                    mark(oponent,new Pair<>(row-3,col-3));
                    return;
                }
            }
        }
        //search oponent 2 in row 1 free and next one diagonally
        for (int row=5;row>2;row--) {
            for (int col=0; col<4; col++) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-1][col+1]==oponent) {
                    counter++;
                }
                if (matrix[row-3][col+3]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row-1][col+2]!=0 && matrix[row-2][col+2]==0) {
                    mark(oponent,new Pair<>(row-2,col+2));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-1][col-1]==oponent) {
                    counter++;
                }
                if (matrix[row-3][col-3]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row-1][col-2]!=0 && matrix[row-2][col-2]==0) {
                    mark(oponent,new Pair<>(row-2,col-2));
                    return;
                }
            }
            for (int col=0; col<4; col++) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-2][col+2]==oponent) {
                    counter++;
                }
                if (matrix[row-3][col+3]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row][col+1]!=0 && matrix[row-1][col+1]==0) {
                    mark(oponent,new Pair<>(row-1,col+1));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row-2][col-2]==oponent) {
                    counter++;
                }
                if (matrix[row-3][col-3]==oponent) {
                    counter++;
                }
                if (counter==3 && matrix[row][col-1]!=0 && matrix[row-1][col-1]==0) {
                    mark(oponent,new Pair<>(row-1,col-1));
                    return;
                }
            }
        }
        //search oponent 2 in row 1 free and next one horizontal
        for (int row=5;row>=0;row--) {
            for (int col=0;col<4;col++) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row][col+1]==oponent) {
                    counter++;
                }
                if (matrix[row][col+3]==oponent) {
                    counter++;
                }
                if (counter==3 && row==5 && matrix[row][col+2]==0) {
                    mark(oponent,new Pair<>(row,col+2));
                    return;
                }
                if (counter==3 && row<5 && matrix[row+1][col+2]!=0 && matrix[row][col+2]==0) {
                    mark(oponent,new Pair<>(row,col+2));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter = 0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row][col-1]==oponent) {
                    counter++;
                }
                if (matrix[row][col-3]==oponent) {
                    counter++;
                }
                if (counter==3 && row==5 && matrix[row][col-2]==0) {
                    mark(oponent,new Pair<>(row,col-2));
                    return;
                }
                if (counter==3 && row<5 && matrix[row+1][col-2]!=0 && matrix[row][col-2]==0) {
                    mark(oponent,new Pair<>(row,col-2));
                    return;
                }
            }
            for (int col=0;col<4;col++) {
                counter=0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row][col+2]==oponent) {
                    counter++;
                }
                if (matrix[row][col+3]==oponent) {
                    counter++;
                }
                if (counter==3 && row==5 && matrix[row][col+1]==0) {
                    mark(oponent,new Pair<>(row,col+1));
                    return;
                }
                if (counter==3 && row<5 && matrix[row+1][col+1]!=0 && matrix[row][col+1]==0) {
                    mark(oponent,new Pair<>(row,col+1));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter = 0;
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (matrix[row][col-2]==oponent) {
                    counter++;
                }
                if (matrix[row][col-3]==oponent) {
                    counter++;
                }
                if (counter==3 && row==5 && matrix[row][col-1]==0) {
                    mark(oponent,new Pair<>(row,col-1));
                    return;
                }
                if (counter==3 && row<5 && matrix[row+1][col-1]!=0 && matrix[row][col-1]==0) {
                    mark(oponent,new Pair<>(row,col-1));
                    return;
                }
            }
        }
        //search oponent 3 in row horizontal
        for (int row=5; row>=0; row--)  {
            counter=0;
            for (int col=0;col<7;col++) {
                if (matrix[row][col]!=oponent) {
                    counter=0;
                }
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (row==5 && counter==3 && col+1<7) {
                    if (matrix[row][col+1]==0) {
                        mark(oponent,new Pair<>(row,col+1));
                        return;
                    }
                }
                if (row<5 && counter==3 && col+1<7) {
                    if (matrix[row+1][col+1]!=0 && matrix[row][col+1]==0) {
                        mark(oponent,new Pair<>(row,col+1));
                        return;
                    }
                }
            }
            counter=0;
            for (int col=6;col>=0;col--) {
                if (matrix[row][col]!=oponent) {
                    counter=0;
                }
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (row==5 && counter==3 && col-1>=0) {
                    if (matrix[row][col-1]==0) {
                        mark(oponent,new Pair<>(row,col-1));
                        return;
                    }
                }
                if (row<5 && counter==3 && col-1>=0) {
                    if (matrix[row+1][col-1]!=0 && matrix[row][col-1]==0) {
                        mark(oponent,new Pair<>(row,col-1));
                        return;
                    }
                }
            }
        }
        //search oponent 3 in row vertical
        for (int col=0; col<7; col++) {
            counter=0;
            for (int row=5; row>=0; row--) {
                if (matrix[row][col]!=oponent) {
                    counter=0;
                }
                if (matrix[row][col]==oponent) {
                    counter++;
                }
                if (row-1>=0 && counter==3) {
                    if (matrix[row-1][col]==0) {
                        mark(oponent,new Pair<>(row-1,col));
                        return;
                    }
                }
            }
        }

        //block player between
        for (int row=5; row>=0; row--)  {
            for (int col=0;col<5;col++) {
                if (row==5 && matrix[row][col] == player && matrix[row][col+1] == 0 && matrix[row][col+2] == player) {
                    list.add(new Pair<>(row, col + 1));
                }
                if (row<5 && matrix[row+1][col+1]!=0 && matrix[row][col] == player && matrix[row][col+1] == 0 && matrix[row][col+2] == player) {
                    list.add(new Pair<>(row, col + 1));
                }
            }
            for (int col=6;col>2;col--) {
                if (row==5 && matrix[row][col]==player && matrix[row][col-1]==0 && matrix[row][col-2]==player) {
                    list.add(new Pair<>(row,col-1));
                }
                if (row<5 && matrix[row+1][col-1]!=0 && matrix[row][col]==player && matrix[row][col-1]==0 && matrix[row][col-2]==player) {
                    list.add(new Pair<>(row,col-1));
                }
            }
        }
        //block player vertical
        for (int col=0; col<7; col++) {
            counter=0;
            for (int row=5; row>=0; row--) {
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (row-1>=0 && counter==2) {
                    if (matrix[row-1][col]==0) {
                        list.add(new Pair<>(row-1,col));
                    }
                }
                if (row-1>=0 && counter==3) {
                    if (matrix[row-1][col]==0) {
                        mark(oponent,new Pair<>(row-1,col));
                        return;
                    }
                }
            }
        }
        //block player diagonally
        for (int row=5;row>2;row--) {
            for (int col=0; col<4; col++) {
                counter=0;
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row-1][col+1]==player) {
                    counter++;
                }
                if (counter==2 && matrix[row-1][col+2]!=0 && matrix[row-2][col+2]==0) {
                    list.add(new Pair<>(row-2,col+2));
                }
                if (matrix[row-2][col+2]==player) {
                    counter++;
                }
                if (counter==3 && matrix[row-2][col+3]!=0 && matrix[row-3][col+3]==0) {
                    mark(oponent,new Pair<>(row-3,col+3));
                    return;
                }
            }
            for (int col=6; col>2; col--) {
                counter=0;
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row-1][col-1]==player) {
                    counter++;
                }
                if (counter==2 && matrix[row-1][col-2]!=0 && matrix[row-2][col-2]==0) {
                    list.add(new Pair<>(row-2,col-2));
                }
                if (matrix[row-2][col-2]==player) {
                    counter++;
                }
                if (counter==3 && matrix[row-2][col-3]!=0 && matrix[row-3][col-3]==0) {
                    mark(oponent,new Pair<>(row-3,col-3));
                    return;
                }
            }
        }
        //block pleyer horizontal
        for (int row=5; row>=0; row--)  {
            counter=0;
            for (int col=0;col<7;col++) {
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (row==5 && counter==2 && col+1<7) {
                    if (matrix[row][col+1]==0) {
                        list.add(new Pair<>(row, col + 1));
                    }
                }
                if (row<5 && counter==2 && col+1<7) {
                    if (matrix[row+1][col+1]!=0 && matrix[row][col+1]==0) {
                        list.add(new Pair<>(row,col+1));
                    }
                }
                if (row==5 && counter==3 && col+1<7) {
                    if (matrix[row][col+1]==0) {
                        mark(oponent,new Pair<>(row,col+1));
                        return;
                    }
                }
                if (row<5 && counter==3 && col+1<7) {
                    if (matrix[row+1][col+1]!=0 && matrix[row][col+1]==0) {
                        mark(oponent,new Pair<>(row,col+1));
                        return;
                    }
                }

            }
            counter=0;
            for (int col=6;col>=0;col--) {
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (row==5 && counter==2 && col-1>=0) {
                    if (matrix[row][col-1]==0) {
                        list.add(new Pair<>(row, col - 1));
                    }
                }
                if (row<5 && counter==2 && col-1>=0) {
                    if (matrix[row+1][col-1]!=0 && matrix[row][col-1]==0) {
                        list.add(new Pair<>(row,col-1));
                    }
                }
                if (row==5 && counter==3 && col-1>=0) {
                    if (matrix[row][col-1]==0) {
                        mark(oponent,new Pair<>(row,col-1));
                        return;
                    }
                }
                if (row<5 && counter==3 && col-1>=0) {
                    if (matrix[row+1][col-1]!=0 && matrix[row][col-1]==0) {
                        mark(oponent,new Pair<>(row,col-1));
                        return;
                    }
                }
            }
        }


        int mostFrequented=0;
        int frequency;
        Pair<Integer,Integer> bestPair=null;
        for (int i=0;i<list.size();i++) {
            frequency=0;
            for (int j=0;j<list.size();j++) {
                if (list.get(i)==list.get(j)) {
                    frequency++;
                }
            }
            if (frequency>mostFrequented) {
                mostFrequented=frequency;
                bestPair = list.get(i);
            }
        }

        if (bestPair==null) {
            int col = (int) ((Math.random() * (6 - 0)) + 0);
            boolean tru=false;
            while (tru==false) {
                for (int j = 5; j >= 0; j--) {
                    if (matrix[j][col] == 0) {
                        tru=true;
                        mark(oponent, new Pair<>(j, col));
                        return;
                    }
                }
                col = (int) ((Math.random() * (6 - 0)) + 0);
            }
        }
        if (bestPair!=null) {
            mark(2,bestPair);
            return;
        }
    }

    public boolean isWinner(int player) {

        int counter=0;
        for (int col=0; col<7; col++) {
            counter=0;
            for (int row=5; row>=0; row--) {
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (counter==4) {
                    return true;
                }
            }
        }

        for (int row=5; row>=0; row--)  {
            counter=0;
            for (int col=0;col<7;col++) {
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (counter==4) {
                    return true;
                }
            }
            counter=0;
            for (int col=6;col>=0;col--) {
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row][col]!=player) {
                    counter=0;
                }
                if (counter==4) {
                    return true;
                }
            }
        }


        for (int row=5;row>2;row--) {
            for (int col=0; col<4; col++) {
                counter=0;
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row-1][col+1]==player) {
                    counter++;
                }
                if (matrix[row-2][col+2]==player) {
                    counter++;
                }
                if (matrix[row-3][col+3]==player) {
                    counter++;
                }
                if (counter==4) {
                    return true;
                }
            }
            for (int col=6; col>2; col--) {
                counter=0;
                if (matrix[row][col]==player) {
                    counter++;
                }
                if (matrix[row-1][col-1]==player) {
                    counter++;
                }
                if (matrix[row-2][col-2]==player) {
                    counter++;
                }
                if (matrix[row-3][col-3]==player) {
                    counter++;
                }
                if (counter==4) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean winner() {
        int winner = 0;
        boolean zero = false;
        for (int row=0;row<6;row++) {
            for (int col=0;col<7;col++) {
                if (matrix[row][col]==0) {
                    zero=true;
                }
            }
        }

        if (isWinner(1)==true) {
            winner=1;
            textView.setText("Wygrałeś grę");
            return true;
        }

        if (isWinner(2)==true) {
            winner=2;
            textView.setText("Przegrałeś grę");
            return true;
        }

        if (winner==0 && zero==false) {
            textView.setText("Remis");
            return true;
        }
        return false;
    }

    public boolean checkMove(int col, int player) {
        for (int j=5; j>=0; j--) {
            if (matrix[j][col]==0) {
                    mark(player, new Pair<>(j,col));
                    return true;
            }
        }
        return false;
    }
}