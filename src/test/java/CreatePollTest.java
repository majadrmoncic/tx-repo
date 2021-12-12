import org.testng.annotations.Test;



public class CreatePollTest extends InitTest {

	@Test
	public void successfullyCreatedPoll() {
		Poll myPoll = new Poll("Some example poll", "Conference call", "Some text here", "Maja", "example@email.com");
		driver.get(BASE_URL);
		newPoll.acceptCookies();
		newPoll.createPoll();
		sa.assertEquals(newPoll.getStep1Title(), "STEP 1 OF 4");
		newPoll.step1enterData(myPoll.getPollTitle(), 2, myPoll.getPollNote());
		sa.assertEquals(newPoll.getStep2Title(), "STEP 2 OF 4");
		newPoll.step2enterData();
		sa.assertEquals(newPoll.getStep3Title(), "STEP 3 OF 4");
		newPoll.step3enterData();
		sa.assertEquals(newPoll.getStep4Title(), "STEP 4 OF 4");
		newPoll.step4enterData(myPoll.getInitiatorName(), myPoll.getInitiatorEmail());
		sa.assertEquals(poll.getPollTitle(), myPoll.getPollTitle());
		sa.assertEquals(poll.getPollLocation(), myPoll.getPollLocation());
		sa.assertEquals(poll.getPollNote(), myPoll.getPollNote());
		System.out.println("You have successfully generated poll at next link: " + poll.getPollLink());
		sa.assertAll();
	}


}
