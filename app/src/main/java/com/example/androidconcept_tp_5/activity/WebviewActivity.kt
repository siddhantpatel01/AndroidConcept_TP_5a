package com.example.androidconcept_tp_5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityWebviewBinding

class WebviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webView.webViewClient = MyWebViewClient()
        binding.webView.loadUrl("https://developer.android.com/reference/android/webkit/WebView")
    }


   inner class MyWebViewClient: WebViewClient(){
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            binding.progressBar.visibility = View.GONE
        }

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            Log.d("TAG", "shouldOverrideUrlLoading: "+request?.url)
            return super.shouldOverrideUrlLoading(view, request)

        }
    }
}