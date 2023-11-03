package pkg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import pkg.DBConnection.DBConnection;
import pkg.model.MemberVO;

public class MemberDaoImpl implements MemberDao {
	DBConnection DBCon = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public MemberDaoImpl() {
		DBCon = DBConnection.getInstance();
	}

	@Override
	public void insert(MemberVO vo) {
		try {
			conn = DBCon.getConnection();
			String SQL = "insert into member200 (id, pwd, name, email) values (ST1103.nextVal,?,?,?)";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, vo.getPwd());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<MemberVO> select(MemberVO vo) {
		List<MemberVO> li = null;
		try {
			li = new ArrayList<>();
			conn = DBCon.getConnection();
			String SQL = "select * from member200 order by id desc";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				li.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public MemberVO edit(MemberVO vo) {

		MemberVO memberVO = null;
		try {
			Connection conn = DBCon.getConnection();
			String SQL = "select * from member200 where id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, vo.getId());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setId(rs.getString("id"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setName(rs.getString("name"));
				memberVO.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberVO;
	}

	@Override
	public void delete(MemberVO vo) {
		try {
			Connection conn = DBCon.getConnection();
			String SQL = "delete from member200 where id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, vo.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
