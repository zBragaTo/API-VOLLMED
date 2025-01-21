package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        @NotNull
        String nome,
        @NotBlank
        @NotNull
        String email,
        @NotBlank
        @NotNull
        String cpf,
        @NotBlank
        @NotNull
        String telefone,
        @NotNull
        @Valid
        DadosEndereco endereco
) {
}
