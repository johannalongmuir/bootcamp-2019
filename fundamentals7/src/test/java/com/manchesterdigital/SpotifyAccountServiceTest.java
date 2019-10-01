package com.manchesterdigital;

import javafx.scene.effect.Light;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {

    // waits for expception to be thrown.
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // aware that are using Mockito somewhere in the code
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private AuthenticationService authenticationService;

    // syntax sugar

    private SpotifyAccountService subject;

    @Before
    public void setUp() {
        subject = new  SpotifyAccountService(authenticationService);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        // Arrange
        SpotifyAccountService subject = new SpotifyAccountService(authenticationService);
        // new data type of type string
        String username = "john@test.com";
        String password = " 2rr2f3q4r";

        // Expect some form of account. Set up new class. Create first. Will complain about constructor after
        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        // Add the Mokito to fix this test now

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);
        // Act.
        // Expect to see a username and password
        SpotifyAccount result = subject.verify(username,password);

        // Assert. Assertions using assertj.
        // Assertions.assertThat(result).isEqualTo(expectedAccount);
        Assertions.assertThat(result.getUserName()).isEqualTo(expectedAccount.getUserName());

    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {
        // Arrange
        SpotifyAccountService subject = new SpotifyAccountService(authenticationService);
        String username = "john@test.com";
        String password = " 2rr2f3q4r";

        // Given, when, then
        // dumb service. Just true or false for this instance.
        // Will just accept any String at this point, not matching.
        // Wants it to behave in a certain way
        // BDDMockito.
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);

        expectedException.expect(SpotifyAccountNotValidException.class);

        // Act
        subject.verify(username, password);

        // Has it been called. Assert that this function has been called when acting.
        BDDMockito.verify(authenticationService).authenticate(username, password);

    }
}
