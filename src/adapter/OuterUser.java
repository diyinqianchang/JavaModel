package adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "这个员工叫混世魔王");
		baseInfoMap.put("mobileNumber", "这个员工的电话是多少:....");
		
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		
		HashMap<String, String> officeInfoMap = new HashMap<>();
		officeInfoMap.put("jobPosition", "这个员工的职位是");
		officeInfoMap.put("officeTelNumber", "这个员工的办公电话是多少:....");
		return officeInfoMap;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfoMap = new HashMap<>();
		homeInfoMap.put("homeAddress", "这个员工的家庭地址是");
		homeInfoMap.put("homeTelNumber", "这个员工的家庭电话是多少:....");
		return homeInfoMap;
	}

}
