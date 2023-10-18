package ch01;

import java.util.ArrayList;
import java.util.List;

class Test {
	public List<GugudanVO> gugudan(GugudanVO vo) {
		int startDan = vo.getStartDan();
		int endDan = vo.getEndDan();
		List<GugudanVO> li = new ArrayList<GugudanVO>();
		for (int dan = startDan; dan <= endDan ; dan++) {
			int i = 1;
			String str = "";
			while(i < 10) {
				if(dan*i < 10) {
					str = dan + "X" + i + "=" + " " +(dan*i) + " ";
				} else {
					str = dan + "X" + i + "=" + (dan*i) + " ";
				}
				vo = new GugudanVO();
				vo.setStr(str);
				li.add(vo);
				i++;
			}
		}
		return li;
	}
}

public class MainClass {
	public static void main(String[] args) {
		
		Test test = new Test();
		
		GugudanVO vo = new GugudanVO();
		vo.setStartDan(2);
		vo.setEndDan(8);
		
		List<GugudanVO> m = test.gugudan(vo);
		for(int i = 0; i < m.size(); i++) {
			GugudanVO result = m.get(i);
			System.out.print(result.getStr());
			
			if((i+1) % 9 == 0) {
				System.out.println();
			}
		}
	}
}
