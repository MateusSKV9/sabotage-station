
package visual.levels;

import objsTemp.Barreira;
import objsTemp.Laser;
import objsTemp.Objeto;

public class Level {

    private int[][] mapa;
    private Objeto[][] objetos;

    public Level(int[][] mapa) {
        this.mapa = mapa;
        this.objetos = new Objeto[mapa.length][mapa[0].length];
        construirObjetos();
    }

    private void construirObjetos() {
        for (int linha = 0; linha < mapa.length; linha++) {
            for (int col = 0; col < mapa[0].length; col++) {
                int tipo = mapa[linha][col];
                Objeto obj = criarObjetoPorTipo(tipo, linha, col);
                objetos[linha][col] = obj;
            }
        }
    }

    private Objeto criarObjetoPorTipo(int tipo, int linha, int col) {
        int x = col * 50, y = linha * 50;
        switch (tipo) {
            case 1:
                return new Barreira(x, y);
            case 2:
                return new Laser(x, y);
            default:
                return null;
        }
    }

    public Objeto[][] getObjetos() {
        return objetos;
    }

    public Objeto getObjeto(int linha, int coluna) {
        return objetos[linha][coluna];
    }

    public int[][] getMapa() {
        return mapa;
    }
}
