/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ASubtExp extends PExp
{
    private PTermo _termo_;
    private TSubtracao _subtracao_;
    private PExp _exp_;

    public ASubtExp ()
    {
    }

    public ASubtExp (
            PTermo _termo_,
            TSubtracao _subtracao_,
            PExp _exp_
    )
    {
        setTermo (_termo_);
        setSubtracao (_subtracao_);
        setExp (_exp_);
    }

    public Object clone()
    {
        return new ASubtExp (
            (PTermo)cloneNode (_termo_),
            (TSubtracao)cloneNode (_subtracao_),
            (PExp)cloneNode (_exp_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubtExp(this);
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
    public TSubtracao getSubtracao ()
    {
        return _subtracao_;
    }

    public void setSubtracao (TSubtracao node)
    {
        if(_subtracao_ != null)
        {
            _subtracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _subtracao_ = node;
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

    public String toString()
    {
        return ""
            + toString (_termo_)
            + toString (_subtracao_)
            + toString (_exp_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _termo_ == child )
        {
            _termo_ = null;
            return;
        }
        if ( _subtracao_ == child )
        {
            _subtracao_ = null;
            return;
        }
        if ( _exp_ == child )
        {
            _exp_ = null;
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
        if ( _subtracao_ == oldChild )
        {
            setSubtracao ((TSubtracao) newChild);
            return;
        }
        if ( _exp_ == oldChild )
        {
            setExp ((PExp) newChild);
            return;
        }
    }

}