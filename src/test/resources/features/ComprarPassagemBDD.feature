# language: pt

Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

  Cenario: Comprar com Sucesso
    Dado que acesso o site "https://blazedemo.com/"
    Quando seleciono a origem "São Paolo" e destino "Cairo"
    E clico no botao Find Flights
    Entao visualiza a lista de voos

  Esquema do Cenario: Comprar com Sucesso DDT
    Dado que acesso o site "https://blazedemo.com/"
    Quando seleciono a <origem> e <destino>
    E clico no botao Find Flights
    Entao visualiza a lista de voos

    Exemplos:
      | origem      | destino  |
      | "São Paolo" | "Cairo"  |
      | "Boston"    | "London" |
      
# Quando houve um OU é melhor separar em 2 ou mais Cenario
 #   Cenario: Cadastro Cliente
 #       Dado que acesso a pagina de cadastro de cliente
 #       Entao escolho entre PF OU PJ
 #       E preencho os dados cadastrais
 #       Quando clico em Salvar
 #       Entao exibe a mensagem de Cadastrado com Sucesso!
 #   Cenario: Cadastro Cliente PF
 #       Dado que acesso a pagina de cadastro de cliente
 #       Entao escolho o tipo "PF"
 #       E preencho o Nome, CPF e data de nascimento
 #       E preencho o telefone e o email
 #       Quando clico em Salvar
 #       Entao exibe a mensagem de Cadastrado com Sucesso!
 #   Cenario: Cadastro Cliente PJ
 #       Dado que entro na pagina de cadastro do cliente
 #       Entao escolho entre "PJ"
 #       E preencho a Razao Social, CNPJ e a data de fundacao
 #       E preencho o telefone e o email
 #       Quando clico em Salvar
 #       Entao exibe a mensagem de Cadastrado com Sucesso!
 # Testes Negativos

  Esquema do Cenario: Login Positivo
    Dado que acesso a pagina de Login
    Quando preencho o <email> e a <senha>
    E clico no botao Login
    Entao exibe a mensagem de Login com Sucesso

    Exemplos:
      | email                   | senha     |
      | cliente@iterasys.com.br | Laranja25 |

  Esquema do Cenario: Login Negativo
    Dado que acesso a pagina de Login
    Quando preencho o <email> e a <senha>
    E clico no botao Login
    Entao exibe a mensagem de email ou senha incorretos

    Exemplos:
      | email                   | senha     |
      | cliente@iterasys.com.br | Laranja24 |
      | aluno@iterasys.com.br   | Laranja25 |
      | aluno@iterasys.com.br   | Laranja24 |

  Esquema do Cenario: Login
    Dado que acesso a pagina de Login
    Quando preencho o <email> e a <senha>
    E clico no botao Login
    Entao exibe a <mensagem>

    Exemplos:
      | email                   | senha     | tipo | mensagem                  |
      | cliente@iterasys.com.br | Laranja25 | P    | Login com Sucesso         |
      | cliente@iterasys.com.br | Laranja24 | N    | email ou senha incorretos |
      | aluno@iterasys.com.br   | Laranja25 | N    | email ou senha incorretos |
      | aluno@iterasys.com.br   | Laranja24 | N    | email ou senha incorretos |
