package com.study.help;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VideoItem {
    String name;
    String path; // 视频存放位置
    Bitmap thumb;// 视频标题
    String createdTime;

    public VideoItem(String name, String path, String createdTime) {
        this.name = name;
        this.path = path;

        /*  Android SDK提供的生成对应地址的视频缩略图工具
            MINI_KIND表示小的缩略图；
            FULL_SCREEN_KIND表示大尺寸的缩略图；
            MICRO_KIND表示超小图的缩略图；
         */
        this.thumb = ThumbnailUtils.createVideoThumbnail(path, MediaStore.Images.Thumbnails.MINI_KIND);

        SimpleDateFormat sf = new SimpleDateFormat("yy年MM月dd日HH时mm分");
        Date d = new Date(Long.valueOf(createdTime) * 1000);
        this.createdTime = sf.format(d);
    }

}
