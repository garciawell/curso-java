package classes;

public class AreaCirc {
    double raid;
    static double pi = 3.14;

    AreaCirc(double initialRaid){
        raid = initialRaid;
    }

    double area(){
        return pi * Math.pow(raid, 2);
    }
}

