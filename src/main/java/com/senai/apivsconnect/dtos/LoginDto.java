package com.senai.apivsconnect.dtos;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;


public record LoginDto(
        @NotBlank @Email String email,

        @NotBlank String senha
) {}


