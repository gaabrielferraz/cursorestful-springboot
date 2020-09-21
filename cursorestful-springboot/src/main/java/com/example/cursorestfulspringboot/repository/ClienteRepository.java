package com.example.cursorestfulspringboot.repository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import com.example.cursorestfulspringboot.model.Cliente;
import org.springframework.stereotype.Component;


@Component
public class ClienteRepository {

    public List<Cliente> clientes;

    @PostConstruct
    public void init() {
        final Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Jose");
        c1.setEndereco("Rua X, 99");
        c1.setSaldo(202.0);

        final Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Maria");
        c2.setEndereco("Rua Y, 59");
        c2.setSaldo(444.0);

        final Cliente c3 = new Cliente();
        c3.setId(3);
        c3.setNome("Fernanda");
        c3.setEndereco("Rua W, 33");
        c3.setSaldo(332.0);

        clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
    }

    public List<Cliente> getAllClientes(){
        return clientes;
    }}

