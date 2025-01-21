package med.voll.api.domain.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import med.voll.api.domain.endereco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded
    private Endereco endereco;

    private boolean ativo;

    public Paciente(DadosCadastroPaciente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }

    public void excluir(){
        this.ativo = false;
    }
}
