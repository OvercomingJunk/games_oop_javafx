package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test (expected = FigureNotFoundException.class)
    public void whenNotFind()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.C4));
        logic.move(Cell.A1, Cell.A5);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenWayNotValid()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.C4));
        logic.move(Cell.C1, Cell.A5);
    }

    @Test (expected = OccupiedCellException.class)
    public void whenWayIsNotFree()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.F4));
        logic.move(Cell.C1, Cell.F4);
    }
}