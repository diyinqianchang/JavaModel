package adapter;


import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {

	//直接获取
	private Map<String, String> baseInfo = super.getUserBaseInfo();
	private Map<String, String>homeInfo = super.getUserHomeInfo();
	private Map<String, String>officeInfo = super.getUserOfficeInfo();
	
	
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		String name = (String)this.baseInfo.get("userName");
		return name;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = (String)this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		String mobileNumber = (String)this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String  jobPosition = (String)this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
