
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Oct 31 21:13:27 ART 2021
//----------------------------------------------------

package ar.edu.ub.dc.compilador_aritmetico;

import java.io.*;
import java.util.*;
import java_cup.runtime.*;
import java.util.HashMap;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Oct 31 21:13:27 ART 2021
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\002\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\002\000\002" +
    "\005\005\000\002\010\006\000\002\010\006\000\002\006" +
    "\012\000\002\006\016\000\002\007\011\000\002\011\005" +
    "\000\002\011\005\000\002\012\005\000\002\012\005\000" +
    "\002\012\005\000\002\012\005\000\002\012\005\000\002" +
    "\012\003\000\002\012\003\000\002\012\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\004\005\001\002\000\004\002\102\001" +
    "\002\000\024\003\ufffd\005\ufffd\006\ufffd\015\ufffd\016\ufffd" +
    "\017\ufffd\022\ufffd\025\ufffd\031\ufffd\001\002\000\024\003" +
    "\020\005\014\006\ufff6\015\021\016\023\017\015\022\007" +
    "\025\024\031\016\001\002\000\004\025\074\001\002\000" +
    "\004\006\ufff8\001\002\000\004\006\073\001\002\000\004" +
    "\006\ufff9\001\002\000\004\006\ufffc\001\002\000\004\002" +
    "\000\001\002\000\004\025\057\001\002\000\024\006\uffe8" +
    "\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\023\uffe8\024" +
    "\uffe8\026\uffe8\001\002\000\022\006\ufffa\007\031\010\034" +
    "\011\035\012\033\013\032\023\050\024\046\001\002\000" +
    "\004\006\056\001\002\000\024\006\uffe7\007\uffe7\010\uffe7" +
    "\011\uffe7\012\uffe7\013\uffe7\014\054\023\uffe7\024\uffe7\001" +
    "\002\000\004\006\ufffb\001\002\000\004\025\043\001\002" +
    "\000\010\015\026\025\024\031\016\001\002\000\004\006" +
    "\ufff7\001\002\000\024\006\uffe7\007\uffe7\010\uffe7\011\uffe7" +
    "\012\uffe7\013\uffe7\023\uffe7\024\uffe7\026\uffe7\001\002\000" +
    "\016\007\031\010\034\011\035\012\033\013\032\026\030" +
    "\001\002\000\024\006\uffe6\007\uffe6\010\uffe6\011\uffe6\012" +
    "\uffe6\013\uffe6\023\uffe6\024\uffe6\026\uffe6\001\002\000\010" +
    "\015\026\025\024\031\016\001\002\000\010\015\026\025" +
    "\024\031\016\001\002\000\010\015\026\025\024\031\016" +
    "\001\002\000\010\015\026\025\024\031\016\001\002\000" +
    "\010\015\026\025\024\031\016\001\002\000\024\006\uffeb" +
    "\007\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\023\uffeb\024" +
    "\uffeb\026\uffeb\001\002\000\024\006\uffec\007\uffec\010\uffec" +
    "\011\035\012\033\013\032\023\uffec\024\uffec\026\uffec\001" +
    "\002\000\024\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea" +
    "\013\uffea\023\uffea\024\uffea\026\uffea\001\002\000\024\006" +
    "\uffe9\007\uffe9\010\uffe9\011\uffe9\012\uffe9\013\uffe9\023\uffe9" +
    "\024\uffe9\026\uffe9\001\002\000\024\006\uffed\007\uffed\010" +
    "\uffed\011\035\012\033\013\032\023\uffed\024\uffed\026\uffed" +
    "\001\002\000\010\015\026\025\024\031\016\001\002\000" +
    "\004\026\053\001\002\000\022\007\031\010\034\011\035" +
    "\012\033\013\032\023\050\024\046\026\047\001\002\000" +
    "\010\015\026\025\024\031\016\001\002\000\004\006\ufff4" +
    "\001\002\000\010\015\026\025\024\031\016\001\002\000" +
    "\020\006\uffef\007\031\010\034\011\035\012\033\013\032" +
    "\026\uffef\001\002\000\020\006\uffee\007\031\010\034\011" +
    "\035\012\033\013\032\026\uffee\001\002\000\004\006\ufff3" +
    "\001\002\000\010\015\026\025\024\031\016\001\002\000" +
    "\016\006\ufff5\007\031\010\034\011\035\012\033\013\032" +
    "\001\002\000\026\003\ufffe\005\ufffe\006\ufffe\015\ufffe\016" +
    "\ufffe\017\ufffe\022\ufffe\025\ufffe\030\ufffe\031\ufffe\001\002" +
    "\000\010\015\026\025\024\031\016\001\002\000\004\026" +
    "\062\001\002\000\020\007\031\010\034\011\035\012\033" +
    "\013\032\023\050\024\046\001\002\000\004\020\063\001" +
    "\002\000\004\027\064\001\002\000\024\003\ufffd\006\ufffd" +
    "\015\ufffd\016\ufffd\017\ufffd\022\ufffd\025\ufffd\030\ufffd\031" +
    "\ufffd\001\002\000\024\003\020\006\ufff6\015\021\016\023" +
    "\017\015\022\007\025\024\030\066\031\016\001\002\000" +
    "\006\006\ufff2\021\067\001\002\000\004\027\070\001\002" +
    "\000\024\003\ufffd\006\ufffd\015\ufffd\016\ufffd\017\ufffd\022" +
    "\ufffd\025\ufffd\030\ufffd\031\ufffd\001\002\000\024\003\020" +
    "\006\ufff6\015\021\016\023\017\015\022\007\025\024\030" +
    "\072\031\016\001\002\000\004\006\ufff1\001\002\000\026" +
    "\003\uffff\005\uffff\006\uffff\015\uffff\016\uffff\017\uffff\022" +
    "\uffff\025\uffff\030\uffff\031\uffff\001\002\000\010\015\026" +
    "\025\024\031\016\001\002\000\016\007\031\010\034\011" +
    "\035\012\033\013\032\026\076\001\002\000\004\027\077" +
    "\001\002\000\024\003\ufffd\006\ufffd\015\ufffd\016\ufffd\017" +
    "\ufffd\022\ufffd\025\ufffd\030\ufffd\031\ufffd\001\002\000\024" +
    "\003\020\006\ufff6\015\021\016\023\017\015\022\007\025" +
    "\024\030\101\031\016\001\002\000\004\006\ufff0\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\005\001\001\000\020\004\010\005\012\006\007" +
    "\007\024\010\021\011\011\012\016\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\026\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\041\001\001\000" +
    "\004\012\040\001\001\000\004\012\037\001\001\000\004" +
    "\012\036\001\001\000\004\012\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\011\043\012\044\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\051\001\001" +
    "\000\002\001\001\000\004\012\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\054" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\011" +
    "\057\012\060\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\064\001" +
    "\001\000\020\004\010\005\012\006\007\007\024\010\021" +
    "\011\011\012\016\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\070\001\001\000\020\004\010\005\012" +
    "\006\007\007\024\010\021\011\011\012\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\074\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\077\001" +
    "\001\000\020\004\010\005\012\006\007\007\024\010\021" +
    "\011\011\012\016\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {


	
	public static HashMap<String, Object> hm = new HashMap<>();
	
	public static void Put(String identifier, Object value) {
		hm.put(identifier, value);
	}
			   			   
	public static Object Get(String identifier) {
		return hm.get(identifier);
	}
   
	public static void Show(String value) {
		System.out.println("Resultado: " +  value);
		System.out.println("Fin de ejecucion.");
	}
	

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expression ::= LPAREN expression RPAREN 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expression ::= IDENTIFIER 
            {
              Integer RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (Integer)Get((String)v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expression ::= NUMERO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expression ::= expression MODULO expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() % e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expression ::= expression DIVISION expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() / e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expression ::= expression POR expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() * e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expression ::= expression MENOS expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() - e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expression ::= expression MAS expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() + e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // bool_expr ::= expression DESIGUALDAD expression 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer s1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer s2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ( s1 != s2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bool_expr",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // bool_expr ::= expression IGUALDAD expression 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer s1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer s2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ( s1 == s2);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bool_expr",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // for_stmt ::= FOR LPAREN expression RPAREN L_LLAVE stmt_list R_LLAVE 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
				Integer length = e.intValue();
				
				for( Integer i = 0; i < length; i++)
				{
					RESULT = s;
				};
				 
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("for_stmt",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // if_stmt ::= IF LPAREN bool_expr RPAREN THEN L_LLAVE stmt_list R_LLAVE ELSE L_LLAVE stmt_list R_LLAVE 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object s1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object s2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if((Boolean)c){ RESULT = s1; } else { RESULT = s2; } 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_stmt",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // if_stmt ::= IF LPAREN bool_expr RPAREN THEN L_LLAVE stmt_list R_LLAVE 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if((Boolean)c){ RESULT = s; } 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_stmt",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // print_stmt ::= IMPRIMIR LPAREN bool_expr RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println((Boolean)e ? "True" :"False" ); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("print_stmt",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // print_stmt ::= IMPRIMIR LPAREN expression RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(Integer.toString(e)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("print_stmt",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // assign_stmt ::= IDENTIFIER ASIGNACION expression 
            {
              Object RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 Put((String)v, e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assign_stmt",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // stmt ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // stmt ::= for_stmt 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= if_stmt 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= bool_expr 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= expression 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= print_stmt 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= assign_stmt 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt_list ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt_list ::= stmt_list error PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt_list ::= stmt_list stmt PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= INICIO stmt_list FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

