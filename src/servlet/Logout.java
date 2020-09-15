package servlet; 
	 
	import java.io.IOException; 
	 
	import javax.servlet.RequestDispatcher; 
	import javax.servlet.ServletException; 
	import javax.servlet.annotation.WebServlet; 
	import javax.servlet.http.HttpServlet; 
	import javax.servlet.http.HttpServletRequest; 
	import javax.servlet.http.HttpServletResponse; 
	 
	//ログアウトリクエストを処理する 
	@WebServlet("/logout") 
	public class Logout extends HttpServlet { 
	   private static final long serialVersionUID = 1L; 
	 
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	       //セッションを破棄 
	       request.getSession().invalidate(); 
	 
	       //メインページにリダイレクト 
	       //ログインページでブラウザの「戻る」ボタンを押される対策 
	       //一度ログインしていない状態でメインページにアクセスし、ログインページにリダイレクトさせる。 
	       response.sendRedirect("/ActionLoggerSample/"); 
	   } 
	} 
