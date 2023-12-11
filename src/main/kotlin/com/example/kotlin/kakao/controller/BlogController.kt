package com.example.kotlin.kakao.controller

import com.example.kotlin.kakao.dto.BlogDto
import com.example.kotlin.kakao.service.BlogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/blog")
@RestController
class BlogController (
    // 서비스 주입
    val blogService: BlogService
) {
    @GetMapping("")
    fun search(@RequestBody blogDto:BlogDto): String? {
        val result: String? = blogService.searchKakao(blogDto)
        return result
    }
}