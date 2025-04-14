package visual.levels;

public class Level03 extends AbstractLevel {
    @Override
    public void construirMapa() {
        int[][] mapa = {
                { 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 2, 2, 2, 2, 2 }
        };
        level = new Level(mapa);
    }
}
