/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I18N Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.I18NResource#getLanguage <em>Language</em>}</li>
 *   <li>{@link guizmo.structure.I18NResource#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getI18NResource()
 * @model
 * @generated
 */
public interface I18NResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.structure.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see guizmo.structure.LanguageType
	 * @see #setLanguage(LanguageType)
	 * @see guizmo.structure.StructurePackage#getI18NResource_Language()
	 * @model required="true"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link guizmo.structure.I18NResource#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see guizmo.structure.LanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.TextTranslation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getI18NResource_Translations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextTranslation> getTranslations();

} // I18NResource
