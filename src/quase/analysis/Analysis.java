/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.analysis;

import quase.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramaPrograma(AProgramaPrograma node);
    void caseAListaClasseListaClasse(AListaClasseListaClasse node);
    void caseAClasseListaClasse(AClasseListaClasse node);
    void caseAFamiliaFamilia(AFamiliaFamilia node);
    void caseAVazioFamilia(AVazioFamilia node);
    void caseAListaRelacaoListaRelacao(AListaRelacaoListaRelacao node);
    void caseARelacaoListaRelacao(ARelacaoListaRelacao node);
    void caseARelacaoRelacao(ARelacaoRelacao node);
    void caseAFilhaRelacaoFilhaRelacao(AFilhaRelacaoFilhaRelacao node);
    void caseADefClasseDefClasse(ADefClasseDefClasse node);
    void caseAAtributosAtributos(AAtributosAtributos node);
    void caseAVazioAtributos(AVazioAtributos node);
    void caseAMetodosMetodos(AMetodosMetodos node);
    void caseAVazioMetodos(AVazioMetodos node);
    void caseAObjDec(AObjDec node);
    void caseAVarDec(AVarDec node);
    void caseAConsDec(AConsDec node);
    void caseAListaDecListaDecs(AListaDecListaDecs node);
    void caseAVazioListaDecs(AVazioListaDecs node);
    void caseADecObjDecObj(ADecObjDecObj node);
    void caseADecVarDecVar(ADecVarDecVar node);
    void caseADecConsDecCons(ADecConsDecCons node);
    void caseAInicializacaoInicializacao(AInicializacaoInicializacao node);
    void caseAListaIdListaId(AListaIdListaId node);
    void caseAIdListaId(AIdListaId node);
    void caseAListaInicializacaoListaInicializacao(AListaInicializacaoListaInicializacao node);
    void caseAInicializacaoListaInicializacao(AInicializacaoListaInicializacao node);
    void caseAClasseTipo(AClasseTipo node);
    void caseAPrimitivoTipo(APrimitivoTipo node);
    void caseAIntTipoPrimitivo(AIntTipoPrimitivo node);
    void caseABoolTipoPrimitivo(ABoolTipoPrimitivo node);
    void caseARealTipoPrimitivo(ARealTipoPrimitivo node);
    void caseATipoClasseTipoClasse(ATipoClasseTipoClasse node);
    void caseAProcDec2(AProcDec2 node);
    void caseAFuncDec2(AFuncDec2 node);
    void caseADecProcedimentoDecProcedimento(ADecProcedimentoDecProcedimento node);
    void caseADecFuncaoDecFuncao(ADecFuncaoDecFuncao node);
    void caseAParametrosParametros(AParametrosParametros node);
    void caseAVazioParametros(AVazioParametros node);
    void caseAListaParametroListaParametro(AListaParametroListaParametro node);
    void caseAParametroListaParametro(AParametroListaParametro node);
    void caseAParametroParametro(AParametroParametro node);
    void caseACondComando(ACondComando node);
    void caseACondElseComando(ACondElseComando node);
    void caseALoopComando(ALoopComando node);
    void caseAAtribComando(AAtribComando node);
    void caseACallComando(ACallComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseACondComandoElse(ACondComandoElse node);
    void caseALoopComandoElse(ALoopComandoElse node);
    void caseAAtribComandoElse(AAtribComandoElse node);
    void caseACallComandoElse(ACallComandoElse node);
    void caseABlocoComandoElse(ABlocoComandoElse node);
    void caseAContCondContComandoElse(AContCondContComandoElse node);
    void caseAListaComandosListaComandos(AListaComandosListaComandos node);
    void caseAVazioListaComandos(AVazioListaComandos node);
    void caseABlocoBloco(ABlocoBloco node);
    void caseACondExp(ACondExp node);
    void caseANegativoExp(ANegativoExp node);
    void caseASomaExp(ASomaExp node);
    void caseASubtExp(ASubtExp node);
    void caseAMultiExp(AMultiExp node);
    void caseADivExp(ADivExp node);
    void caseAModExp(AModExp node);
    void caseAIgualExp(AIgualExp node);
    void caseAMenorExp(AMenorExp node);
    void caseADifExp(ADifExp node);
    void caseAAndExp(AAndExp node);
    void caseAOrExp(AOrExp node);
    void caseABlocoExpExp(ABlocoExpExp node);
    void caseATermoExp(ATermoExp node);
    void caseAContCondCondExp2(AContCondCondExp2 node);
    void caseAFimCondCondExp3(AFimCondCondExp3 node);
    void caseAInteiroTermo(AInteiroTermo node);
    void caseARealTermo(ARealTermo node);
    void caseATrueTermo(ATrueTermo node);
    void caseAFalseTermo(AFalseTermo node);
    void caseAIdCallTermo(AIdCallTermo node);
    void caseAParTermo(AParTermo node);
    void caseAIdIdCall(AIdIdCall node);
    void caseACallIdCall(ACallIdCall node);
    void caseAAtribIdCall(AAtribIdCall node);
    void caseAIdPontoIdPonto(AIdPontoIdPonto node);
    void caseABlocoExpBlocoExp(ABlocoExpBlocoExp node);
    void caseAListaDecConsListaDecCons(AListaDecConsListaDecCons node);
    void caseAVazioListaDecCons(AVazioListaDecCons node);
    void caseAChamadaChamada(AChamadaChamada node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAExpListaExp(AExpListaExp node);
    void caseAVazioListaExp(AVazioListaExp node);
    void caseAVazioAtributo(AVazioAtributo node);

    void caseTEComercial(TEComercial node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTClasse(TClasse node);
    void caseTFilhaDaClasse(TFilhaDaClasse node);
    void caseTComeca(TComeca node);
    void caseTTermina(TTermina node);
    void caseTObjeto(TObjeto node);
    void caseTVirgula(TVirgula node);
    void caseTVariavel(TVariavel node);
    void caseTConstante(TConstante node);
    void caseTInicializacao(TInicializacao node);
    void caseTInt(TInt node);
    void caseTBool(TBool node);
    void caseTReal(TReal node);
    void caseTPontoDeEntrada(TPontoDeEntrada node);
    void caseTProcedimento(TProcedimento node);
    void caseTParentesesEsquerdo(TParentesesEsquerdo node);
    void caseTParentesesDireito(TParentesesDireito node);
    void caseTFuncao(TFuncao node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTPonto(TPonto node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTSubtracao(TSubtracao node);
    void caseTEntao(TEntao node);
    void caseTAdicao(TAdicao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTModulo(TModulo node);
    void caseTIgualdade(TIgualdade node);
    void caseTMenorQue(TMenorQue node);
    void caseTNegacao(TNegacao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTComentario(TComentario node);
    void caseTId(TId node);
    void caseTCid(TCid node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
