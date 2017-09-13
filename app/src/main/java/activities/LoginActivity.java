package activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.jinsei.cd.R;

import sql.DatabaseHelper;

/**
 * Created by JinSei on 6/5/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private final AppCompatActivity activity=LoginActivity.this;
    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutItem;
    private TextInputLayout textInputLayoutAmount;

    private TextInputEditText textInputEditTextItem;
    private TextInputEditText textInputEditTextAmount;

    private AppCompatButton appCompatButtonLogin;

    private AppCompatTextView textViewLinkRegister;


    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        initViews();
        initListeners();
        initObjects();
    }
    /**
     * This method is to initialize views
     */
    private void initViews() {

        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        textInputLayoutItem = (TextInputLayout) findViewById(R.id.textInputLayoutItem);
        textInputLayoutAmount = (TextInputLayout) findViewById(R.id.textInputLayoutAmount);

        textInputEditTextItem = (TextInputEditText) findViewById(R.id.textInputEditTextItem);
        textInputEditTextAmount = (TextInputEditText) findViewById(R.id.textInputEditTextAmount);

        appCompatButtonLogin = (AppCompatButton) findViewById(R.id.appCompatButtonLogin);



    }

    /**
     * This method is to initialize listeners
     */
    private void initListeners() {
        appCompatButtonLogin.setOnClickListener(this);
        textViewLinkRegister.setOnClickListener(this);
    }

    /**
     * This method is to initialize objects to be used
     */
    private void initObjects() {
        databaseHelper = new DatabaseHelper(activity);

    }
    /**
     * This implemented method is to listen the click on view
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

                // Navigate to RegisterActivity
                Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intentRegister);

        }
    }



