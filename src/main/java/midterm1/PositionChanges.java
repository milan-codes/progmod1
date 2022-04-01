package midterm1;

public class PositionChanges extends Team {

    public void promote(String name, String newPosition) {
        for (TeamMember teamMember : super.members) {
            if (teamMember.getName().equals(name)) {
                teamMember.setPosition(newPosition);
            }
        }
    }


}
