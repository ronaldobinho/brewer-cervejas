package com.ronaldocarvalho.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ronaldocarvalho.brewer.controller.CervejasController;

@Configuration
@ComponentScan(basePackageClasses = {CervejasController.class})
public class WebConfig {

}
