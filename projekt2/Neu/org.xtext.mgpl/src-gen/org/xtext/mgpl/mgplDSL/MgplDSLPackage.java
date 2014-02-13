/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.mgpl.mgplDSL.MgplDSLFactory
 * @model kind="package"
 * @generated
 */
public interface MgplDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mgplDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/mgpl/MgplDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mgplDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MgplDSLPackage eINSTANCE = org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ModelImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Game</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GAME = 0;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECL = 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STMT = 2;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BLOCKS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.GameImpl <em>Game</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.GameImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getGame()
   * @generated
   */
  int GAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__ATTR = 1;

  /**
   * The number of structural features of the '<em>Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.DeclarationImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__OBJ = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.VarDeclImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__EXPR = 1;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__INT = 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.InitImpl <em>Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.InitImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getInit()
   * @generated
   */
  int INIT = 4;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__EXPR = 0;

  /**
   * The number of structural features of the '<em>Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ObjDeclImpl <em>Obj Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ObjDeclImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getObjDecl()
   * @generated
   */
  int OBJ_DECL = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJ_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJ_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJ_DECL__ATTR = 2;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJ_DECL__INT = 3;

  /**
   * The number of structural features of the '<em>Obj Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJ_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.BlockImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 6;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STMT = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AnimBlockImpl <em>Anim Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AnimBlockImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAnimBlock()
   * @generated
   */
  int ANIM_BLOCK = 7;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIM_BLOCK__STMT = BLOCK__STMT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIM_BLOCK__NAME = BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIM_BLOCK__TYPE = BLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Obj Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIM_BLOCK__OBJ_NAME = BLOCK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Anim Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIM_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.EventBlockImpl <em>Event Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.EventBlockImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getEventBlock()
   * @generated
   */
  int EVENT_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_BLOCK__STMT = BLOCK__STMT;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_BLOCK__KEY = BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.StatementBlockImpl <em>Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.StatementBlockImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getStatementBlock()
   * @generated
   */
  int STATEMENT_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STMT = 0;

  /**
   * The number of structural features of the '<em>Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.StmtImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getStmt()
   * @generated
   */
  int STMT = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__EXPR = 0;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ForStmtImpl <em>For Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ForStmtImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getForStmt()
   * @generated
   */
  int FOR_STMT = 11;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__EXPR = STMT__EXPR;

  /**
   * The feature id for the '<em><b>Ass1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__ASS1 = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ass2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__ASS2 = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__STMT = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.IfStmtImpl <em>If Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.IfStmtImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getIfStmt()
   * @generated
   */
  int IF_STMT = 12;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__EXPR = STMT__EXPR;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__STMT = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ElseStmtImpl <em>Else Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ElseStmtImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getElseStmt()
   * @generated
   */
  int ELSE_STMT = 13;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT__STMT = 0;

  /**
   * The number of structural features of the '<em>Else Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AssStmtImpl <em>Ass Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AssStmtImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAssStmt()
   * @generated
   */
  int ASS_STMT = 14;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT__EXPR = STMT__EXPR;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT__VAR = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ass Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AssStmt2Impl <em>Ass Stmt2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AssStmt2Impl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAssStmt2()
   * @generated
   */
  int ASS_STMT2 = 15;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT2__VAR = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT2__EXPR = 1;

  /**
   * The number of structural features of the '<em>Ass Stmt2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASS_STMT2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AttrListImpl <em>Attr List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AttrListImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAttrList()
   * @generated
   */
  int ATTR_LIST = 16;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST__ATTR = 0;

  /**
   * The number of structural features of the '<em>Attr List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AttrAssImpl <em>Attr Ass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AttrAssImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAttrAss()
   * @generated
   */
  int ATTR_ASS = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_ASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_ASS__EXPR = 1;

  /**
   * The number of structural features of the '<em>Attr Ass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_ASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ExprImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 18;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.DisjImpl <em>Disj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.DisjImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getDisj()
   * @generated
   */
  int DISJ = 19;

  /**
   * The feature id for the '<em><b>Conj</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJ__CONJ = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJ_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.ConjImpl <em>Conj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.ConjImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getConj()
   * @generated
   */
  int CONJ = 20;

  /**
   * The feature id for the '<em><b>Relat</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJ__RELAT = 0;

  /**
   * The number of structural features of the '<em>Conj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJ_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.RelatImpl <em>Relat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.RelatImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getRelat()
   * @generated
   */
  int RELAT = 21;

  /**
   * The feature id for the '<em><b>Add</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELAT__ADD = 0;

  /**
   * The number of structural features of the '<em>Relat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELAT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AddImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAdd()
   * @generated
   */
  int ADD = 22;

  /**
   * The feature id for the '<em><b>Mult</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__MULT = 0;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.MultImpl <em>Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.MultImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getMult()
   * @generated
   */
  int MULT = 23;

  /**
   * The feature id for the '<em><b>Unary</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT__UNARY = 0;

  /**
   * The number of structural features of the '<em>Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.UnaryImpl <em>Unary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.UnaryImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getUnary()
   * @generated
   */
  int UNARY = 24;

  /**
   * The feature id for the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY__ATOM = 0;

  /**
   * The number of structural features of the '<em>Unary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.AtomImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 25;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__INT = 0;

  /**
   * The feature id for the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__VAR1 = 1;

  /**
   * The feature id for the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__VAR2 = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__EXPR = 3;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.mgpl.mgplDSL.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgpl.mgplDSL.impl.VarImpl
   * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getVar()
   * @generated
   */
  int VAR = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__EXPR = 1;

  /**
   * The feature id for the '<em><b>Subname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__SUBNAME = 2;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.mgpl.mgplDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Model#getGame <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Game</em>'.
   * @see org.xtext.mgpl.mgplDSL.Model#getGame()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Game();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Model#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see org.xtext.mgpl.mgplDSL.Model#getDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Model#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.Model#getStmt()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Model#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.xtext.mgpl.mgplDSL.Model#getBlocks()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Blocks();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game</em>'.
   * @see org.xtext.mgpl.mgplDSL.Game
   * @generated
   */
  EClass getGame();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.Game#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.Game#getName()
   * @see #getGame()
   * @generated
   */
  EAttribute getGame_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Game#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Game#getAttr()
   * @see #getGame()
   * @generated
   */
  EReference getGame_Attr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.mgpl.mgplDSL.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Declaration#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mgpl.mgplDSL.Declaration#getVar()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Declaration#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.xtext.mgpl.mgplDSL.Declaration#getObj()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Obj();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see org.xtext.mgpl.mgplDSL.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.VarDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.VarDecl#getName()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.VarDecl#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.VarDecl#getExpr()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.VarDecl#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.mgpl.mgplDSL.VarDecl#getInt()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Int();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init</em>'.
   * @see org.xtext.mgpl.mgplDSL.Init
   * @generated
   */
  EClass getInit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Init#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Init#getExpr()
   * @see #getInit()
   * @generated
   */
  EReference getInit_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.ObjDecl <em>Obj Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Obj Decl</em>'.
   * @see org.xtext.mgpl.mgplDSL.ObjDecl
   * @generated
   */
  EClass getObjDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.ObjDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.mgpl.mgplDSL.ObjDecl#getType()
   * @see #getObjDecl()
   * @generated
   */
  EAttribute getObjDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.ObjDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.ObjDecl#getName()
   * @see #getObjDecl()
   * @generated
   */
  EAttribute getObjDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.ObjDecl#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see org.xtext.mgpl.mgplDSL.ObjDecl#getAttr()
   * @see #getObjDecl()
   * @generated
   */
  EReference getObjDecl_Attr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.ObjDecl#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.mgpl.mgplDSL.ObjDecl#getInt()
   * @see #getObjDecl()
   * @generated
   */
  EAttribute getObjDecl_Int();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.mgpl.mgplDSL.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Block#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.Block#getStmt()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.AnimBlock <em>Anim Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anim Block</em>'.
   * @see org.xtext.mgpl.mgplDSL.AnimBlock
   * @generated
   */
  EClass getAnimBlock();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.AnimBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.AnimBlock#getName()
   * @see #getAnimBlock()
   * @generated
   */
  EAttribute getAnimBlock_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.AnimBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.mgpl.mgplDSL.AnimBlock#getType()
   * @see #getAnimBlock()
   * @generated
   */
  EAttribute getAnimBlock_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.AnimBlock#getObjName <em>Obj Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obj Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.AnimBlock#getObjName()
   * @see #getAnimBlock()
   * @generated
   */
  EAttribute getAnimBlock_ObjName();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.EventBlock <em>Event Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Block</em>'.
   * @see org.xtext.mgpl.mgplDSL.EventBlock
   * @generated
   */
  EClass getEventBlock();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.EventBlock#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.mgpl.mgplDSL.EventBlock#getKey()
   * @see #getEventBlock()
   * @generated
   */
  EAttribute getEventBlock_Key();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Block</em>'.
   * @see org.xtext.mgpl.mgplDSL.StatementBlock
   * @generated
   */
  EClass getStatementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.StatementBlock#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.StatementBlock#getStmt()
   * @see #getStatementBlock()
   * @generated
   */
  EReference getStatementBlock_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Stmt#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Stmt#getExpr()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.ForStmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.ForStmt
   * @generated
   */
  EClass getForStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss1 <em>Ass1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ass1</em>'.
   * @see org.xtext.mgpl.mgplDSL.ForStmt#getAss1()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Ass1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss2 <em>Ass2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ass2</em>'.
   * @see org.xtext.mgpl.mgplDSL.ForStmt#getAss2()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Ass2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.ForStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.ForStmt#getStmt()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.IfStmt
   * @generated
   */
  EClass getIfStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.IfStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.IfStmt#getStmt()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.IfStmt#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.xtext.mgpl.mgplDSL.IfStmt#getElse()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.ElseStmt <em>Else Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.ElseStmt
   * @generated
   */
  EClass getElseStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.ElseStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.ElseStmt#getStmt()
   * @see #getElseStmt()
   * @generated
   */
  EReference getElseStmt_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.AssStmt <em>Ass Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ass Stmt</em>'.
   * @see org.xtext.mgpl.mgplDSL.AssStmt
   * @generated
   */
  EClass getAssStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.AssStmt#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mgpl.mgplDSL.AssStmt#getVar()
   * @see #getAssStmt()
   * @generated
   */
  EReference getAssStmt_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.AssStmt2 <em>Ass Stmt2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ass Stmt2</em>'.
   * @see org.xtext.mgpl.mgplDSL.AssStmt2
   * @generated
   */
  EClass getAssStmt2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.AssStmt2#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mgpl.mgplDSL.AssStmt2#getVar()
   * @see #getAssStmt2()
   * @generated
   */
  EReference getAssStmt2_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.AssStmt2#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.AssStmt2#getExpr()
   * @see #getAssStmt2()
   * @generated
   */
  EReference getAssStmt2_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.AttrList <em>Attr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr List</em>'.
   * @see org.xtext.mgpl.mgplDSL.AttrList
   * @generated
   */
  EClass getAttrList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.AttrList#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr</em>'.
   * @see org.xtext.mgpl.mgplDSL.AttrList#getAttr()
   * @see #getAttrList()
   * @generated
   */
  EReference getAttrList_Attr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.AttrAss <em>Attr Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Ass</em>'.
   * @see org.xtext.mgpl.mgplDSL.AttrAss
   * @generated
   */
  EClass getAttrAss();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.AttrAss#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.AttrAss#getName()
   * @see #getAttrAss()
   * @generated
   */
  EAttribute getAttrAss_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.AttrAss#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.AttrAss#getExpr()
   * @see #getAttrAss()
   * @generated
   */
  EReference getAttrAss_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Disj <em>Disj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disj</em>'.
   * @see org.xtext.mgpl.mgplDSL.Disj
   * @generated
   */
  EClass getDisj();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Disj#getConj <em>Conj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conj</em>'.
   * @see org.xtext.mgpl.mgplDSL.Disj#getConj()
   * @see #getDisj()
   * @generated
   */
  EReference getDisj_Conj();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Conj <em>Conj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conj</em>'.
   * @see org.xtext.mgpl.mgplDSL.Conj
   * @generated
   */
  EClass getConj();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Conj#getRelat <em>Relat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relat</em>'.
   * @see org.xtext.mgpl.mgplDSL.Conj#getRelat()
   * @see #getConj()
   * @generated
   */
  EReference getConj_Relat();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Relat <em>Relat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relat</em>'.
   * @see org.xtext.mgpl.mgplDSL.Relat
   * @generated
   */
  EClass getRelat();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Relat#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Add</em>'.
   * @see org.xtext.mgpl.mgplDSL.Relat#getAdd()
   * @see #getRelat()
   * @generated
   */
  EReference getRelat_Add();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see org.xtext.mgpl.mgplDSL.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Add#getMult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mult</em>'.
   * @see org.xtext.mgpl.mgplDSL.Add#getMult()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Mult();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult</em>'.
   * @see org.xtext.mgpl.mgplDSL.Mult
   * @generated
   */
  EClass getMult();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mgpl.mgplDSL.Mult#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary</em>'.
   * @see org.xtext.mgpl.mgplDSL.Mult#getUnary()
   * @see #getMult()
   * @generated
   */
  EReference getMult_Unary();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Unary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary</em>'.
   * @see org.xtext.mgpl.mgplDSL.Unary
   * @generated
   */
  EClass getUnary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Unary#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom</em>'.
   * @see org.xtext.mgpl.mgplDSL.Unary#getAtom()
   * @see #getUnary()
   * @generated
   */
  EReference getUnary_Atom();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see org.xtext.mgpl.mgplDSL.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.Atom#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.mgpl.mgplDSL.Atom#getInt()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Int();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Atom#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var1</em>'.
   * @see org.xtext.mgpl.mgplDSL.Atom#getVar1()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Var1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Atom#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var2</em>'.
   * @see org.xtext.mgpl.mgplDSL.Atom#getVar2()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Var2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Atom#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Atom#getExpr()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mgpl.mgplDSL.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see org.xtext.mgpl.mgplDSL.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgpl.mgplDSL.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgpl.mgplDSL.Var#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mgpl.mgplDSL.Var#getExpr()
   * @see #getVar()
   * @generated
   */
  EReference getVar_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgpl.mgplDSL.Var#getSubname <em>Subname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subname</em>'.
   * @see org.xtext.mgpl.mgplDSL.Var#getSubname()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Subname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MgplDSLFactory getMgplDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ModelImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GAME = eINSTANCE.getModel_Game();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECL = eINSTANCE.getModel_Decl();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STMT = eINSTANCE.getModel_Stmt();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BLOCKS = eINSTANCE.getModel_Blocks();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.GameImpl <em>Game</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.GameImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getGame()
     * @generated
     */
    EClass GAME = eINSTANCE.getGame();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME__NAME = eINSTANCE.getGame_Name();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME__ATTR = eINSTANCE.getGame_Attr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.DeclarationImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VAR = eINSTANCE.getDeclaration_Var();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__OBJ = eINSTANCE.getDeclaration_Obj();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.VarDeclImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__EXPR = eINSTANCE.getVarDecl_Expr();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__INT = eINSTANCE.getVarDecl_Int();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.InitImpl <em>Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.InitImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getInit()
     * @generated
     */
    EClass INIT = eINSTANCE.getInit();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT__EXPR = eINSTANCE.getInit_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ObjDeclImpl <em>Obj Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ObjDeclImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getObjDecl()
     * @generated
     */
    EClass OBJ_DECL = eINSTANCE.getObjDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJ_DECL__TYPE = eINSTANCE.getObjDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJ_DECL__NAME = eINSTANCE.getObjDecl_Name();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJ_DECL__ATTR = eINSTANCE.getObjDecl_Attr();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJ_DECL__INT = eINSTANCE.getObjDecl_Int();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.BlockImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STMT = eINSTANCE.getBlock_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AnimBlockImpl <em>Anim Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AnimBlockImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAnimBlock()
     * @generated
     */
    EClass ANIM_BLOCK = eINSTANCE.getAnimBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANIM_BLOCK__NAME = eINSTANCE.getAnimBlock_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANIM_BLOCK__TYPE = eINSTANCE.getAnimBlock_Type();

    /**
     * The meta object literal for the '<em><b>Obj Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANIM_BLOCK__OBJ_NAME = eINSTANCE.getAnimBlock_ObjName();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.EventBlockImpl <em>Event Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.EventBlockImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getEventBlock()
     * @generated
     */
    EClass EVENT_BLOCK = eINSTANCE.getEventBlock();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_BLOCK__KEY = eINSTANCE.getEventBlock_Key();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.StatementBlockImpl <em>Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.StatementBlockImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getStatementBlock()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STMT = eINSTANCE.getStatementBlock_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.StmtImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__EXPR = eINSTANCE.getStmt_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ForStmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ForStmtImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getForStmt()
     * @generated
     */
    EClass FOR_STMT = eINSTANCE.getForStmt();

    /**
     * The meta object literal for the '<em><b>Ass1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__ASS1 = eINSTANCE.getForStmt_Ass1();

    /**
     * The meta object literal for the '<em><b>Ass2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__ASS2 = eINSTANCE.getForStmt_Ass2();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__STMT = eINSTANCE.getForStmt_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.IfStmtImpl <em>If Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.IfStmtImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getIfStmt()
     * @generated
     */
    EClass IF_STMT = eINSTANCE.getIfStmt();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__STMT = eINSTANCE.getIfStmt_Stmt();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSE = eINSTANCE.getIfStmt_Else();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ElseStmtImpl <em>Else Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ElseStmtImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getElseStmt()
     * @generated
     */
    EClass ELSE_STMT = eINSTANCE.getElseStmt();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_STMT__STMT = eINSTANCE.getElseStmt_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AssStmtImpl <em>Ass Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AssStmtImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAssStmt()
     * @generated
     */
    EClass ASS_STMT = eINSTANCE.getAssStmt();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASS_STMT__VAR = eINSTANCE.getAssStmt_Var();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AssStmt2Impl <em>Ass Stmt2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AssStmt2Impl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAssStmt2()
     * @generated
     */
    EClass ASS_STMT2 = eINSTANCE.getAssStmt2();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASS_STMT2__VAR = eINSTANCE.getAssStmt2_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASS_STMT2__EXPR = eINSTANCE.getAssStmt2_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AttrListImpl <em>Attr List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AttrListImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAttrList()
     * @generated
     */
    EClass ATTR_LIST = eINSTANCE.getAttrList();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_LIST__ATTR = eINSTANCE.getAttrList_Attr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AttrAssImpl <em>Attr Ass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AttrAssImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAttrAss()
     * @generated
     */
    EClass ATTR_ASS = eINSTANCE.getAttrAss();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_ASS__NAME = eINSTANCE.getAttrAss_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_ASS__EXPR = eINSTANCE.getAttrAss_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ExprImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.DisjImpl <em>Disj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.DisjImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getDisj()
     * @generated
     */
    EClass DISJ = eINSTANCE.getDisj();

    /**
     * The meta object literal for the '<em><b>Conj</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJ__CONJ = eINSTANCE.getDisj_Conj();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.ConjImpl <em>Conj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.ConjImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getConj()
     * @generated
     */
    EClass CONJ = eINSTANCE.getConj();

    /**
     * The meta object literal for the '<em><b>Relat</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJ__RELAT = eINSTANCE.getConj_Relat();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.RelatImpl <em>Relat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.RelatImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getRelat()
     * @generated
     */
    EClass RELAT = eINSTANCE.getRelat();

    /**
     * The meta object literal for the '<em><b>Add</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELAT__ADD = eINSTANCE.getRelat_Add();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AddImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Mult</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__MULT = eINSTANCE.getAdd_Mult();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.MultImpl <em>Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.MultImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getMult()
     * @generated
     */
    EClass MULT = eINSTANCE.getMult();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULT__UNARY = eINSTANCE.getMult_Unary();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.UnaryImpl <em>Unary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.UnaryImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getUnary()
     * @generated
     */
    EClass UNARY = eINSTANCE.getUnary();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY__ATOM = eINSTANCE.getUnary_Atom();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.AtomImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__INT = eINSTANCE.getAtom_Int();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__VAR1 = eINSTANCE.getAtom_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__VAR2 = eINSTANCE.getAtom_Var2();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__EXPR = eINSTANCE.getAtom_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mgpl.mgplDSL.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgpl.mgplDSL.impl.VarImpl
     * @see org.xtext.mgpl.mgplDSL.impl.MgplDSLPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__EXPR = eINSTANCE.getVar_Expr();

    /**
     * The meta object literal for the '<em><b>Subname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__SUBNAME = eINSTANCE.getVar_Subname();

  }

} //MgplDSLPackage
