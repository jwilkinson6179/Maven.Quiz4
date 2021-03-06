package rocks.zipcode.quiz4.fundamentals;

import java.util.function.BinaryOperator;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value)
    {
        return Math.sqrt(value);
    }

    public static Double square(Double value)
    {
        return Math.pow(value, 2);
    }

    public static Double[] squareRoots(Double... value)
    {
        Double[] results = new Double[value.length];

        for(Integer i = 0; i < value.length; i++)
        {
            results[i] = squareRoot(value[i]);
        }

        return results;
    }

    public static Double[] squares(Double... values)
    {
        Double[] results = new Double[values.length];

        for(Integer i = 0; i < values.length; i++)
        {
            results[i] = square(values[i]);
        }

        return results;
    }

    public static Double add(Double value1, Double value2)
    {
        BinaryOperator<Double> add = Double::sum;
        return add.apply(value1, value2);
    }

    public static Double subtract(Double value1, Double value2)
    {
        BinaryOperator<Double> sub = (a, b) -> a - b;
        return sub.apply(value1, value2);
    }


    public static Double divide(Double divisor, Double dividend)
    {
        BinaryOperator<Double> div = (n, m) -> n / m;
        return div.apply(divisor, dividend);
    }
}
