package Balaji;

import java.util.Arrays;
import java.util.List;

public class averagecalculator {

		
		public static void main(String[] args) {
	        
	        List<Double> doubleList = Arrays.asList( 2.3,4.5,5.6,7.6,1.8,-5.4,-2.1);

	        double average = calculateAverage(doubleList);
	        
	        System.out.println("List of Doubles : " + doubleList);
	        System.out.println("Average calulated : " + average);
	    }

	    private static double calculateAverage(List<Double> list) {
	        
	        return list.stream()
	                .mapToDouble(Double::doubleValue)
	                .average()
	                .orElse(0.0);

	}

}