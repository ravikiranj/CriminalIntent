package com.android.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by ravikirn on 7/12/14.
 */
public class CrimeFragment extends Fragment
{
    private Crime m_crime;
    private EditText m_titleField;
    private Button m_dateButton;
    private CheckBox m_solvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        m_crime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        m_titleField = (EditText) v.findViewById(R.id.crime_title);
        m_titleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                m_crime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        m_dateButton = (Button) v.findViewById(R.id.crime_date);
        m_dateButton.setText(m_crime.getDate().toString());
        m_dateButton.setEnabled(false);

        m_solvedCheckBox = (CheckBox) v.findViewById(R.id.crime_solved);
        m_solvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                m_crime.setIsSolved(isChecked);
            }
        });
        return v;
    }
}
