package com.javanauta.bffagendador.business.dto.out;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioDTOResponse {

    private String nome;
    private String email;
    private String senha;
    private List<TelefoneDTOResponse> telefone;
    private List<EnderecoDTOResponse> endereco;
}
