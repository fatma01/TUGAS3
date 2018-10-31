import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("FATMAWATI");
		arls.add("IRMAYANTI");
		arls.add("NUR RESKI");
		System.out.println(arls);
		//menghapus
		arls.remove("FATMAWATI");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("FHATMA");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("UANG"))
			System.out.println(" ada UANG");
		else{
			System.out.println("tak ada UANG");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
