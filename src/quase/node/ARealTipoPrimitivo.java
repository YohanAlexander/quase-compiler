/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ARealTipoPrimitivo extends PTipoPrimitivo
{
    private TReal _real_;

    public ARealTipoPrimitivo ()
    {
    }

    public ARealTipoPrimitivo (
            TReal _real_
    )
    {
        setReal (_real_);
    }

    public Object clone()
    {
        return new ARealTipoPrimitivo (
            (TReal)cloneNode (_real_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealTipoPrimitivo(this);
    }

    public TReal getReal ()
    {
        return _real_;
    }

    public void setReal (TReal node)
    {
        if(_real_ != null)
        {
            _real_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _real_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_real_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _real_ == child )
        {
            _real_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _real_ == oldChild )
        {
            setReal ((TReal) newChild);
            return;
        }
    }

}