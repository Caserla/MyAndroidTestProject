package com.wangdiaozhu.smartimageview;

import com.loopj.android.image.SmartImageView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

   public void click(View v){
	   
	   SmartImageView siv = (SmartImageView) findViewById(R.id.siv);
//	   ÇëÇóÍøÂçÍ¼Æ¬
	   siv.setImageUrl("http://img10.pengfu.cn/big/202/447202.jpg");
	   
   }
}
