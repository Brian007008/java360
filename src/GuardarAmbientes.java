import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuardarAmbientes {

    // Interface Map e implementação HashMap
    private Map<String, String> ambientes = new HashMap<>();

    // Formatação de data e hora
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final String CAMINHO_ARQUIVO = "ambientes.txt";

    public GuardarAmbientes() {
        // 1. Carrega dados salvos anteriormente no arquivo .txt
        carregarDoArquivo();

        // 2. Carga inicial padrão (caso o arquivo esteja vazio)
        if (ambientes.isEmpty()) {
            ambientes.put("F07", "Laboratório de Programação Java");
            ambientes.put("B03", "Sala de aula padrão");
            ambientes.put("G09", "Oficina de Lanternagem e pintura");
            salvarNoArquivo();
        }
    }

    // Retorna a data e hora formatada
    private String getObterDataHoraAtual() {
        return LocalDateTime.now().format(formatador);
    }

    // Cadastra um novo ambiente
    public void cadastrar(String chave, String descricao) {
        String dataHora = getObterDataHoraAtual();
        String valorCompleto = descricao + " (Cadastrado em: " + dataHora + ")";

        ambientes.put(chave.toUpperCase(), valorCompleto);
        salvarNoArquivo();
    }

    // Altera um ambiente existente
    public boolean alterar(String chave, String novaDescricao) {
        chave = chave.toUpperCase();
        if (ambientes.containsKey(chave)) {
            String dataHora = getObterDataHoraAtual();
            String valorCompleto = novaDescricao + " (Alterado em: " + dataHora + ")";

            ambientes.put(chave, valorCompleto);
            salvarNoArquivo();
            return true;
        }
        return false;
    }

    // Pesquisa ambiente pela chave
    public String pesquisar(String chave) {
        return ambientes.get(chave.toUpperCase());
    }

    // Exclui ambiente pela chave
    public boolean excluir(String chave) {
        chave = chave.toUpperCase();
        if (ambientes.containsKey(chave)) {
            ambientes.remove(chave);
            salvarNoArquivo();
            return true;
        }
        return false;
    }

    // Retorna a lista formatada de todos os ambientes
    public String listarTodos() {
        if (ambientes.isEmpty()) {
            return "Nenhum ambiente cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--- LISTA DE AMBIENTES ---\n\n");
        for (Map.Entry<String, String> entry : ambientes.entrySet()) {
            sb.append("Chave: ").append(entry.getKey())
                    .append(" | ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    // Grava as alterações no arquivo .txt usando FileWriter e try/catch/finally
    private void salvarNoArquivo() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(CAMINHO_ARQUIVO, false);
            for (Map.Entry<String, String> entry : ambientes.entrySet()) {
                writer.write(entry.getKey() + ";" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar o arquivo: " + e.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    // Carrega do arquivo .txt
    private void carregarDoArquivo() {
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (!arquivo.exists()) {
            return;
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    ambientes.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}