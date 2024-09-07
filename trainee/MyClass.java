package ru.lesson6.trainee;

public class MyClass {

    int number;
    char symbol;

    void set (int n, char s){
        number = n;
        symbol = s;
    }

    String getInfo() {
        String text = "NUmber: " + number + "\n";
        text += "Symbol: " + symbol;
        return text;
    }
}
