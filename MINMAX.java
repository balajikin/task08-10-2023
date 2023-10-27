package Balaji;



	import java.util.Arrays;
	import java.util.List;

	public class MINMAX {

		public static void main(String[] args) {
			
			List<Integer> integerList = Arrays.asList(10,20,30,40,50,60,70);

	        
	        int maxValue = findMaxValue(integerList);
	        int minValue = findMinValue(integerList);

	        
	        System.out.println("List of Integers: " + integerList);
	        System.out.println("Maximum Value: " + maxValue);
	        System.out.println("Minimum Value: " + minValue);
	    }

	    private static int findMaxValue(List<Integer> list) {
	        
	        return list.stream()
	                .mapToInt(Integer::intValue)
	                .max()
	                .orElse(0);
	    }

	    private static int findMinValue(List<Integer> list) {
	        
	        return list.stream()
	                .mapToInt(Integer::intValue)
	                .min()
	                .orElse(0);
	    }


	}


