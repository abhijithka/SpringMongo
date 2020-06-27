package com.abhijith.cricket.players;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class Player {

    @Id
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String country;
}
