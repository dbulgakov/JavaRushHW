package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException, ParseException
    {
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.next();
        DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMMMM", Locale.ENGLISH);
        Date date = dateFormat.parse(monthName);
        System.out.println(monthName + " is " + (date.getMonth() + 1) + " month");
    }

}
