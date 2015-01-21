package ar.edu.unicen.exa.papilio.core.as.translate;

import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

import ar.edu.unicen.exa.papilio.core.as.Context;
import ar.edu.unicen.exa.papilio.core.as.element.ASElement;

public interface AbstractSyntaxTranslator {

	public List<ASElement> translate(ASTNode node);
	
	public ASTNode getEnclosedNode(ASTNode node);
		
	public void setContext(Context context);
	
}