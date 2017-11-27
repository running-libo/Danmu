package com.example.danmu.danmu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DanmuView danmuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        danmuView = (DanmuView) findViewById(R.id.danmuview);
        danmuView.setData(loadData());
    }

    private List loadData(){
        ArrayList<DanmuBean> datas = new ArrayList<>();
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"小强","女神我爱你！"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"Jack ma","妈妈问我为什么跪着听歌"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_lori,"习大大","歌词特别美"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_robot,"宝强","全世界都安静了"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"宝宝","听到放不下耳机，听到耳朵痛都不放下，哈哈哈"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"我是大神","中国好声音，I want you"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"茜茜","一天脑子里都在唱这首歌"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"Bangbangbang","有故事，好听"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"stalse","我就是为了你开的会员"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"hehe","太好听了.."));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_robot,"小强","女神我爱你！"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"Jack ma","妈妈问我为什么跪着听歌"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"习大大","歌词特别美"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"宝强","全世界都安静了"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"宝宝","听到放不下耳机，听到耳朵痛都不放下，哈哈哈"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"我是大神","中国好声音，I want you"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_robot,"茜茜","一天脑子里都在唱这首歌"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"Bangbangbang","有故事，好听"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"stalse","我就是为了你开的会员"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"hehe","太好听了.."));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"小强","女神我爱你！"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_robot,"Jack ma","妈妈问我为什么跪着听歌"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"习大大","歌词特别美"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"宝强","全世界都安静了"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"宝宝","听到放不下耳机，听到耳朵痛都不放下，哈哈哈"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"我是大神","中国好声音，I want you"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_uncle,"茜茜","一天脑子里都在唱这首歌"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"Bangbangbang","有故事，好听"));
        datas.add(new DanmuBean(0,R.mipmap.make_music_voice_changer_funny,"stalse","我就是为了你开的会员"));
        datas.add(new DanmuBean(0,R.mipmap.internet_star,"hehe","太好听了.."));

        return datas;
    }
}
