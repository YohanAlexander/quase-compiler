/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TReal extends Token
{
    public TReal()
    {
        super.setText("real");
    }

    public TReal(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TReal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReal(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TReal text.");
    }
}
