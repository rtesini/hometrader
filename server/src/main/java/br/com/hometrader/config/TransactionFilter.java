package br.com.hometrader.config;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransactionFilter implements Filter {

	private Logger logger = Logger.getLogger(TransactionFilter.class.getCanonicalName());

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		logger.info("[START] Transaction filter");
		logger.info("[START] Transaction dev ? " + (System.getProperty("dev") != null));
		if(System.getProperty("dev")!= null){
			String clientOrigin = ((HttpServletRequest) request).getHeader("origin");
			logger.info("[START] Origin " + clientOrigin);
			((HttpServletResponse) response).setHeader("Access-Control-Allow-Origin", clientOrigin);
			((HttpServletResponse) response).setHeader("Access-Control-Allow-Methods", "POST");
			((HttpServletResponse) response).setHeader("Access-Control-Allow-Headers", "Content-Type");
			((HttpServletResponse) response).setHeader("Access-Control-Max-Age", "86400");
		}
		try {
			TransactionalContext.beginTransaction();
			chain.doFilter(request, response);
			if (TransactionalContext.isOpen()) {
				TransactionalContext.commitTransaction();
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
			rollback();
		} finally {
			if (TransactionalContext.isOpen()) {
				TransactionalContext.close();
			}
		}
	}
	
	public void rollback() {
		if (TransactionalContext.isOpen()) {
			TransactionalContext.rollbackTransaction();
		}
	}

	@Override
	public void destroy() {
	}

}
