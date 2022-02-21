package unity;

import java.util.Objects;

public class Vector2 {
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Vector2 sum(Vector2 firstVector, Vector2 secondVector) {
        return new Vector2(
                firstVector.x + secondVector.x,
                firstVector.y + secondVector.y);
    }

    public static Vector2 lerp(Vector2 firstVector, Vector2 secondVector, float time) {
        time = clamp(time, 0f, 1f);
        Vector2 vector = new Vector2(
                secondVector.x - firstVector.x,
                secondVector.y - firstVector.y);
        float xTime = firstVector.x + vector.x * time;
        float yTime = firstVector.y + vector.y * time;

        return new Vector2(xTime, yTime);
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float square(float value) {
        return value * value;
    }

    public static float distance(Vector2 firstVector, Vector2 secondVector) {
        float diffSquared = square(firstVector.x - secondVector.x) +
                            square(firstVector.y - secondVector.y);

        return (float)Math.sqrt(diffSquared);
    }

    public static Vector2 up()
    {
        return new Vector2(0,1);
    }

    public static Vector2 down()
    {
        return new Vector2(0,-1);
    }

    public static Vector2 left()
    {
        return new Vector2(-1,0);
    }

    public static Vector2 right()
    {
        return new Vector2(1,0);
    }

    @Override
    public String toString() {
        return "x: " + x + "  y: " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2 vector2 = (Vector2) o;
        return Float.compare(vector2.x, x) == 0 && Float.compare(vector2.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}