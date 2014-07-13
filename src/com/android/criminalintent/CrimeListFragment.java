package com.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;

import java.util.List;

/**
 * Created by ravikirn on 7/13/14.
 */
public class CrimeListFragment extends ListFragment
{
    private List<Crime> m_crimeList;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        activity.setTitle(R.string.crimes_title);
        m_crimeList = CrimeLab.getInstance(activity).getCrimes();
    }

}
