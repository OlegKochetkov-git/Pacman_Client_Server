package unity;

import java.util.Objects;

public abstract class GameObject {
    public Vector2 gameObjectPosition;

    public GameObject(float x, float y)
    {
        gameObjectPosition = new Vector2(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameObject that = (GameObject) o;
        return gameObjectPosition.equals(that.gameObjectPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameObjectPosition);
    }
}