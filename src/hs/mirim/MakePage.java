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
		TextView textWrite = (TextView)findViewById(R.id.textWrite);
		
		btnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MakePage.this, "��������", 3000).show();
			}
		});
	}

}
