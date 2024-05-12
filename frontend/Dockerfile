# Build stage with Node.js 16
FROM node:16-alpine as build
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm cache clean --force && npm install
COPY . .
EXPOSE 3000
CMD ["npm", "start"]
