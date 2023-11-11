export const oktaConfig = {
  clientId: "0oacvpta3iwZhYB5u5d7",
  issuer: "https://dev-08327746.okta.com",
  redirectUri: "https://localhost:3000/login/callback",
  scopes: ["openid", "profile", "email"],
  pkce: true,
  disableHttpsCheck: true,
};
