/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AVarDec extends PDec
{
    private PDecVar _dec_var_;

    public AVarDec ()
    {
    }

    public AVarDec (
            PDecVar _dec_var_
    )
    {
        setDecVar (_dec_var_);
    }

    public Object clone()
    {
        return new AVarDec (
            (PDecVar)cloneNode (_dec_var_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarDec(this);
    }

    public PDecVar getDecVar ()
    {
        return _dec_var_;
    }

    public void setDecVar (PDecVar node)
    {
        if(_dec_var_ != null)
        {
            _dec_var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dec_var_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_dec_var_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _dec_var_ == child )
        {
            _dec_var_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _dec_var_ == oldChild )
        {
            setDecVar ((PDecVar) newChild);
            return;
        }
    }

}
