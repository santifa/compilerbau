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
      case MgplDSLPackage.DECLARATION: return createDeclaration();
      case MgplDSLPackage.VARE: return createVARE();
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
      case MgplDSLPackage.BOOL: return createBOOL();
      case MgplDSLPackage.ARI: return createARI();
      case MgplDSLPackage.ATOM: return createAtom();
      case MgplDSLPackage.VARI: return createVARI();
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
  public VARE createVARE()
  {
    VAREImpl vare = new VAREImpl();
    return vare;
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
  public BOOL createBOOL()
  {
    BOOLImpl bool = new BOOLImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARI createARI()
  {
    ARIImpl ari = new ARIImpl();
    return ari;
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
  public VARI createVARI()
  {
    VARIImpl vari = new VARIImpl();
    return vari;
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
