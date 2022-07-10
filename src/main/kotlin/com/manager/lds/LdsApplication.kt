package com.manager.lds

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import javax.persistence.Entity

@SpringBootApplication
class LdsApplication

fun main(args: Array<String>) {
	runApplication<LdsApplication>(*args)
}
