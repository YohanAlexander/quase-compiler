/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ABlocoExpExp extends PExp
{
    private PBlocoExp _bloco_exp_;

    public ABlocoExpExp ()
    {
    }

    public ABlocoExpExp (
            PBlocoExp _bloco_exp_
    )
    {
        setBlocoExp (_bloco_exp_);
    }

    public Object clone()
    {
        return new ABlocoExpExp (
            (PBlocoExp)cloneNode (_bloco_exp_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoExpExp(this);
    }

    public PBlocoExp getBlocoExp ()
    {
        return _bloco_exp_;
    }

    public void setBlocoExp (PBlocoExp node)
    {
        if(_bloco_exp_ != null)
        {
            _bloco_exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _bloco_exp_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_bloco_exp_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _bloco_exp_ == child )
        {
            _bloco_exp_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _bloco_exp_ == oldChild )
        {
            setBlocoExp ((PBlocoExp) newChild);
            return;
        }
    }

}
