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

public class TransactionFilter implements Filter {

	private Logger logger = Logger.getLogger(TransactionFilter.class.getCanonicalName());

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		logger.info("[START] Transaction filter");
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
