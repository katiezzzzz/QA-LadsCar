FROM node:19-alpine as build

# change into a folder called /app
WORKDIR /app

# only copy package.json
COPY package.json .

# download the project dependencies
RUN npm install

# copy everything from the react app folder to the /app folder in the container
COPY . .

ARG SERVER_URL=localhost

RUN chmod +x set_env.sh
RUN ./set_env.sh

# package up the react project in the /app directory
RUN npm run build

# stage 2
FROM nginx:1.23-alpine
COPY --from=build /app/build /usr/share/nginx/html

COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]