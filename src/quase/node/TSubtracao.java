/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TSubtracao extends Token
{
    public TSubtracao()
    {
        super.setText("-");
    }

    public TSubtracao(int line, int pos)
    {
        super.setText("-");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TSubtracao(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSubtracao(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TSubtracao text.");
    }
}
