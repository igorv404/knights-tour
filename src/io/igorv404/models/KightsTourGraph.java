package io.igorv404.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KightsTourGraph {
  private final int[] row = new int[]{2, 2, -2, -2, 1, 1, -1, -1};
  private final int[] column = new int[]{-1, 1, 1, -1, 2, -2, 2, -2};

  private boolean isOnBoard(int x, int y, int size) {
    return x >= 1 && x <= size && y >= 1 && y <= size;
  }

  public int knightsTour(int[] startPoint, int[] endPoint, int size) {
    Vertex startVertex = new Vertex(startPoint[0], startPoint[1], 0);
    Queue<Vertex> queue = new LinkedList<>();
    queue.add(startVertex);
    List<int[]> visitedVertex = new ArrayList<>();
    visitedVertex.add(startPoint);
    while (!queue.isEmpty()) {
      int x = queue.peek().x();
      int y = queue.peek().y();
      int count = queue.peek().count();
      queue.poll();
      if (x == endPoint[0] && y == endPoint[1]) {
        return count;
      }
      for (int i = 0; i < 8; i++) {
        int stepOnX = x + this.row[i];
        int stepOnY = y + this.column[i];
        if (isOnBoard(stepOnX, stepOnY, size)) {
          Vertex vertex = new Vertex(stepOnX, stepOnY, count++);
          if (!visitedVertex.contains(new int[]{vertex.x(), vertex.y()})) {
            queue.add(vertex);
            visitedVertex.add(new int[]{vertex.x(), vertex.y()});
          }
        }
      }
    }
    return 0;
  }
}
