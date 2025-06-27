# Sistema de Gerenciamento Doce Pimenta

Este repositório contém um projeto Java utilizado para cadastro de produtos, fornecedores e controle de estoque.
Ele foi criado no NetBeans 22 e utiliza o modelo Ant padrão gerado pelo IDE.

## Requisitos
- **JDK 21** ou superior
- **Apache Ant** (para compilação completa do projeto)
- Biblioteca `AbsoluteLayout` do NetBeans (necessária para compilar as telas)

Caso a biblioteca `AbsoluteLayout` não esteja disponível, é possível compilar apenas as classes DTO executando:

```bash
javac src/DTO/*.java
```

## Ajustes aplicados
- Todas as classes da pasta `DTO` agora implementam `Serializable` e possuem construtores
  padrão e parametrizado, além de um método `toString()` para facilitar o debug.
- O formulário `FrmCadastroProduto` foi atualizado para criar `CadProdutoDTO` utilizando
  o novo construtor parametrizado, reduzindo o uso de *setters*.
- Realizada revisão do ambiente de build. A compilação completa falha caso a biblioteca
  `AbsoluteLayout` não esteja instalada.

## Execução
Abra o projeto no NetBeans 22 ou superior para utilizar a interface gráfica. A partir do IDE é
possível compilar, executar e editar os formulários.
