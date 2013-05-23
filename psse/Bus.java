package com.powerdata.openpa.psse;

import com.powerdata.openpa.tools.BaseObject;

public class Bus extends BaseObject
{
	protected BusList<?> _list;
	
	public Bus(int ndx, BusList<?> list)
	{
		super(ndx);
		_list = list;
	}

	@Override
	public String getDebugName() throws PsseModelException {return getNAME();}

	@Override
	public String getObjectID() {return _list.getObjectID(_ndx);}
	
	/* Convenience methods */
	
	/** enumerated IDE code */
	public BusTypeCode getBusType() {return _list.getBusType(_ndx);}
	/** Area */
	public AreaInterchange getAreaObject() throws PsseModelException {return _list.getAreaObject(_ndx);}
	/** Zone */
	public Zone getZoneObject() throws PsseModelException {return _list.getZoneObject(_ndx);}
	/** Owner */
	public Owner getOwnerObject() throws PsseModelException {return _list.getOwnerObject(_ndx);}
	/** Active component of shunt admittance to ground (GL) p.u. */
	public float getShuntG() {return _list.getShuntG(_ndx);}
	/** Reactive component of shunt admittance to ground (BL) p.u. */
	public float getShuntB() {return _list.getShuntB(_ndx);}
	/** Bus voltage phase angle in radians */
	public float getVaRad() {return _list.getVaRad(_ndx);}

	
	
	/* Raw PSS/e methods */
	
	/** Bus number */
	public int getI() {return _list.getI(_ndx);}
	/** Alphanumeric identifier */
	public String getNAME() {return _list.getNAME(_ndx);}
	/** Bus base voltage */
	public float getBASKV() {return _list.getBASKV(_ndx);}
	/** Bus type code */
	public int getIDE() {return _list.getIDE(_ndx);}
	/** Active component of shunt admittance to ground in MW at unity voltage*/
	public float getGL() {return _list.getGL(_ndx);}
	/** Reactive component of shunt admittance to ground in MVAr at unity voltage*/
	public float getBL() {return _list.getBL(_ndx);}
	/** Area number */
	public int getAREA() {return _list.getAREA(_ndx);}
	/** Zone number */
	public int getZONE() {return _list.getZONE(_ndx);}
	/** Bus voltage magnitude p.u.*/
	public float getVM() {return _list.getVM(_ndx);}
	/** Bus voltage phase angle in degrees */
	public float getVA() {return _list.getVA(_ndx);}
	/** Owner number */
	public int getOWNER() {return _list.getOWNER(_ndx);}
	
}
