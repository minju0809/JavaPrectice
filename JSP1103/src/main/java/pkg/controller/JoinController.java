package pkg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg.model.MemberVO;
import pkg.service.MemberService;
import pkg.service.MemberServiceImpl;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinController() {
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
//      response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("==>Controller 확인");

//		String path = request.getContextPath();
		String sw = request.getParameter("sw");
		RequestDispatcher dispatcher = null;
		MemberService memberService = null;
		MemberVO memberVO = null;
		switch (sw) {
		case "i":
			memberService = new MemberServiceImpl();
			memberVO = new MemberVO();

			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			memberVO.setPwd(pwd);
			memberVO.setName(name);
			memberVO.setEmail(email);

			memberService.insert(memberVO);
//         RequestDispatcher dispatcher = request.getRequestDispatcher("/member/member_result.jsp");

			dispatcher = request.getRequestDispatcher("/JoinController?sw=l");
			dispatcher.forward(request, response);

			break;
		case "l":
			memberService = new MemberServiceImpl();

			List<MemberVO> li = memberService.select(null);
			request.setAttribute("li", li);
			dispatcher = request.getRequestDispatcher("/member/member_list.jsp");
			dispatcher.forward(request, response);

			break;
		case "e":
			memberService = new MemberServiceImpl();
			String searchId = request.getParameter("id");

			memberVO = new MemberVO();
			memberVO.setId(searchId);

			MemberVO m = memberService.edit(memberVO);
			request.setAttribute("vo", m);
			dispatcher = request.getRequestDispatcher("/member/member_edit.jsp");
			dispatcher.forward(request, response);

			break;
		case "d":
			memberService = new MemberServiceImpl();
			String deleteId = request.getParameter("id");

			memberVO = new MemberVO();
			memberVO.setId(deleteId);

			memberService.delete(memberVO);
			dispatcher = request.getRequestDispatcher("/JoinController?sw=l");
			dispatcher.forward(request, response);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + sw);
		}
		// 이동방법1
//      response.sendRedirect(root + "/member/member_list.jsp");

		// 이동방법2 (SELECT 쿼리)
//      RequestDispatcher dispatcher = request.getRequestDispatcher("/member/member_list.jsp");
//      dispatcher.forward(request, response);
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