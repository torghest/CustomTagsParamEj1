/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customtags;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author alumno
 */
public class PrimeraEtiqueta extends TagSupport{
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int doStartTag()
    {
        return TagSupport.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspTagException
    {
         try {
             pageContext.getOut().write("Bienvenido a mi página <b>" + this.getNombre() + "</b><br>");
         } catch (Exception ex) {
             throw new JspTagException(ex.toString());
         }
         return TagSupport.EVAL_PAGE;
}   
}
