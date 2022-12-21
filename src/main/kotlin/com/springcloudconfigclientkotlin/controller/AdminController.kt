package com.springcloudconfigclientkotlin.controller

import com.springcloudconfigclientkotlin.config.Foo
import jakarta.annotation.PostConstruct
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.context.refresh.ContextRefresher
import org.springframework.cloud.endpoint.RefreshEndpoint
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.RequestEntity
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate


@RestController
@RefreshScope
class AdminController(val foo: Foo) {

    @GetMapping("/test")
    fun test(): String{
        return "Admin's username is ${foo.adminUserName}"
    }
}