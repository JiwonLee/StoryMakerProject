package hs.mirim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MakePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make);
		
		ImageButton btnNext = (ImageButton)findViewById(R.id.btnNext);
		ImageButton btnTakePicture = (ImageButton)findViewById(R.id.btnTakePicture);
		ImageButton btnReplay = (ImageButton)findViewById(R.id.btnReplay);
		ImageButton btnSave = (ImageButton)findViewById(R.id.btnSave);
		TextView textWrite = (TextView)findViewById(R.id.textWrite);
		
		btnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MakePage.this, "다음으로", 3000).show();
			}
		});
		
		btnTakePicture.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MakePage.this, "그림 넣읍시다.", 3000).show();
			}
		});
		
		btnReplay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MakePage.this, "수정 합시다.", 3000).show();
			}
		});
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MakePage.this, "저장 합시다.", 3000).show();
			}
		});
	}

}
