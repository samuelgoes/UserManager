# Get user list
curl http://localhost:8080/users

# Insert new User
curl -i -X POST -H "Content-Type: application/json" -d '{"username": "moralito", "name": "Jaime"}' localhost:8080/users
