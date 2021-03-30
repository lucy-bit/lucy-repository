package com.nannan.standard.http;

import com.nannan.standard.Servlet;
import com.nannan.standard.ServletException;
import com.nannan.standard.ServletRequest;
import com.nannan.standard.ServletResponse;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 16:40
 */
public abstract  class Httpservlet implements Servlet {
    @Override
    public void init() throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException {
        if (req instanceof HttpServletRequest && resp instanceof HttpServletResponse) {
            HttpServletRequest httpReq = (HttpServletRequest) req;
            HttpServletResponse httpResp = (HttpServletResponse) resp;

            service(httpReq, httpResp);
        } else {
            throw new ServletException("不支持非 HTTP 协议");
        }
    }
        //我们只实现 GET 方法
        protected void service(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException {
            if(req.getMethod().equals("GET")) {
                doGet(req,resp);
            }else {
                resp.sendError(405); // 405 ——不支持这种方法
            }
        }

        protected  void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
            resp.sendError(405); //默认是 405，子类可以重写 doGet方法实现自己的逻辑
        }
}
