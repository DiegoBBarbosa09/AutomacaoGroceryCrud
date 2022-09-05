#language:pt

@AdicionarUsuario
Funcionalidade: Adicionar usuario
Como usuario final Quero adicionar um novo usuario Para ter acessar ao sistema

@testePositivo
 Cenario: Adicionar um novo usuario
 		Dado que esteja com bootstrap v4
 		E acione add custumer
 		Quando salvar o formulario
 		Entao validar mensagem  de sucesso
