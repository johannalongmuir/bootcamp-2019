package com.manchesterdigital;

import java.util.Objects;

public class SpotifyAccount {
    private final String username;
    private final String password;

    public SpotifyAccount(String username, String password) {
// for this particular SpotifyAccount, this username coming in from outside is username
        this.username = username;
        this.password = password;
    }

    // Getter. Cannot change once got

    public String getUserName() {
        return username;
    }





    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpotifyAccount that = (SpotifyAccount) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

     */
}

