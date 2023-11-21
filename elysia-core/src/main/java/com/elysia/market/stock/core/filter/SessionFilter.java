package com.elysia.market.stock.core.filter;//package com.elysia.core.filter;
//
//import com.elysia.core.filter.wrapper.XssHttpServletRequestWrapper;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//public class SessionFilter implements Filter {
//    // 配置信息对象
//    public FilterConfig config;
//
//    /**
//     * 初始化
//     * 与我们编写的Servlet程序一样，Filter的创建和销毁由WEB服务器负责。
//     * Web应用程序启动时，Web服务器将创建Filter的实例对象，并调用其init方法，读取web.xml配置，
//     * 完成对象的初始化功能，从而为后续的用户请求作好拦截的准备工作。
//     * Filter对象只会创建一次，init方法也只会执行一次。
//     * 开发人员通过init方法的参数，可获得代表当前Filter配置信息的FilterConfig对象。
//     */
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        config = filterConfig;
//    }
//
//    /**
//     * 拦截请求
//     * 这个方法完成实际的过滤操作。当客户请求访问与过滤器关联的URL的时候，Servlet过滤器将先执行doFilter方法。
//     * FilterChain参数用于访问后续过滤器。
//     */
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        String enctype = httpRequest.getContentType();
//        if (StringUtils.isNotBlank(enctype) && enctype.contains("multipart/form-data")) {
//            // 上传文件
//            CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(httpRequest.getSession().getServletContext());
//            MultipartHttpServletRequest multipartRequest = commonsMultipartResolver.resolveMultipart(httpRequest);
//            XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(multipartRequest);
//            chain.doFilter(xssRequest, response);
//        } else {
//            // 普通表单和Ajax
//            XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper((HttpServletRequest) request);
//            chain.doFilter(xssRequest, response);
//        }
//    }
//
//    /**
//     * 销毁
//     * Filter对象创建后会驻留在内存，当Web应用移除或服务器停止时才销毁。在Web容器卸载Filter对象之前被调用。
//     * 该方法在Filter的生命周期中仅执行一次。在这个方法中，可以释放过滤器使用的资源。
//     */
//    @Override
//    public void destroy() {
//        this.config = null;
//    }
//}
