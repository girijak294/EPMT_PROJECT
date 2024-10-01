import java.util.Map;
import java.util.TreeMap;

public class SortTreeMapBasedOnNames {

	public static void main(String[] args) {

		Map<String, EmployeeTreeMap> m = new TreeMap<>((name1, name2) -> name2.compareTo(name1));
		m.put("Bhavani", new EmployeeTreeMap("Bhavani"));
		m.put("fef", new EmployeeTreeMap("fef"));
		m.put("fefef", new EmployeeTreeMap("fefef"));
		m.put("hthtyj", new EmployeeTreeMap("hthtyj"));
		
		
		for(String s: m.keySet()) {
			
			System.out.println(s);
		}
	}

}
