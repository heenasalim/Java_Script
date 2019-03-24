package pk;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class demotaglib extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doStartTag();
	
		
		
		
	}
@Override
public int doEndTag() throws JspException {
	// TODO Auto-generated method stub
	String  d=new Date().toString();
	try {
		
		pageContext.getOut().write("hello   todays  date :" + d);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return EVAL_PAGE;	
	

	
	
}
}
