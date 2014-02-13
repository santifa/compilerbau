/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ARI#getMult <em>Mult</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ARI#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ARI#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getARI()
 * @model
 * @generated
 */
public interface ARI extends EObject
{
  /**
   * Returns the value of the '<em><b>Mult</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.ARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mult</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mult</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getARI_Mult()
   * @model containment="true"
   * @generated
   */
  EList<ARI> getMult();

  /**
   * Returns the value of the '<em><b>Unary</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.ARI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getARI_Unary()
   * @model containment="true"
   * @generated
   */
  EList<ARI> getUnary();

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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getARI_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.ARI#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

} // ARI
