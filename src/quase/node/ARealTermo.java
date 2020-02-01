/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class ARealTermo extends PTermo
{
    private TNumeroReal _numeroReal_;

    public ARealTermo()
    {
        // Constructor
    }

    public ARealTermo(
        @SuppressWarnings("hiding") TNumeroReal _numeroReal_)
    {
        // Constructor
        setNumeroReal(_numeroReal_);

    }

    @Override
    public Object clone()
    {
        return new ARealTermo(
            cloneNode(this._numeroReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealTermo(this);
    }

    public TNumeroReal getNumeroReal()
    {
        return this._numeroReal_;
    }

    public void setNumeroReal(TNumeroReal node)
    {
        if(this._numeroReal_ != null)
        {
            this._numeroReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroReal_ == child)
        {
            this._numeroReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroReal_ == oldChild)
        {
            setNumeroReal((TNumeroReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
