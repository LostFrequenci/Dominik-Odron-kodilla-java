package com.kodilla.patternsVol2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"435345345345","John","Smith"},
            {"434365465466","Ivone","Novak"},
            {"764512342377","Jessie","Pinkman"},
            {"325437567943","Walter","White"},
            {"435654779654","Clara","Lanson"},
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
        }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
