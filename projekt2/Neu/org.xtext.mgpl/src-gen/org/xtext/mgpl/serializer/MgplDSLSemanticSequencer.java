package org.xtext.mgpl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mgpl.mgplDSL.Add;
import org.xtext.mgpl.mgplDSL.AnimBlock;
import org.xtext.mgpl.mgplDSL.AssStmt;
import org.xtext.mgpl.mgplDSL.AssStmt2;
import org.xtext.mgpl.mgplDSL.Atom;
import org.xtext.mgpl.mgplDSL.AttrAss;
import org.xtext.mgpl.mgplDSL.AttrList;
import org.xtext.mgpl.mgplDSL.Conj;
import org.xtext.mgpl.mgplDSL.Declaration;
import org.xtext.mgpl.mgplDSL.Disj;
import org.xtext.mgpl.mgplDSL.ElseStmt;
import org.xtext.mgpl.mgplDSL.EventBlock;
import org.xtext.mgpl.mgplDSL.ForStmt;
import org.xtext.mgpl.mgplDSL.Game;
import org.xtext.mgpl.mgplDSL.IfStmt;
import org.xtext.mgpl.mgplDSL.Init;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.Model;
import org.xtext.mgpl.mgplDSL.Mult;
import org.xtext.mgpl.mgplDSL.ObjDecl;
import org.xtext.mgpl.mgplDSL.Relat;
import org.xtext.mgpl.mgplDSL.StatementBlock;
import org.xtext.mgpl.mgplDSL.Unary;
import org.xtext.mgpl.mgplDSL.Var;
import org.xtext.mgpl.mgplDSL.VarDecl;
import org.xtext.mgpl.services.MgplDSLGrammarAccess;

@SuppressWarnings("all")
public class MgplDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MgplDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MgplDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MgplDSLPackage.ADD:
				if(context == grammarAccess.getAddRule()) {
					sequence_Add(context, (Add) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ANIM_BLOCK:
				if(context == grammarAccess.getAnimBlockRule() ||
				   context == grammarAccess.getBlockRule()) {
					sequence_AnimBlock(context, (AnimBlock) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ASS_STMT:
				if(context == grammarAccess.getAssStmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_AssStmt(context, (AssStmt) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ASS_STMT2:
				if(context == grammarAccess.getAssStmt2Rule()) {
					sequence_AssStmt2(context, (AssStmt2) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ATOM:
				if(context == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ATTR_ASS:
				if(context == grammarAccess.getAttrAssRule()) {
					sequence_AttrAss(context, (AttrAss) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ATTR_LIST:
				if(context == grammarAccess.getAttrListRule()) {
					sequence_AttrList(context, (AttrList) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.CONJ:
				if(context == grammarAccess.getConjRule()) {
					sequence_Conj(context, (Conj) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.DISJ:
				if(context == grammarAccess.getDisjRule() ||
				   context == grammarAccess.getExprRule()) {
					sequence_Disj(context, (Disj) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.ELSE_STMT:
				if(context == grammarAccess.getElseStmtRule()) {
					sequence_ElseStmt(context, (ElseStmt) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.EVENT_BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getEventBlockRule()) {
					sequence_EventBlock(context, (EventBlock) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.FOR_STMT:
				if(context == grammarAccess.getForStmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_ForStmt(context, (ForStmt) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.GAME:
				if(context == grammarAccess.getGameRule()) {
					sequence_Game(context, (Game) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.IF_STMT:
				if(context == grammarAccess.getIfStmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_IfStmt(context, (IfStmt) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.INIT:
				if(context == grammarAccess.getInitRule()) {
					sequence_Init(context, (Init) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.MULT:
				if(context == grammarAccess.getMultRule()) {
					sequence_Mult(context, (Mult) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.OBJ_DECL:
				if(context == grammarAccess.getObjDeclRule()) {
					sequence_ObjDecl(context, (ObjDecl) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.RELAT:
				if(context == grammarAccess.getRelatRule()) {
					sequence_Relat(context, (Relat) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.STATEMENT_BLOCK:
				if(context == grammarAccess.getStatementBlockRule()) {
					sequence_StatementBlock(context, (StatementBlock) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.UNARY:
				if(context == grammarAccess.getUnaryRule()) {
					sequence_Unary(context, (Unary) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.VAR:
				if(context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case MgplDSLPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (mult+=Mult mult+=Mult*)
	 */
	protected void sequence_Add(EObject context, Add semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ObjType objName=ID stmt=StatementBlock)
	 */
	protected void sequence_AnimBlock(EObject context, AnimBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.BLOCK__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.BLOCK__STMT));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__NAME));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__TYPE));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ANIM_BLOCK__OBJ_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0(), semanticObject.getObjName());
		feeder.accept(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=Var expr=Expr)
	 */
	protected void sequence_AssStmt2(EObject context, AssStmt2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ASS_STMT2__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ASS_STMT2__VAR));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ASS_STMT2__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ASS_STMT2__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=Var expr=Expr)
	 */
	protected void sequence_AssStmt(EObject context, AssStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.STMT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.STMT__EXPR));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ASS_STMT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ASS_STMT__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (int=INT | (var1=Var var2=Var?) | expr=Expr)
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=Expr)
	 */
	protected void sequence_AttrAss(EObject context, AttrAss semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ATTR_ASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ATTR_ASS__NAME));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ATTR_ASS__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ATTR_ASS__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attr+=AttrAss? attr+=AttrAss*)
	 */
	protected void sequence_AttrList(EObject context, AttrList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relat+=Relat relat+=Relat*)
	 */
	protected void sequence_Conj(EObject context, Conj semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=VarDecl | obj=ObjDecl)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conj+=Conj conj+=Conj*)
	 */
	protected void sequence_Disj(EObject context, Disj semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stmt=StatementBlock
	 */
	protected void sequence_ElseStmt(EObject context, ElseStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.ELSE_STMT__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.ELSE_STMT__STMT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=Keystroke stmt=StatementBlock)
	 */
	protected void sequence_EventBlock(EObject context, EventBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.BLOCK__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.BLOCK__STMT));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.EVENT_BLOCK__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.EVENT_BLOCK__KEY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ass1=AssStmt expr=Expr ass2=AssStmt2 stmt=StatementBlock)
	 */
	protected void sequence_ForStmt(EObject context, ForStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.STMT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.STMT__EXPR));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.FOR_STMT__ASS1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.FOR_STMT__ASS1));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.FOR_STMT__ASS2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.FOR_STMT__ASS2));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.FOR_STMT__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.FOR_STMT__STMT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0(), semanticObject.getAss1());
		feeder.accept(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0(), semanticObject.getAss2());
		feeder.accept(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attr=AttrList)
	 */
	protected void sequence_Game(EObject context, Game semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.GAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.GAME__NAME));
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.GAME__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.GAME__ATTR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGameAccess().getAttrAttrListParserRuleCall_3_0(), semanticObject.getAttr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr stmt=StatementBlock else=ElseStmt?)
	 */
	protected void sequence_IfStmt(EObject context, IfStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Init(EObject context, Init semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.INIT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.INIT__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (game=Game decl+=Declaration* stmt=StatementBlock blocks+=Block*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unary+=Unary unary+=Unary*)
	 */
	protected void sequence_Mult(EObject context, Mult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ObjType name=ID (attr=AttrList | int=INT))
	 */
	protected void sequence_ObjDecl(EObject context, ObjDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (add+=Add add+=Add*)
	 */
	protected void sequence_Relat(EObject context, Relat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stmt+=Stmt*)
	 */
	protected void sequence_StatementBlock(EObject context, StatementBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     atom=Atom
	 */
	protected void sequence_Unary(EObject context, Unary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MgplDSLPackage.Literals.UNARY__ATOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MgplDSLPackage.Literals.UNARY__ATOM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0(), semanticObject.getAtom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (expr=Init? | int=INT))
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((expr=Expr subname=ID?) | subname=ID)?)
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
