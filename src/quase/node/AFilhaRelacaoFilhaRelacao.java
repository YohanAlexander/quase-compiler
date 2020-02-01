/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AFilhaRelacaoFilhaRelacao extends PFilhaRelacao
{
    private TFilhaDaClasse _filhaDaClasse_;
    private TCid _cid_;

    public AFilhaRelacaoFilhaRelacao()
    {
        // Constructor
    }

    public AFilhaRelacaoFilhaRelacao(
        @SuppressWarnings("hiding") TFilhaDaClasse _filhaDaClasse_,
        @SuppressWarnings("hiding") TCid _cid_)
    {
        // Constructor
        setFilhaDaClasse(_filhaDaClasse_);

        setCid(_cid_);

    }

    @Override
    public Object clone()
    {
        return new AFilhaRelacaoFilhaRelacao(
            cloneNode(this._filhaDaClasse_),
            cloneNode(this._cid_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFilhaRelacaoFilhaRelacao(this);
    }

    public TFilhaDaClasse getFilhaDaClasse()
    {
        return this._filhaDaClasse_;
    }

    public void setFilhaDaClasse(TFilhaDaClasse node)
    {
        if(this._filhaDaClasse_ != null)
        {
            this._filhaDaClasse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._filhaDaClasse_ = node;
    }

    public TCid getCid()
    {
        return this._cid_;
    }

    public void setCid(TCid node)
    {
        if(this._cid_ != null)
        {
            this._cid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cid_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._filhaDaClasse_)
            + toString(this._cid_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._filhaDaClasse_ == child)
        {
            this._filhaDaClasse_ = null;
            return;
        }

        if(this._cid_ == child)
        {
            this._cid_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._filhaDaClasse_ == oldChild)
        {
            setFilhaDaClasse((TFilhaDaClasse) newChild);
            return;
        }

        if(this._cid_ == oldChild)
        {
            setCid((TCid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
