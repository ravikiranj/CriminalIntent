package com.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ravikirn on 7/12/14.
 */
public class CrimeLab {
    private Context m_appContext;
    private List<Crime> m_crimeList;

    private CrimeLab()
    {
        m_crimeList = new ArrayList<Crime>();
        _fillCrimeList();
    }


    private static class SingletonHolder {
        private static final CrimeLab INSTANCE = new CrimeLab();
    }

    public static CrimeLab getInstance(Context c)
    {
        SingletonHolder.INSTANCE.setAppContext(c);
        return SingletonHolder.INSTANCE;
    }

    public void setAppContext(Context c)
    {
        m_appContext = c;
    }

    public List<Crime> getCrimes()
    {
        return m_crimeList;
    }

    public Crime getCrime(UUID id)
    {
        for (Crime c : m_crimeList)
        {
            if (c.getId() == id)
            {
                return c;
            }
        }
        return null;
    }

    public void _fillCrimeList()
    {
        for (int i = 0; i < 100; i++)
        {
            Crime c = new Crime();
            c.setTitle("Crime #" + String.valueOf(i));
            c.setIsSolved(i % 2 == 0);
            m_crimeList.add(c);
        }
    }
}
