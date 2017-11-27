package com.example.danmu.danmu;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import java.util.List;

/**
 * Created by libo on 2017/11/27.
 */

public class DanmuView extends RelativeLayout{
    private int widthPixels;
    private int heightPixels;
    private int curPos;
    private List<DanmuBean> datas;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            addTextView();

            //弹幕出现间隔时间400-700ms
            int randomDelay = (int) (Math.random()*300+400);
            handler.sendEmptyMessageDelayed(0,randomDelay);
        }
    };

    public DanmuView(Context context) {
        super(context);
        init();
    }

    public DanmuView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public void init(){
        widthPixels = getResources().getDisplayMetrics().widthPixels;
        heightPixels = getResources().getDisplayMetrics().heightPixels;

        handler.sendEmptyMessage(0);
    }

    public void setData(List<DanmuBean> datas){
        this.datas = datas;
    }

    private void addTextView(){
        if(curPos == datas.size()){  //循环播放
            curPos = 0;
        }
        MoveView moveView = new MoveView(getContext(),datas.get(curPos++));
        addView(moveView);
        moveView.randomVerticalPos(heightPixels);
        startTranslateAnim(moveView);
    }


    /**
     * 设置从右往左移动动画,时间范围是2000-4000毫秒
     * @param view
     */
    private void startTranslateAnim(final View view){
        int randomDuration = (int) (Math.random()*2000 + 7000);
        TranslateAnimation anim = new TranslateAnimation(widthPixels,-widthPixels,0,0);
        anim.setDuration(randomDuration);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                removeView(view);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        view.startAnimation(anim);
    }

}
