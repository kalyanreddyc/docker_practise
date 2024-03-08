# Specify the base image
FROM node:14

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install

# Bundle app source
COPY ./app /usr/src/app

# Bind to all network interfaces (allows access from the host)
ENV PORT=3000
EXPOSE 3000

CMD ["node", "server.js"]
