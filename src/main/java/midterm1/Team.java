package midterm1;

import java.util.ArrayList;

public class Team {
    protected final ArrayList<TeamMember> members;

    public Team() {
        members = new ArrayList<>();
    }

    public void newMember(String name, String position) {
        members.add(new TeamMember(name, position));
    }

    public void leaveTeam(String name) {
        members.removeIf(member -> member.getName().equals(name));
    }

    public String getMembers() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.size(); i++) {
            TeamMember teamMember = members.get(i);
            sb.append(teamMember.getName()).append(" ").append(teamMember.getPosition());

            // Checks whether the list has a next element, and if it does, appends the string with a new line character
            if (i + i < members.size() - 1) {
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }
}
