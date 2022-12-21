package Q061_to_Q080.q063;

interface Exportable{
    void export();
 }

 class Tool implements  Exportable{
    public void export(){  //line n1
        System.out.println("Tool::export");
    }
 }
class ReportTool  extends Tool{
    public void export(){  //line n2
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool atool=new ReportTool();
        Tool btool=new Tool();
        callExport(atool);
        callExport(btool);
    }
    public static void callExport(Exportable ex){
        ex.export();
    }
}
// What is the result?
// A. Compilation fails only at line n2.
// B. RTool:exportTool::export
// C. Tool::exportTool:export
// D. Compilation fails only at line n1.
// E. Compilation fails at both line n1 and line n2.
//
// Answer: A