import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FlatMapExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//creating ArrayList      
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
		List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");  
		List<List<String>> allproducts = new ArrayList<List<String>>();   
		//adding elements to the list  
		allproducts.add(productlist1);  
		allproducts.add(productlist2);  
		allproducts.add(productlist3);  
		allproducts.add(productlist4);  		
		
		List<String> names= allproducts.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		
		names.forEach(name->System.out.println(name));
		
		long[] array = {1, 2, 3, 4, 5, 6};
		

		  Stream<long[]> longArray = Stream.of(array);

		  LongStream longStream = longArray.flatMapToLong(x -> Arrays.stream(x));

		  System.out.println(longStream.sum());
		
	}

}
