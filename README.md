# Execução

- O projeto usa gradle e a versão 21 do jdk.
- Para rodar o projeto basta executar `./gradlew run --console-plain`, ou `gradlew.bat run --console-plain` caso esteja no windows, no terminal de sua escolha (o argumento `--console-plain` serve para remover a barra de progresso que o gradle renderiza no terminal, que atrapalha a interação com o aplicativo).

# Uso

O projeto usa uma éspecie de "REPL" (Read-Evaluate-Print-Loop), onde um menu com todas as funcionalidades disponíveis está sempre presente na tela. Menus podem conter submenus, que liberam funcionalidades novas.

Exemplo de uma sessão:

```
❯ ./gradlew run --console=plain
> Task :app:compileJava UP-TO-DATE
> Task :app:processResources NO-SOURCE
> Task :app:classes UP-TO-DATE

> Task :app:run

Escolha uma função:
> 1 - Gerenciar solicitações
> 2 - Gerenciar atendimentos
> 3 - Sair

> 1

Escolha uma função:
> 1 - Consultar solicitações
> 2 - Criar nova solicitação
> 3 - Finalizar solicitação mais recente
> 4 - Voltar

> 1
REQ001 | Instalação de software | 2024-08-20 10:30
REQ002 | Manutenção preventiva | 2024-08-20 11:00
REQ003 | Atualização de sistema | 2024-08-20 11:30
REQ004 | Suporte técnico | 2024-08-20 12:00
REQ005 | Troca de equipamento | 2024-08-20 12:30
REQ006 | Consulta de garantia | 2024-08-20 13:00
REQ007 | Reparo de impressora | 2024-08-20 13:30
REQ008 | Configuração de rede | 2024-08-20 14:00
REQ009 | Restauração de dados | 2024-08-20 14:30
REQ010 | Consulta técnica | 2024-08-20 15:00

Escolha uma função:
> 1 - Consultar solicitações
> 2 - Criar nova solicitação
> 3 - Finalizar solicitação mais recente
> 4 - Voltar

> 4

Escolha uma função:
> 1 - Gerenciar solicitações
> 2 - Gerenciar atendimentos
> 3 - Sair

> 3

BUILD SUCCESSFUL in 17s
2 actionable tasks: 1 executed, 1 up-to-date
```

# Estrutura

- Na pasta `app/src/main/java/org/puc/` estão localizados todos os arquivos de código relevantes.
- A função main se encontra no arquivo `App.java`, dentro do diretório mencionado acima.

# Implementação

- ## Fila
  - Se encontra no arquivo `Queue.java`.
  - Implementada como uma lista encadeada com somente dois membros, `head` e `tail`, como descrito no "template" da tarefa.
- ## Pilha
  - Se encontra no arquivo `Stack.java`.
  - Implementada como uma lista encadeada com somente um único membro, `top`, como descrito no "template" da tarefa.
  - A limitação de uma implementação com um único membro nos forçou a usar um loop para encontrar o último elemento na função de inserção, que poderia ser substituído por uma variável apontando para o fim da pilha.
