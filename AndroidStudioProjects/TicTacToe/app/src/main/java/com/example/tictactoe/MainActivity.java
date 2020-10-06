package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean gameactive=true;
    //0- X
    //1- O
    //2- none
    int active=0;
    int[] gamestate={2,2,2,2,2,2,2,2,2};
    int[][] winposition={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
   public void tap(View view)
   {
       ImageView img = (ImageView) view;
       int tappedImage = Integer.parseInt(img.getTag().toString());
       if(!gameactive)
       {
           reset(view);
       }
       if (gamestate[tappedImage] == 2 && gameactive) {
           gamestate[tappedImage] = active;
           img.setTranslationY(-1000f);
           if (active == 0) {
               img.setImageResource(R.drawable.cross3);
               active = 1;
               TextView status = findViewById(R.id.status);
               status.setText("O's turn.Tap to play");
           } else {
               img.setImageResource(R.drawable.o1);
               active = 0;
               TextView status = findViewById(R.id.status);
               status.setText("X's turn.Tap to play");
           }


           img.animate().translationYBy(1000f).setDuration(300);
       }
       //winning code
       for(int[] winposition1:winposition)
       {
           if(gamestate[winposition1[0]]==gamestate[winposition1[1]]&& gamestate[winposition1[1]]==gamestate[winposition1[2]]&&gamestate[winposition1[0]]!=2)
           {
               //someone's has won
               String win;
               gameactive=false;
               if(gamestate[winposition1[0]]==0)
               {
                   win="X has won";
               }
               else{
                   win="0 has won";
               }
               //updating status bar
               TextView status =findViewById(R.id.status);
               status.setText(win);
           }
       }
   }
    public void reset(View view)
    {
        gameactive=true;
        active=0;
        for(int i=0;i<gamestate.length;i++)
        {
            gamestate[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView24)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView23)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView22)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView21)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView20)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView19)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView18)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView17)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        TextView status = findViewById(R.id.status);
        status.setText("X's turn.Tap to play");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
