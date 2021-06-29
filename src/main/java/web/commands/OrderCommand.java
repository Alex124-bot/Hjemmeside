package web.commands;

import business.entities.User;
import business.exceptions.UserException;
import business.services.UserFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OrderCommand extends CommandUnprotectedPage{
    private UserFacade userFacade;

    public OrderCommand(String pageToShow) {
        super(pageToShow);
        userFacade = new UserFacade(database);
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        try {
            session.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        User user = new userFacade.getUserInfo(id);


        return "orderpage";
    }
}
