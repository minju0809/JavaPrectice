package ch01;

import java.util.ArrayList;
import java.util.List;

public class GugudanImpl implements Gugudan {

	@Override
	public List<GugudanVO> gugudan(GugudanVO vo) {
		int start = vo.getStartDan();
		int end = vo.getEndDan();
		List<GugudanVO> li = new ArrayList<GugudanVO>();
		String str = "";
		for (int dan = start; dan <= end; dan++) {
			for (int i = 1; i <= 9; i++) {
				if ((dan * i) < 10) {
					str = dan + "X" + i + "= " + dan * i + " ";
				} else {
					str = dan + "X" + i + "=" + dan * i + " ";
				}
				vo = new GugudanVO();
				vo.setStr(str);
				li.add(vo);
			}
		}
		return li;
	}
}
