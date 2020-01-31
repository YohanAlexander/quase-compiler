/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AChamadaChamada extends PChamada
{
    private TId _id_;
    private TParentesesEsquerdo _parenteses_esquerdo_;
    private PListaExp _lista_exp_;
    private TParentesesDireito _parenteses_direito_;

    public AChamadaChamada ()
    {
    }

    public AChamadaChamada (
            TId _id_,
            TParentesesEsquerdo _parenteses_esquerdo_,
            PListaExp _lista_exp_,
            TParentesesDireito _parenteses_direito_
    )
    {
        setId (_id_);
        setParentesesEsquerdo (_parenteses_esquerdo_);
        setListaExp (_lista_exp_);
        setParentesesDireito (_parenteses_direito_);
    }

    public Object clone()
    {
        return new AChamadaChamada (
            (TId)cloneNode (_id_),
            (TParentesesEsquerdo)cloneNode (_parenteses_esquerdo_),
            (PListaExp)cloneNode (_lista_exp_),
            (TParentesesDireito)cloneNode (_parenteses_direito_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaChamada(this);
    }

    public TId getId ()
    {
        return _id_;
    }

    public void setId (TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }
    public TParentesesEsquerdo getParentesesEsquerdo ()
    {
        return _parenteses_esquerdo_;
    }

    public void setParentesesEsquerdo (TParentesesEsquerdo node)
    {
        if(_parenteses_esquerdo_ != null)
        {
            _parenteses_esquerdo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parenteses_esquerdo_ = node;
    }
    public PListaExp getListaExp ()
    {
        return _lista_exp_;
    }

    public void setListaExp (PListaExp node)
    {
        if(_lista_exp_ != null)
        {
            _lista_exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lista_exp_ = node;
    }
    public TParentesesDireito getParentesesDireito ()
    {
        return _parenteses_direito_;
    }

    public void setParentesesDireito (TParentesesDireito node)
    {
        if(_parenteses_direito_ != null)
        {
            _parenteses_direito_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parenteses_direito_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_id_)
            + toString (_parenteses_esquerdo_)
            + toString (_lista_exp_)
            + toString (_parenteses_direito_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _id_ == child )
        {
            _id_ = null;
            return;
        }
        if ( _parenteses_esquerdo_ == child )
        {
            _parenteses_esquerdo_ = null;
            return;
        }
        if ( _lista_exp_ == child )
        {
            _lista_exp_ = null;
            return;
        }
        if ( _parenteses_direito_ == child )
        {
            _parenteses_direito_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _id_ == oldChild )
        {
            setId ((TId) newChild);
            return;
        }
        if ( _parenteses_esquerdo_ == oldChild )
        {
            setParentesesEsquerdo ((TParentesesEsquerdo) newChild);
            return;
        }
        if ( _lista_exp_ == oldChild )
        {
            setListaExp ((PListaExp) newChild);
            return;
        }
        if ( _parenteses_direito_ == oldChild )
        {
            setParentesesDireito ((TParentesesDireito) newChild);
            return;
        }
    }

}
