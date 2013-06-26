package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class StoryMake_Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton btnMake = (ImageButton)findViewById(R.id.btnMake);
        ImageButton btnList = (ImageButton)findViewById(R.id.btnList);
        ImageButton btnHelp = (ImageButton)findViewById(R.id.btnHelp);
        
        btnMake.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StoryMake_Main.this, MakePage.class);
		    	startActivity(intent);
			}
		});
        
        btnList.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StoryMake_Main.this, ListPage.class);
		    	startActivity(intent);
			}
		});
        
        btnHelp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StoryMake_Main.this, HelpPage.class);
		    	startActivity(intent);
			}
		});
    }
}