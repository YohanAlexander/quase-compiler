/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ABlocoComandoSenao extends PComandoSenao
{
    private TSenao _senao_;
    private PBloco _bloco_;

    public ABlocoComandoSenao ()
    {
    }

    public ABlocoComandoSenao (
            TSenao _senao_,
            PBloco _bloco_
    )
    {
        setSenao (_senao_);
        setBloco (_bloco_);
    }

    public Object clone()
    {
        return new ABlocoComandoSenao (
            (TSenao)cloneNode (_senao_),
            (PBloco)cloneNode (_bloco_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComandoSenao(this);
    }

    public TSenao getSenao ()
    {
        return _senao_;
    }

    public void setSenao (TSenao node)
    {
        if(_senao_ != null)
        {
            _senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _senao_ = node;
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
            + toString (_senao_)
            + toString (_bloco_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _senao_ == child )
        {
            _senao_ = null;
            return;
        }
        if ( _bloco_ == child )
        {
            _bloco_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _senao_ == oldChild )
        {
            setSenao ((TSenao) newChild);
            return;
        }
        if ( _bloco_ == oldChild )
        {
            setBloco ((PBloco) newChild);
            return;
        }
    }

}
