package com.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ravikirn on 7/12/14.
 */
public class Crime
{
    private UUID m_id;
    private String m_title;


    private Date m_date;
    private boolean m_isSolved;

    public Crime()
    {
        m_id = UUID.randomUUID();
        m_date = new Date();
    }

    public UUID getId()
    {
        return m_id;
    }

    public String getTitle()
    {
        return m_title;
    }

    public void setTitle(String m_title)
    {
        this.m_title = m_title;
    }

    public Date getDate()
    {
        return m_date;
    }

    public void setDate(Date m_date)
    {
        this.m_date = m_date;
    }

    public boolean isSolved()
    {
        return m_isSolved;
    }

    public void setIsSolved(boolean m_isSolved)
    {
        this.m_isSolved = m_isSolved;
    }

    @Override
    public String toString()
    {
        return m_title;
    }
}
