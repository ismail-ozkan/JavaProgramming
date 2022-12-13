package day31_Constructors.Tasks;

import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie myMovie = new Movie("USA","Journey to SDET: Cydeo Batch 25","10/25/2021","Kuzzat Altay","Adventure, Comedy, Thriller");
        myMovie.addCast("Asiya");
        String[] casts = {"Adam", "Muhtar", "Sally", "Halid", "Seyyid", "Görkem", "Salim","İsmail"};
        myMovie.addCasts(casts);
        System.out.println(myMovie);




    }

}
