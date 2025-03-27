package objsTemp;

abstract class Objeto {
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

class Barreira extends Objeto {
    public Barreira(int x, int y) {
        super(x, y);
    }
}

class Laser extends Objeto {
    public Laser(int x, int y) {
        super(x, y);
    }
}

class Pistao extends Objeto {
    public Pistao(int x, int y) {
        super(x, y);
    }
}

class Porta extends Objeto {
    public Porta(int x, int y) {
        super(x, y);
    }
}