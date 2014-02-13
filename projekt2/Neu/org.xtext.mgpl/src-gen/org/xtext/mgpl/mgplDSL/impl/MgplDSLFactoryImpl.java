/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.mgpl.mgplDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MgplDSLFactoryImpl extends EFactoryImpl implements MgplDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MgplDSLFactory init()
  {
    try
    {
      MgplDSLFactory theMgplDSLFactory = (MgplDSLFactory)EPackage.Registry.INSTANCE.getEFactory(MgplDSLPackage.eNS_URI);
      if (theMgplDSLFactory != null)
      {
        return theMgplDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MgplDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MgplDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MgplDSLPackage.MODEL: return createModel();
      case MgplDSLPackage.GAME: return createGame();
      case MgplDSLPackage.DECLARATION: return createDeclaration();
      case MgplDSLPackage.VAR_DECL: return createVarDecl();
      case MgplDSLPackage.INIT: return createInit();
      case MgplDSLPackage.OBJ_DECL: return createObjDecl();
      case MgplDSLPackage.BLOCK: return createBlock();
      case MgplDSLPackage.ANIM_BLOCK: return createAnimBlock();
      case MgplDSLPackage.EVENT_BLOCK: return createEventBlock();
      case MgplDSLPackage.STATEMENT_BLOCK: return createStatementBlock();
      case MgplDSLPackage.STMT: return createStmt();
      case MgplDSLPackage.FOR_STMT: return createForStmt();
      case MgplDSLPackage.IF_STMT: return createIfStmt();
      case MgplDSLPackage.ELSE_STMT: return createElseStmt();
      case MgplDSLPackage.ASS_STMT: return createAssStmt();
      case MgplDSLPackage.ASS_STMT2: return createAssStmt2();
      case MgplDSLPackage.ATTR_LIST: return createAttrList();
      case MgplDSLPackage.ATTR_ASS: return createAttrAss();
      case MgplDSLPackage.EXPR: return createExpr();
      case MgplDSLPackage.DISJ: return createDisj();
      case MgplDSLPackage.CONJ: return createConj();
      case MgplDSLPackage.RELAT: return createRelat();
      case MgplDSLPackage.ADD: return createAdd();
      case MgplDSLPackage.MULT: return createMult();
      case MgplDSLPackage.UNARY: return createUnary();
      case MgplDSLPackage.ATOM: return createAtom();
      case MgplDSLPackage.VAR: return createVar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjDecl createObjDecl()
  {
    ObjDeclImpl objDecl = new ObjDeclImpl();
    return objDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnimBlock createAnimBlock()
  {
    AnimBlockImpl animBlock = new AnimBlockImpl();
    return animBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventBlock createEventBlock()
  {
    EventBlockImpl eventBlock = new EventBlockImpl();
    return eventBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock createStatementBlock()
  {
    StatementBlockImpl statementBlock = new StatementBlockImpl();
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt createStmt()
  {
    StmtImpl stmt = new StmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStmt createForStmt()
  {
    ForStmtImpl forStmt = new ForStmtImpl();
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt createIfStmt()
  {
    IfStmtImpl ifStmt = new IfStmtImpl();
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseStmt createElseStmt()
  {
    ElseStmtImpl elseStmt = new ElseStmtImpl();
    return elseStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssStmt createAssStmt()
  {
    AssStmtImpl assStmt = new AssStmtImpl();
    return assStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssStmt2 createAssStmt2()
  {
    AssStmt2Impl assStmt2 = new AssStmt2Impl();
    return assStmt2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrList createAttrList()
  {
    AttrListImpl attrList = new AttrListImpl();
    return attrList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrAss createAttrAss()
  {
    AttrAssImpl attrAss = new AttrAssImpl();
    return attrAss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disj createDisj()
  {
    DisjImpl disj = new DisjImpl();
    return disj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conj createConj()
  {
    ConjImpl conj = new ConjImpl();
    return conj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relat createRelat()
  {
    RelatImpl relat = new RelatImpl();
    return relat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary createUnary()
  {
    UnaryImpl unary = new UnaryImpl();
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MgplDSLPackage getMgplDSLPackage()
  {
    return (MgplDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MgplDSLPackage getPackage()
  {
    return MgplDSLPackage.eINSTANCE;
  }

} //MgplDSLFactoryImpl
