package com.augustojbe.lojaVirtual.service;

import com.augustojbe.lojaVirtual.model.Acesso;
import com.augustojbe.lojaVirtual.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {


    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso){

       return acessoRepository.save(acesso);


    }





}
