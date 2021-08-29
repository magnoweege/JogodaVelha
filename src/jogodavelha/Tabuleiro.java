package jogodavelha;

import javax.swing.JOptionPane;

public class Tabuleiro {

    // Inicializa os atributos utilizando encapsulamento:
    private int[][] jogo = new int[3][3]; // inicia matriz de inteiros fixa 
    private boolean jogador1ativo = true; //seta jogador1 ou X como primeiro a jogar
    private boolean jogador2ativo = false; //seta jogador2 ou O como primeiro a jogar
    private int jogada = 1; //Contador de jogada para mpate na jogada 9
    private int vitoriasX = 0;
    private int vitoriasO = 0;
    private int empates = 0;
    
    public Tabuleiro() { //Construtor

        this.jogo = jogo;
        this.jogador1ativo = jogador1ativo;
        this.jogador2ativo = jogador2ativo;
        this.jogada = jogada;
        this.vitoriasX = vitoriasX;
        this.vitoriasO = vitoriasO;
        this.empates = empates;
    }
    
        
    //metodos get e set
    public int[][] getJogo() {
        return jogo;
    }

    public void setJogo(int[][] jogo) {
        this.jogo = jogo;
    }

    public boolean isJogador1ativo() {
        return jogador1ativo;
    }

    public void setJogador1ativo(boolean jogador1ativo) {
        this.jogador1ativo = jogador1ativo;
    }

    public boolean isJogador2ativo() {
        return jogador2ativo;
    }

    public void setJogador2ativo(boolean jogador2ativo) {
        this.jogador2ativo = jogador2ativo;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public int getVitoriasX() {
        return vitoriasX;
    }

    public void setVitoriasX(int vitoriasX) {
        this.vitoriasX = vitoriasX;
    }

    public int getVitoriasO() {
        return vitoriasO;
    }

    public void setVitoriasO(int vitoriasO) {
        this.vitoriasO = vitoriasO;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public String preenche(String a, int l, int c) {
        //Verifica matriz para retornar jogador o valor a preencher na matriz X ou O
        if (jogador1ativo == true) { //se jogador 1 é true continue
            if (a.equals("")) { //se o jbutton está vazio continue
                jogo[l][c] = -1; //matriz recebe o valor de -1 para X
                jogadorAtivo(); //inverte jogador para O caso X seja verdadeiro!
                return ("X"); //retorna valor para jbutton
            }
        } else {
            if (jogador2ativo == true) {
                if (a.equals("")) {

                    jogo[l][c] = 1;
                    jogadorAtivo();//inverte jogador para X caso O seja verdadeiro!
                    return ("O");

                }
            }
        }
        return ("");//caso contrario nao faça nada
    }

    private void jogadorAtivo() { //alterna enre as jogadas dos jogadores e soma uma jogada

        if (jogador1ativo == true) {
            jogador1ativo = false;
            jogador2ativo = true;
        } else {
            jogador1ativo = true;
            jogador2ativo = false;
        }
        jogada++; //incrementa a jogada para empate

    }

    private void zerajogo() {  //reinicia a matriz e variaveis para nova jogada
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[i].length; j++) {
                jogo[i][j] = 0;
            }
        }
        //reinicia atributos da joagada
        jogada = 1;
        jogador1ativo = true;
        jogador2ativo = false;
    }

    public boolean verificarvitoria() {
        //checa linhas
        for (int linha = 0; linha < jogo.length; linha++) {
            if ((jogo[linha][0] + jogo[linha][1] + jogo[linha][2]) == -3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador X ganhou!");
                vitoriasX++;
                zerajogo();
                return true;
            }
            if ((jogo[linha][0] + jogo[linha][1] + jogo[linha][2]) == 3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador O ganhou!");
                vitoriasO++;
                zerajogo();
                return true;
            }
        }
        //checa colunas
        for (int coluna = 0; coluna < jogo.length; coluna++) {

            if ((jogo[0][coluna] + jogo[1][coluna] + jogo[2][coluna]) == -3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador X ganhou!");
                vitoriasX++;
                zerajogo();
                return true;
            }
            if ((jogo[0][coluna] + jogo[1][coluna] + jogo[2][coluna]) == 3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador O ganhou!");
                vitoriasO++;
                zerajogo();
                return true;
            }
        }

        //checa diagonal principal
        int checkp = 0;
        for (int i = 0; i < jogo.length; i++) {
            checkp += jogo[i][i];
            if (checkp == -3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador X ganhou!");
                vitoriasX++;
                zerajogo();
                return true;
            } else if (checkp == 3) {
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador O ganhou!");
                vitoriasO++;
                zerajogo();
                return true;
            }

        }
        //checa diagonal secundaria
        int checko = 0; //soma valores para determinar 3 ou -3
        int aux = jogo.length - 1; //inicializamos a coluna com o tamanho máximo
        for (int i = 0; i < jogo.length; i++) { //fazemos a passagens das linhas
            checko += jogo[i][aux--];} // somamos os valores para verificar depois a soma
            if (checko == -3) {// se a soma der -3 X ganhou
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador X ganhou!");
                vitoriasX++;
                zerajogo();
                return true;
            } else if (checko == 3) { // caso a soma de 3 O ganhou
                JOptionPane.showMessageDialog(null, "Parabéns, Jogador O ganhou!");
                vitoriasO++;
                zerajogo();
                return true;
            }
        
        //mantém contagem de jogadas para verificar empates
        if (jogada > 9) {// verifica o numero de jogadas, caso nenhuma opção acima satisfaça. a jogada é incrementada no jogadorAtivo().
            JOptionPane.showMessageDialog(null, "Empate, ninguem ganhou!");
            empates++;
            zerajogo();
            return true;
        }
        return false; //se não tiver nenhum match continua

    }

    

}
