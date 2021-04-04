package com.nannan.standard.http;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 16:25
 */
import com.nannan.standard.Servlet;
import com.nannan.standard.ServletException;
import com.nannan.standard.ServletRequest;
import com.nannan.standard.ServletResponse;

import java.io.IOException;

public abstract class HttpServlet implements Servlet {
    @Override
    public void init() throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        if (req instanceof HttpServletRequest && resp instanceof HttpServletResponse) {
            HttpServletRequest httpReq = (HttpServletRequest)req;
            HttpServletResponse httpResp = (HttpServletResponse)resp;

            service(httpReq, httpResp);
        } else {
            throw new ServletException("不支持非 HTTP 协议");
        }
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equals("GET")) {
            doGet(req, resp);
        } else {
            resp.sendError(405);
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(405);
    }
}
