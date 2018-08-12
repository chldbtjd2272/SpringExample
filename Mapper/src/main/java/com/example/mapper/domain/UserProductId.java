package com.example.mapper.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserProductId implements Serializable {

    @Column(name = "pid")
    private Long pid;

    @Column(name = "uid")
    private Long uid;
}
