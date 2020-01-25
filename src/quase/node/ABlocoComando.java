/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ABlocoComando extends PComando
{
    private PBloco _bloco_;

    public ABlocoComando ()
    {
    }

    public ABlocoComando (
            PBloco _bloco_
    )
    {
        setBloco (_bloco_);
    }

    public Object clone()
    {
        return new ABlocoComando (
            (PBloco)cloneNode (_bloco_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComando(this);
    }

    public PBloco getBloco ()
    {
        return _bloco_;
    }

    public void setBloco (PBloco node)
    {
        if(_bloco_ != null)
        {
            _bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _bloco_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_bloco_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _bloco_ == child )
        {
            _bloco_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _bloco_ == oldChild )
        {
            setBloco ((PBloco) newChild);
            return;
        }
    }

}
