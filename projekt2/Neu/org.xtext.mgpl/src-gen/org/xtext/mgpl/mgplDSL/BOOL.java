/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOOL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.BOOL#getConj <em>Conj</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.BOOL#getRelat <em>Relat</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.BOOL#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getBOOL()
 * @model
 * @generated
 */
public interface BOOL extends EObject
{
  /**
   * Returns the value of the '<em><b>Conj</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.BOOL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conj</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getBOOL_Conj()
   * @model containment="true"
   * @generated
   */
  EList<BOOL> getConj();

  /**
   * Returns the value of the '<em><b>Relat</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.BOOL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relat</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relat</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getBOOL_Relat()
   * @model containment="true"
   * @generated
   */
  EList<BOOL> getRelat();

  /**
   * Returns the value of the '<em><b>Add</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.ARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getBOOL_Add()
   * @model containment="true"
   * @generated
   */
  EList<ARI> getAdd();

} // BOOL
