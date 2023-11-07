package syncgui.parkingmanagement.dto.security;

import java.util.Date;
import java.util.Objects;

public class TokenDTO {

    private String userName;

    private Boolean authenticated;

    private Date createdAt;

    private Date expiration;

    private String accessToken;

    private String refreshToken;

    public TokenDTO() {
    }

    public TokenDTO(String userName, Boolean authenticated, Date createdAt, Date expiration, String accessToken, String refreshToken) {
        this.userName = userName;
        this.authenticated = authenticated;
        this.createdAt = createdAt;
        this.expiration = expiration;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenDTO tokenDTO = (TokenDTO) o;
        return Objects.equals(userName, tokenDTO.userName) && Objects.equals(authenticated, tokenDTO.authenticated) && Objects.equals(createdAt, tokenDTO.createdAt) && Objects.equals(expiration, tokenDTO.expiration) && Objects.equals(accessToken, tokenDTO.accessToken) && Objects.equals(refreshToken, tokenDTO.refreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, authenticated, createdAt, expiration, accessToken, refreshToken);
    }

    @Override
    public String toString() {
        return "TokenDTO{" +
                "userName='" + userName + '\'' +
                ", authenticated=" + authenticated +
                ", createdAt=" + createdAt +
                ", expiration=" + expiration +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
