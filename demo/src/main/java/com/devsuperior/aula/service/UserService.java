package com.devsuperior.aula.service;


import com.devsuperior.aula.dto.UserDTO;
import com.devsuperior.aula.entities.User;
import com.devsuperior.aula.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
