# dslist
mini projeto com foco no back end da aplicação

O projeto consiste em uma lista de games, com funcionalidade de alterar a ordem com que ela é apresentada

Esta lista foi feita separando o FRONT-END do BACK-END, como representado no modelo abaixo:
![01 - Sistema Web](https://github.com/eduardodev-1/dslist/assets/122590889/4074e37e-fa3a-49ce-8701-3c1ad24e9da6)

A comunicação do FRONT com o BACK é feita por meio de API REST como no exemplo:
![02 - requisição API REST](https://github.com/eduardodev-1/dslist/assets/122590889/ee00b726-2b3f-4437-b922-93e9b9db1a61)

O back-end foi desenvolvido por meio de padrão de camadas, no modelo estão arquivos que fazem parte das respectivas camadas:
![03 - Padrao de camadas do projeto](https://github.com/eduardodev-1/dslist/assets/122590889/17e3d025-1b7f-46b5-8ca7-e4ae5d410b93)

O que foi aplicado até o commit "Game repository, service, controller"
![04 - Revisão](https://github.com/eduardodev-1/dslist/assets/122590889/89e1dc44-6774-40d5-b4f9-c04d66faea79)

MODELO DE OBJETOS
Game é a lista de games
Game list é o tipo de lista (neste projeto possui 2 tipos de lista, lista de jogos plataforma e lista de jogos RPG)
Belonging é o OBJETO intermediário, que indica a posição que os games são mostrados, podendo ser alterada durante a aplicação:
![05 - Modelo de domínio DSlist](https://github.com/eduardodev-1/dslist/assets/122590889/88912bda-3006-4ed3-88e9-2fb2070f8262)

![06 - Belonging](https://github.com/eduardodev-1/dslist/assets/122590889/7a63ab12-8009-419c-91be-a1f4a63b6515)

representação do modelo de domínio em uma tabela relacional
![07 - tabela relacional do modelo de domínio](https://github.com/eduardodev-1/dslist/assets/122590889/4cde6e15-6860-43e4-8468-12e11de7f58c)

O que foi aplicado até o commit "Projection created, GameRepository Update"
- Implementado modelo de domínio
- Atualizado seed da base de dados
- GameDTO, busca game por id
- Busca totas listas em /lists
- Consulta SQL, projection, busca de games
por lista
