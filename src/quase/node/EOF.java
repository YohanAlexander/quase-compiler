/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class EOF extends Token
{
    public EOF()
    {
        setText("");
    }

    public EOF(int line, int pos)
    {
        setText("");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
        return new EOF(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseEOF(this);
    }
}
