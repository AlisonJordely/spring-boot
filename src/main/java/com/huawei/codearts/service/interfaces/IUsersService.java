package com.huawei.codearts.service.interfaces;

import java.util.List;

import com.huawei.codearts.dto.UserRequest;
import org.springframework.stereotype.Service;
import com.huawei.codearts.dto.UsersDTO;

/**
 * @author: Luis Enrique Carranza - Huawei Cloud
 */

@Service
public interface IUsersService {
    List<UsersDTO> findAll();

    void save(UserRequest user);
}
