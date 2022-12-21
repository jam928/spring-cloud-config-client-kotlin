package com.springcloudconfigclientkotlin.config

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.cloud.context.refresh.ContextRefresher
import org.springframework.cloud.endpoint.RefreshEndpoint
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView

@Component
class MinimalInterceptor(val contextRefresher: ContextRefresher) : HandlerInterceptor {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        // hit the refresh endpoint in the spring actuator to get hit the refresh scopes which retrieve latest configs from the spring cloud config server
        RefreshEndpoint(contextRefresher).refresh()
        return true
    }
}