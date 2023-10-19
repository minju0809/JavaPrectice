package ch01;

import java.util.ArrayList;
import java.util.List;

class Test {
	public List<GugudanVO2> gugudan2() {
			List<GugudanVO2> li = new ArrayList<GugudanVO2>();
			GugudanVO2 m = null;
			for(int dan = 2; dan <= 9; dan++) {
				for (int i = 1; i <= 9; i++) {
					m = new GugudanVO2();
					m.setDan(dan);
					m.setI(i);
					m.setResult(dan*i);
					li.add(m);
				}
			}
		return li;
	}
}

public class MainClass {
	public static void main(String[] args) {
		Test test = new Test();
		List<GugudanVO2> li = test.gugudan2();
		for(int i = 0; i < li.size(); i++) {
			GugudanVO2 m = li.get(i);
			int dan = m.getDan();
			int ii = m.getI();
			int result = m.getResult();
			System.out.printf("%sX%s=%2s ", dan, ii, result);
			
			if((i+1) % 9 == 0) {
				System.out.println();
			}
		}
	}
}
