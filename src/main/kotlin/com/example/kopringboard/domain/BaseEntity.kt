package com.example.kopringboard.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass // 해당 어노테이션을 쓰면 상속받는 클래스 내부에서 BaseEntity 프로퍼티들을 갖는다.
abstract class BaseEntity(
    createdBy: String,
) {
    val createdBy: String = createdBy
    val createdAt: LocalDateTime = LocalDateTime.now()
    var updateBy: String? = null
        protected set
    var updatedAt: LocalDateTime? = null
        protected set

    fun update(updateBy: String) {
        this.updateBy = updateBy
        this.updatedAt = LocalDateTime.now()
    }
}
