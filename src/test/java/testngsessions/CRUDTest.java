package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	
	public int addUser() {
		return 123;
	}
	
	public String getUser(int uid) {
		return "User information for: "+uid;
	}
	public String updateUser(int uid) {
		return "User details updated for user: "+uid;
	}
	public void deleteUser(int uid) {
		System.out.println("User is deleted");
	}
	
	//AAA
	@Test
	public void addUserTest() {
		int uid = addUser();
	}
	
	@Test
	public void getUserTest() {
		int uid = addUser();
		String userInfo = getUser(uid);
		System.out.println(userInfo);
		//Assert.assertEquals(uid, uid);
	}
	
	@Test
	public void updateUserTest() {
		int uid = addUser();
		String updUserId = updateUser(uid);
		getUser(uid);
		System.out.println(updUserId);
		//Assert.assertEquals(uid, uid);
	}
	@Test
	public void deleteUserTest() {
		int uid = addUser();
		deleteUser(uid);
		getUser(uid);
		
		//Assert.assertEquals(uid, uid);
	}

}
