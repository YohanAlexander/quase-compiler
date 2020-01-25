/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ACondComandoSenao extends PComandoSenao
{
    private TSenao _senao_;
    private TSe _se_;
    private TParentesesEsquerdo _parenteses_esquerdo_;
    private PExp _exp_;
    private TParentesesDireito _parenteses_direito_;
    private PComando _comando_;

    public ACondComandoSenao ()
    {
    }

    public ACondComandoSenao (
            TSenao _senao_,
            TSe _se_,
            TParentesesEsquerdo _parenteses_esquerdo_,
            PExp _exp_,
            TParentesesDireito _parenteses_direito_,
            PComando _comando_
    )
    {
        setSenao (_senao_);
        setSe (_se_);
        setParentesesEsquerdo (_parenteses_esquerdo_);
        setExp (_exp_);
        setParentesesDireito (_parenteses_direito_);
        setComando (_comando_);
    }

    public Object clone()
    {
        return new ACondComandoSenao (
            (TSenao)cloneNode (_senao_),
            (TSe)cloneNode (_se_),
            (TParentesesEsquerdo)cloneNode (_parenteses_esquerdo_),
            (PExp)cloneNode (_exp_),
            (TParentesesDireito)cloneNode (_parenteses_direito_),
            (PComando)cloneNode (_comando_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondComandoSenao(this);
    }

    public TSenao getSenao ()
    {
        return _senao_;
    }

    public void setSenao (TSenao node)
    {
        if(_senao_ != null)
        {
            _senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _senao_ = node;
    }
    public TSe getSe ()
    {
        return _se_;
    }

    public void setSe (TSe node)
    {
        if(_se_ != null)
        {
            _se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _se_ = node;
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
    public PExp getExp ()
    {
        return _exp_;
    }

    public void setExp (PExp node)
    {
        if(_exp_ != null)
        {
            _exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exp_ = node;
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
    public PComando getComando ()
    {
        return _comando_;
    }

    public void setComando (PComando node)
    {
        if(_comando_ != null)
        {
            _comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comando_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_senao_)
            + toString (_se_)
            + toString (_parenteses_esquerdo_)
            + toString (_exp_)
            + toString (_parenteses_direito_)
            + toString (_comando_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _senao_ == child )
        {
            _senao_ = null;
            return;
        }
        if ( _se_ == child )
        {
            _se_ = null;
            return;
        }
        if ( _parenteses_esquerdo_ == child )
        {
            _parenteses_esquerdo_ = null;
            return;
        }
        if ( _exp_ == child )
        {
            _exp_ = null;
            return;
        }
        if ( _parenteses_direito_ == child )
        {
            _parenteses_direito_ = null;
            return;
        }
        if ( _comando_ == child )
        {
            _comando_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _senao_ == oldChild )
        {
            setSenao ((TSenao) newChild);
            return;
        }
        if ( _se_ == oldChild )
        {
            setSe ((TSe) newChild);
            return;
        }
        if ( _parenteses_esquerdo_ == oldChild )
        {
            setParentesesEsquerdo ((TParentesesEsquerdo) newChild);
            return;
        }
        if ( _exp_ == oldChild )
        {
            setExp ((PExp) newChild);
            return;
        }
        if ( _parenteses_direito_ == oldChild )
        {
            setParentesesDireito ((TParentesesDireito) newChild);
            return;
        }
        if ( _comando_ == oldChild )
        {
            setComando ((PComando) newChild);
            return;
        }
    }

}
