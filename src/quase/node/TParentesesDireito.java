/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TParentesesDireito extends Token
{
    public TParentesesDireito()
    {
        super.setText(")");
    }

    public TParentesesDireito(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TParentesesDireito(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParentesesDireito(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TParentesesDireito text.");
    }
}
