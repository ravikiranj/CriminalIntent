package com.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by ravikirn on 7/12/14.
 */
public class CrimeActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}