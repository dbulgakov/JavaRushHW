package com.javarush.test.level14.lesson06.home01;

public class Solution
{
    public static void main(String[] args)
    {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country)
        {
            Hen hen = null;
            if (country == Country.RUSSIA)
            {
                hen = new RussianHen();
            }
            if (country == Country.BELARUS)
            {
                hen = new BelarusianHen();
            }
            if (country == Country.MOLDOVA)
            {
                hen = new MoldovanHen();
            }
            if (country == Country.UKRAINE)
            {
                hen = new UkrainianHen();
            }
            return hen;
        }
    }
}
