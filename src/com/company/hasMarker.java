package com.company;

/**
 * Created by gb647 on 10/19/16.
 */
public class hasMarker
{
    public hasMarker(double m)
    {
        mn = m;
    }
    public boolean b;
    public double mn;
    public boolean canAfford()
    {
        if(mn>=20)
        {
            b=true;
        } else
        {
            b=false;
        }
        return b;
    }
}
