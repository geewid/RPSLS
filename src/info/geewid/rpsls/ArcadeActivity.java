package info.geewid.rpsls;

import java.util.Random;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ArcadeActivity extends Activity {
	
	private TextView playerResult, AIResult;
	private ImageButton rock, spock, paper, lizard, scissors;
    private ImageView scissorsAI, paperAI, rockAI, lizardAI, spockAI;
//    private Integer ai_score = Integer.parseInt(((TextView) findViewById(R.id.txt_ai_score)).getText().toString());
//    Integer player_score = Integer.parseInt(((TextView) findViewById(R.id.txt_player_score)).getText().toString());
    Random rand = new Random();
    
    int ai_choice = 0;
    String playerChoice = "";
    String AIChoice = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arcade);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0169b2")));
		
		play();
	}
	
	private void play() {
		playerResult = (TextView) findViewById(R.id.txt_player_score);
		AIResult = (TextView) findViewById(R.id.txt_ai_score);
		rock = (ImageButton) findViewById(R.id.img_rock_player);
		spock = (ImageButton) findViewById(R.id.img_spock_player);
		paper = (ImageButton) findViewById(R.id.img_paper_player);
		lizard = (ImageButton) findViewById(R.id.img_lizard_player);
		scissors = (ImageButton) findViewById(R.id.img_scissors_player);
		
		rockAI = (ImageView) findViewById(R.id.img_rock);
		spockAI = (ImageView) findViewById(R.id.img_spock);
		paperAI = (ImageView) findViewById(R.id.img_paper);
		lizardAI = (ImageView) findViewById(R.id.img_lizard);
		scissorsAI = (ImageView) findViewById(R.id.img_scissors);
		
		rock.setOnClickListener(new View.OnClickListener() {
			@Override
	        public void onClick(View v) {
	            rock.setImageResource(R.drawable.rock_selected);
	            Handler handler = new Handler(); 
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 rock.setImageResource(R.drawable.rock); 
	                 } 
	            }, 500);
	            

	            
	            lizardAI.setImageResource(R.drawable.lizard_selected);
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 lizardAI.setImageResource(R.drawable.lizard); 
	                 } 
	            }, 500);
	            Integer ai_score = Integer.parseInt(((TextView) findViewById(R.id.txt_ai_score)).getText().toString());
	            ((TextView) findViewById(R.id.txt_ai_score)).setText(String.valueOf(ai_score+1));
	        }
		});
		
		spock.setOnClickListener(new View.OnClickListener() {
			@Override
	        public void onClick(View v) {
	            spock.setImageResource(R.drawable.spock_selected);
	            Handler handler = new Handler(); 
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 spock.setImageResource(R.drawable.spock); 
	                 } 
	            }, 500);
	            

	            
	            paperAI.setImageResource(R.drawable.paper_selected);
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 paperAI.setImageResource(R.drawable.paper); 
	                 } 
	            }, 500);
	            Integer ai_score = Integer.parseInt(((TextView) findViewById(R.id.txt_ai_score)).getText().toString());
	            ((TextView) findViewById(R.id.txt_ai_score)).setText(String.valueOf(ai_score+1));
	        }
		});
		
		paper.setOnClickListener(new View.OnClickListener() {
			@Override
	        public void onClick(View v) {
	            paper.setImageResource(R.drawable.paper_selected);
	            Handler handler = new Handler(); 
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 paper.setImageResource(R.drawable.paper); 
	                 } 
	            }, 500);
	            

	            
	            scissorsAI.setImageResource(R.drawable.scissors_selected);
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 scissorsAI.setImageResource(R.drawable.scissors); 
	                 } 
	            }, 500);
	            Integer ai_score = Integer.parseInt(((TextView) findViewById(R.id.txt_ai_score)).getText().toString());
	            ((TextView) findViewById(R.id.txt_ai_score)).setText(String.valueOf(ai_score+1));
	        }
		});
		
		lizard.setOnClickListener(new View.OnClickListener() {
			@Override
	        public void onClick(View v) {
	            lizard.setImageResource(R.drawable.lizard_selected);
	            Handler handler = new Handler(); 
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 lizard.setImageResource(R.drawable.lizard); 
	                 } 
	            }, 500);
	            

	            
	            rockAI.setImageResource(R.drawable.rock_selected);
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 rockAI.setImageResource(R.drawable.rock); 
	                 } 
	            }, 500);
	            Integer ai_score = Integer.parseInt(((TextView) findViewById(R.id.txt_ai_score)).getText().toString());
	            ((TextView) findViewById(R.id.txt_ai_score)).setText(String.valueOf(ai_score+1));
	        }
		});
		
		scissors.setOnClickListener(new View.OnClickListener() {
			@Override
	        public void onClick(View v) {
				scissors.setImageResource(R.drawable.scissors_selected);
	            Handler handler = new Handler(); 
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 scissors.setImageResource(R.drawable.scissors); 
	                 } 
	            }, 500);
	            
	            paperAI.setImageResource(R.drawable.paper_selected);
	            handler.postDelayed(new Runnable() { 
	                 public void run() { 
	                	 paperAI.setImageResource(R.drawable.paper); 
	                 } 
	            }, 500);
	            Integer player_score = Integer.parseInt(((TextView) findViewById(R.id.txt_player_score)).getText().toString());
	            ((TextView) findViewById(R.id.txt_player_score)).setText(String.valueOf(player_score+1));
	        }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.arcade, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_arcade_reset) {
			((TextView) findViewById(R.id.txt_player_score)).setText("0");
			((TextView) findViewById(R.id.txt_ai_score)).setText("0");
		}
		if (id == R.id.action_rules) {
			Intent intent = new Intent(this, RulesActivity.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
