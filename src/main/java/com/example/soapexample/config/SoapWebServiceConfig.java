package com.example.soapexample.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,
                "/api/users/soap/*",
                "/api/movies/soap/*", "/api/reviews/soap/*", "/api/rate/soap/*");
    }

    @Bean
    public XsdSchema userSchema() {
        return new SimpleXsdSchema(new ClassPathResource("soap/user.xsd"));
    }

    @Bean(name = "users")
    public DefaultWsdl11Definition userWsdl11Definition(XsdSchema userSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(userSchema);
        definition.setLocationUri("/api/users/soap");
        definition.setPortTypeName("UserServicePort");
        definition.setTargetNamespace("http://example.com.soapexample/soap");

        return definition;
    }

    @Bean
    public XsdSchema movieSchema() {
        return new SimpleXsdSchema(new ClassPathResource("soap/movie.xsd"));
    }

    @Bean(name = "movies")
    public DefaultWsdl11Definition incidentWsdl11Definition(XsdSchema movieSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(movieSchema);
        definition.setLocationUri("/api/movies/soap");
        definition.setPortTypeName("MovieServicePort");
        definition.setTargetNamespace("http://example.com.soapexample/soap");
        return definition;
    }

    @Bean
    XsdSchema reviewSchema(){
        return new SimpleXsdSchema(new ClassPathResource("soap/review.xsd"));
    }

    @Bean(name = "reviews")
    public DefaultWsdl11Definition marketWsdl11Definition(XsdSchema reviewSchema){

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(reviewSchema);
        definition.setLocationUri("/api/reviews/soap");
        definition.setPortTypeName("ReviewServicePort");
        definition.setTargetNamespace("http://example.com.soapexample/soap");

        return definition;
    }


    @Bean
    XsdSchema rateSchema(){
        return new SimpleXsdSchema(new ClassPathResource("soap/rate.xsd"));
    }

    @Bean(name = "rates")
    public DefaultWsdl11Definition rateWsdl11Definition(XsdSchema rateSchema){

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(rateSchema);
        definition.setLocationUri("/api/rates/soap");
        definition.setPortTypeName("RateServicePort");
        definition.setTargetNamespace("http://example.com.soapexample/soap");

        return definition;
    }
}
