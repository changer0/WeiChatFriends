package com.lulu.weichatfriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.main_web_view);
        //解决点击链接跳转浏览器问题
        mWebView.setWebViewClient(new WebViewClient());

        //js支持
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        //允许访问assets目录
        settings.setAllowFileAccess(true);
        //设置WebView排版算法, 实现单列显示, 不允许横向移动
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //assets文件路径
        String path = "file:///android_asset/index.html";
        //加载Html页面
        mWebView.loadUrl(path);

    }
}
