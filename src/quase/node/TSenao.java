/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TSenao extends Token
{
    public TSenao()
    {
        super.setText("sen\u00e3o");
    }

    public TSenao(int line, int pos)
    {
        super.setText("sen\u00e3o");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TSenao(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSenao(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TSenao text.");
    }
}
