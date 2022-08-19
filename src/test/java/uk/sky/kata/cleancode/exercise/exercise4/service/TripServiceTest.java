package uk.sky.kata.cleancode.exercise.exercise4.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.sky.kata.cleancode.exercise.exercise4.context.UserSession;
import uk.sky.kata.cleancode.exercise.exercise4.exception.UserNotLoggedInException;
import uk.sky.kata.cleancode.exercise.exercise4.model.Trip;
import uk.sky.kata.cleancode.exercise.exercise4.model.User;
import uk.sky.kata.cleancode.exercise.exercise4.repository.TripRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TripServiceTest {

    @Mock
    private UserSession userSession;

    @Mock
    private TripRepository repository;

    @InjectMocks
    private TripService service;

    @Test
    void shouldThrowsExceptionWhenTheUserIsNotLoggedIn() {
        // Arrange
        User user = new User();
        when(userSession.getLoggedUser()).thenReturn(null);

        // Act & Assert
        assertThrows(UserNotLoggedInException.class,
                () -> service.getTripsByUser(user));
    }

    @Test
    void returnsAnEmptyListWhenFriendsListIsEmpty() {
        // Arrange
        User friend = new User();
        User loggedUser = new User();

        when(userSession.getLoggedUser()).thenReturn(loggedUser);

        // Act
        var trips = service.getTripsByUser(friend);

        // Assert
        assertThat(trips).isEmpty();
    }

    @Test
    void returnsExpectedTripsListFromAFriendUser() {
        // Arrange
        User friend = new User();
        User loggedUser = new User();
        friend.addFriend(loggedUser);

        List<Trip> expectedTrips = List.of(new Trip(), new Trip());

        when(userSession.getLoggedUser()).thenReturn(loggedUser);
        when(repository.findTripsByUser(friend))
                .thenReturn(expectedTrips);

        // Act
        var trips = service.getTripsByUser(friend);

        // Assert
        assertThat(trips).isEqualTo(expectedTrips);
    }

    @Test
    void returnsExpectedTripsListFromDifferentAFriendUser() {
        // TODO: change to support return a list of all trips from different friends
    }
}

