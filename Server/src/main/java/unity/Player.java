package unity;

import main.App;
import map.MapHandler;
import proto.PlayerServiceOuterClass;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

public class Player extends GameObject {

    private MapHandler mapHandler = null;
    private Map<Obstacle, String> obstacleStringMap = null;
    private Map<Coin, String> coinStringMap = null;

    private Vector2 dirLeftOrRight = null;
    private Vector2 dirUpOrDown = null;

    private Vector2 movePoint = null;

    private float speed = 8f;

    private int rightCheckPoint = 0;
    private int leftCheckPoint = 0;
    private int upCheckPoint = 0;
    private int downCheckPoint = 0;

    private boolean canMoveUp = false;
    private boolean canMoveDown = false;
    private boolean canMoveLeft = false;
    private boolean canMoveRight = false;

    private int id = 0;

    public Player(int x, int y, int id) {
        super(x, y);
        this.id = id;
        dirLeftOrRight = Vector2.left();
        dirUpOrDown = Vector2.down();
        movePoint = new Vector2(x, y);
        mapHandler = App.mapHandler;
        obstacleStringMap = mapHandler.getObstacleStringMap();
        coinStringMap = mapHandler.getCoinStringMap();
    }

    public synchronized void move(PlayerServiceOuterClass.MovementRequest movementRequest) {
        checkCoordinatesWithinRadiusOfOne();
        setInWitchDirectionCanMove();

        gameObjectPosition = Vector2.lerp(gameObjectPosition, movePoint, speed * 0.02f);

        if (Vector2.distance(gameObjectPosition, movePoint) <= 0.05f) {
            specialMovements(movementRequest);
            simpleMovements(movementRequest);
        }

        destroyCoin();
    }

    public Vector2 getMovePoint() {
        return movePoint;
    }

    public int getId() {
        return id;
    }

    private void checkCoordinatesWithinRadiusOfOne() {
        rightCheckPoint = (int) movePoint.x + 1;
        leftCheckPoint = (int) movePoint.x - 1;
        upCheckPoint = (int) movePoint.y + 1;
        downCheckPoint = (int) movePoint.y - 1;
    }

    private void setInWitchDirectionCanMove() {
        canMoveUp = !obstacleStringMap.containsKey(new Obstacle(movePoint.x, upCheckPoint));

        canMoveDown = !obstacleStringMap.containsKey(new Obstacle(movePoint.x, downCheckPoint));

        canMoveLeft = !obstacleStringMap.containsKey(new Obstacle(leftCheckPoint, movePoint.y));

        canMoveRight = !obstacleStringMap.containsKey(new Obstacle(rightCheckPoint, movePoint.y));
    }

    private void simpleMovements(PlayerServiceOuterClass.MovementRequest movementRequest) {
        if (movementRequest.getUp() && canMoveUp) {
            movePoint = Vector2.sum(movePoint, Vector2.up());

            if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {
                movePoint = Vector2.sum(movePoint, Vector2.down());
            }
        }

        if (movementRequest.getDown() && canMoveDown) {
            movePoint = Vector2.sum(movePoint, Vector2.down());

            if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {
                movePoint = Vector2.sum(movePoint, Vector2.up());
            }
        }

        if (movementRequest.getLeft() && canMoveLeft) {
            movePoint = Vector2.sum(Vector2.left(), movePoint);

            if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {
                movePoint = Vector2.sum(movePoint, Vector2.right());
            }
        }

        if (movementRequest.getRight() && canMoveRight) {
            movePoint = Vector2.sum(Vector2.right(), movePoint);

            if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {
                movePoint = Vector2.sum(movePoint, Vector2.left());
            }
        }
    }

    private void specialMovements(PlayerServiceOuterClass.MovementRequest movementRequest) {
        if (movementRequest.getLeft() && movementRequest.getRight()) upDownMovements();

        if (movementRequest.getUp() && movementRequest.getDown()) leftRightMovements();
    }

    private void leftRightMovements() {
        canMoveUp = false;
        canMoveDown = false;

        movePoint = Vector2.sum(movePoint, dirUpOrDown);

        if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {

            if (dirUpOrDown.equals(Vector2.down())) {
                dirUpOrDown = Vector2.up();
                movePoint = Vector2.sum(movePoint, Vector2.up());
                return;
            }

            if (dirUpOrDown.equals(Vector2.up())) {
                dirUpOrDown = Vector2.down();
                movePoint = Vector2.sum(movePoint, Vector2.down());
                return;
            }
        }
    }

    private void upDownMovements() {
        canMoveLeft = false;
        canMoveRight = false;

        movePoint = Vector2.sum(dirLeftOrRight, movePoint);

        if (obstacleStringMap.containsKey(new Obstacle(movePoint.x, movePoint.y))) {

            if (dirLeftOrRight.equals(Vector2.left())) {
                dirLeftOrRight = Vector2.right();
                movePoint = Vector2.sum(movePoint, Vector2.right());
                return;
            }

            if (dirLeftOrRight.equals(Vector2.right())) {
                dirLeftOrRight = Vector2.left();
                movePoint = Vector2.sum(movePoint, Vector2.left());
                return;
            }
        }
    }

    private void destroyCoin() {
        if (coinStringMap.containsKey(new Coin(movePoint.x, movePoint.y))) {
            coinStringMap.keySet().removeIf(key -> key.equals(new Coin(movePoint.x, movePoint.y)));
            System.out.println("Number of coins: " + coinStringMap.size());
        }
    }

}