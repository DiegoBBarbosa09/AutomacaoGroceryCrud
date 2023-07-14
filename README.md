# AutomacaoGroceryCrud
Este projeto demonstra a implementação de testes automatizados utilizando Selenium WebDriver, Cucumber e Junit. A automação é realizada para preenchimento de campos, validação e geração de evidências utilizando o plugin AShot no arquivo pom.xml.

Pré-requisitos
Certifique-se de ter os seguintes componentes instalados em sua máquina:

- **Java Development Kit (JDK)**
- **Eclipse IDE** em um projeto MAVEN(ou qualquer outra IDE de sua preferência)

Certifique-se de ter a seguinte configuração no pom.xml:
- **Selenium WebDriver**
- **Cucumber**
- **AShot** (Para gerar Evidencias)

#### Configuração do Projeto
Clone este repositório para o seu ambiente local.
Abra o Eclipse IDE (ou a IDE de sua preferência) e importe o projeto como um projeto Maven existente.
Certifique-se de que as dependências do Maven tenham sido baixadas corretamente.
Verifique se o driver do Selenium WebDriver correspondente ao navegador que deseja automatizar está configurado corretamente. Caso contrário, baixe o driver adequado e configure o seu caminho no projeto.

#### Estrutura do Projeto
Aqui está a estrutura atualizada com as pastas de conexões, elementos, métodos, pages, runner e steps:
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── example
│   │   │   │       ├── connections
│   │   │   │       │   └── ...
│   │   │   │       ├── elements
│   │   │   │       │   └── ...
│   │   │   │       ├── methods
│   │   │   │       │   └── ...
│   │   │   │       ├── pages
│   │   │   │       │   └── ...
│   │   │   │       ├── runner
│   │   │   │       │   └── ...
│   │   │   │       └── steps
│   │   │   │           └── ...
│   │   └── resources
│   │       ├── features
│   │       │   └── ...
│   │       └── config
│   │           └── ...
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── runner
│                       └── ...
├── pom.xml
└── README.md
```

**src/main/java/com/example/conexoes:** Contém as classes relacionadas às conexões com o banco de dados ou serviços externos, se necessário.

**src/main/java/com/example/elementos:** Contém as classes que representam os elementos da página, onde são mapeados os locators e as ações básicas.

**src/main/java/com/example/metodos:** Contém classes com métodos auxiliares que podem ser usados nos testes automatizados.

**src/main/java/com/example/pages:** Contém as classes relacionadas às páginas da web, onde os elementos são agrupados e as ações são definidas.

**src/main/java/com/example/runner:** Contém as classes de execução dos testes do Cucumber.

**src/main/java/com/example/steps:** Contém as classes com os passos de teste definidos usando a sintaxe Gherkin do Cucumber.

Essa estrutura permite uma melhor organização dos componentes do projeto, facilitando a manutenção e a escalabilidade dos testes automatizados. Certifique-se de ajustar o código-fonte em conformidade com as alterações da estrutura.

#### Executando os Testes
Navegue até a classe de execução do teste localizada em src/test/java/com/example/runner.
Execute a classe como um teste JUnit para iniciar a execução dos testes automatizados.

Após a execução dos testes, as evidências serão geradas e armazenadas no diretório especificado no projeto. Verifique o código relevante nos arquivos Java para saber mais detalhes sobre como as evidências são capturadas e salvas.

Conclusão
Este projeto demonstra uma automação de testes básica usando Selenium WebDriver, Cucumber e Maven. Você pode expandir o projeto adicionando mais cenários de teste, aprimorando as classes de páginas, etc.
        
