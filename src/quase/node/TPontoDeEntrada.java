/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TPontoDeEntrada extends Token
{
    public TPontoDeEntrada()
    {
        super.setText("=>");
    }

    public TPontoDeEntrada(int line, int pos)
    {
        super.setText("=>");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPontoDeEntrada(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPontoDeEntrada(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPontoDeEntrada text.");
    }
}
