package web.commands;

import business.entities.User;
import business.exceptions.UserException;
import business.persistence.Database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CommandUnprotectedPage extends Command
{
    public String pageToShow;

    public CommandUnprotectedPage(String pageToShow)
    {
        this.pageToShow = pageToShow;
    }

    public String execute(
            HttpServletRequest request,
            HttpServletResponse response) throws UserException
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
}


