/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AMultiExp extends PExp
{
    private PTermo _termo_;
    private TMultiplicacao _multiplicacao_;
    private PExp _exp_;

    public AMultiExp()
    {
        // Constructor
    }

    public AMultiExp(
        @SuppressWarnings("hiding") PTermo _termo_,
        @SuppressWarnings("hiding") TMultiplicacao _multiplicacao_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setTermo(_termo_);

        setMultiplicacao(_multiplicacao_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AMultiExp(
            cloneNode(this._termo_),
            cloneNode(this._multiplicacao_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiExp(this);
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    public TMultiplicacao getMultiplicacao()
    {
        return this._multiplicacao_;
    }

    public void setMultiplicacao(TMultiplicacao node)
    {
        if(this._multiplicacao_ != null)
        {
            this._multiplicacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplicacao_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo_)
            + toString(this._multiplicacao_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        if(this._multiplicacao_ == child)
        {
            this._multiplicacao_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        if(this._multiplicacao_ == oldChild)
        {
            setMultiplicacao((TMultiplicacao) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
