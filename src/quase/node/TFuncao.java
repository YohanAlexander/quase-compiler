/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

public final class TFuncao extends Token
{
    public TFuncao()
    {
        super.setText("fun\u00e7\u00e3o");
    }

    public TFuncao(int line, int pos)
    {
        super.setText("fun\u00e7\u00e3o");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TFuncao(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFuncao(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TFuncao text.");
    }
}
