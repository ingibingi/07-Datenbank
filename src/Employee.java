import java.sql.ResultSet;
import java.util.Date;

//EMPNO int
    //ENAME varchar(10)
    //JOB varchar(9)
    //MGR int
    //HIREDATE date
    //SAL decimal(7,2)
    //COMM decimal(7,2)
    //DEPTNO int
public class Employee {
    int empNo;
    String eName;
    String job;
    int mgr;
    Date hireDate;
    double sal;
    double comm;
    int deptNo;

    public Employee (int EMPNO, String ENAME, String JOB, int MGR, Date HIREDATE, double SAL, double COMM, int DEPTNO){
        empNo = EMPNO;
        eName = ENAME;
        job = JOB;
        mgr = MGR;
        hireDate = HIREDATE;
        sal = SAL;
        comm = COMM;
        deptNo = DEPTNO;
    }

    public Employee (ResultSet sqlRow) throws Exception{
        empNo = sqlRow.getInt(1);
        eName = sqlRow.getString(2);
        job = sqlRow.getString(3);
        mgr = sqlRow.getInt(4);
        hireDate = sqlRow.getDate(5);
        sal = sqlRow.getDouble(6);
        comm = sqlRow.getDouble(7);
        deptNo = sqlRow.getInt(8);
    }

    public void printEmpInfo(){
        String printText = ""+empNo+"\t"+eName+"\t"+job+"\t"+mgr+"\t"+hireDate+"\t"+sal+"\t"+comm+"\t"+deptNo;
        System.out.println(printText);
    }
}
