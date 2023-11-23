
package chat;

import java.io.Serializable;


public class Message implements Serializable
{

protected static final long serialVersionUID = 1112122200L;


static final int WHOISIN = 0, PUB_MESSAGE = 1, LOGOUT = 2, PVT_MESSAGE = 3;
private int type;
private String msg;



Message(int type, String msg) { 
		this.type = type;
		this.msg = msg;
	}



        
	int getType() {
		return type;
	}
        

	String getMessage() {
		return msg;
	}



    
}
