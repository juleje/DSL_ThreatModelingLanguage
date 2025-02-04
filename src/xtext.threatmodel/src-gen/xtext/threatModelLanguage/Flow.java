/**
 * generated by Xtext 2.33.0
 */
package xtext.threatModelLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.threatModelLanguage.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link xtext.threatModelLanguage.Flow#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see xtext.threatModelLanguage.ThreatModelLanguagePackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Type
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Entity)
   * @see xtext.threatModelLanguage.ThreatModelLanguagePackage#getFlow_Source()
   * @model
   * @generated
   */
  Entity getSource();

  /**
   * Sets the value of the '{@link xtext.threatModelLanguage.Flow#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Entity value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(Entity)
   * @see xtext.threatModelLanguage.ThreatModelLanguagePackage#getFlow_Destination()
   * @model
   * @generated
   */
  Entity getDestination();

  /**
   * Sets the value of the '{@link xtext.threatModelLanguage.Flow#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Entity value);

} // Flow
