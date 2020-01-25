/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ACondExp extends PExp
{
    private TSe _se_;
    private TParentesesEsquerdo _parenteses_esquerdo_;
    private PExp _exp_;
    private TParentesesDireito _parenteses_direito_;
    private TEntao _entao_;
    private PCondExp2 _cond_exp2_;

    public ACondExp ()
    {
    }

    public ACondExp (
            TSe _se_,
            TParentesesEsquerdo _parenteses_esquerdo_,
            PExp _exp_,
            TParentesesDireito _parenteses_direito_,
            TEntao _entao_,
            PCondExp2 _cond_exp2_
    )
    {
        setSe (_se_);
        setParentesesEsquerdo (_parenteses_esquerdo_);
        setExp (_exp_);
        setParentesesDireito (_parenteses_direito_);
        setEntao (_entao_);
        setCondExp2 (_cond_exp2_);
    }

    public Object clone()
    {
        return new ACondExp (
            (TSe)cloneNode (_se_),
            (TParentesesEsquerdo)cloneNode (_parenteses_esquerdo_),
            (PExp)cloneNode (_exp_),
            (TParentesesDireito)cloneNode (_parenteses_direito_),
            (TEntao)cloneNode (_entao_),
            (PCondExp2)cloneNode (_cond_exp2_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondExp(this);
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
    public TEntao getEntao ()
    {
        return _entao_;
    }

    public void setEntao (TEntao node)
    {
        if(_entao_ != null)
        {
            _entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _entao_ = node;
    }
    public PCondExp2 getCondExp2 ()
    {
        return _cond_exp2_;
    }

    public void setCondExp2 (PCondExp2 node)
    {
        if(_cond_exp2_ != null)
        {
            _cond_exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cond_exp2_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_se_)
            + toString (_parenteses_esquerdo_)
            + toString (_exp_)
            + toString (_parenteses_direito_)
            + toString (_entao_)
            + toString (_cond_exp2_)
        ;
    }

    void removeChild(Node child)
    {
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
        if ( _entao_ == child )
        {
            _entao_ = null;
            return;
        }
        if ( _cond_exp2_ == child )
        {
            _cond_exp2_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
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
        if ( _entao_ == oldChild )
        {
            setEntao ((TEntao) newChild);
            return;
        }
        if ( _cond_exp2_ == oldChild )
        {
            setCondExp2 ((PCondExp2) newChild);
            return;
        }
    }

}
