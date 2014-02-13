/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Model#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Model#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Model#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Model#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttrList)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel_Attr()
   * @model containment="true"
   * @generated
   */
  AttrList getAttr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Model#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrList value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDecl();

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(StatementBlock)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel_Stmt()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStmt();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Model#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(StatementBlock value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.Block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getModel_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<Block> getBlocks();

} // Model
