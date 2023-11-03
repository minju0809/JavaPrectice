package pkg.service;

import java.util.List;

import pkg.dao.MemberDao;
import pkg.dao.MemberDaoImpl;
import pkg.model.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDao dao;

	// 생성자를 통한 의존성 주입
	public MemberServiceImpl() {
		this.dao = new MemberDaoImpl();
	}

	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	public List<MemberVO> select(MemberVO vo) {
		return dao.select(vo);
	}

	public MemberVO edit(MemberVO vo) {
		return dao.edit(vo);
	}

	public void delete(MemberVO vo) {
		dao.delete(vo);
	}
}