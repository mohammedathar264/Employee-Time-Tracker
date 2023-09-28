package com.employee.repositories;

import com.employee.entities.TimeInfo;

public interface TimeInfoRepository {

	void saveTime(TimeInfo timeInfo);
	TimeInfo getTimeInfo(int eid);
}
