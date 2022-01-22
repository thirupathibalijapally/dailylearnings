import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.math.*;


public class ReducerSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// Sum of all integer elements in given array
       Integer array []= {8,2,3,4,5,6,7,1};       
       Optional<Integer> sum = Arrays.stream(array).reduce( (a,b)-> a+b);		
       System.out.println(sum.get());		
	   Optional<Integer> sum1 = Arrays.stream(array).reduce(Integer::sum);		  
	   System.out.println(sum1.get());
		
		
		//Max and Min from given elements
		  
		  Integer max = Arrays.stream(array).reduce(0, (a,b)-> a>b ? a:b);	
		  Integer max1 = Arrays.stream(array).reduce(Integer.MIN_VALUE, Integer::max);
		  System.out.println(max);	
		  System.out.println(max1);
		  
		//
		  
		  List<Invoices> invoices = Arrays.asList(
	                new Invoices("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
	                new Invoices("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
	                new Invoices("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
	        );
		  
		  BigDecimal sum3 = invoices.stream().map(x->x.getQty().multiply(x.getPrice())).reduce(BigDecimal.ZERO,BigDecimal::add);		  
		  System.out.println(sum3);
		  System.out.println(sum3.setScale(2,RoundingMode.HALF_UP)); 
		  
		  List<String> words = Arrays.asList("GFG", "Geeks", "for",
                  "GeeksQuiz", "GeeksforGeeks");
		  
		  Optional<String> longStrOptional = words.stream().reduce((str1,str2)->str1.length()>str2.length() ? str1:str2);
		  
		  System.out.println(longStrOptional.get());
		  
		  
		  List<Integer> givenNumbers = Arrays.asList(1,2,3,4,5,6);
		  
		  
		 double avg = givenNumbers.stream().reduce((a,b)->a+b).orElse(0)/givenNumbers.size();
		 
		 double avg1 = givenNumbers.stream().reduce(0,(a,b)->a+b)/givenNumbers.size();
		 
		 System.out.println(avg1);
		  
	}

}
