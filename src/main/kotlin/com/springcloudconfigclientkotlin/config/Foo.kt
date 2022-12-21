package com.springcloudconfigclientkotlin.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
@RefreshScope
class Foo {
    @Value("\${adminusername}")
    var adminUserName: String? = null

    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}