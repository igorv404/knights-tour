package io.igorv404;

import io.igorv404.models.FileData;
import io.igorv404.models.KightsTourGraph;

public class Main {
  public static void main(String[] args) {
    KightsTourGraph genrih = new KightsTourGraph();
    FileData fileData = new FileData();
    fileData.setCountOfSteps(genrih.knightsTour(fileData.getStartPoint(), fileData.getEndPoint(), fileData.getSize()));
  }
}
