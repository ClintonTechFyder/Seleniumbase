package x;

import java.nio.charset.StandardCharsets;
import java.util.Random;

import com.google.common.hash.Hashing;

import net.bytebuddy.utility.RandomString;

public class RandomPassword {

	public static String returnRandomPassword() {
		//Password Randomeze
		RandomString session = new RandomString();
		//Generates random string
		final String pass = Hashing.farmHashFingerprint64().hashString(session.toString(), StandardCharsets.UTF_8).toString();
		//Creates 2 lists with capital letters and special charters
		char spl[] = "-!@=#$%^&".toCharArray();
		char apl[] = "ABCDEFGHI".toCharArray();
		
		Random r = new Random();
		int result = r.nextInt(spl.length - 1) + 1;
		char specailCharater = spl[result];
		
		result = r.nextInt(apl.length - 1) + 1;
		char capLetter = apl[result];
		String x1 = pass.substring(0, pass.length() / 2 - 1) + specailCharater + capLetter + "." + capLetter + specailCharater + pass.substring(pass.length() / 2 , pass.length());
		return x1;
	}
}
