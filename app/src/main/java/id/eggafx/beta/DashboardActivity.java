package id.eggafx.beta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;

import id.eggafx.beta.util.Db;

public class DashboardActivity extends AppCompatActivity {

    Db db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        db = new Db();

        test();
    }

    private void test() {
        DatabaseReference ref = db.mainDb();

        ref.setValue("Hello World!").addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Toast.makeText(DashboardActivity.this, "success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}