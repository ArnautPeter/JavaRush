package com.javarush.test.level15.lesson12.home05;

public class SubSolution extends Solution
{
    public SubSolution()
    {

    }

    public SubSolution(int count, String name)
    {
        super(count, name);
    }

    public SubSolution(Solution solution)
    {
        super(solution);
    }

    protected SubSolution(String name)
    {
        super(name);
    }

    protected SubSolution(char ch)
    {
        super(ch);
    }

    protected SubSolution(String name, char ch)
    {
        super(name, ch);
    }

    SubSolution(Solution solution, int count)
    {
        super(solution, count);
    }

    SubSolution(Solution solution, Solution solution1)
    {
        super(solution, solution1);
    }

    SubSolution(String str, String name)
    {
        super(str, name);
    }

    private SubSolution(int count) {

    }

    private SubSolution(int count,char ch) {
        this.count = count;

    }

    private SubSolution(Solution solution, char ch){

    }
}
