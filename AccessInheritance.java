
/**
 * Write a description of class AccessInheritance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccessInheritance
{
    public static void main(String[] args) {
        Department dept = new Department();
        FinanceDepartment financeDept = new FinanceDepartment();
        ServiceDepartment serviceDept = new ServiceDepartment();
        System.out.println("Department Information");
      dept.depInfo();
     financeDept.depInfo();
     serviceDept.depInfo();
    }
}
