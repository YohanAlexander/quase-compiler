/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TVariavel extends Token
{
    public TVariavel()
    {
        super.setText("var");
    }

    public TVariavel(int line, int pos)
    {
        super.setText("var");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVariavel(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVariavel(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TVariavel text.");
    }
}
