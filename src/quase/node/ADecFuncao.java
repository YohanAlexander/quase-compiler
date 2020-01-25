/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ADecFuncao extends PDecFuncao
{
    private TFuncao _funcao_;
    private PTipo _tipo_;
    private TId _id_;
    private TParentesesEsquerdo _parenteses_esquerdo_;
    private PParametros _parametros_;
    private TParentesesDireito _parenteses_direito_;
    private PExp _exp_;

    public ADecFuncao ()
    {
    }

    public ADecFuncao (
            TFuncao _funcao_,
            PTipo _tipo_,
            TId _id_,
            TParentesesEsquerdo _parenteses_esquerdo_,
            PParametros _parametros_,
            TParentesesDireito _parenteses_direito_,
            PExp _exp_
    )
    {
        setFuncao (_funcao_);
        setTipo (_tipo_);
        setId (_id_);
        setParentesesEsquerdo (_parenteses_esquerdo_);
        setParametros (_parametros_);
        setParentesesDireito (_parenteses_direito_);
        setExp (_exp_);
    }

    public Object clone()
    {
        return new ADecFuncao (
            (TFuncao)cloneNode (_funcao_),
            (PTipo)cloneNode (_tipo_),
            (TId)cloneNode (_id_),
            (TParentesesEsquerdo)cloneNode (_parenteses_esquerdo_),
            (PParametros)cloneNode (_parametros_),
            (TParentesesDireito)cloneNode (_parenteses_direito_),
            (PExp)cloneNode (_exp_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncao(this);
    }

    public TFuncao getFuncao ()
    {
        return _funcao_;
    }

    public void setFuncao (TFuncao node)
    {
        if(_funcao_ != null)
        {
            _funcao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _funcao_ = node;
    }
    public PTipo getTipo ()
    {
        return _tipo_;
    }

    public void setTipo (PTipo node)
    {
        if(_tipo_ != null)
        {
            _tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _tipo_ = node;
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
    public TParentesesEsquerdo getParentesesEsquerdo ()
    {
        return _parenteses_esquerdo_;
    }

    public void setParentesesEsquerdo (TParentesesEsquerdo node)
    {
        if(_parenteses_esquerdo_ != null)
        {
            _parenteses_esquerdo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parenteses_esquerdo_ = node;
    }
    public PParametros getParametros ()
    {
        return _parametros_;
    }

    public void setParametros (PParametros node)
    {
        if(_parametros_ != null)
        {
            _parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parametros_ = node;
    }
    public TParentesesDireito getParentesesDireito ()
    {
        return _parenteses_direito_;
    }

    public void setParentesesDireito (TParentesesDireito node)
    {
        if(_parenteses_direito_ != null)
        {
            _parenteses_direito_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parenteses_direito_ = node;
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
            + toString (_funcao_)
            + toString (_tipo_)
            + toString (_id_)
            + toString (_parenteses_esquerdo_)
            + toString (_parametros_)
            + toString (_parenteses_direito_)
            + toString (_exp_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _funcao_ == child )
        {
            _funcao_ = null;
            return;
        }
        if ( _tipo_ == child )
        {
            _tipo_ = null;
            return;
        }
        if ( _id_ == child )
        {
            _id_ = null;
            return;
        }
        if ( _parenteses_esquerdo_ == child )
        {
            _parenteses_esquerdo_ = null;
            return;
        }
        if ( _parametros_ == child )
        {
            _parametros_ = null;
            return;
        }
        if ( _parenteses_direito_ == child )
        {
            _parenteses_direito_ = null;
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
        if ( _funcao_ == oldChild )
        {
            setFuncao ((TFuncao) newChild);
            return;
        }
        if ( _tipo_ == oldChild )
        {
            setTipo ((PTipo) newChild);
            return;
        }
        if ( _id_ == oldChild )
        {
            setId ((TId) newChild);
            return;
        }
        if ( _parenteses_esquerdo_ == oldChild )
        {
            setParentesesEsquerdo ((TParentesesEsquerdo) newChild);
            return;
        }
        if ( _parametros_ == oldChild )
        {
            setParametros ((PParametros) newChild);
            return;
        }
        if ( _parenteses_direito_ == oldChild )
        {
            setParentesesDireito ((TParentesesDireito) newChild);
            return;
        }
        if ( _exp_ == oldChild )
        {
            setExp ((PExp) newChild);
            return;
        }
    }

}
