/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TOu extends Token
{
    public TOu()
    {
        super.setText("ou");
    }

    public TOu(int line, int pos)
    {
        super.setText("ou");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TOu(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOu(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TOu text.");
    }
}
