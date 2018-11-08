package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        for (int n=0; n < numbers.size(); n++) {
            int temporaryValue = 0;
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0 ) {
                evenNumber.add(temporaryValue);
            }
        }
       return evenNumber;
    }
}
