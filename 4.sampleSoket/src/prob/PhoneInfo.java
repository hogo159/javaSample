package prob;

public class PhoneInfo implements Comparable<PhoneInfo> {

	private String name ;
	private String num ;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneInfo other = (PhoneInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", num=" + num + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public PhoneInfo(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}


	public PhoneInfo() {
		super();
	}


	@Override
	public int compareTo(PhoneInfo o) {
		return name.compareTo(o.name);
	}
	
}