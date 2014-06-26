package hispark2014.coloringobject.test;



import com.jayway.android.robotium.solo.Solo;

import hispark2014.coloringobject.MainActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class InitialButtonTests extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;

	public InitialButtonTests() {
		super("hispark2014.coloringobject", MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {

		super.setUp();

		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testAddRemove() {

		solo.assertCurrentActivity("check first activity", MainActivity.class);
        solo.clickOnButton("ADD KID NAME");
       solo.enterText(0,"nouman");
       
    	    solo.clickOnButton("OK");
    	    
       
	}
	

}
