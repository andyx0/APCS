public class VotingMachineTester {

	public static void main(String[] args) {
		VotingMachine FirstElection = new VotingMachine();
		FirstElection.voteRepublican();
		FirstElection.voteRepublican();
		FirstElection.voteDemocrat();
		FirstElection.voteDemocrat();
		System.out.println("Republican Votes: " + FirstElection.getTalliesRepublican());
		System.out.println("Democrat Votes: " + FirstElection.getTalliesDemocrat());
		FirstElection.clearMachine();
		System.out.println("Voting Machine Cleared!");
		System.out.println("Republican Votes: " + FirstElection.getTalliesRepublican());
		System.out.print("Democrat Votes: " + FirstElection.getTalliesDemocrat());
	}
}
