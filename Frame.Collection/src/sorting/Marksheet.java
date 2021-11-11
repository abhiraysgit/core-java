package sorting;

public class Marksheet implements Comparable<Marksheet> {
	private String fname;
	private String lname;
	private String rollnumber;
	private int phys;
	private int che;
	private int mat;

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the rollnumber
	 */
	public String getRollnumber() {
		return rollnumber;
	}

	/**
	 * @param rollnumber the rollnumber to set
	 */
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	/**
	 * @return the phys
	 */
	public int getPhys() {
		return phys;
	}

	/**
	 * @param phys the phys to set
	 */
	public void setPhys(int phys) {
		this.phys = phys;
	}

	/**
	 * @return the che
	 */
	public int getChe() {
		return che;
	}

	/**
	 * @param che the che to set
	 */
	public void setChe(int che) {
		this.che = che;
	}

	/**
	 * @return the mat
	 */
	public int getMat() {
		return mat;
	}

	/**
	 * @param mat the mat to set
	 */
	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return this.rollnumber.compareTo(m.rollnumber);
	}

}
