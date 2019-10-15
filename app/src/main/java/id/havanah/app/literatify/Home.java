package id.havanah.app.literatify;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

/**
 * Created by farhan at 23:20
 * on 15/10/2019.
 * Havanah Team, ID.
 */
public class Home extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home);

    CardView scanToRead = findViewById(R.id.cardToScan);
    scanToRead.setOnClickListener(v -> {
      startActivity(new Intent(Home.this, ScanToRead.class));
    });

  }
}

