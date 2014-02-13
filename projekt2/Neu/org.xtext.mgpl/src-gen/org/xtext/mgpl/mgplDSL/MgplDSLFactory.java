/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage
 * @generated
 */
public interface MgplDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MgplDSLFactory eINSTANCE = org.xtext.mgpl.mgplDSL.impl.MgplDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>VARE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARE</em>'.
   * @generated
   */
  VARE createVARE();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Anim Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anim Block</em>'.
   * @generated
   */
  AnimBlock createAnimBlock();

  /**
   * Returns a new object of class '<em>Event Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Block</em>'.
   * @generated
   */
  EventBlock createEventBlock();

  /**
   * Returns a new object of class '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Block</em>'.
   * @generated
   */
  StatementBlock createStatementBlock();

  /**
   * Returns a new object of class '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt</em>'.
   * @generated
   */
  Stmt createStmt();

  /**
   * Returns a new object of class '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Stmt</em>'.
   * @generated
   */
  ForStmt createForStmt();

  /**
   * Returns a new object of class '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Stmt</em>'.
   * @generated
   */
  IfStmt createIfStmt();

  /**
   * Returns a new object of class '<em>Else Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Stmt</em>'.
   * @generated
   */
  ElseStmt createElseStmt();

  /**
   * Returns a new object of class '<em>Ass Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ass Stmt</em>'.
   * @generated
   */
  AssStmt createAssStmt();

  /**
   * Returns a new object of class '<em>Ass Stmt2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ass Stmt2</em>'.
   * @generated
   */
  AssStmt2 createAssStmt2();

  /**
   * Returns a new object of class '<em>Attr List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr List</em>'.
   * @generated
   */
  AttrList createAttrList();

  /**
   * Returns a new object of class '<em>Attr Ass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr Ass</em>'.
   * @generated
   */
  AttrAss createAttrAss();

  /**
   * Returns a new object of class '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOL</em>'.
   * @generated
   */
  BOOL createBOOL();

  /**
   * Returns a new object of class '<em>ARI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARI</em>'.
   * @generated
   */
  ARI createARI();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>VARI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARI</em>'.
   * @generated
   */
  VARI createVARI();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MgplDSLPackage getMgplDSLPackage();

} //MgplDSLFactory
