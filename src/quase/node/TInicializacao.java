/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TInicializacao extends Token
{
    public TInicializacao()
    {
        super.setText(":=");
    }

    public TInicializacao(int line, int pos)
    {
        super.setText(":=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TInicializacao(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInicializacao(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TInicializacao text.");
    }
}
