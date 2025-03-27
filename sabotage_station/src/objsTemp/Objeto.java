package objsTemp;

public abstract class Objeto {
    int x, y;
    /*
     * add outros parametros:
     * Imagempath
     * Colisão
     * Efeito (instakill ou não)
     * Ativo/desativo (booleano)
     */

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}