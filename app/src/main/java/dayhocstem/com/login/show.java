package dayhocstem.com.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class show extends AppCompatActivity {

    private static final String TAG = "show";
    private EditText inputUsername, inputPass;
    private Button loginButton;
    private TextView accountDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Ensure this is the correct layout file

        // Initialize UI components
        inputUsername = findViewById(R.id.inputusername);
        inputPass = findViewById(R.id.inputpass);
        loginButton = findViewById(R.id.button2);
        accountDetails = findViewById(R.id.textViewAccountDetails);

        if (accountDetails == null) {
            Log.e(TAG, "TextView not found. Check your layout file.");
            return;
        }

        // Set up click event for the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from EditText
                String username = inputUsername.getText().toString().trim();
                String password = inputPass.getText().toString().trim();

                // Log values to check if they are being retrieved correctly
                Log.d(TAG, "Username: " + username);
                Log.d(TAG, "Password: " + password);

                // Update TextView with the information
                accountDetails.setText("Username: " + username + "\nPassword: " + password);
            }
        });
    }
}
