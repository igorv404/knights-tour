package io.igorv404.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileData {
  public int getSize() {
    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "input.txt")));
      return Integer.parseInt(reader.readLine());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return 0;
  }

  public int[] getStartPoint() {
    try {
      int[] startPoint = new int[2];
      BufferedReader reader = new BufferedReader(new FileReader(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "input.txt")));
      for (int i = 1; i < 4; i++) {
        int point = Integer.parseInt(reader.readLine());
        if (i == 2) {
          startPoint[0] = point;
        } else if (i == 3) {
          startPoint[1] = point;
        }
      }
      reader.close();
      return startPoint;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return new int[]{1, 1};
  }

  public int[] getEndPoint() {
    try {
      int[] endPoint = new int[2];
      BufferedReader reader = new BufferedReader(new FileReader(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "input.txt")));
      for (int i = 1; i < 6; i++) {
        int point = Integer.parseInt(reader.readLine());
        if (i == 4) {
          endPoint[0] = point;
        } else if (i == 5) {
          endPoint[1] = point;
        }
      }
      reader.close();
      return endPoint;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return new int[]{1, 1};
  }

  public void setCountOfSteps(int count) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "output.txt")));
      writer.write(String.format("%s", count));
      writer.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
