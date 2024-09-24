package com.eazybytes.accounts.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    @Column(updatable = false)
    //odnt update the column everytime; omly insert once
    private LocalDateTime createdAt;

    @Column(insertable = false)
    //dont' insert; only update
    private LocalDateTime updatedAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private String updatedBy;
}
