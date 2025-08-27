package com.javanauta.bffagendador.business.dto.in;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioDTORequest {

    private String nome;
    private String email;
    private String senha;
    private List<TelefoneDTORequest> telefone;
    private List<EnderecoDTORequest> endereco;
}
