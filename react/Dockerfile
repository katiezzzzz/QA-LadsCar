FROM node:16.10-alpine as build

# change into a folder called /app
WORKDIR /app

# only copy package.json
COPY package*.json .

# download the project dependencies
RUN npm install

# copy everything from the react app folder to the /app folder in the container
COPY . .

ARG SERVER_URL=http://127.0.0.1:8000/

# package up the react project in the /app directory
RUN npm run build

# stage 2
FROM nginx:1.23-alpine
COPY --from=build /app/build /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
