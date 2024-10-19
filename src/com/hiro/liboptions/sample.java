package com.hiro.liboptions;

public class sample{
	public String arg;
	public int i;
	public static void main(String[] args){
		new sample().init_opt(args.length ,args);
		System.out.println("引数の個数:" + args.length);
	}
	public int where_options_position(int i){
		System.out.println("Where is 'add' option is " + i);
		return this.i = i;
	}
	public void init_opt(int length, String...  args){
		for(int i=0;i<args.length; i++){
			System.out.println("データの個数：" + args[i]);
			if(args[i].equals("--add")){
				System.out.println("hit");
				System.out.println("--add のオプション：" + args[i+1]);
			}
		}
	}

}


		
