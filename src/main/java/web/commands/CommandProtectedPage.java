package web.commands;

import business.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CommandProtectedPage extends Command
{
    public String role;
    public String pageToShow;

    public CommandProtectedPage(String pageToShow, String role)
    {
        this.pageToShow = pageToShow;
        this.role = role;

    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        try {
            session.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pageToShow;
    }

    public String getRole()
    {
        return role;
    }
}
