package com.example.alex.finaproject;

import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    Button mFourButton;
    EditText mFourEdit;
    EditText mFourResult;
    int fourCount;

    Button mSixButton;
    EditText mSixEdit;
    EditText mSixResult;
    int sixCount;

    Button mEightButton;
    EditText mEightEdit;
    EditText mEightResult;
    int eightCount;

    Button mTenButton;
    EditText mTenEdit;
    EditText mTenResult;
    int tenCount;

    Button mTwelveButton;
    EditText mTwelveEdit;
    EditText mTwelveResult;
    int twelveCount;

    Button mTwentyButton;
    EditText mTwentyEdit;
    EditText mTwentyResult;
    int twentyCount;

    Die four = new Die(4);
    Die six = new Die(6);
    Die eight = new Die(8);
    Die ten = new Die(10);
    Die twelve = new Die(12);
    Die twenty = new Die(20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        MediaPlayer player = MediaPlayer.create(this, R.raw.music_file);
        player.setLooping(true);
        player.start();

        final MediaPlayer dogBark = MediaPlayer.create(this, R.raw.dog_bark);
        dogBark.setLooping(false);

        final MediaPlayer catMeow = MediaPlayer.create(this, R.raw.cat_meow);
        catMeow.setLooping(false);

        final MediaPlayer monkeyScreech = MediaPlayer.create(this, R.raw.monkey_screech);
        monkeyScreech.setLooping(false);

        mFourButton = (Button)findViewById(R.id.dfour);
        mFourEdit   = (EditText)findViewById(R.id.dfourCount);
        mFourResult = (EditText)findViewById(R.id.dfourResult);
        mFourButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        fourCount = Integer.parseInt(mFourEdit.getText().toString());
                        Roll fours = new Roll( fourCount , four);
                        fours.reroll();
                        mFourResult.setText( Integer.toString(fours.total()), TextView.BufferType.EDITABLE);
                        dogBark.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mFourButton.startAnimation(animation);
                    }
                }
        );


        mSixButton = (Button)findViewById(R.id.dsix);
        mSixEdit   = (EditText)findViewById(R.id.dsixCount);
        mSixResult = (EditText)findViewById(R.id.dsixResult);
        mSixButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        sixCount = Integer.parseInt(mSixEdit.getText().toString());
                        Roll sixes = new Roll( sixCount , six);
                        sixes.reroll();
                        mSixResult.setText( Integer.toString(sixes.total()), TextView.BufferType.EDITABLE);
                        dogBark.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mSixButton.startAnimation(animation);
                    }
                }
        );


        mEightButton = (Button)findViewById(R.id.deight);
        mEightEdit   = (EditText)findViewById(R.id.deightCount);
        mEightResult = (EditText)findViewById(R.id.deightResult);
        mEightButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        eightCount = Integer.parseInt(mEightEdit.getText().toString());
                        Roll eights = new Roll( eightCount , eight);
                        eights.reroll();
                        mEightResult.setText( Integer.toString(eights.total()), TextView.BufferType.EDITABLE);
                        catMeow.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mEightButton.startAnimation(animation);
                    }
                }
        );


        mTenButton = (Button)findViewById(R.id.dten);
        mTenEdit   = (EditText)findViewById(R.id.dtenCount);
        mTenResult = (EditText)findViewById(R.id.dtenResult);
        mTenButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        tenCount = Integer.parseInt(mTenEdit.getText().toString());
                        Roll tens = new Roll( tenCount , ten);
                        tens.reroll();
                        mTenResult.setText( Integer.toString(tens.total()), TextView.BufferType.EDITABLE);
                        catMeow.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mTenButton.startAnimation(animation);
                    }
                }
        );

        mTwelveButton = (Button)findViewById(R.id.dtwelve);
        mTwelveEdit   = (EditText)findViewById(R.id.dtwelveCount);
        mTwelveResult = (EditText)findViewById(R.id.dtwelveResult);
        mTwelveButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        twelveCount = Integer.parseInt(mTwelveEdit.getText().toString());
                        Roll twelves = new Roll( twelveCount , twelve);
                        twelves.reroll();
                        mTwelveResult.setText( Integer.toString(twelves.total()), TextView.BufferType.EDITABLE);
                        monkeyScreech.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mTwelveButton.startAnimation(animation);
                    }
                }
        );


        mTwentyButton = (Button)findViewById(R.id.dtwenty);
        mTwentyEdit   = (EditText)findViewById(R.id.dtwentyCount);
        mTwentyResult = (EditText)findViewById(R.id.dtwentyResult);
        mTwentyButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        twentyCount = Integer.parseInt(mTwentyEdit.getText().toString());
                        Roll twentys = new Roll( twentyCount , twenty);
                        twentys.reroll();
                        mTwentyResult.setText( Integer.toString(twentys.total()), TextView.BufferType.EDITABLE);
                        monkeyScreech.start();

                        Animation animation = new AlphaAnimation(1.0f, 0.0f);
                        animation.setDuration(500);
                        mTwentyButton.startAnimation(animation);
                    }
                }
        );

    }
}
