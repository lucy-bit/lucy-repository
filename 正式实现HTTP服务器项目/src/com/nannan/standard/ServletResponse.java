package com.nannan.standard;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 16:29
 */
public interface ServletResponse {
    OutputStream getOutputStream() throws IOException;

    PrintWriter getWriter() throws IOException;

    void setContentType(String type);
}
