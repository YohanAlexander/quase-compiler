/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

public final class ACallIdComandoSenao extends PComandoSenao
{
    private TSenao _senao_;
    private TId _id_;
    private TPonto _ponto_;
    private PChamada _chamada_;
    private TPontoVirgula _ponto_virgula_;

    public ACallIdComandoSenao ()
    {
    }

    public ACallIdComandoSenao (
            TSenao _senao_,
            TId _id_,
            TPonto _ponto_,
            PChamada _chamada_,
            TPontoVirgula _ponto_virgula_
    )
    {
        setSenao (_senao_);
        setId (_id_);
        setPonto (_ponto_);
        setChamada (_chamada_);
        setPontoVirgula (_ponto_virgula_);
    }

    public Object clone()
    {
        return new ACallIdComandoSenao (
            (TSenao)cloneNode (_senao_),
            (TId)cloneNode (_id_),
            (TPonto)cloneNode (_ponto_),
            (PChamada)cloneNode (_chamada_),
            (TPontoVirgula)cloneNode (_ponto_virgula_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACallIdComandoSenao(this);
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
    public TPonto getPonto ()
    {
        return _ponto_;
    }

    public void setPonto (TPonto node)
    {
        if(_ponto_ != null)
        {
            _ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ponto_ = node;
    }
    public PChamada getChamada ()
    {
        return _chamada_;
    }

    public void setChamada (PChamada node)
    {
        if(_chamada_ != null)
        {
            _chamada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _chamada_ = node;
    }
    public TPontoVirgula getPontoVirgula ()
    {
        return _ponto_virgula_;
    }

    public void setPontoVirgula (TPontoVirgula node)
    {
        if(_ponto_virgula_ != null)
        {
            _ponto_virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ponto_virgula_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_senao_)
            + toString (_id_)
            + toString (_ponto_)
            + toString (_chamada_)
            + toString (_ponto_virgula_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _senao_ == child )
        {
            _senao_ = null;
            return;
        }
        if ( _id_ == child )
        {
            _id_ = null;
            return;
        }
        if ( _ponto_ == child )
        {
            _ponto_ = null;
            return;
        }
        if ( _chamada_ == child )
        {
            _chamada_ = null;
            return;
        }
        if ( _ponto_virgula_ == child )
        {
            _ponto_virgula_ = null;
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
        if ( _id_ == oldChild )
        {
            setId ((TId) newChild);
            return;
        }
        if ( _ponto_ == oldChild )
        {
            setPonto ((TPonto) newChild);
            return;
        }
        if ( _chamada_ == oldChild )
        {
            setChamada ((PChamada) newChild);
            return;
        }
        if ( _ponto_virgula_ == oldChild )
        {
            setPontoVirgula ((TPontoVirgula) newChild);
            return;
        }
    }

}
