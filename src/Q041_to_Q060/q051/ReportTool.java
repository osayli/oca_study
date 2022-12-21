package Q041_to_Q060.q051;
 interface Exportable{
     void export();
         }

 class Tool implements Exportable{
      public void export(){  //line n1
          System.out.print("Tool:export");
     }
 }

class ReportTool extends Tool implements Exportable {
//    protected void export(){  //line n2
//        System.out.println("RTool:export");
//    }
    public void export(){  //line n2
        System.out.print("RTool:export");
    }

    public static void main(String[] args) {
        Tool aTool=new ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex){
        ex.export();
    }
}
//What is the result?
//A.	Compilation fails only at line n2.
//B.	RTool::exportTool::export
//C.	Tool::exportTool:export
//D.	Compilation fails only at line n1.
//E.	Compilation fails at both line n1 and line n2.

/*
Answer is D
 */

/*
if we fixed line n1 then result be B
RTool:exportTool:export
 */