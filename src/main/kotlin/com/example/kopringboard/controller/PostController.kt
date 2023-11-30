package com.example.kopringboard.controller

import com.example.kopringboard.controller.dto.PostCreateRequest
import com.example.kopringboard.controller.dto.PostDetailResponse
import com.example.kopringboard.controller.dto.PostSearchRequest
import com.example.kopringboard.controller.dto.PostSummaryResponse
import com.example.kopringboard.controller.dto.PostUpdateRequest
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class PostController {

    @PostMapping("/posts")
    fun createPost(
        @RequestBody request: PostCreateRequest,
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePost(
        @PathVariable id: Long,
        @RequestBody request: PostUpdateRequest,
    ): Long {
        return 1L
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(
        @PathVariable id: Long,
        @RequestParam createdBy: String,
    ): Long {
        return id
    }

    @GetMapping("/posts/{id}")
    fun getPost(
        @PathVariable id: Long,
    ): PostDetailResponse {
        return PostDetailResponse(
            id = id,
            title = "title",
            content = "content",
            createdBy = "createdBy",
            createdAt = LocalDateTime.now().toString()
        )
    }

    @GetMapping("/posts")
    fun getPosts(
        pageable: Pageable,
        request: PostSearchRequest,
    ): Page<PostSummaryResponse> {
        return Page.empty(pageable)
    }
}
