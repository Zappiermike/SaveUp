package edu.gac.mcs270.saveup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class IncomeFragment extends Fragment{
    private Income mIncome;
    private EditText mIncomeTitle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIncome= new Income();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v =inflater.inflate(R.layout.add_income, container, false);


        mIncomeTitle = (EditText) v.findViewById(R.id.EditIncomeName);
        mIncomeTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mIncome.setIncomeName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        
        return v;
    }
}
