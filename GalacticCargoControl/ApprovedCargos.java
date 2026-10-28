package GalacticCargoControl;
import java.util.List;
import java.util.ArrayList;

public class ApprovedCargos 
{
    private List<Cargo> approvedCargos = new ArrayList<>();

    public void addApprovedCargo(Cargo cargo)
    {
        this.approvedCargos.add(cargo);
    }

    public List<Cargo> getApprovedCaros()
    {
        return this.approvedCargos;
    }

    public void showApprovedCargos()
    {
        for (Cargo cargo : approvedCargos)
        {
            System.out.println("------------------------");
            System.out.println("Cargo name: " + cargo.getName());
            System.out.println("Cargo weight: " + cargo.getWeight());
        }
        
        System.out.println("------------------------");
    }

}
