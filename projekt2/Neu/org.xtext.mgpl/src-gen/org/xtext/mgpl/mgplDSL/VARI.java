/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getConj <em>Conj</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getRelat <em>Relat</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getMult <em>Mult</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getAtom <em>Atom</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getSubname <em>Subname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI()
 * @model
 * @generated
 */
public interface VARI extends EObject
{
  /**
   * Returns the value of the '<em><b>Conj</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.VARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conj</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Conj()
   * @model containment="true"
   * @generated
   */
  EList<VARI> getConj();

  /**
   * Returns the value of the '<em><b>Relat</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.VARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relat</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relat</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Relat()
   * @model containment="true"
   * @generated
   */
  EList<VARI> getRelat();

  /**
   * Returns the value of the '<em><b>Add</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.VARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Add()
   * @model containment="true"
   * @generated
   */
  EList<VARI> getAdd();

  /**
   * Returns the value of the '<em><b>Mult</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.VARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mult</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mult</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Mult()
   * @model containment="true"
   * @generated
   */
  EList<VARI> getMult();

  /**
   * Returns the value of the '<em><b>Unary</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.VARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Unary()
   * @model containment="true"
   * @generated
   */
  EList<VARI> getUnary();

  /**
   * Returns the value of the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' containment reference.
   * @see #setAtom(Atom)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Expr()
   * @model containment="true"
   * @generated
   */
  VARI getExpr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(VARI value);

  /**
   * Returns the value of the '<em><b>Subname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subname</em>' attribute.
   * @see #setSubname(String)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Subname()
   * @model
   * @generated
   */
  String getSubname();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getSubname <em>Subname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subname</em>' attribute.
   * @see #getSubname()
   * @generated
   */
  void setSubname(String value);

} // VARI
