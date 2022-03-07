package dk.easv.bll.bot;

import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;

import java.util.List;
import java.util.Random;

public class UnnamedBot implements IBot{
    private static final String BOTNAME = "Unnamed Bot";
    private Random random = new Random();


    @Override
    public IMove doMove(IGameState state) {
        List<IMove> moves = state.getField().getAvailableMoves();
        if (moves.size() > 0) {
            return moves.get(random.nextInt(moves.size())); /* get random move from available moves */
        }
        
        return null;
    }

    @Override
    public String getBotName() {
        return BOTNAME;
    }
}
