package uk.sky.kata.cleancode.exercise.exercise4.repository;

import uk.sky.kata.cleancode.exercise.exercise4.model.Trip;
import uk.sky.kata.cleancode.exercise.exercise4.model.User;

import java.util.List;

public interface TripRepository {

    List<Trip> findTripsByUser(User user);
}
