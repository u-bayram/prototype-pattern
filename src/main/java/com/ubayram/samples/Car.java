package com.ubayram.samples;

/**
 * User: ubayram
 * Date: 18.01.2021
 * Time: 09:19
 */
public abstract class Car implements Cloneable {
    protected String name;
    private Integer year;

    public abstract void printNameAndYear();

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public Object clone()   {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
