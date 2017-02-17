package com.example.persistence.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * User: eailes
 * Created: 1/16/17
 * Time: 6:15 PM
 * Project: micro_test
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class AbstractEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    @CreatedDate LocalDateTime createdDate;
    @LastModifiedDate LocalDateTime modifiedDate;
}
