package com.powerdata.openpa;

public class Station extends AbstractGroupObject
{
	protected StationList _list;
	
	public Station(StationList list, int ndx)
	{
		super(list, ndx);
		_list = list;
	}

}
