packages com.hiro.liboptions;

class libopt{
	public libopt(){
		}
	public int col;

	public void setOptCoulm(int coulm){
		this.col = coulm;
	}
	
	public String init_opt(int length, String options, String...  args){
		for(int i=0;i<args.length; i++){
			System.out.println("データの個数：" + args[i]);
			if(args[i].equals(options)){
				System.out.println("hit");
				System.out.println("[" + options + "] + のオプション：" + args[i+1]);
				rargs = args[i+1];
				return rargs;
			}
		}
			return rargs;
	}
   

}

