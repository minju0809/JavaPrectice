package pkg.service;

import java.util.List;

import pkg.model.MemberVO;

public interface MemberService {
	public void insert(MemberVO vo);

	public List<MemberVO> select(MemberVO vo);

	MemberVO edit(MemberVO vo);

	void delete(MemberVO vo);
}
