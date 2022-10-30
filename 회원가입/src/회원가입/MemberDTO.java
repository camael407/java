package 회원가입;

public class MemberDTO {
	private String mem_id;
	private	String mem_userid;
	private String mem_email;
	private String mem_password;
	private String mem_username;
	private String mem_nickname;
	private int mem_level;
	private int mem_point;
	private String mem_phone;
	private String mem_birthday;
	private String mem_sex;
	private String mem_ip;
	private int mem_zipcode;
	private String mem_address;
	private String mem_receive_sms;
	private String mem_open_profile;
	private String mem_recommend;
	private String mem_denied;
	private String mem_register_datetime;
	private String mem_lastlogin_datetime;
	private String mem_is_comp;
	private String mem_compname;
	private String mem_is_admin;
	
	//이거 스트링으로 받을까? 식별 id 영숫 조합으로
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id; }
	
	public String getMem_userid() {
		return mem_userid;
	}
	public void setMem_userid(String mem_userid) {
		this.mem_userid = mem_userid; }
	
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email; }	
	
	public String getMem_password() {
		return mem_password;
	}
	public void setMem_password(String mem_password) {
		this.mem_password = mem_password; }	
	
	public String getMem_username() {
		return mem_username;
	}
	public void setMem_username(String mem_username) {
		this.mem_username = mem_username; }	
	
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname; }	
	
	public int getMem_level() {
		return mem_level;
	}
	public void setMem_level(int mem_level) {
		this.mem_level = mem_level; }	
	
	public int getMem_point() {
		return mem_point;
	}
	public void setMem_point(int mem_point) {
		this.mem_point = mem_point; }	
	
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone; }	
	
	public String getmem_birthday() {
		return mem_birthday;
	}
	public void setMem_birthday(String mem_birthday) {
		this.mem_birthday = mem_birthday; }	
	
	public String getMem_sex() {
		return mem_sex;
	}
	public void setMem_sex(String mem_sex) {
		this.mem_sex = mem_sex; }	
	
	public String getMem_ip() {
		return mem_ip;
	}
	public void setMem_ip(String mem_ip) {
		this.mem_ip = mem_ip; }	
	
	public int getMem_zipcode() {
		return mem_zipcode;
	}
	public void setMem_zipcode(int mem_zipcode) {
		this.mem_zipcode = mem_zipcode; }	
	
	public String getMem_address() {
		return mem_address;
	}
	public void setMem_addressl(String mem_address) {
		this.mem_address = mem_address; }	
	
	public String getMem_receive_sms() {
		return mem_receive_sms;
	}
	public void setMem_receive_sms(String mem_receive_sms) {
		this.mem_receive_sms = mem_receive_sms; }	
	
	
	public String getMem_open_profile() {
		return mem_open_profile;
	}
	public void setMem_open_profile(String mem_open_profile) {
		this.mem_open_profile = mem_open_profile; }	
	
	public String getMem_recommend() {
		return mem_recommend;
	}
	public void setMem_recommend(String mem_recommend) {
		this.mem_recommend = mem_recommend; }	
	
	public String getMem_denied() {
		return mem_denied;
	}
	public void setMem_denied(String mem_denied) {
		this.mem_denied = mem_denied; }	
	
	public String getMem_register_datetime() {
		return mem_register_datetime;
	}
	public void setMem_register_datetime(String mem_register_datetime) {
		this.mem_register_datetime = mem_register_datetime; }	
	
	public String getMem_lastlogin_datetime() {
		return mem_lastlogin_datetime;
	}
	public void setMem_lastlogin_datetime(String mem_lastlogin_datetime) {
		this.mem_lastlogin_datetime = mem_lastlogin_datetime; }	
	
	public String getMem_is_comp() {
		return mem_is_comp;
	}
	public void setMem_is_comp(String mem_is_comp) {
		this.mem_is_comp = mem_is_comp; }	
	
	public String getMem_compname() {
		return mem_compname;
	}
	public void setMem_compname(String mem_compname) {
		this.mem_compname = mem_compname; }	
	
	public String getMem_is_admin() {
		return mem_is_admin;
	}
	public void setMem_is_admin(String mem_is_admin) {
		this.mem_is_admin = mem_is_admin; }	
	
	
	@Override
	public String toString() {
		return "MemberDTO [회원 번호=" + mem_id + ", 회원 실명=" + mem_username + ", 회원 아이디=" + mem_userid + ", 회원 비밀번호=" + mem_password + ", 회원 이메일=" + mem_email + ", 닉네임=" + mem_nickname + ", 회원 레벨=" + mem_level +
				", 회원 포인트=" + mem_point + ", 연락처" + mem_phone + ", 생년월일" + mem_birthday + ", 성별" + mem_sex + ", 우편 번호" + mem_zipcode + ", 집 주소" + mem_address + ", 문자 수신 여부" + mem_receive_sms +
				", 정보 공개 여부=" + mem_open_profile + ", 추천인 여부" + mem_recommend + ", 차단된 회원 여부=" + mem_denied + ", 회원 등록일=" + mem_register_datetime + ", 최종 로그인 시간=" + mem_lastlogin_datetime + ", 회사 계정 여부=" + mem_is_comp + 
				", 관리자 계정 여부=" + mem_is_admin + ", getMem_id()=" + getMem_id() + ", getMem_userid()=" + getMem_userid() + ", getMem_email()=" + getMem_email() + ", getMem_password()="+ getMem_password() + ", getMem_username()=" + getMem_username() +
				", getMem_nickname()=" + getMem_nickname() + ", getMem_level()=" + getMem_level() + ", getMem_point()=" + getMem_point() + ", getMem_phone()=" + getMem_phone() + ", getmem_birthday()=" + getmem_birthday() +
				", getMem_sex()=" + getMem_sex() + ", getMem_ip()=" + getMem_ip() + ", getMem_zipcode()=" + getMem_zipcode() + ", getMem_address()=" + getMem_address() + ", getMem_receive_sms()=" + getMem_receive_sms() +
				", getMem_open_profile()=" + getMem_open_profile() + ", getMem_recommend()=" + getMem_recommend() + ", getMem_denied()=" + getMem_denied() + ", getMem_register_datetime()=" + getMem_register_datetime() +
				", getMem_lastlogin_datetime()=" + getMem_lastlogin_datetime() + ", getMem_is_comp()=" + getMem_is_comp() + ", getMem_compname()=" + getMem_compname() + ", getMem_is_admin()=" + getMem_is_admin() +  "]";
					} 
					
	}
	
	
	
	

