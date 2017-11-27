package com.example.danmu.danmu;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by libo on 2017/11/27.
 */

public class MoveTextView extends LinearLayout{
    private View rootView;
    private ImageView ivAvator;
    private TextView tvName;
    private TextView tvContent;

    public MoveTextView(Context context,DanmuBean danmuBean) {
        super(context);

        rootView = inflate(context,R.layout.item,null);
        addView(rootView);
        init(danmuBean);
    }

    private void init(DanmuBean danmuBean) {
        ivAvator = rootView.findViewById(R.id.avator);
        tvName = rootView.findViewById(R.id.tv_name);
        tvContent = rootView.findViewById(R.id.tv_content);

        ivAvator.setImageResource(danmuBean.getAvatorId());
        tvName.setText(danmuBean.getUserName());
        tvContent.setText(danmuBean.getContent());
    }

    /**
     * 设置随机出现垂直位置
     */
    public void randomVerticalPos(int heightPixels){
        int randonTop = (int) (Math.random()*heightPixels);

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) getLayoutParams();
        params.topMargin = randonTop;
        setLayoutParams(params);
    }

}
