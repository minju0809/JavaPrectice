package ch01;

class Test {
	void school1(SchoolVO k) {
		System.out.println(k);
		System.out.println(k.getName());
		System.out.println(k.getAge());
		System.out.println(k.getEmail());
	}

	String school2(SchoolVO k) {
		return k.getName() + "님";
	}

	public SchoolVO school3(SchoolVO k) {
		k.setName(k.getName() + "냥");
		k.setAge(k.getAge() + 100);
		k.setEmail(k.getEmail() + "@naver.com");
		return k;
	}
}

public class MainClass {
	public static void main(String[] args) {
		Test test = new Test();

		String name = "둘리";
		int age = 30;
		String email = "minju";

		SchoolVO vo = new SchoolVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setEmail(email);

		test.school1(vo);

		String result = test.school2(vo);
		
		/////////////////////////
		System.out.println(result);

		/////////////////////////
		vo = test.school3(vo);
		System.out.println(vo.getName() + vo.getAge() + vo.getEmail());
	}
}
