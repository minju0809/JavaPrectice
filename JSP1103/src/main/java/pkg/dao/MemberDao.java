package pkg.dao;

import java.util.List;

import pkg.model.MemberVO;

public interface MemberDao {
	public void insert(MemberVO vo);

	public List<MemberVO> select(MemberVO vo);

	MemberVO edit(MemberVO vo);

	void delete(MemberVO vo);
}
