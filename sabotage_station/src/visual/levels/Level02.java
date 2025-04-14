package visual.levels;

public class Level02 extends AbstractLevel {
    @Override
    public void construirMapa() {
        int[][] mapa = {
                { 1, 1, 1, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 0 }
        };
        level = new Level(mapa);
    }
}
