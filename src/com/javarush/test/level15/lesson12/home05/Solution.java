package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    String name;
    int count;
    char ch;

    public Solution(){

    }

    public Solution(int count, String name) {
        this.name = name;
        this.count = count;
    }

    public Solution(Solution solution) {

    }

    protected Solution(String name) {
        this.name = name;
    }

    protected Solution(char ch) {
        this.ch = ch;
    }

    protected Solution(String name, char ch) {
        this.ch = ch;
        this.name = name;
    }

    private Solution(int count) {

    }

    private Solution(int count,char ch) {
        this.count = count;

    }

    private Solution(Solution solution, char ch){

    }

    Solution(Solution solution, int count){

    }

    Solution(Solution solution, Solution solution1) {

    }
    Solution(String str, String name) {

    }
}

