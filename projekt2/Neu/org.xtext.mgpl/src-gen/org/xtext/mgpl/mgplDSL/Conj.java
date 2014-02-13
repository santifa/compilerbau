/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Conj#getRelat <em>Relat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getConj()
 * @model
 * @generated
 */
public interface Conj extends EObject
{
  /**
   * Returns the value of the '<em><b>Relat</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.Relat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relat</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relat</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getConj_Relat()
   * @model containment="true"
   * @generated
   */
  EList<Relat> getRelat();

} // Conj
