/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AVazioListaDecCons extends PListaDecCons
{

    public AVazioListaDecCons()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AVazioListaDecCons();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioListaDecCons(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}