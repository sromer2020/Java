//Stephen Romer
//Pagerank algorithim testing

import java.util.*;

public class Test
{
    public static void main(String[] args) 
    {
        double[] iteration = {0,0,0}; //stores the resulting vector of the multiplied matrix+vector
        double sum = 0; //stores the sum of the formula's used

        double[][] test_matrix = {
                                 {.5,.5,0},
                                 {.5,.0,1},
                                 {0,.5,0}
                                };

        double[] test_vector = {.333333333333333,.3333333333333333,.333333333333333};


        //Formula for multiplying a Matrix by a Vector/ WORKS!!!!!
        for(int j=0; j<3; j++) //j represents the number of rows in the intial matrix
         {
            for(int k=0; k<3; k++) //k represents the number of columns in the initial vector
            {
                 sum = sum + test_matrix[j][k]*test_vector[j]; //sets the corresponding values to a variable 
            }
            iteration[j] += sum;
            sum = 0;
        }

        System.out.println("PageRank Value: " + Arrays.toString(iteration));

        //for(int l=0; l<3; l++)
        //{   
            //prob don't need this
            //for(int m=0; m<1; m++)
            //{
          //iteration[l] //prints out iteration
            //}
        //}
    }
}