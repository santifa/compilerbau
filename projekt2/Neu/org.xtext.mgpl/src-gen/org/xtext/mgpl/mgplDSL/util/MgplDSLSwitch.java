/**
 */
package org.xtext.mgpl.mgplDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.mgpl.mgplDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage
 * @generated
 */
public class MgplDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MgplDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MgplDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MgplDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MgplDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.VARE:
      {
        VARE vare = (VARE)theEObject;
        T result = caseVARE(vare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ANIM_BLOCK:
      {
        AnimBlock animBlock = (AnimBlock)theEObject;
        T result = caseAnimBlock(animBlock);
        if (result == null) result = caseBlock(animBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.EVENT_BLOCK:
      {
        EventBlock eventBlock = (EventBlock)theEObject;
        T result = caseEventBlock(eventBlock);
        if (result == null) result = caseBlock(eventBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.STATEMENT_BLOCK:
      {
        StatementBlock statementBlock = (StatementBlock)theEObject;
        T result = caseStatementBlock(statementBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.FOR_STMT:
      {
        ForStmt forStmt = (ForStmt)theEObject;
        T result = caseForStmt(forStmt);
        if (result == null) result = caseStmt(forStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.IF_STMT:
      {
        IfStmt ifStmt = (IfStmt)theEObject;
        T result = caseIfStmt(ifStmt);
        if (result == null) result = caseStmt(ifStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ELSE_STMT:
      {
        ElseStmt elseStmt = (ElseStmt)theEObject;
        T result = caseElseStmt(elseStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ASS_STMT:
      {
        AssStmt assStmt = (AssStmt)theEObject;
        T result = caseAssStmt(assStmt);
        if (result == null) result = caseStmt(assStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ASS_STMT2:
      {
        AssStmt2 assStmt2 = (AssStmt2)theEObject;
        T result = caseAssStmt2(assStmt2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ATTR_LIST:
      {
        AttrList attrList = (AttrList)theEObject;
        T result = caseAttrList(attrList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ATTR_ASS:
      {
        AttrAss attrAss = (AttrAss)theEObject;
        T result = caseAttrAss(attrAss);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.BOOL:
      {
        BOOL bool = (BOOL)theEObject;
        T result = caseBOOL(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ARI:
      {
        ARI ari = (ARI)theEObject;
        T result = caseARI(ari);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MgplDSLPackage.VARI:
      {
        VARI vari = (VARI)theEObject;
        T result = caseVARI(vari);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARE(VARE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anim Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anim Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimBlock(AnimBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventBlock(EventBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementBlock(StatementBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStmt(ForStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStmt(IfStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseStmt(ElseStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ass Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ass Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssStmt(AssStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ass Stmt2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ass Stmt2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssStmt2(AssStmt2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrList(AttrList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Ass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Ass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrAss(AttrAss object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOL(BOOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARI(ARI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARI(VARI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MgplDSLSwitch
