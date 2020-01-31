/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class AInicializacaoInicializacao extends PInicializacao
{
    private TId _id_;
    private TInicializacao _inicializacao_;
    private PExp _exp_;

    public AInicializacaoInicializacao ()
    {
    }

    public AInicializacaoInicializacao (
            TId _id_,
            TInicializacao _inicializacao_,
            PExp _exp_
    )
    {
        setId (_id_);
        setInicializacao (_inicializacao_);
        setExp (_exp_);
    }

    public Object clone()
    {
        return new AInicializacaoInicializacao (
            (TId)cloneNode (_id_),
            (TInicializacao)cloneNode (_inicializacao_),
            (PExp)cloneNode (_exp_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInicializacaoInicializacao(this);
    }

    public TId getId ()
    {
        return _id_;
    }

    public void setId (TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }
    public TInicializacao getInicializacao ()
    {
        return _inicializacao_;
    }

    public void setInicializacao (TInicializacao node)
    {
        if(_inicializacao_ != null)
        {
            _inicializacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _inicializacao_ = node;
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
            + toString (_id_)
            + toString (_inicializacao_)
            + toString (_exp_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _id_ == child )
        {
            _id_ = null;
            return;
        }
        if ( _inicializacao_ == child )
        {
            _inicializacao_ = null;
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
        if ( _id_ == oldChild )
        {
            setId ((TId) newChild);
            return;
        }
        if ( _inicializacao_ == oldChild )
        {
            setInicializacao ((TInicializacao) newChild);
            return;
        }
        if ( _exp_ == oldChild )
        {
            setExp ((PExp) newChild);
            return;
        }
    }

}
