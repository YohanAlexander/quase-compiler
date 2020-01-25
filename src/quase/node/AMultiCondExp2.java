/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AMultiCondExp2 extends PCondExp2
{
    private PTermo _termo_;
    private TMultiplicacao _multiplicacao_;
    private PCondExp2 _cond_exp2_;

    public AMultiCondExp2 ()
    {
    }

    public AMultiCondExp2 (
            PTermo _termo_,
            TMultiplicacao _multiplicacao_,
            PCondExp2 _cond_exp2_
    )
    {
        setTermo (_termo_);
        setMultiplicacao (_multiplicacao_);
        setCondExp2 (_cond_exp2_);
    }

    public Object clone()
    {
        return new AMultiCondExp2 (
            (PTermo)cloneNode (_termo_),
            (TMultiplicacao)cloneNode (_multiplicacao_),
            (PCondExp2)cloneNode (_cond_exp2_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiCondExp2(this);
    }

    public PTermo getTermo ()
    {
        return _termo_;
    }

    public void setTermo (PTermo node)
    {
        if(_termo_ != null)
        {
            _termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _termo_ = node;
    }
    public TMultiplicacao getMultiplicacao ()
    {
        return _multiplicacao_;
    }

    public void setMultiplicacao (TMultiplicacao node)
    {
        if(_multiplicacao_ != null)
        {
            _multiplicacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multiplicacao_ = node;
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
            + toString (_termo_)
            + toString (_multiplicacao_)
            + toString (_cond_exp2_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _termo_ == child )
        {
            _termo_ = null;
            return;
        }
        if ( _multiplicacao_ == child )
        {
            _multiplicacao_ = null;
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
        if ( _termo_ == oldChild )
        {
            setTermo ((PTermo) newChild);
            return;
        }
        if ( _multiplicacao_ == oldChild )
        {
            setMultiplicacao ((TMultiplicacao) newChild);
            return;
        }
        if ( _cond_exp2_ == oldChild )
        {
            setCondExp2 ((PCondExp2) newChild);
            return;
        }
    }

}
