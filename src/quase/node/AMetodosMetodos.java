/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AMetodosMetodos extends PMetodos
{
    private PDec2 _dec2_;
    private PMetodos _metodos_;

    public AMetodosMetodos ()
    {
    }

    public AMetodosMetodos (
            PDec2 _dec2_,
            PMetodos _metodos_
    )
    {
        setDec2 (_dec2_);
        setMetodos (_metodos_);
    }

    public Object clone()
    {
        return new AMetodosMetodos (
            (PDec2)cloneNode (_dec2_),
            (PMetodos)cloneNode (_metodos_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMetodosMetodos(this);
    }

    public PDec2 getDec2 ()
    {
        return _dec2_;
    }

    public void setDec2 (PDec2 node)
    {
        if(_dec2_ != null)
        {
            _dec2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dec2_ = node;
    }
    public PMetodos getMetodos ()
    {
        return _metodos_;
    }

    public void setMetodos (PMetodos node)
    {
        if(_metodos_ != null)
        {
            _metodos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _metodos_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_dec2_)
            + toString (_metodos_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _dec2_ == child )
        {
            _dec2_ = null;
            return;
        }
        if ( _metodos_ == child )
        {
            _metodos_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _dec2_ == oldChild )
        {
            setDec2 ((PDec2) newChild);
            return;
        }
        if ( _metodos_ == oldChild )
        {
            setMetodos ((PMetodos) newChild);
            return;
        }
    }

}