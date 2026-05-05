# Relatório da Atividade: Pesquisa e Projeto Prático em Kotlin Android

## Conceitos Pesquisados

### 1. Bottom Navigation
O **Bottom Navigation** é um componente de interface do usuário que exibe uma barra na parte inferior da tela, contendo de três a cinco destinos principais. Ele serve para facilitar a navegação rápida entre as seções mais importantes de um aplicativo com apenas um toque, permitindo que o usuário alterne contextos sem perder o fluxo da aplicação.

### 2. Classe de Dados em Kotlin (`data class`)
Uma **data class** em Kotlin é uma classe cujo propósito principal é armazenar dados. Ao declarar uma classe como `data`, o compilador gera automaticamente métodos úteis como `equals()`, `hashCode()`, `toString()` e `copy()`. Isso facilita muito a criação de objetos que representam informações, reduzindo o código repetitivo ("boilerplate").

### 3. Entidade
No contexto Android, uma **Entidade** representa um objeto do mundo real ou um conceito do sistema que possui dados persistentes. Geralmente, o termo é usado em conjunto com bancos de dados (como o Room), onde cada instância da entidade corresponde a uma linha em uma tabela do banco de dados. No nosso app, a entidade será a `Tarefa`.

### 4. RecyclerView
O **RecyclerView** é um componente avançado para exibição de grandes conjuntos de dados em forma de lista ou grade. Ele é eficiente porque "recicla" as visualizações dos itens que saíram da tela para exibir os novos itens que estão entrando, economizando memória e processamento. Ele funciona através da tríade:
- **Lista**: Os dados em si.
- **Adapter**: O "garçom" que liga os dados ao layout.
- **ViewHolder**: O "recipiente" que segura as referências visuais de cada item.

### 5. Fragment
Um **Fragment** representa uma porção reutilizável da interface do usuário dentro de uma Activity. Eles permitem organizar as telas do aplicativo de forma modular, facilitando a adaptação para diferentes tamanhos de tela (como tablets) e permitindo a troca dinâmica de partes da interface sem precisar mudar de Activity.

### 6. Ciclo de Vida
O **Ciclo de Vida** de uma Activity ou Fragment é o conjunto de estados pelos quais o componente passa desde sua criação até sua destruição. Os principais métodos são:
- `onCreate()`: Chamado quando o componente é criado.
- `onStart()`: Quando se torna visível.
- `onResume()`: Quando o usuário pode interagir com ele.
- `onPause()`: Quando perde o foco (ex: sobreposição).
- `onStop()`: Quando não está mais visível.
- `onDestroy()`: Antes de ser removido da memória.

---

## Detalhes do Projeto: To Do List
O projeto consiste em um gerenciador de tarefas simples:
- **TasksFragment**: Lista as tarefas usando um `RecyclerView`.
- **InfoFragment**: Exibe informações sobre o projeto.
- **Bottom Navigation**: Alterna entre a lista de tarefas e a tela de informações.
- **Tarefa**: `data class` que serve como entidade do sistema.
- **Logs de Ciclo de Vida**: Implementados na `MainActivity` para demonstrar as transições de estado no Logcat.
