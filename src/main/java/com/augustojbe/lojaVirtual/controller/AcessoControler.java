package com.augustojbe.lojaVirtual.controller;

import com.augustojbe.lojaVirtual.model.Acesso;
import com.augustojbe.lojaVirtual.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/salvar")
public class AcessoControler {

    @Autowired
    private AcessoService acessoService;

    @PostMapping("/acesso")
    public Acesso salvarAcesso(Acesso acesso){
        return acessoService.save(acesso);
    }

}
