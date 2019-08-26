package com.raywenderlich.camelot;

import org.researchstack.backbone.step.Step;

public class AudioStep extends Step
{
    private int mDuration;

    public AudioStep(String identifier)
    {
        super(identifier);
        setOptional(false);
        setStepLayoutClass(AudioStepLayout.class);
    }

    public int getDuration() {
        return mDuration;
    }

    public void setDuration(int duration) {
        mDuration = duration;
    }
}
