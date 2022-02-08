package ru.netology;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

   /*
       // PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1,"MotoMoto","3","4");
        FilmTile duo = new FilmTile(2,"Pinnokio","2","4");
        FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
        FilmTile cuatro = new FilmTile(4,"Lionking","3","4");

        FilmTile cinco = new FilmTile(5,"Lomo","1","4");
        FilmTile seis = new FilmTile(6,"Pidgo","3","4");
        FilmTile siete = new FilmTile(7,"Konneko-san","3","4");
        FilmTile ocho = new FilmTile(8,"X-wing","3","4");
        FilmTile nueve = new FilmTile(9,"Pax_Imperia","3","4");
        FilmTile diez = new FilmTile(10,"Jagged_Alliance","3","4");
        FilmTile once = new FilmTile(11,"Alladin","5","4");
        FilmTile doce = new FilmTile(12,"Scream","3","4");
        FilmTile trece = new FilmTile(13,"Nikond70","3","4");
        FilmTile catorce = new FilmTile(14,"Polaroid","2","4");
        FilmTile quince = new FilmTile(15,"Spoon","3","4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.addTile(cuatro);
        manager.addTile(cinco);
        manager.addTile(seis);
        manager.addTile(siete);
        manager.addTile(nueve);
        manager.addTile(diez);
        manager.addTile(once);
        manager.addTile(doce);
        manager.addTile(trece);
        manager.addTile(catorce);
        manager.addTile(quince);
        manager.addTile(ocho);

   */
   @Test
   void shouldTestDefaultFilmShowLimit() {
       PosterManager manager = new PosterManager();
       int actual = manager.getFilmShowLimit();
       int excpected = 5;
       assertEquals(excpected,actual);

   }
    @Test
    void shouldTestCustomFilmShowLimit() {
        PosterManager manager = new PosterManager(7);
        int actual = manager.getFilmShowLimit();
        int excpected = 7;
        assertEquals(excpected,actual);

    }
    @Test
    void addTile() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1,"MotoMoto","3","4");
        manager.addTile(uno);
        FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
        manager.addTile(tres);
        FilmTile[] actual = manager.showTiles();
        FilmTile[] excpected = {uno ,tres};
        assertArrayEquals(excpected,actual);

    }

    @Test
    void showTiles() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1,"MotoMoto","3","4");
        FilmTile duo = new FilmTile(2,"Pinnokio","2","4");
        FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
        FilmTile cuatro = new FilmTile(4,"Lionking","3","4");

        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.addTile(cuatro);

        FilmTile[] actual = manager.showTiles();
        FilmTile[] excpected = {uno , duo,tres, cuatro};

        assertArrayEquals(excpected,actual);
    }

    @Test
    void showSomeTilesStraightTest() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1,"MotoMoto","3","4");
        FilmTile duo = new FilmTile(2,"Pinnokio","2","4");
        FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.setFilmShowLimit(2);
        FilmTile[] actual = manager.showSomeTiles();
        FilmTile[] excpected = {tres , duo};
        assertArrayEquals(excpected,actual);
    }
    @Test

    void showSomeTilesNonVslidFilmshow() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1,"MotoMoto","3","4");
        FilmTile duo = new FilmTile(2,"Pinnokio","2","4");
        FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.setFilmShowLimit(5);
        FilmTile[] actual = manager.showSomeTiles();
        FilmTile[] excpected = {tres , duo, uno};
        assertArrayEquals(excpected,actual);
    }
}