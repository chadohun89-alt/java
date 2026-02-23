package board;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);

	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		BoardService boardService = new BoardService();
		
		String uri = request.getRequestURI();  // /board/list.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		System.out.println(cmd);
		
		String view = null; // 실제 화면에 보여줄 페이지 명( board.jsp 등 )
		if(cmd.equals("list.do"))
			view = "/board.jsp";
		
		else if(cmd.equals("write.do")) // 글작성 페이지 요청
			view = "/boardWrite.jsp";
		
		else if(cmd.equals("detail.do")) // 상세페이지 요청
			view = "/boardDetail.jsp";
		
		else if(cmd.equals("save.do")) { // 글작성 저장 요청
			boardService.boardSave(request);
			view = "/board.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		
	
		
	}
	
}

// 서블릿을 통해 페이지 제공하는 방법
// 1. response객체의 sendRedirect로 직접 페이지 제공하기
// 2. forward를 통해 페이지 제공

// 게시판 목록		: /board/list.do -> borad.jsp
// 게시판 글작성	: /board/write.do -> boardWrite.jsp
// 게시판 상세페이지	: /board/detail.do - > boardDetail.jsp
