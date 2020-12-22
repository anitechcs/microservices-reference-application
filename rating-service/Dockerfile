FROM node:12-alpine
  
WORKDIR /app
 
COPY package.json package.json
COPY package-lock.json package-lock.json
 
RUN npm install
 
COPY . .

EXPOSE 8080
 
CMD [ "node", "index.js" ]