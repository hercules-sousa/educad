package br.edu.ifpb.educad.service;

import br.edu.ifpb.educad.dto.request.RegisterForm;
import br.edu.ifpb.educad.dto.response.table.UserResponse;

public interface UserService {

    UserResponse registerUser(RegisterForm registerForm);

}
