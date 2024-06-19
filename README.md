# BootcampBase2

Exercício - Automação de testes funcionais de interface (Web)

Automatize o caso de teste abaixo, projetado para a funcionalidade “Criar Tarefa” do sistema “Mantis”. Utilizar a linguagem de programação Java, a biblioteca Selenium WebDriver para manipular a interface, a biblioteca JUnit para orquestrar o testes e o browser Google Chrome. Sobre o Mantis: É uma ferramenta de rastreamento de problemas e bugs de software. É usada para reportar e monitorar defeitos de software, gerenciar projetos e colaborar entre equipes de desenvolvimento.

CT01 - Criar tarefa com sucesso preenchendo todos os campos do formulário. Pré condições:

    Usuário deverá ter permissão para criação de tarefas em um projeto Passos:
    Acessar o Mantis (https://mantis-prova.base2.com.br/)
    Efetuar login (usuario: grupoXX, senha 123456, onde XX é o número do seu grupo)
    Clicar em “Criar tarefa” no menu lateral
    Selecionar uma categoria
    Selecionar uma frequência
    Selecionar uma prioridade
    Preencher o campo “Resumo”
    Preencher o campo “Descrição”
    Preencher o campo “Passos para reproduzir”
    Preencher o campo “Informações adicionais”
    (Opcional) Inserir anexo em “Enviar arquivos”
    Clicar em “Criar nova tarefa”

Resultado esperado:

    O sistema deve exibir a mensagem “Operação realizada com sucesso.”
    A tarefa é criada com sucesso contendo todas as informações fornecidas no cadastro

