package xyz.italo.bngl.sdd.plugin.sdd

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SddApplication>().with(TestcontainersConfiguration::class).run(*args)
}
