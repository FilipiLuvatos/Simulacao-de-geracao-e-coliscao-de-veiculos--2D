package Trabalho;

import java.util.Random;

public class Veiculo {

    Random r = new Random();

    private int x;
    private int y;
    private int velocidade;
    private boolean fabrica;
    private String cor;

    public Veiculo(){
        x = 0;
        y = 0;
        velocidade = 0;
        fabrica = false;
        cor = null;
    }

    public Veiculo(int x, int y, int velocidade, boolean fabrica, String cor) {

        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.fabrica = fabrica;
        this.cor = cor;
    }

    public int getX() {
        return this.x;
    }

    public int setX() {
        this.x =  r.nextInt(28);
        return x;
    }

    public int getY() {
        return y;
    }

    public int setY() {
        y = r.nextInt(58);
        return y;
    }
    public void MoveX(int x) {

        this.x = x;
    }
    public void MoveY(int y) {

        this.y = y;

    }
    public boolean isFabrica() {

        return fabrica;
    }
    public String getCor() {

        return cor;
    }
    public void setFabrica(boolean fabrica) {

        this.fabrica = fabrica;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public int verificaX(int x) {
        if (x >= 29) {
            x = 1;
        }
        if(x <= 0) {
            x = 28;
        }
        return x;
    }

    public int verificaY(int y) {
        if (y >= 59) {
            y = 1;
        }
        if(y <= 0) {
            y = 58;
        }
        return y;
    }


    Random car = new Random();
    public void moveCarro(Carro carro){

        int mov;
        mov = car.nextInt(4);

        if(mov == 0) {
            int x1 = carro.getX(); ///< Obtendo o valor atual de X
            x1 = x1 + 2;///< Somando 2 (velocidade do carro) no valor atual de X
            carro.MoveX(verificaX(x1));///< Chamando a função moveX da classe Veículo para realizar a movimentação
        }

        if(mov == 1) {
            int x2 = carro.getX();
            x2 = x2 - 2;
            carro.MoveX(verificaX(x2));
        }

        if(mov == 2) {
            int y1 = carro.getY();
            y1 = y1 + 2;
            carro.MoveY(verificaY(y1));
        }

        if(mov == 3) {
            int y2 = carro.getY();
            y2 = y2 - 2;
            carro.MoveY(verificaY(y2));
        }



    }

    Random moty = new Random();
    public void moveMoto(Moto moto ){

        int mov;
        mov = moty.nextInt(4);

        if(mov == 0) {
            int x1 = moto.getX(); ///< Obtendo o valor atual de X
            x1 = x1 + 3;///< Somando 2 (velocidade do carro) no valor atual de X
            moto.MoveX(verificaX(x1));///< Chamando a função moveX da classe Veículo para realizar a movimentação
        }

        if(mov == 1) {
            int x2 = moto.getX();
            x2 = x2 - 3;
            moto.MoveX(verificaX(x2));
        }

        if(mov == 2) {
            int y1 = moto.getY();
            y1 = y1 + 3;
            moto.MoveY(verificaY(y1));
        }

        if(mov == 3) {
            int y2 = moto.getY();
            y2 = y2 - 3;
            moto.MoveY(verificaY(y2));
        }



    }

    Random cami = new Random();
    public void moveCaminhao(Caminhao caminhao ){

        int mov;
        mov = cami.nextInt(4);

        if(mov == 0) {
            int x1 = caminhao.getX(); ///< Obtendo o valor atual de X
            x1 = x1 + 2;///< Somando 2 (velocidade do carro) no valor atual de X
            caminhao.MoveX(verificaX(x1));///< Chamando a função moveX da classe Veículo para realizar a movimentação
        }

        if(mov == 1) {
            int x2 = caminhao.getX();
            x2 = x2 - 1;
            caminhao.MoveX(verificaX(x2));
        }

        if(mov == 2) {
            int y1 = caminhao.getY();
            y1 = y1 + 1;
            caminhao.MoveY(verificaY(y1));
        }

        if(mov == 3) {
            int y2 = caminhao.getY();
            y2 = y2 - 1;
            caminhao.MoveY(verificaY(y2));
        }



    }


}
