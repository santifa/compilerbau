package org.xtext.mgpl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.mgpl.services.MgplDSLGrammarAccess;

@SuppressWarnings("all")
public class MgplDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MgplDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Add_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0;
	protected AbstractElementAlias match_Mult_AsteriskKeyword_1_0_0_or_SolidusKeyword_1_0_1;
	protected AbstractElementAlias match_Relat_EqualsSignEqualsSignKeyword_1_0_0_or_LessThanSignEqualsSignKeyword_1_0_2_or_LessThanSignKeyword_1_0_1;
	protected AbstractElementAlias match_Unary___ExclamationMarkKeyword_0_0_or_HyphenMinusKeyword_0_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MgplDSLGrammarAccess) access;
		match_Add_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0()));
		match_Mult_AsteriskKeyword_1_0_0_or_SolidusKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMultAccess().getSolidusKeyword_1_0_1()));
		match_Relat_EqualsSignEqualsSignKeyword_1_0_0_or_LessThanSignEqualsSignKeyword_1_0_2_or_LessThanSignKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1()));
		match_Unary___ExclamationMarkKeyword_0_0_or_HyphenMinusKeyword_0_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Add_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0.equals(syntax))
				emit_Add_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mult_AsteriskKeyword_1_0_0_or_SolidusKeyword_1_0_1.equals(syntax))
				emit_Mult_AsteriskKeyword_1_0_0_or_SolidusKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Relat_EqualsSignEqualsSignKeyword_1_0_0_or_LessThanSignEqualsSignKeyword_1_0_2_or_LessThanSignKeyword_1_0_1.equals(syntax))
				emit_Relat_EqualsSignEqualsSignKeyword_1_0_0_or_LessThanSignEqualsSignKeyword_1_0_2_or_LessThanSignKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Unary___ExclamationMarkKeyword_0_0_or_HyphenMinusKeyword_0_1__a.equals(syntax))
				emit_Unary___ExclamationMarkKeyword_0_0_or_HyphenMinusKeyword_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '-' | '+'
	 */
	protected void emit_Add_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '/' | '*'
	 */
	protected void emit_Mult_AsteriskKeyword_1_0_0_or_SolidusKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '<' | '<=' | '=='
	 */
	protected void emit_Relat_EqualsSignEqualsSignKeyword_1_0_0_or_LessThanSignEqualsSignKeyword_1_0_2_or_LessThanSignKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('-' | '!')*
	 */
	protected void emit_Unary___ExclamationMarkKeyword_0_0_or_HyphenMinusKeyword_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
