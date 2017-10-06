package com.jeremycurny.sparkjavarestapi.util;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
        public Integer _x;
        public Integer _y;

        public Integer getX() {
            return _x;
        }

        public Integer getY() {
            return _y;
        }

        public Point(Integer x, Integer y) {
            _x = x;
            _y = y;
        }

        public Point add(Point point) {

            return new Point(point.getX() + getX(), point.getY() + getY());

        }

        public Point sub(Point point) {

            return new Point(getX() - point.getX(), getY() - point.getY());
        }

        public Double distance(Point p1, Point p2)
        {

            return sqrt(pow(p1.getX() - p2.getX(),2) + pow(p1.getY() - p2.getY(), 2));
        }

        public String toString()
        {
            return "{{" + getX().toString() + ", " + getY().toString() + "}}";
        }


    }
