package qfind.com.qfindappandroid.webviewactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import qfind.com.qfindappandroid.R;

public class WebviewActivity extends AppCompatActivity {

    @BindView(R.id.webViewProgress)
    ProgressBar webViewProgressBar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbarTitle)
    TextView toolbarTitle;
    @BindView(R.id.webView)
    WebView webView;
    @BindView(R.id.webViewCloseBtn)
    ImageView webViewCloseBtn;

    private String url, toolbarTittleText;
    Typeface mTypeFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        url = getIntent().getStringExtra("url");

        if (TextUtils.isEmpty(url)) {
            finish();
        }
        setFontTypeForToolbar();
        setUpWebView();
        webView.loadUrl(url);
        setUpCloseButtonClickListener();


    }

    public void setUpWebView() {
        webView.setWebChromeClient(new MyWebChromeClient(this));
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                webViewProgressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                webView.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                webViewProgressBar.setVisibility(View.GONE);
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                webViewProgressBar.setVisibility(View.GONE);
            }
        });
        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
    }

    private class MyWebChromeClient extends WebChromeClient {
        Context context;

        private MyWebChromeClient(Context context) {
            super();
            this.context = context;
        }


    }

    public void setUpCloseButtonClickListener() {
        webViewCloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void setFontTypeForToolbar() {
        if (getResources().getConfiguration().locale.getLanguage().equals("en")) {
            mTypeFace = Typeface.createFromAsset(getAssets(),
                    "fonts/Lato-Bold.ttf");
        } else {
            mTypeFace = Typeface.createFromAsset(getAssets(),
                    "fonts/GE_SS_Unique_Bold.otf");

        }
        toolbarTitle.setTypeface(mTypeFace);
        toolbarTitle.setText(toolbarTittleText);
    }
}
