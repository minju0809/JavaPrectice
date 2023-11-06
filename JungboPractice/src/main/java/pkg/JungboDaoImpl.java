package pkg;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JungboDaoImpl implements JungboDao {
	DBConnection DBConn = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public List<JungboVO> select(JungboVO vo) {
		List<JungboVO> li = null;
		try {
			li = new ArrayList<>();
			DBConn = DBConnection.getInstance();
			conn = DBConn.getConnection();
			String SQL = "select * from examtbl";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				vo = new JungboVO();
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vo.setHist(rs.getInt("hist"));
				li.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

}
