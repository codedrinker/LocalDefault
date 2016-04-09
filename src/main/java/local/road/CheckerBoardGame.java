package local.road;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tusizi on 4/8/16.
 */
public class CheckerBoardGame {

    public static void main(String[] args) {
        CheckerBoardGame boardGame = new CheckerBoardGame();
        boardGame.initCheckerBoard();//初始化棋盘
        boardGame.initPositionMap();//把字母和数字路由起来

        String from = "a8";
        String to = "h1";
        boardGame.calcPath(from, to);
    }

    private void calcPath(String from, String to) {
        Point startPoint = getPoint(from);
        Point endPoint = getPoint(to);
        printShortestPathGraphByPoints(startPoint, endPoint);
    }

    private void printShortestPathGraphByPoints(Point startPoint, Point endPoint) {
        int horizontalDistance = endPoint.getX() - startPoint.getX();
        int verticalDistance = endPoint.getY() - startPoint.getY();

        //根据x的值和y的值,用递归的方式计算距离,然后打印

    }

    private Point getPoint(String from) {
        Integer x = positionMap.get("" + from.charAt(0));
        int y = (int) from.charAt(1);
        return new Point(x, y);
    }

    private void initPositionMap() {
        positionMap.put("a", 1);
        positionMap.put("b", 2);
        positionMap.put("c", 3);
        positionMap.put("d", 4);
        positionMap.put("e", 5);
        positionMap.put("f", 6);
        positionMap.put("g", 7);
        positionMap.put("h", 8);
    }

    private void initCheckerBoard() {
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                checkerboard.add(new Point(x, y));
            }
        }
    }

    private Map<String, Integer> positionMap = new HashMap<String, Integer>();

    private List<Point> checkerboard = new ArrayList<Point>();//棋盘

    class Point {

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        //每一个点的对象
        private int x;

        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
