package com.example.android.miwok;

/**
 * Created by Vanderlei on 09/08/2016.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResouceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, Integer mImageResouceId, Integer audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImageResouceId = mImageResouceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getImageResouceId() {
        return mImageResouceId;
    }

    public boolean hasImage() {
        return mImageResouceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }
}
