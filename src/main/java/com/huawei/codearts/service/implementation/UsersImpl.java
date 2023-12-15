package com.huawei.codearts.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.huawei.codearts.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huawei.codearts.dto.UsersDTO;
import com.huawei.codearts.entity.Users;
import com.huawei.codearts.repository.UserRepository;
import com.huawei.codearts.service.interfaces.IUsersService;
import com.huawei.codearts.utils.MHelper;

/**
 * @author Luis Enrique Carranza - Huawei Cloud
 * 
 * Clase que implementa la interfaz del service.
 * 
 */

@Component
public class UsersImpl implements IUsersService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public List<UsersDTO> findAll() {
        List<UsersDTO> dto = new ArrayList<>();
        Iterable<Users> users = this.usersRepository.findAll();

        for (Users user : users) {
            UsersDTO usersDTO = MHelper.modelMapper().map(user, UsersDTO.class);
            dto.add(usersDTO);
        }
        return dto;
    }
    @Override
    public void save(UserRequest user) {
        Users users = MHelper.modelMapper().map(user, Users.class);
        this.usersRepository.save(users);
    }

    private UsersDTO convertToUsersDTO(final Users users){
        return MHelper.modelMapper().map(users, UsersDTO.class);
    }
}
