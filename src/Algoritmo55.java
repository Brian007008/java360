import javax.swing.JOptionPane;

public class Algoritmo55 {

    private static GuardarAmbientes gerenciador = new GuardarAmbientes();

    public static void main(String[] args) {
        int opcao = 0;

        // Loop do-while para navegação no menu
        do {
            try {
                String menu = "=== DICIONÁRIO DE AMBIENTES ===\n"
                        + "1. Cadastrar Ambiente\n"
                        + "2. Listar Ambientes\n"
                        + "3. Pesquisar Ambiente\n"
                        + "4. Alterar Ambiente\n"
                        + "5. Excluir Ambiente\n"
                        + "6. Sair\n\n"
                        + "Digite a opção desejada:";

                String entrada = JOptionPane.showInputDialog(null, menu, "Agenda de Ambientes",
                        JOptionPane.QUESTION_MESSAGE);

                if (entrada == null) {
                    opcao = 6;
                } else {
                    opcao = Integer.parseInt(entrada);
                }

                switch (opcao) {
                    case 1:
                        opcaoCadastrar();
                        break;
                    case 2:
                        opcaoListar();
                        break;
                    case 3:
                        opcaoPesquisar();
                        break;
                    case 4:
                        opcaoAlterar();
                        break;
                    case 5:
                        opcaoExcluir();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Encerrando o programa...", "Sair",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 1 e 6.", "Aviso",
                                JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!", "Erro de Entrada",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 6);
    }

    private static void opcaoCadastrar() {
        String chave = JOptionPane.showInputDialog(null, "Informe a chave do ambiente (ex: F07, B03):", "Cadastrar",
                JOptionPane.QUESTION_MESSAGE);
        if (chave != null && !chave.trim().isEmpty()) {

            if (gerenciador.pesquisar(chave) != null) {
                JOptionPane.showMessageDialog(null,
                        "A chave '" + chave.toUpperCase() + "' já existe! Use a opção de Alterar.", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            String descricao = JOptionPane.showInputDialog(null, "Informe a descrição do ambiente:", "Cadastrar",
                    JOptionPane.QUESTION_MESSAGE);
            if (descricao != null && !descricao.trim().isEmpty()) {
                gerenciador.cadastrar(chave, descricao);
                JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void opcaoListar() {
        String lista = gerenciador.listarTodos();
        JOptionPane.showMessageDialog(null, lista, "Lista de Ambientes", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void opcaoPesquisar() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente para pesquisar:", "Pesquisar",
                JOptionPane.QUESTION_MESSAGE);
        if (chave != null && !chave.trim().isEmpty()) {
            String resultado = gerenciador.pesquisar(chave);
            if (resultado != null) {
                JOptionPane.showMessageDialog(null, "Chave: " + chave.toUpperCase() + "\nDescrição: " + resultado,
                        "Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ambiente não encontrado para a chave: " + chave.toUpperCase(),
                        "Não Encontrado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private static void opcaoAlterar() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente que deseja alterar:", "Alterar",
                JOptionPane.QUESTION_MESSAGE);
        if (chave != null && !chave.trim().isEmpty()) {
            if (gerenciador.pesquisar(chave) == null) {
                JOptionPane.showMessageDialog(null, "Chave não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novaDescricao = JOptionPane.showInputDialog(null, "Digite a nova descrição para o ambiente:",
                    "Alterar", JOptionPane.QUESTION_MESSAGE);
            if (novaDescricao != null && !novaDescricao.trim().isEmpty()) {
                gerenciador.alterar(chave, novaDescricao);
                JOptionPane.showMessageDialog(null, "Ambiente alterado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void opcaoExcluir() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente que deseja excluir:", "Excluir",
                JOptionPane.QUESTION_MESSAGE);
        if (chave != null && !chave.trim().isEmpty()) {
            boolean excluiu = gerenciador.excluir(chave);
            if (excluiu) {
                JOptionPane.showMessageDialog(null, "Ambiente removido com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ambiente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}