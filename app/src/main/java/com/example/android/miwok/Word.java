package com.example.android.miwok;

/**
 * Created by Niska on 2017-02-24.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioID;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word (String defaultTranslation, String miwokTranslation, int audioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioID = audioID;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioID = audioID;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceId() { return mImageResourceId; }
    public int getAudioID () {
        return mAudioID; }

    //Checks if a word as an image.
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioID=" + mAudioID +
                '}';
    }
}
