package com.example.ludosnake;

import javafx.scene.paint.Paint;
import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameBoard {
    static int tileSize = 40;
    static int height = 10;
    static int width = 10;
    static ArrayList<Pair<Integer, Integer>> positionCoordinates;
    static ArrayList<Integer> snakeLadderPosition;
    public  GameBoard()
    {
        populateSankeLadderPosition();
        popularPositionCoordinate();
    }

    public  int getXValue(int piecePosition)
    {
        if(piecePosition<=100 && piecePosition>=1)
        {
            return positionCoordinates.get(piecePosition).getKey();
        }
        else return positionCoordinates.get(1).getKey();

    }
    public  int getYValue(int piecePosition)
    {
        if(piecePosition<=100 && piecePosition>=1)
        {
            return positionCoordinates.get(piecePosition).getValue();
        }
        else return positionCoordinates.get(1).getValue();

    }
    public  int PlayerPositionAtSnakeOrLadder(int piecePosition){
            if(piecePosition != snakeLadderPosition.get(piecePosition)){
                return  snakeLadderPosition.get(piecePosition);
            }
            else return  -1;

    }
   static private void popularPositionCoordinate() {
       positionCoordinates = new ArrayList<>();
       positionCoordinates.add(new Pair<Integer, Integer>(20, 380));
       for (int i = height - 1; i >= 0; i--) {
           for (int j = width - 1; j >= 0; j--) {
               int xTilePos;
               int yTilePos;
               int pos;
               if (i % 2 != 0)
                   xTilePos = tileSize * width - (tileSize / 2 + j * tileSize);
               else
                   xTilePos = tileSize / 2 + j * tileSize;
               yTilePos = tileSize / 2 + i * tileSize;
               positionCoordinates.add(new Pair<>(xTilePos, yTilePos));

           }
       }
       for (int i = 0; i < positionCoordinates.size() ; i++) {
           System.out.println(i + " x:" + positionCoordinates.get(i).getKey() + "y: " + positionCoordinates.get(i).getValue());

       }
   }
   private void populateSankeLadderPosition()
   {
       snakeLadderPosition = new ArrayList<>();
       for (int i = 0; i < 101; i++) {
           snakeLadderPosition.add(i);
       }
      // snakeLadderPosition.set(1,38);
       snakeLadderPosition.set(4,14);
       snakeLadderPosition.set(9,31);
       snakeLadderPosition.set(21,42);
       snakeLadderPosition.set(28,84);
       snakeLadderPosition.set(51,67);
       snakeLadderPosition.set(72,91);
       snakeLadderPosition.set(80,99);
       snakeLadderPosition.set(17,7);
       snakeLadderPosition.set(54,34);
       snakeLadderPosition.set(62,19);
       snakeLadderPosition.set(87,36);
       snakeLadderPosition.set(93,73);
       snakeLadderPosition.set(95,75);
       snakeLadderPosition.set(98,79);
       snakeLadderPosition.set(64,60);

   }

        public static void main (String[]args)
        {
            popularPositionCoordinate();
        }
    }

