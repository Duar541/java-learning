package ����;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class work734 {
		    
		    public void m1() {
		        List<String> list = new ArrayList<String>();
		        
		        list.add("a");
		        list.add("c");
		        list.add("b");
		        list.add("w");
		        list.add("s");
		        list.add("a");
		        list.add("b");
		        list.add("s");
		        list.add("d");
		        list.add("c");
		        list.add("a");
		        System.out.println("����ǰ��" + list);
		        
		        Collections.sort(list);
		        
		        System.out.println("�����" + list);
		    }

		    public static void main(String[] args) {
		        new work734().m1();
		        
		    }

	}
