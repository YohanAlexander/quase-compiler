/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TNegacao extends Token
{
    public TNegacao()
    {
        super.setText("!");
    }

    public TNegacao(int line, int pos)
    {
        super.setText("!");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TNegacao(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNegacao(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TNegacao text.");
    }
}
