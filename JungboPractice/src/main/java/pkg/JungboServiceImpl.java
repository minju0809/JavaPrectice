package pkg;

import java.util.List;

public class JungboServiceImpl implements JungboService {
	JungboDao dao = new JungboDaoImpl();

	@Override
	public List<JungboVO> select(JungboVO vo) {
		return dao.select(vo);
	}

}
