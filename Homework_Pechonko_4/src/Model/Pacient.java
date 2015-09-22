package Model;


public class Pacient extends Human{

	public String bolezn;

	public String getBolezn() {
		return bolezn;
	}

	public void setBolezn(String bolezn) {
		this.bolezn = bolezn;
	}

	public String toString() {
		return "Pacient [bolezn=" + bolezn + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bolezn == null) ? 0 : bolezn.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacient other = (Pacient) obj;
		if (bolezn == null) {
			if (other.bolezn != null)
				return false;
		} else if (!bolezn.equals(other.bolezn))
			return false;
		return true;
	}
}
	
