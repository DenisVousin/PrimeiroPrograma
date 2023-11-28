import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        // Obtém o Toolkit padrão
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtém a dimensão da tela
        Dimension dimensao = toolkit.getScreenSize();

        // Obtém a largura e altura da tela
        int largura = (int) dimensao.getWidth();
        int altura = (int) dimensao.getHeight();

        System.out.println("Resolução da Tela:");
        System.out.println("Largura: " + largura + " pixels");
        System.out.println("Altura: " + altura + " pixels");
    }
}