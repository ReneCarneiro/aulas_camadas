package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.User;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDTO {

    private Long Id;
    private String name;

    public UserDTO(){

    }

    public UserDTO(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public UserDTO(User user) {
        Id = user.getId();
        name = user.getName();
    }
}
