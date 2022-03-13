package com.foodbox.foodbox.securityconfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.ContentType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException authException) throws IOException, ServletException {
        ApiResponse response = new ApiResponse(401, "Unauthorised");
        response.setMessage("Unauthorised");
        ObjectMapper om = new ObjectMapper();
        OutputStream out = res.getOutputStream();
        res.setContentType("applicaion/json");
        om.writeValue(out, response);
        out.flush();
    }
}
