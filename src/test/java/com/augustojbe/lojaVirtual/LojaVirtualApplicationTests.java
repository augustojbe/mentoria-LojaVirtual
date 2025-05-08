package com.augustojbe.lojaVirtual;

import com.augustojbe.lojaVirtual.controller.AcessoControler;
import com.augustojbe.lojaVirtual.model.Acesso;
import com.augustojbe.lojaVirtual.repository.AcessoRepository;
import com.augustojbe.lojaVirtual.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualApplication.class)
public class LojaVirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoControler acessoControler;

//	@Autowired
//	private AcessoRepository acessoRepository;

	@Test
	void testCadastroAcesso() {
		Acesso acesso = new Acesso();

		acesso.setDescricao("ROLE_ADMIN");

		acessoControler.salvarAcesso(acesso);
	}

}
