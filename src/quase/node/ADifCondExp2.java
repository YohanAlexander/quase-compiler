/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ADifCondExp2 extends PCondExp2
{
    private TNegacao _negacao_;
    private PCondExp2 _cond_exp2_;

    public ADifCondExp2 ()
    {
    }

    public ADifCondExp2 (
            TNegacao _negacao_,
            PCondExp2 _cond_exp2_
    )
    {
        setNegacao (_negacao_);
        setCondExp2 (_cond_exp2_);
    }

    public Object clone()
    {
        return new ADifCondExp2 (
            (TNegacao)cloneNode (_negacao_),
            (PCondExp2)cloneNode (_cond_exp2_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADifCondExp2(this);
    }

    public TNegacao getNegacao ()
    {
        return _negacao_;
    }

    public void setNegacao (TNegacao node)
    {
        if(_negacao_ != null)
        {
            _negacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _negacao_ = node;
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
            + toString (_negacao_)
            + toString (_cond_exp2_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _negacao_ == child )
        {
            _negacao_ = null;
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
        if ( _negacao_ == oldChild )
        {
            setNegacao ((TNegacao) newChild);
            return;
        }
        if ( _cond_exp2_ == oldChild )
        {
            setCondExp2 ((PCondExp2) newChild);
            return;
        }
    }

}