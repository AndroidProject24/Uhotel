package com.acuteksolutions.uhotel.libs.view;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;

/**
 * Created by Toan.IT
 * Date: 30/08/2016
 * Email: huynhvantoan.itc@gmail.com
 */

public class FadeScaleViewAnimProvider implements ViewAnimProvider {

    public Animation showAnimation() {
        AnimationSet set = new AnimationSet(true);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        Animation scaleAnimation = new ScaleAnimation(0.1f, 1f, 0.1f, 1f,Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF,0.5f);

        set.setDuration(200);
        set.setInterpolator(new DecelerateInterpolator());
        set.addAnimation(alphaAnimation);
        set.addAnimation(scaleAnimation);
        return set;
    }

    @Override
    public Animation hideAnimation() {
        AnimationSet set = new AnimationSet(true);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.1f, 1.0f, 0.1f,Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF,0.5f);

        set.setDuration(200);
        set.setInterpolator(new DecelerateInterpolator());
        set.addAnimation(alphaAnimation);
        set.addAnimation(scaleAnimation);
        return set;
    }
}