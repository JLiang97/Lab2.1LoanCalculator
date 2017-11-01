package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";
    private EditText editTextCarPrice, editTextDownPayment, editTextLoadPeriod, editTextInterestRate, editTextSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        editTextCarPrice = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownPayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextLoadPeriod = (EditText)findViewById(R.id.editTextLoadPeriod);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
        editTextSalary = (EditText)findViewById(R.id.editTextSalary)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateLoan(View view){
        Intent intent = new Intent(this, ResultActivity.class);

        //TODO: calculate monthly payment and determine
        // loan application status; approve or reject
        double monthlyPayment, vehiclePrice, downPayment, interestRate, repayment, totalInterest, totalLoan, salary;
        String status;

        vehiclePrice = Double.parseDouble(editTextCarPrice.getText().toString());
        downPayment = Double.parseDouble(editTextDownPayment.getText().toString());
        repayment = Double.parseDouble(editTextLoadPeriod.getText().toString());
        interestRate = Double.parseDouble(editTextInterestRate.getText().toString());

        //Passing data using putExtra method
        //putExtra(TAG, value)
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS, status);
        startActivity(intent);
    }
}
