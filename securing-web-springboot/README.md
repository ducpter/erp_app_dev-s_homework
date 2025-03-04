### API Endpoints

- `POST /auth/addNewUser` - Register a new user
- `POST /auth/generateToken` - Authenticate and get a JWT token
- `GET /auth/welcome` - Public endpoint
- `GET /auth/user/userProfile` - User profile (requires ROLE_USER)
- `GET /auth/admin/adminProfile` - Admin profile (requires ROLE_ADMIN)
- `POST /api/admin/create` - Create a new resource (requires ROLE_ADMIN)
- `PUT /api/admin/update` - Update a resource (requires ROLE_ADMIN)
- `DELETE /api/admin/delete` - Delete a resource (requires ROLE_ADMIN)
- `GET /api/user/profile` - Get user profile information (requires ROLE_USER)

## Demo

### Welcome Page

![UserProfile.png](demo/picture/WelcomePage.png)demo/picture/AccountListWithAdminJWT.png

### Register a New User

![Register.png](demo/picture/Register.png)

### Login and Get JWT Token

![Login.png](demo/picture/Login.png)

### User Profile

![UserProfile.png](demo/picture/UserProfilewithJWT.png)

### Account List with JWT 

![AdminProfile.png](demo/picture/AccountListWithAdminJWT.png)

### Update Account with JWT

![AdminProfile.png](demo/picture/UpdateAccount.png)

### Delete Account with JWT

![AdminProfile.png](demo/picture/DeleteAccount.png)
