public class RouteCipher
{
	/** A two-dimensional array of single-character strings, instantiated in the constructor */
	public String[][] letterBlock;

	/** The number of rows of letterBlock, set by the constructor */
	private int numRows;

	/** The number of columns of letterBlock, set by the constructor */
	private int numCols;

	public RouteCipher(int r, int c){
		this.letterBlock = new String[r][c];
		this.numRows = r;
		this.numCols = c;
	}

	/** Places a string into letterBlock in row-major order.
	 *   @param str the string to be processed
	 *   Postcondition:
	 *     if str.length() < numRows * numCols, "A" in each unfilled cell
	 *     if str.length() > numRows * numCols, trailing characters are ignored
	 */
	private void fillBlock(String str){
		int pos = 0;
		for (int i = 0; i < this.numRows; i++ ) {
			for (int x = 0; x < this.numCols; x++ ) {
				if (pos < str.length()) {
					this.letterBlock[i][x] = str.substring(pos, pos+1);
					pos++;
				} else {
					this.letterBlock[i][x] = "A";
				}
			}
		}
	}

	/** Extracts encrypted string from letterBlock in column-major order.
	 *   Precondition: letterBlock has been filled
	 *   @return the encrypted string from letterBlock
	 */
	private String encryptBlock()
	{
		String message = "";
		for(int i = 0; i < letterBlock[0].length; i++) {
			for(int x = 0; x < letterBlock.length; x++) {
				message += letterBlock[x][i];
			}
		}
		return message;
	}

	/** Encrypts a message.
	 *   @param message the string to be encrypted
	 *   @return the encrypted message;
	 *           if message is the empty string, returns the empty string
	 */
	public String encryptMessage(String message)
	{
		String encrypted = "";
		int chunkSize = numRows * numCols;
		while(message.length() > 0) {
			if(chunkSize > message.length()) {
				chunkSize = message.length();
			}
			fillBlock(message);
			encrypted += encryptBlock();
			message = message.substring(chunkSize);
		}
		return encrypted;
	}

	public static void main(String[] args){

		RouteCipher ciph = new RouteCipher(2, 3);
		if(ciph.encryptMessage("Meet at midnight").substring(0, 6).equals("Mte ea"))
			System.out.println("Looks like your code works well!");
		else
			System.out.println("Oops! Make a few changes to your code, please.");
	}
}
