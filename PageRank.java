//Stephen Romer
//PageRank Algorithim Program
//09-29-2019

import Java.util.*;
import java.math.*;

public class PageRank
{   
    //function to determine pageRank value based off intial matrix and vector, shows 10 iterations--------------------------------
    public static String pageRank(double[][] transition_matrix, double[] initial_vector)
    {   
        String PageRankSummary = " "; //stores output of function

        //loops through 10x (1 for each iteration)
        for(int i=0; i < 10; i++)
        {   
            int numberOfIterations = i + 1; //Arrays start at 0 so we need to add one here.
            
            double sum = 0; //stores the sum of the matrix multiplication for the iteration
            double[] iteration = {0,0,0,0}; //stores the resulting PageRank vector of the multiplied matrix+vector
            
            //Formula for multiplying a Matrix by a Vector
            for(int j=0; j<transition_matrix.length; j++) //j represents the number of rows in the intial matrix
            {
                for(int k=0; k<initial_vector.length; k++) //k represents the number of columns in the initial vector
                {
                   sum = sum + transition_matrix[j][k]*initial_vector[k]; //stores each derived value to be added to the whole vector 
                }
                iteration[j] += sum;
                sum = 0; //clears sum for next iteration's calculations
            }
            
            PageRankSummary += ("Pagerank Iteration " + numberOfIterations +  ": " + Arrays.toString(iteration) + "\n");
            initial_vector = iteration; //SETS THE 'INITIAL' VECTOR TO THE NEW MODIFIED VECTOR (easier to set matrix to the same name then declare a new variable)
        }
        return PageRankSummary;
    }
    //main method-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        //test variables for the function 3x3
        //double[][] test_matrix = {
        //                                {.5,.5,0},
        //                                {.5,.0,1},
        //                                {0,.5,0}
        //                            };
        //double[] test_vector = {.3333333333,.333333333333333,.33333333333333};

        //test variables 4x4
        double[][] test_matrix = {
                                    {0.0,0.0,0.5,0.5},
                                    {.33367,0.0,1.0,0},
                                    {.33367,0.0,0.0,0.5},
                                    {.33367,1.0,0.5,0}
                                 };

        double[] test_vector = {1.0,1.0,1.0,1.0};

        System.out.println(pageRank(test_matrix,test_vector));
    }

}
