package com.lulu.weichatfriends;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Lulu on 2016/10/27.
 * JS支持类
 */
public class JsSupport {
    private Context mContext;
    private String json;

    public JsSupport(Context context) {
        mContext = context;
    }


    public void setJson(String json) {
        this.json = json;
    }

    /**
     * @param str
     */
    @JavascriptInterface
    public void showToast(String str) {
        Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();
    }
    @JavascriptInterface
    public String getJson(){
        return json;
    }

}
