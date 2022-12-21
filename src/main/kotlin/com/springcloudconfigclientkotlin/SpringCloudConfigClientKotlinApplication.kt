package com.springcloudconfigclientkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class SpringCloudConfigClientKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigClientKotlinApplication>(*args)
}
