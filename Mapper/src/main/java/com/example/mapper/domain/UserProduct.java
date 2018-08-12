package com.example.mapper.domain;

import javax.persistence.*;

@Entity
public class UserProduct {

    @EmbeddedId
    private UserProductId userProductId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("pid")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("uid")
    private User user;

}
