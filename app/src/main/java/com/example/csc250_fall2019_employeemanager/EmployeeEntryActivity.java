package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmployeeEntryActivity extends AppCompatActivity
{

    private EditText fnameET, lnameET, height_feetET, height_inchesET, weightET, ageET;
    private Employee theEmployee = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_entry);

        this.fnameET = this.findViewById(R.id.fnameET);
        this.lnameET = this.findViewById(R.id.lnameET);
        this.weightET = this.findViewById(R.id.weightET);
        this.ageET = this.findViewById(R.id.ageET);
        this.height_feetET = this.findViewById(R.id.height_feetET);
        this.height_inchesET = this.findViewById(R.id.height_inchesET);
    }


    public void onCreateEmployeeButtonClicked(View v)
    {
        if(this.theEmployee == null) //this is a new employee
        {
           String fname = this.fnameET.getText().toString();
            String lname = this.lnameET.getText().toString();
            double weight = Double.parseDouble(this.weightET.getText().toString());
            int age = Integer.parseInt(this.ageET.getText().toString());
            int height_feet = Integer.parseInt(this.height_feetET.getText().toString());
            int height_inches = Integer.parseInt(this.height_inchesET.getText().toString());
            this.theEmployee = new Employee(fname, lname, height_feet, height_inches, age, weight);

            TextView confirmMessage = this.findViewById(R.id.confirmMessage);
            confirmMessage.setText("Employee Creation Success!");

        }
        else //this is an employee we are updating
        {
            //allow the create button to also update the current employee object
            //note that you only have getters for your private employee fields
            //currently.  You may need to change that :)
            this.fnameET = this.findViewById(R.id.fnameET);
            this.theEmployee.setFname(fnameET.getText().toString());

            this.lnameET = this.findViewById(R.id.lnameET);
            this.theEmployee.setLname(lnameET.getText().toString());

            this.weightET = this.findViewById(R.id.weightET);
            this.theEmployee.setWeight(Double.parseDouble(weightET.getText().toString()));

            this.ageET = this.findViewById(R.id.ageET);
            this.theEmployee.setAge(Integer.parseInt(ageET.getText().toString()));

            this.height_feetET = this.findViewById(R.id.height_feetET);
            this.theEmployee.setHeight_feet(Integer.parseInt(height_feetET.getText().toString()));

            this.height_inchesET = this.findViewById(R.id.height_inchesET);
            this.theEmployee.setHeight_inches(Integer.parseInt(height_inchesET.getText().toString()));
            }
            TextView outputToEmployee = this.findViewById(R.id.outputView);
            outputToEmployee.setText(theEmployee.employeeGreeting());
        }






    }
