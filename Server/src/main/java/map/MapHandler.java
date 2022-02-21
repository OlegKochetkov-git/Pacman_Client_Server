package map;

import unity.Coin;
import unity.Obstacle;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapHandler {
    private String filePath = null;
    private String fileData = null;
    private int width = 0;
    private int height = 0;
    private boolean[][] obstacleOnMap = null;
    private Map<Obstacle, String> obstacleStringMap = null;
    private Map<Coin, String> coinStringMap = null;

    public MapHandler(String filePath) throws IOException {
        this.filePath = filePath;

        fileData = getFileData();
        generateSizeMap(fileData);
        generateObstacleCoordinates(fileData);

        obstacleStringMap = new HashMap<>();
        coinStringMap = new HashMap<>();

        fillMaps();
    }

    public int getWidthMap() {
        return width;
    }

    public int getHeightMap() {
        return height;
    }

    public Map<Obstacle, String> getObstacleStringMap() {
        return obstacleStringMap;
    }

    public Map<Coin, String> getCoinStringMap() {
        return coinStringMap;
    }

    private String getFileData() throws IOException {

            FileInputStream fileInputStream = new FileInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String stringLine = null;
            StringBuilder fileDataBuilder = new StringBuilder();

            while ((stringLine = reader.readLine()) != null) {
                fileDataBuilder.append(stringLine);
                fileDataBuilder.append(" ");
            }

            reader.close();
            fileInputStream.close();

            return fileDataBuilder.toString();

    }

    private void generateSizeMap(String fileData) {
        try {
            Pattern sizeMapPattern = Pattern.compile("(Size\\s+(\\d+;\\d+))");
            Matcher sizeMapMatcher = sizeMapPattern.matcher(fileData);

            while (sizeMapMatcher.find()) {
                String sizeMapStringLine = sizeMapMatcher.group(2);
                Pattern onlyOneNumberPattern = Pattern.compile("\\d+");
                Matcher onlyOneNumberMatcher = onlyOneNumberPattern.matcher(sizeMapStringLine);

                while (onlyOneNumberMatcher.find()) {
                    String stringLine = onlyOneNumberMatcher.group();
                    int result = Integer.parseInt(stringLine);

                    if (width == 0) {
                        width = result;
                    } else {
                        height = result;
                    }
                }
            }

            obstacleOnMap = new boolean[width][height];
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private void generateObstacleCoordinates(String fileData) {
        try {
            Pattern obstaclePattern = Pattern.compile(".*walls:(.*)");
            Matcher obstacleMatcher = obstaclePattern.matcher(fileData);
            StringBuilder obstacleBuilder = new StringBuilder();

            while (obstacleMatcher.find()) {
                obstacleBuilder.append(obstacleMatcher.group(1));
            }

            String obstacle = obstacleBuilder.toString();

            Pattern onlyNumbersPattern = Pattern.compile("\\d+;\\d+");
            Matcher onlyNumbersMatcher = onlyNumbersPattern.matcher(obstacle);

            while (onlyNumbersMatcher.find()) {
                String stringLine = onlyNumbersMatcher.group();
                String[] coordinates = stringLine.split(";");
                int firstCoordinate = Integer.parseInt(coordinates[0]);
                int secondCoordinate = Integer.parseInt(coordinates[1]);
                obstacleOnMap[firstCoordinate][secondCoordinate] = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WARNING: The number of obstacles exceeds the size of the map");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private void fillMaps() {
        try {
            for (int width = 0; width < obstacleOnMap.length; width++) {
                for (int height = 0; height < obstacleOnMap[width].length; height++) {
                    if (obstacleOnMap[width][height]) {
                        obstacleStringMap.put(new Obstacle(width, height), "Obstacle");
                    } else {
                        coinStringMap.put(new Coin(width, height), "Coin");
                    }
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}