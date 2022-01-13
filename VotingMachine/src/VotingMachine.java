public class VotingMachine {

	private int republicanVotes;
	private int democratVotes;

	public VotingMachine()
	{
		republicanVotes = 0;
		democratVotes = 0;
	}
	
	public void voteRepublican()
	{
		republicanVotes++;
	}
	
	public void voteDemocrat()
	{
		democratVotes++;
	}

	public int getTalliesRepublican()
	{
		return republicanVotes;
	}
	
	public int getTalliesDemocrat()
	{
		return democratVotes;
	}

	public void clearMachine()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
}
