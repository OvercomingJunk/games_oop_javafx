package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionEqualsA1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        Cell actual = bishopBlack.position();
        assertEquals(expected, actual);
    }

    @Test
    public void whenPositionOfCopyFigureEqualsD1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlackCopy = bishopBlack.copy(Cell.D1);
        Cell expected = Cell.D1;
        Cell actual = bishopBlackCopy.position();

        assertEquals(expected, actual);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayNotValid() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        bishopBlack.way(Cell.A2);
    }
}