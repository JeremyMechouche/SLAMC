/**
 */
package slamc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import slamc.Service;
import slamc.SlamcPackage;
import slamc.Slo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slamc.impl.ServiceImpl#getPartie <em>Partie</em>}</li>
 *   <li>{@link slamc.impl.ServiceImpl#getSlos <em>Slos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getPartie() <em>Partie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartie()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartie() <em>Partie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartie()
	 * @generated
	 * @ordered
	 */
	protected String partie = PARTIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSlos() <em>Slos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlos()
	 * @generated
	 * @ordered
	 */
	protected EList<Slo> slos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlamcPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartie() {
		return partie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartie(String newPartie) {
		String oldPartie = partie;
		partie = newPartie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.SERVICE__PARTIE, oldPartie, partie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slo> getSlos() {
		if (slos == null) {
			slos = new EObjectContainmentEList<Slo>(Slo.class, this, SlamcPackage.SERVICE__SLOS);
		}
		return slos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlamcPackage.SERVICE__SLOS:
				return ((InternalEList<?>)getSlos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlamcPackage.SERVICE__PARTIE:
				return getPartie();
			case SlamcPackage.SERVICE__SLOS:
				return getSlos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlamcPackage.SERVICE__PARTIE:
				setPartie((String)newValue);
				return;
			case SlamcPackage.SERVICE__SLOS:
				getSlos().clear();
				getSlos().addAll((Collection<? extends Slo>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlamcPackage.SERVICE__PARTIE:
				setPartie(PARTIE_EDEFAULT);
				return;
			case SlamcPackage.SERVICE__SLOS:
				getSlos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlamcPackage.SERVICE__PARTIE:
				return PARTIE_EDEFAULT == null ? partie != null : !PARTIE_EDEFAULT.equals(partie);
			case SlamcPackage.SERVICE__SLOS:
				return slos != null && !slos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Partie: ");
		result.append(partie);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
