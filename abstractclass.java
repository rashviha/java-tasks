package PROGRAM;
interface Superclass1{
	 void sending();
	}
	interface superclass2{
	    void sender();
	}
	class subclass implements Superclass1, superclass2{
	    public void sending(){
	        System.out.println("Superclass 1");
	    }
	     public void sender(){
	        System.out.println("superclass 2");
	    }
	}
	class Mainn {
	    public static void main(String[] args) {
	       subclass s=new subclass();
	       s.sending();
	        s.sender();
	    }
	}