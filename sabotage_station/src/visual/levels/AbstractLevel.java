package visual.levels;

public abstract class AbstractLevel {
    protected Level level;

    public abstract void construirMapa(); // cada level usa pra montar seu mapa aqui

    public Level getLevel() {
        return level;
    }

    public int[][] getMapa() {
        return level.getMapa();
    }
}
