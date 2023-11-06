package pkg;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JungController
 */
@WebServlet("/JungController")
public class JungboController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JungboController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String sw = request.getParameter("sw"); //url 파라미터
		JungService service = new JungServiceImpl();
		JungVO vo = new JungVO();
		if (sw.equals("F")) {
			int sNo = service.sNo();
			request.setAttribute("sNo", sNo);

			RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
			dispatcher.forward(request, response);
		} else if (sw.equals("I")) {
			String sNo = request.getParameter("sNo");
			String sName = request.getParameter("sName");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			int hist = Integer.parseInt(request.getParameter("hist"));
			vo.setsNo(sNo);
			vo.setsName(sName);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setHist(hist);
			service.insert(vo);

			RequestDispatcher dispatcher = request.getRequestDispatcher("JungboController?sw=S");
			dispatcher.forward(request, response);
		} else if (sw.equals("S")) {
			List<JungVO> li = service.select();
			request.setAttribute("li", li); // "li"에 li를 담는다. 

			RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp"); // 보넬 곳을 list.jsp로 정함 
			dispatcher.forward(request, response); 
		} else if (sw.equals("E")) {
			String sNo = request.getParameter("sNo");
			int sNoK = Integer.parseInt(sNo);
			
			vo = service.edit(sNoK);
			request.setAttribute("vo", vo);

			RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
			dispatcher.forward(request, response);
		} else if (sw.equals("U")) {
			String sNo = request.getParameter("sNo");
			String sName = request.getParameter("sName");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			int hist = Integer.parseInt(request.getParameter("hist"));
			vo.setsNo(sNo);
			vo.setsName(sName);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setHist(hist);

			service.update(vo);

			request.setAttribute("vo", vo);

			RequestDispatcher dispatcher = request.getRequestDispatcher("JungboController?sw=S");
			dispatcher.forward(request, response);
		} else if (sw.equals("D")) {
			String sNo = request.getParameter("sNo");
			int sNoK = Integer.parseInt(sNo);
			
			service.delete(sNoK);

//			request.setAttribute("vo", vo); // dispatcher 의 url에 값을 넘겨야 할 때 사용 

			RequestDispatcher dispatcher = request.getRequestDispatcher("JungboController?sw=S");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
