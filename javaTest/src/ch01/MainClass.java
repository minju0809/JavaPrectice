package ch01;

import java.util.ArrayList;
import java.util.List;

class Test {
	public List<GugudanVO> gugudan (GugudanVO vo) {
		int startDan = vo.getStartDan();
		int endDan = vo.getEndDan();
		List<GugudanVO> li = new ArrayList<GugudanVO>();
		for (int dan = startDan; dan <= endDan; dan++) {
			String str = "";
			for (int i = 1; i <= 9; i++) {
				if(dan*i < 10) {
					str = dan + "X" + i + "=" + " " +(dan*i) + " ";
				} else {
					str = dan + "X" + i + "=" + (dan*i) + " ";
				}
				vo = new GugudanVO();
				vo.setStr(str);
				li.add(vo);
			}
			
		}
		return li;
	}
}

public class MainClass {
	public static void main(String[] args) {
		Test test = new Test();
		
		GugudanVO vo = new GugudanVO();
		int startDan = 3;
		int endDan = 7;
		vo.setStartDan(startDan);
		vo.setEndDan(endDan);
		
		List<GugudanVO> li = test.gugudan(vo);
		for(int i = 0; i < li.size(); i++) {
			GugudanVO result = li.get(i);
			System.out.print(result.getStr());
			
			if((i+1) % 9 == 0) {
				System.out.println();
			}
		}
	}
}
