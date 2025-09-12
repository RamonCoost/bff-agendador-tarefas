package com.javanauta.bffagendador.business.dto.in;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginDTORequest {

    private String email;
    private String senha;
}
