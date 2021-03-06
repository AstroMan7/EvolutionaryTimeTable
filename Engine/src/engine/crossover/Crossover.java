package engine.crossover;

import engine.Solution;
import generated.ETTCrossover;

import java.util.Random;


public abstract class Crossover
{
    protected int m_NumOfCuttingPoints;
    protected String m_Configuration;

    //Methods
    public abstract Solution execute(Solution parent1, Solution parent2);


   public void setConfiguration(String configuration){m_Configuration= configuration; }

    public String getConfiguration(){return  m_Configuration;}

    @Override
    public String toString() {
        return "Number Of Cutting Points: " + m_NumOfCuttingPoints;
    }
}
