/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AProcDec2 extends PDec2
{
    private PDecProcedimento _dec_procedimento_;

    public AProcDec2 ()
    {
    }

    public AProcDec2 (
            PDecProcedimento _dec_procedimento_
    )
    {
        setDecProcedimento (_dec_procedimento_);
    }

    public Object clone()
    {
        return new AProcDec2 (
            (PDecProcedimento)cloneNode (_dec_procedimento_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProcDec2(this);
    }

    public PDecProcedimento getDecProcedimento ()
    {
        return _dec_procedimento_;
    }

    public void setDecProcedimento (PDecProcedimento node)
    {
        if(_dec_procedimento_ != null)
        {
            _dec_procedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dec_procedimento_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_dec_procedimento_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _dec_procedimento_ == child )
        {
            _dec_procedimento_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _dec_procedimento_ == oldChild )
        {
            setDecProcedimento ((PDecProcedimento) newChild);
            return;
        }
    }

}