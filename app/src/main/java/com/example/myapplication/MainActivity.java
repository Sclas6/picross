package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int miss = 0;
    private int ansc = 0;
    private int ac = 0;
    private boolean p00 = false;
    private boolean p01 = false;
    private boolean p02 = false;
    private boolean p03 = false;
    private boolean p04 = false;
    private boolean p05 = false;
    private boolean p06 = false;
    private boolean p07 = false;
    private boolean p08 = false;
    private boolean p09 = false;
    private boolean p10 = false;
    private boolean p11 = false;
    private boolean p12 = false;
    private boolean p13 = false;
    private boolean p14 = false;
    private boolean p15 = false;
    private boolean p16 = false;
    private boolean p17 = false;
    private boolean p19 = false;
    private boolean p20 = false;
    private boolean p21 = false;
    private boolean p22 = false;
    private boolean p23 = false;
    private boolean p25 = false;
    private boolean p26 = false;
    private boolean p27 = false;
    private boolean p28 = false;
    private boolean p29 = false;
    private boolean p30 = false;
    private boolean p31 = false;
    private boolean p32 = false;
    private boolean p33 = false;
    private boolean p34 = false;
    private boolean p35 = false;
    private boolean p36 = false;
    private boolean p37 = false;
    private boolean p38 = false;
    private boolean p39 = false;
    private boolean p40 = false;
    private boolean p41 = false;
    private boolean p42 = false;
    private boolean p43 = false;
    private boolean p44 = false;
    private boolean p45 = false;
    private boolean p46 = false;
    private boolean p47 = false;
    private boolean p48 = false;
    private boolean p49 = false;
    private boolean p50 = false;
    private boolean p51 = false;
    private boolean p52 = false;
    private boolean p53 = false;
    private boolean p54 = false;
    private boolean p55 = false;
    private boolean p56 = false;
    private boolean p57 = false;
    private boolean p58 = false;
    private boolean p59 = false;
    private boolean p60 = false;
    private boolean p61 = false;
    private boolean p65 = false;
    private boolean p66 = false;
    private boolean p67 = false;
    private boolean p68 = false;

    String x_hint = "";
    String y_hint = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView textView = findViewById(R.id.myText);
        textView.setTypeface(Typeface.MONOSPACE);
        Button button = this.findViewById(R.id.button);
        final EditText editText = findViewById(R.id.edit_text);
        final Button b00 = this.findViewById(R.id.b00);
        final Button b01 = this.findViewById(R.id.b01);
        final Button b02 = this.findViewById(R.id.b02);
        final Button b03 = this.findViewById(R.id.b03);
        final Button b4 = this.findViewById(R.id.b4);
        final Button b5 = this.findViewById(R.id.b5);
        final Button b6 = this.findViewById(R.id.b6);
        final Button b7 = this.findViewById(R.id.b7);
        final Button b8 = this.findViewById(R.id.b8);
        final Button b9 = this.findViewById(R.id.b9);
        final Button b10 = this.findViewById(R.id.b10);
        final Button b11 = this.findViewById(R.id.b11);
        final Button b12 = this.findViewById(R.id.b12);
        final Button b13 = this.findViewById(R.id.b13);
        final Button b14 = this.findViewById(R.id.b14);
        final Button b15 = this.findViewById(R.id.b15);
        final Button b16 = this.findViewById(R.id.b16);
        final Button b17 = this.findViewById(R.id.b17);
        final Button b19 = this.findViewById(R.id.b19);
        final Button b20 = this.findViewById(R.id.b20);
        final Button b21 = this.findViewById(R.id.b21);
        final Button b22 = this.findViewById(R.id.b22);
        final Button b23 = this.findViewById(R.id.b23);
        final Button b25 = this.findViewById(R.id.b25);
        final Button b26 = this.findViewById(R.id.b26);
        final Button b27 = this.findViewById(R.id.b27);
        final Button b28 = this.findViewById(R.id.b28);
        final Button b29 = this.findViewById(R.id.b29);
        final Button b30 = this.findViewById(R.id.b30);
        final Button b31 = this.findViewById(R.id.b31);
        final Button b32 = this.findViewById(R.id.b32);
        final Button b33 = this.findViewById(R.id.b33);
        final Button b34 = this.findViewById(R.id.b34);
        final Button b35 = this.findViewById(R.id.b35);
        final Button b36 = this.findViewById(R.id.b36);
        final Button b37 = this.findViewById(R.id.b37);
        final Button b38 = this.findViewById(R.id.b38);
        final Button b39 = this.findViewById(R.id.b39);
        final Button b40 = this.findViewById(R.id.b40);
        final Button b41 = this.findViewById(R.id.b41);
        final Button b42 = this.findViewById(R.id.b42);
        final Button b43 = this.findViewById(R.id.b43);
        final Button b44 = this.findViewById(R.id.b44);
        final Button b45 = this.findViewById(R.id.b45);
        final Button b46 = this.findViewById(R.id.b46);
        final Button b47 = this.findViewById(R.id.b47);
        final Button b48 = this.findViewById(R.id.b48);
        final Button b49 = this.findViewById(R.id.b49);
        final Button b50 = this.findViewById(R.id.b50);
        final Button b51 = this.findViewById(R.id.b51);
        final Button b52 = this.findViewById(R.id.b52);
        final Button b53 = this.findViewById(R.id.b53);
        final Button b54 = this.findViewById(R.id.b54);
        final Button b55 = this.findViewById(R.id.b55);
        final Button b56 = this.findViewById(R.id.b56);
        final Button b57 = this.findViewById(R.id.b57);
        final Button b58 = this.findViewById(R.id.b58);
        final Button b59 = this.findViewById(R.id.b59);
        final Button b60 = this.findViewById(R.id.b60);
        final Button b61 = this.findViewById(R.id.b61);
        final Button b65 = this.findViewById(R.id.b65);
        final Button b66 = this.findViewById(R.id.b66);
        final Button b67 = this.findViewById(R.id.b67);
        final Button b68 = this.findViewById(R.id.b68);

        miss=0;
        ansc=0;
        int SIZE = 8;
        x_hint = "";
        y_hint = "";
        Log.d("debug","aaaaa");
        int xsum[][] = new int[(int) Math.ceil((double) SIZE / 2)][SIZE];
        int xtmp[][] = new int[(int) Math.ceil((double) SIZE / 2) + 1][SIZE];
        int ysum[][] = new int[SIZE][(int) Math.ceil((double) SIZE / 2)];
        int ytmp[][] = new int[SIZE][(int) Math.ceil((double) SIZE / 2) + 1];
        int count = 0;
        int oneans;
        String ans = "";
        String correct[] = new String[SIZE];
        boolean Zero;
        /*mapping*/
        int c[][]= {{0,0,1,1,1,1,0,0},
                    {0,1,0,0,1,0,1,0},
                    {1,0,0,1,1,0,0,1},
                    {1,0,1,0,0,1,0,1},
                    {1,0,1,0,0,1,0,1},
                    {1,0,0,1,1,0,0,1},
                    {0,1,0,1,0,0,1,0},
                    {0,0,1,1,1,1,0,0}};
        ans = "0011110001000010100110011010011111100101100110010100001000111100";

        /*print tate no wa*/
        for (int y = 0; y < SIZE; y++) {
            count = 0;
            oneans = 0;
            for (int x = 0; x < SIZE; x++) {
                Zero = (c[y][x] == 0) ? true : false;
                if (Zero == true) {
                    if (oneans != 0) {
                        ytmp[y][count] = oneans;
                    }
                    count += (oneans != 0) ? 1 : 0;
                    oneans = 0;
                } else {
                    oneans++;
                }
            }
            ytmp[y][count] = oneans;
            count += (Zero = true && oneans != 0) ? 1 : 0;
            /*making question array*/
            for (int i = 0; i < (int) Math.ceil((double) SIZE / 2) - count; i++) {
                ysum[y][i] = 0;
            }
            for (int i = (int) Math.ceil((double) SIZE / 2) - count; i < (int) Math.ceil((double) SIZE / 2); i++) {
                ysum[y][i] = ytmp[y][i - ((int) Math.ceil((double) SIZE / 2) - count)];
            }
            count = 0;
        }
        for (int y = 0; y < (int) Math.ceil((double) SIZE / 2); y++) {
            //System.out.print("  ");
            for (int x = 0; x < SIZE; x++) {
                //System.out.print((ysum[x][y]!=0)?" "+ysum[x][y]:"  ");
                y_hint += (ysum[x][y] != 0) ? " " + ysum[x][y] : "  ";
            }
            //System.out.print("\n");
            y_hint += "\n";
        }
        //System.out.print("\n");
        /*print yoko no wa*/
        for (int y = 0; y < SIZE; y++) {
            count = 0;
            oneans = 0;
            for (int x = 0; x < SIZE; x++) {
                Zero = (c[x][y] == 0) ? true : false;
                if (Zero == true) {
                    if (oneans != 0) {
                        xtmp[count][y] = oneans;
                    }
                    count += (oneans != 0) ? 1 : 0;
                    oneans = 0;
                } else {
                    oneans++;
                }
            }
            xtmp[count][y] = oneans;
            count += (Zero = true && oneans != 0) ? 1 : 0;
            /*making question array*/
            for (int i = 0; i < (int) Math.ceil((double) SIZE / 2) - count; i++) {
                xsum[i][y] = 0;
            }
            for (int i = (int) Math.ceil((double) SIZE / 2) - count; i < (int) Math.ceil((double) SIZE / 2); i++) {
                xsum[i][y] = xtmp[i - ((int) Math.ceil((double) SIZE / 2) - count)][y];
            }
            for (int i = 0; i < (int) Math.ceil((double) SIZE / 2); i++) {
                //System.out.print((xsum[i][y]!=0)?(xsum[i][y]<10)?(xsum[i][y]+" "):(xsum[i][y]):"  ");
                x_hint += (xsum[i][y] != 0) ? (xsum[i][y] < 10) ? (xsum[i][y] + " ") : (xsum[i][y]) : "  ";
            }

            //System.out.print("||");
            correct[y] = "";
            for (int x = 0; x < SIZE; x++) {
                /*print map*/
                //System.out.print(" "+c[x][y]);
                correct[y] += (c[x][y] == 1) ? 1 : 0;
                /*hide map*/
                //System.out.print("  ");
                /*show pic*/
                //System.out.print((c[x][y]==1)?" "+1:"  ");
                //answer += (c[x][y] == 1) ? " " + 1 : "  ";
            }
            //System.out.print("\n");
            x_hint += "\n";
            count = 0;
            TextView myText = findViewById(R.id.myText);
            TextView System = findViewById(R.id.System);
            TextView xhint = findViewById(R.id.xhint);
            TextView yhint = findViewById(R.id.yhint);
            xhint.setTypeface(Typeface.DEFAULT);
            yhint.setTypeface(Typeface.MONOSPACE);
            xhint.setText(x_hint);
            yhint.setText(y_hint);
            myText.setText(ans);
            //System.setText(ans);


        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p00 = false;
                p01 = false;
                p02 = false;
                p03 = false;
                p04 = false;
                p05 = false;
                p06 = false;
                p07 = false;
                p08 = false;
                p09 = false;
                p10 = false;
                p11 = false;
                p12 = false;
                p13 = false;
                p14 = false;
                p15 = false;
                p16 = false;
                p17 = false;
                p19 = false;
                p20 = false;
                p21 = false;
                p22 = false;
                p23 = false;
                p25 = false;
                p26 = false;
                p27 = false;
                p28 = false;
                p29 = false;
                p30 = false;
                p31 = false;
                p32 = false;
                p33 = false;
                p34 = false;
                p35 = false;
                p36 = false;
                p37 = false;
                p38 = false;
                p39 = false;
                p40 = false;
                p41 = false;
                p42 = false;
                p43 = false;
                p44 = false;
                p45 = false;
                p46 = false;
                p47 = false;
                p48 = false;
                p49 = false;
                p50 = false;
                p51 = false;
                p52 = false;
                p53 = false;
                p54 = false;
                p55 = false;
                p56 = false;
                p57 = false;
                p58 = false;
                p59 = false;
                p60 = false;
                p61 = false;
                p65 = false;
                p66 = false;
                p67 = false;
                p68 = false;
                b00.setBackgroundResource(R.drawable.button_background);
                b01.setBackgroundResource(R.drawable.button_background);
                b02.setBackgroundResource(R.drawable.button_background);
                b03.setBackgroundResource(R.drawable.button_background);
                b4.setBackgroundResource(R.drawable.button_background);
                b5.setBackgroundResource(R.drawable.button_background);
                b6.setBackgroundResource(R.drawable.button_background);
                b7.setBackgroundResource(R.drawable.button_background);
                b8.setBackgroundResource(R.drawable.button_background);
                b9.setBackgroundResource(R.drawable.button_background);
                b10.setBackgroundResource(R.drawable.button_background);
                b11.setBackgroundResource(R.drawable.button_background);
                b12.setBackgroundResource(R.drawable.button_background);
                b13.setBackgroundResource(R.drawable.button_background);
                b14.setBackgroundResource(R.drawable.button_background);
                b15.setBackgroundResource(R.drawable.button_background);
                b16.setBackgroundResource(R.drawable.button_background);
                b17.setBackgroundResource(R.drawable.button_background);
                b19.setBackgroundResource(R.drawable.button_background);
                b20.setBackgroundResource(R.drawable.button_background);
                b21.setBackgroundResource(R.drawable.button_background);
                b22.setBackgroundResource(R.drawable.button_background);
                b23.setBackgroundResource(R.drawable.button_background);
                b25.setBackgroundResource(R.drawable.button_background);
                b26.setBackgroundResource(R.drawable.button_background);
                b27.setBackgroundResource(R.drawable.button_background);
                b28.setBackgroundResource(R.drawable.button_background);
                b29.setBackgroundResource(R.drawable.button_background);
                b30.setBackgroundResource(R.drawable.button_background);
                b31.setBackgroundResource(R.drawable.button_background);
                b32.setBackgroundResource(R.drawable.button_background);
                b33.setBackgroundResource(R.drawable.button_background);
                b34.setBackgroundResource(R.drawable.button_background);
                b35.setBackgroundResource(R.drawable.button_background);
                b36.setBackgroundResource(R.drawable.button_background);
                b37.setBackgroundResource(R.drawable.button_background);
                b38.setBackgroundResource(R.drawable.button_background);
                b39.setBackgroundResource(R.drawable.button_background);
                b40.setBackgroundResource(R.drawable.button_background);
                b41.setBackgroundResource(R.drawable.button_background);
                b42.setBackgroundResource(R.drawable.button_background);
                b43.setBackgroundResource(R.drawable.button_background);
                b44.setBackgroundResource(R.drawable.button_background);
                b45.setBackgroundResource(R.drawable.button_background);
                b46.setBackgroundResource(R.drawable.button_background);
                b47.setBackgroundResource(R.drawable.button_background);
                b48.setBackgroundResource(R.drawable.button_background);
                b49.setBackgroundResource(R.drawable.button_background);
                b50.setBackgroundResource(R.drawable.button_background);
                b51.setBackgroundResource(R.drawable.button_background);
                b52.setBackgroundResource(R.drawable.button_background);
                b53.setBackgroundResource(R.drawable.button_background);
                b54.setBackgroundResource(R.drawable.button_background);
                b55.setBackgroundResource(R.drawable.button_background);
                b56.setBackgroundResource(R.drawable.button_background);
                b57.setBackgroundResource(R.drawable.button_background);
                b58.setBackgroundResource(R.drawable.button_background);
                b59.setBackgroundResource(R.drawable.button_background);
                b60.setBackgroundResource(R.drawable.button_background);
                b61.setBackgroundResource(R.drawable.button_background);
                b65.setBackgroundResource(R.drawable.button_background);
                b66.setBackgroundResource(R.drawable.button_background);
                b67.setBackgroundResource(R.drawable.button_background);
                b68.setBackgroundResource(R.drawable.button_background);

                ansc=0;
                miss=0;
                int SIZE = 8;
                String str = editText.getText().toString();
                try{
                    Integer.parseInt(str);
                    SIZE = Integer.parseInt(str);
                } catch (NumberFormatException nfex){
                    SIZE = 8;
                }
                x_hint = "";
                y_hint = "";
                Log.d("debug","aaaaa");
                int c[][] = new int[SIZE][SIZE];
                int xsum[][] = new int[(int) Math.ceil((double) SIZE / 2)][SIZE];
                int xtmp[][] = new int[(int) Math.ceil((double) SIZE / 2) + 1][SIZE];
                int ysum[][] = new int[SIZE][(int) Math.ceil((double) SIZE / 2)];
                int ytmp[][] = new int[SIZE][(int) Math.ceil((double) SIZE / 2) + 1];
                int count = 0;
                int oneans;
                String ans = "";
                String correct[] = new String[SIZE];
                boolean Zero;
                /*mapping*/
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        c[j][i] = ((int) (10 * Math.random()) % 2 == 0) ? 0 : 1;
                        ans+=c[j][i];
                    }
                    while(ans.length()<8*(i+1)){
                        ans+=0;
                    }
                }
                while(ans.length()<64){
                    ans+=0;
                }

                /*print tate no wa*/
                for (int y = 0; y < SIZE; y++) {
                    count = 0;
                    oneans = 0;
                    for (int x = 0; x < SIZE; x++) {
                        Zero = (c[y][x] == 0) ? true : false;
                        if (Zero == true) {
                            if (oneans != 0) {
                                ytmp[y][count] = oneans;
                            }
                            count += (oneans != 0) ? 1 : 0;
                            oneans = 0;
                        } else {
                            oneans++;
                        }
                    }
                    ytmp[y][count] = oneans;
                    count += (Zero = true && oneans != 0) ? 1 : 0;
                    /*making question array*/
                    for (int i = 0; i < (int) Math.ceil((double) SIZE / 2) - count; i++) {
                        ysum[y][i] = 0;
                    }
                    for (int i = (int) Math.ceil((double) SIZE / 2) - count; i < (int) Math.ceil((double) SIZE / 2); i++) {
                        ysum[y][i] = ytmp[y][i - ((int) Math.ceil((double) SIZE / 2) - count)];
                    }
                    count = 0;
                }
                for (int y = 0; y < (int) Math.ceil((double) SIZE / 2); y++) {
                    //System.out.print("  ");
                    for (int x = 0; x < SIZE; x++) {
                        //System.out.print((ysum[x][y]!=0)?" "+ysum[x][y]:"  ");
                        y_hint += (ysum[x][y] != 0) ? " " + ysum[x][y] : "  ";
                    }
                    //System.out.print("\n");
                    y_hint += "\n";
                }
                //System.out.print("\n");
                /*print yoko no wa*/
                for (int y = 0; y < SIZE; y++) {
                    count = 0;
                    oneans = 0;
                    for (int x = 0; x < SIZE; x++) {
                        Zero = (c[x][y] == 0) ? true : false;
                        if (Zero == true) {
                            if (oneans != 0) {
                                xtmp[count][y] = oneans;
                            }
                            count += (oneans != 0) ? 1 : 0;
                            oneans = 0;
                        } else {
                            oneans++;
                        }
                    }
                    xtmp[count][y] = oneans;
                    count += (Zero = true && oneans != 0) ? 1 : 0;
                    /*making question array*/
                    for (int i = 0; i < (int) Math.ceil((double) SIZE / 2) - count; i++) {
                        xsum[i][y] = 0;
                    }
                    for (int i = (int) Math.ceil((double) SIZE / 2) - count; i < (int) Math.ceil((double) SIZE / 2); i++) {
                        xsum[i][y] = xtmp[i - ((int) Math.ceil((double) SIZE / 2) - count)][y];
                    }
                    for (int i = 0; i < (int) Math.ceil((double) SIZE / 2); i++) {
                        //System.out.print((xsum[i][y]!=0)?(xsum[i][y]<10)?(xsum[i][y]+" "):(xsum[i][y]):"  ");
                        x_hint += (xsum[i][y] != 0) ? (xsum[i][y] < 10) ? (xsum[i][y] + " ") : (xsum[i][y]) : "  ";
                    }

                    //System.out.print("||");
                    correct[y] = "";
                    for (int x = 0; x < SIZE; x++) {
                        /*print map*/
                        //System.out.print(" "+c[x][y]);
                        correct[y] += (c[x][y] == 1) ? 1 : 0;
                        /*hide map*/
                        //System.out.print("  ");
                        /*show pic*/
                        //System.out.print((c[x][y]==1)?" "+1:"  ");
                        //answer += (c[x][y] == 1) ? " " + 1 : "  ";
                    }
                    //System.out.print("\n");
                    x_hint += "\n";
                    count = 0;
                    TextView myText = findViewById(R.id.myText);
                    TextView System = findViewById(R.id.System);
                    TextView xhint = findViewById(R.id.xhint);
                    TextView yhint = findViewById(R.id.yhint);
                    xhint.setTypeface(Typeface.DEFAULT);
                    yhint.setTypeface(Typeface.MONOSPACE);
                    xhint.setText(x_hint);
                    yhint.setText(y_hint);
                    myText.setText(ans);
                    System.setText("");


                }
            }
        });

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mytext = findViewById(R.id.myText);
                TextView System = findViewById(R.id.System);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p00 == false){
                    p00=true;
                    b00.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p00=false;
                    b00.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(0);
                ansc += (ch=='1')?(p00==true)?1:-1:0;
                miss += (ch=='0')?(p00==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                Log.d("debug",String.valueOf(miss));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p01 == false){
                    p01=true;
                    b01.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p01=false;
                    b01.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(1);
                ansc += (ch=='1')?(p01==true)?1:-1:0;
                miss += (ch=='0')?(p01==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p02 == false){
                    p02=true;
                    b02.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p02=false;
                    b02.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(2);
                ansc += (ch=='1')?(p02==true)?1:-1:0;
                miss += (ch=='0')?(p02==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p03 == false){
                    p03=true;
                    b03.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p03=false;
                    b03.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(3);
                ansc += (ch=='1')?(p03==true)?1:-1:0;
                miss += (ch=='0')?(p03==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p04 == false){
                    p04=true;
                    b4.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p04=false;
                    b4.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(60);
                ansc += (ch=='1')?(p04==true)?1:-1:0;
                miss += (ch=='0')?(p04==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p05 == false){
                    p05=true;
                    b5.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p05=false;
                    b5.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(63);
                ansc += (ch=='1')?(p05==true)?1:-1:0;
                miss += (ch=='0')?(p05==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p06 == false){
                    p06=true;
                    b6.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p06=false;
                    b6.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(62);
                ansc += (ch=='1')?(p06==true)?1:-1:0;
                miss += (ch=='0')?(p06==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p07 == false){
                    p07=true;
                    b7.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p07=false;
                    b7.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(59);
                ansc += (ch=='1')?(p07==true)?1:-1:0;
                miss += (ch=='0')?(p07==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p08 == false){
                    p08=true;
                    b8.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p08=false;
                    b8.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(61);
                ansc += (ch=='1')?(p08==true)?1:-1:0;
                miss += (ch=='0')?(p08==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p09 == false){
                    p09=true;
                    b9.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p09=false;
                    b9.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(58);
                ansc += (ch=='1')?(p09==true)?1:-1:0;
                miss += (ch=='0')?(p09==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p10 == false){
                    p10=true;
                    b10.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p10=false;
                    b10.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(57);
                ansc += (ch=='1')?(p10==true)?1:-1:0;
                miss += (ch=='0')?(p10==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p11 == false){
                    p11=true;
                    b11.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p11=false;
                    b11.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(56);
                ansc += (ch=='1')?(p11==true)?1:-1:0;
                miss += (ch=='0')?(p11==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p12 == false){
                    p12=true;
                    b12.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p12=false;
                    b12.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(48);
                ansc += (ch=='1')?(p12==true)?1:-1:0;
                miss += (ch=='0')?(p12==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p13 == false){
                    p13=true;
                    b13.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p13=false;
                    b13.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(40);
                ansc += (ch=='1')?(p13==true)?1:-1:0;
                miss += (ch=='0')?(p13==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p14 == false){
                    p14=true;
                    b14.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p14=false;
                    b14.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(32);
                ansc += (ch=='1')?(p14==true)?1:-1:0;
                miss += (ch=='0')?(p14==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p15 == false){
                    p15=true;
                    b15.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p15=false;
                    b15.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(24);
                ansc += (ch=='1')?(p15==true)?1:-1:0;
                miss += (ch=='0')?(p15==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p16 == false){
                    p16=true;
                    b16.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p16=false;
                    b16.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(16);
                ansc += (ch=='1')?(p16==true)?1:-1:0;
                miss += (ch=='0')?(p16==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p17 == false){
                    p17=true;
                    b17.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p17=false;
                    b17.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(8);
                ansc += (ch=='1')?(p17==true)?1:-1:0;
                miss += (ch=='0')?(p17==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p19 == false){
                    p19=true;
                    b19.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p19=false;
                    b19.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(49);
                ansc += (ch=='1')?(p19==true)?1:-1:0;
                miss += (ch=='0')?(p19==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p20 == false){
                    p20=true;
                    b20.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p20=false;
                    b20.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(50);
                ansc += (ch=='1')?(p20==true)?1:-1:0;
                miss += (ch=='0')?(p20==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p21 == false){
                    p21=true;
                    b21.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p21=false;
                    b21.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(51);
                ansc += (ch=='1')?(p21==true)?1:-1:0;
                miss += (ch=='0')?(p21==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p22 == false){
                    p22=true;
                    b22.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p22=false;
                    b22.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(52);
                ansc += (ch=='1')?(p22==true)?1:-1:0;
                miss += (ch=='0')?(p22==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p23 == false){
                    p23=true;
                    b23.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p23=false;
                    b23.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(53);
                ansc += (ch=='1')?(p23==true)?1:-1:0;
                miss += (ch=='0')?(p23==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p25 == false){
                    p25=true;
                    b25.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p25=false;
                    b25.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(54);
                ansc += (ch=='1')?(p25==true)?1:-1:0;
                miss += (ch=='0')?(p25==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p26 == false){
                    p26=true;
                    b26.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p26=false;
                    b26.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(55);
                ansc += (ch=='1')?(p26==true)?1:-1:0;
                miss += (ch=='0')?(p26==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p27 == false){
                    p27=true;
                    b27.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p27=false;
                    b27.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(41);
                ansc += (ch=='1')?(p27==true)?1:-1:0;
                miss += (ch=='0')?(p27==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p28 == false){
                    p28=true;
                    b28.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p28=false;
                    b28.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(42);
                ansc += (ch=='1')?(p28==true)?1:-1:0;
                miss += (ch=='0')?(p28==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p29 == false){
                    p29=true;
                    b29.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p29=false;
                    b29.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(43);
                ansc += (ch=='1')?(p29==true)?1:-1:0;
                miss += (ch=='0')?(p29==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p30 == false){
                    p30=true;
                    b30.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p30=false;
                    b30.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(44);
                ansc += (ch=='1')?(p30==true)?1:-1:0;
                miss += (ch=='0')?(p30==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p31 == false){
                    p31=true;
                    b31.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p31=false;
                    b31.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(45);
                ansc += (ch=='1')?(p31==true)?1:-1:0;
                miss += (ch=='0')?(p31==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p32 == false){
                    p32=true;
                    b32.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p32=false;
                    b32.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(46);
                ansc += (ch=='1')?(p32==true)?1:-1:0;
                miss += (ch=='0')?(p32==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p33 == false){
                    p33=true;
                    b33.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p33=false;
                    b33.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(47);
                ansc += (ch=='1')?(p33==true)?1:-1:0;
                miss += (ch=='0')?(p33==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p34 == false){
                    p34=true;
                    b34.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p34=false;
                    b34.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(33);
                ansc += (ch=='1')?(p34==true)?1:-1:0;
                miss += (ch=='0')?(p34==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p35 == false){
                    p35=true;
                    b35.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p35=false;
                    b35.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(34);
                ansc += (ch=='1')?(p35==true)?1:-1:0;
                miss += (ch=='0')?(p35==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p36 == false){
                    p36=true;
                    b36.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p36=false;
                    b36.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(35);
                ansc += (ch=='1')?(p36==true)?1:-1:0;
                miss += (ch=='0')?(p36==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p37 == false){
                    p37=true;
                    b37.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p37=false;
                    b37.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(36);
                ansc += (ch=='1')?(p37==true)?1:-1:0;
                miss += (ch=='0')?(p37==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p38 == false){
                    p38=true;
                    b38.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p38=false;
                    b38.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(37);
                ansc += (ch=='1')?(p38==true)?1:-1:0;
                miss += (ch=='0')?(p38==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p39 == false){
                    p39=true;
                    b39.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p39=false;
                    b39.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(38);
                ansc += (ch=='1')?(p39==true)?1:-1:0;
                miss += (ch=='0')?(p39==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p40 == false){
                    p40=true;
                    b40.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p40=false;
                    b40.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(39);
                ansc += (ch=='1')?(p40==true)?1:-1:0;
                miss += (ch=='0')?(p40==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p41 == false){
                    p41=true;
                    b41.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p41=false;
                    b41.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(25);
                ansc += (ch=='1')?(p41==true)?1:-1:0;
                miss += (ch=='0')?(p41==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p42 == false){
                    p42=true;
                    b42.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p42=false;
                    b42.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(26);
                ansc += (ch=='1')?(p42==true)?1:-1:0;
                miss += (ch=='0')?(p42==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p43 == false){
                    p43=true;
                    b43.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p43=false;
                    b43.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(27);
                ansc += (ch=='1')?(p43==true)?1:-1:0;
                miss += (ch=='0')?(p43==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p44 == false){
                    p44=true;
                    b44.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p44=false;
                    b44.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(28);
                ansc += (ch=='1')?(p44==true)?1:-1:0;
                miss += (ch=='0')?(p44==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p45 == false){
                    p45=true;
                    b45.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p45=false;
                    b45.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(29);
                ansc += (ch=='1')?(p45==true)?1:-1:0;
                miss += (ch=='0')?(p45==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p46 == false){
                    p46=true;
                    b46.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p46=false;
                    b46.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(30);
                ansc += (ch=='1')?(p46==true)?1:-1:0;
                miss += (ch=='0')?(p46==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p47 == false){
                    p47=true;
                    b47.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p47=false;
                    b47.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(31);
                ansc += (ch=='1')?(p47==true)?1:-1:0;
                miss += (ch=='0')?(p47==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p48 == false){
                    p48=true;
                    b48.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p48=false;
                    b48.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(17);
                ansc += (ch=='1')?(p48==true)?1:-1:0;
                miss += (ch=='0')?(p48==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p49 == false){
                    p49=true;
                    b49.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p49=false;
                    b49.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(18);
                ansc += (ch=='1')?(p49==true)?1:-1:0;
                miss += (ch=='0')?(p49==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p50 == false){
                    p50=true;
                    b50.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p50=false;
                    b50.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(19);
                ansc += (ch=='1')?(p50==true)?1:-1:0;
                miss += (ch=='0')?(p50==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p51 == false){
                    p51=true;
                    b51.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p51=false;
                    b51.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(20);
                ansc += (ch=='1')?(p51==true)?1:-1:0;
                miss += (ch=='0')?(p51==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p52 == false){
                    p52=true;
                    b52.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p52=false;
                    b52.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(21);
                ansc += (ch=='1')?(p52==true)?1:-1:0;
                miss += (ch=='0')?(p52==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p53 == false){
                    p53=true;
                    b53.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p53=false;
                    b53.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(22);
                ansc += (ch=='1')?(p53==true)?1:-1:0;
                miss += (ch=='0')?(p53==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p54 == false){
                    p54=true;
                    b54.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p54=false;
                    b54.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(23);
                ansc += (ch=='1')?(p54==true)?1:-1:0;
                miss += (ch=='0')?(p54==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p55 == false){
                    p55=true;
                    b55.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p55=false;
                    b55.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(9);
                ansc += (ch=='1')?(p55==true)?1:-1:0;
                miss += (ch=='0')?(p55==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p56 == false){
                    p56=true;
                    b56.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p56=false;
                    b56.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(10);
                ansc += (ch=='1')?(p56==true)?1:-1:0;
                miss += (ch=='0')?(p56==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p57 == false){
                    p57=true;
                    b57.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p57=false;
                    b57.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(11);
                ansc += (ch=='1')?(p57==true)?1:-1:0;
                miss += (ch=='0')?(p57==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p58 == false){
                    p58=true;
                    b58.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p58=false;
                    b58.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(12);
                ansc += (ch=='1')?(p58==true)?1:-1:0;
                miss += (ch=='0')?(p58==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p59 == false){
                    p59=true;
                    b59.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p59=false;
                    b59.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(13);
                ansc += (ch=='1')?(p59==true)?1:-1:0;
                miss += (ch=='0')?(p59==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p60 == false){
                    p60=true;
                    b60.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p60=false;
                    b60.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(14);
                ansc += (ch=='1')?(p60==true)?1:-1:0;
                miss += (ch=='0')?(p60==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p61 == false){
                    p61=true;
                    b61.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p61=false;
                    b61.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(15);
                ansc += (ch=='1')?(p61==true)?1:-1:0;
                miss += (ch=='0')?(p61==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0&&miss==0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p65 == false){
                    p65=true;
                    b65.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p65=false;
                    b65.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(4);
                ansc += (ch=='1')?(p65==true)?1:-1:0;
                miss += (ch=='0')?(p65==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p66 == false){
                    p66=true;
                    b66.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p66=false;
                    b66.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(5);
                ansc += (ch=='1')?(p66==true)?1:-1:0;
                miss += (ch=='0')?(p66==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p67 == false){
                    p67=true;
                    b67.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p67=false;
                    b67.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(6);
                ansc += (ch=='1')?(p67==true)?1:-1:0;
                miss += (ch=='0')?(p67==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
        b68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView System = findViewById(R.id.System);
                TextView mytext = findViewById(R.id.myText);
                char cr = 0;
                for (int i=0;i<mytext.getText().toString().length();i++){
                    cr = mytext.getText().toString().charAt(i);
                    ac+=(cr=='1')?1:0;
                }
                if(p68 == false){
                    p68=true;
                    b68.setBackgroundResource(R.drawable.bottun_background_b);
                }
                else{
                    p68=false;
                    b68.setBackgroundResource(R.drawable.button_background);
                }
                char ch = mytext.getText().toString().charAt(7);
                ansc += (ch=='1')?(p68==true)?1:-1:0;
                miss += (ch=='0')?(p68==true)?1:-1:0;

                Log.d("debug",String.valueOf(ac));
                Log.d("debug",String.valueOf(ansc));
                if(ac==ansc&&ansc!=0){
                    System.setText("You Win! :)");
                }
                ac=0;
            }
        });
    }

}
