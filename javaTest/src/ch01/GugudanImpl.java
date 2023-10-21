package ch01;

import java.util.ArrayList;
import java.util.List;

public class GugudanImpl implements Gugudan {
	@Override
	public List<GugudanVO> gugudan(int a, int b) {
		List<GugudanVO> li = new ArrayList<>();
		GugudanVO vo = null;
		int start = a;
		int end = b;
		String str = null;
		for (int dan = start; dan <= end; dan++) {
			for (int i = 1; i <= 9; i++) {
				str = dan + "X" + i + "=" + dan * i + " ";
				vo = new GugudanVO();
				vo.setStr(str);
				li.add(vo);
			}
		}
		return li;
	}
}
