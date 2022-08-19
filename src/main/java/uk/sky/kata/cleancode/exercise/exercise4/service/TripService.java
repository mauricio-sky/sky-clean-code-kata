package uk.sky.kata.cleancode.exercise.exercise4.service;

import uk.sky.kata.cleancode.exercise.exercise4.context.UserSession;
import uk.sky.kata.cleancode.exercise.exercise4.exception.UserNotLoggedInException;
import uk.sky.kata.cleancode.exercise.exercise4.model.Trip;
import uk.sky.kata.cleancode.exercise.exercise4.model.User;
import uk.sky.kata.cleancode.exercise.exercise4.repository.TripRepository;

import java.util.ArrayList;
import java.util.List;

public class TripService {

    private UserSession userSession;
    private TripRepository repository;

    public TripService(UserSession userSession, TripRepository repository) {
        this.userSession = userSession;
        this.repository = repository;
    }

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        List<Trip> tripList = new ArrayList<>();
        User loggedUser = userSession.getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                tripList = repository.findTripsByUser(user);
            }
            return tripList;
        } else {
            throw new UserNotLoggedInException();
        }
    }

}
