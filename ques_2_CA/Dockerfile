
FROM mysql:8.0
ENV MYSQL_ROOT_PASSWORD=root123
ENV MYSQL_DATABASE=mydb
ENV MYSQL_USER=user1
ENV MYSQL_PASSWORD=user123
EXPOSE 3306

login to ghcr tag docker img push docker img to ghcr pull docker img from ghcr
To log in to GitHub Container Registry (GHCR), you can use the following command:
```bash 
echo $CR_PAT | docker login ghcr.io -u USERNAME --password-stdin
```
Replace `CR_PAT` with your GitHub Personal Access Token and `USERNAME` with your GitHub username.
To tag a Docker image, you can use the following command:
```bash
docker tag SOURCE_IMAGE[:TAG] TARGET_IMAGE[:TAG]
```
Replace `SOURCE_IMAGE` with the name of your local Docker image, and `TARGET_IMAGE` with the desired name for the image in GHCR, including your GitHub username and repository name (e.g., `ghcr.io/USERNAME/REPOSITORY:TAG`).
To push a Docker image to GHCR, use the following command:
```bash
docker push TARGET_IMAGE[:TAG]
```
Replace `TARGET_IMAGE` with the name of your image in GHCR.
To pull a Docker image from GHCR, use the following command:
```bash

docker pull TARGET_IMAGE[:TAG]







    


