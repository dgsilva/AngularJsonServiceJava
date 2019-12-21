package filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

 
@WebFilter(asyncSupported = true, urlPatterns = { "/*" })
public class CorsFilter implements Filter {
 
    public CorsFilter() {
    }

	 
	public void destroy() {
	}
 
	//Client e Server
	//Angular após CorsFilter pode vir consumir o Serviço ...
 	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) resp;
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST,GET");
		response.addHeader("Access-Control-Allow-Headers", "Content-Type");
		response.addHeader("allow", "POST,PUT,DELETE,GET,OPTIONS");
		chain.doFilter(req, response);

	}

 
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
