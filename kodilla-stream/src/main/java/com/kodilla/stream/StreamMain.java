package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.lambda.Executor;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Hello World", (tekst) -> " !! "+tekst+" !! ");
        poemBeautifier.beautify("Welcome in JAVA Course", (tekst) -> tekst.toUpperCase());
        poemBeautifier.beautify(" This is Module 7 ", (tekst) -> tekst.substring(9,17));
        poemBeautifier.beautify("This line will convert all letters l to large", (tekst) -> tekst.replace("l","L"));
    }
}
