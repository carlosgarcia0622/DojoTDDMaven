package com.udea.DojoTDDMaven;

public class CodeBreaker {

private String secret;
	
	
	
	public CodeBreaker(String secret ){
		this.secret = secret ;
	}
	
	public CodeBreaker(){
		int secretRandom = (int) (Math.random() * 9999) + 1000;
		secret = Integer.toString(secretRandom);
	}
	
	
	public String guess (String data ){
		
		String result="";
		String aux = "";
		for (int i = 0; i < data.length(); i++){
			
			if(data.charAt(i) == secret.charAt(i)){
				aux += "x";			
			}else if(secret.contains(data.substring(i, i+1))){
				aux += "_";
			}
		}
		
		for(int j = 0; j < aux.length(); j++){
			if(aux.charAt(j) == 'x'){
				result = result + aux.charAt(j);
			}
		}
		
		for(int i = 0; i < aux.length(); i++){
			if(aux.charAt(i) == '_'){
				result = result + aux.charAt(i);
			}
		}
		
		return result;
	}
	
}
