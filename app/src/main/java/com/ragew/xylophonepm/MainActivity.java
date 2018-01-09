package com.ragew.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool m_soundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        m_soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = m_soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = m_soundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = m_soundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = m_soundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = m_soundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = m_soundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = m_soundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    // TODO: Add the play methods triggered by the buttons
    public void cKey (View v){
        Log.d("Xylophone", "C key has been pressed");
        m_soundPool.play(mCSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void dKey (View v){
        Log.d("Xylophone", "D key has been pressed");
        m_soundPool.play(mDSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void eKey (View v){
        Log.d("Xylophone", "E key has been pressed");
        m_soundPool.play(mESoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void fKey (View v){
        Log.d("Xylophone", "F key has been pressed");
        m_soundPool.play(mFSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void  gKey (View v){
        Log.d("Xylophone", "G key has been pressed");
        m_soundPool.play(mGSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void aKey (View v){
        Log.d("Xylophone", "A key has been pressed");
        m_soundPool.play(mASoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void bKey (View v){
        Log.d("Xylophone", "B key has been pressed");
        m_soundPool.play(mBSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }


}
