package ch01;

import java.util.ArrayList;
import java.util.List;

class Test5 {
	public List<RandomVO> randomNum() {
		List<RandomVO> li = new ArrayList<>();
		RandomVO rvo = null;
		for (int i = 1; i <= 30; i++) {
			rvo = new RandomVO();
			int random = (int) (Math.random() * 10);
			int age = (int) (Math.random() * 30) + 10;
			String name[] = { "하니", "둘리", "세리", "네모", "다람쥐", "여우", "칠뜩이", "팔뜩이", "아이", "열라면" };

			String str = name[random] + " (" + age + ") ";

			rvo.setStr(str);
			li.add(rvo);
		}
		return li;
	}
}

public class RandomNum_VO_Main {
	public static void main(String[] args) {
		Test5 test = new Test5();
		List<RandomVO> li = test.randomNum();
		for (int i = 0; i < li.size(); i++) {
			RandomVO vo = li.get(i);

			System.out.print(vo.getStr());
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
