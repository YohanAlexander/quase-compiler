/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ARelacaoRelacao extends PRelacao
{
    private TClasse _classe_;
    private TCid _cid_;
    private PFilhaRelacao _filha_relacao_;

    public ARelacaoRelacao ()
    {
    }

    public ARelacaoRelacao (
            TClasse _classe_,
            TCid _cid_,
            PFilhaRelacao _filha_relacao_
    )
    {
        setClasse (_classe_);
        setCid (_cid_);
        setFilhaRelacao (_filha_relacao_);
    }

    public Object clone()
    {
        return new ARelacaoRelacao (
            (TClasse)cloneNode (_classe_),
            (TCid)cloneNode (_cid_),
            (PFilhaRelacao)cloneNode (_filha_relacao_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacaoRelacao(this);
    }

    public TClasse getClasse ()
    {
        return _classe_;
    }

    public void setClasse (TClasse node)
    {
        if(_classe_ != null)
        {
            _classe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _classe_ = node;
    }
    public TCid getCid ()
    {
        return _cid_;
    }

    public void setCid (TCid node)
    {
        if(_cid_ != null)
        {
            _cid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cid_ = node;
    }
    public PFilhaRelacao getFilhaRelacao ()
    {
        return _filha_relacao_;
    }

    public void setFilhaRelacao (PFilhaRelacao node)
    {
        if(_filha_relacao_ != null)
        {
            _filha_relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _filha_relacao_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_classe_)
            + toString (_cid_)
            + toString (_filha_relacao_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _classe_ == child )
        {
            _classe_ = null;
            return;
        }
        if ( _cid_ == child )
        {
            _cid_ = null;
            return;
        }
        if ( _filha_relacao_ == child )
        {
            _filha_relacao_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _classe_ == oldChild )
        {
            setClasse ((TClasse) newChild);
            return;
        }
        if ( _cid_ == oldChild )
        {
            setCid ((TCid) newChild);
            return;
        }
        if ( _filha_relacao_ == oldChild )
        {
            setFilhaRelacao ((PFilhaRelacao) newChild);
            return;
        }
    }

}
