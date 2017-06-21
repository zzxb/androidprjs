package me.zzxb.myskshop.tools;

/**
 * Created by zzxb on 16/5/25.
 */
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

public class BitmapCache implements ImageLoader.ImageCache {

    private LruCache<String, Bitmap> mCache;

    public BitmapCache() {
        int maxSize = 10 * 1024 * 1024;
        mCache = new LruCache<String, Bitmap>(maxSize) {
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        };
    }

    public Bitmap getBitmap(String url) {
        return mCache.get(url);
    }

    public void putBitmap(String url, Bitmap bitmap) {
        mCache.put(url, bitmap);
    }

}
