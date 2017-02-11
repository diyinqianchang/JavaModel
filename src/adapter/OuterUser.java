package adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "���Ա���л���ħ��");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰�Ƕ���:....");
		
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		
		HashMap<String, String> officeInfoMap = new HashMap<>();
		officeInfoMap.put("jobPosition", "���Ա����ְλ��");
		officeInfoMap.put("officeTelNumber", "���Ա���İ칫�绰�Ƕ���:....");
		return officeInfoMap;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfoMap = new HashMap<>();
		homeInfoMap.put("homeAddress", "���Ա���ļ�ͥ��ַ��");
		homeInfoMap.put("homeTelNumber", "���Ա���ļ�ͥ�绰�Ƕ���:....");
		return homeInfoMap;
	}

}
