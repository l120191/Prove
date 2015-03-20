 class Calculator{

	private double n1;
	private double n2;
	private char op;

	public Calculator(double n1,double n2,char op){

		this.n1 = n1;
		this.n2 = n2;
		this.op = op;
	}

	public double result(){
		
		switch(op){
			case '+':
				return n1+n2;
			case '-':
				return n1-n2;

			case ':':
				return n1/n2;
			case '*':
				return n1*n2;

			default:
				return -1;
		}
	}

}