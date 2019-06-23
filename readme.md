# Spring React Starter

https://github.com/pkcwong/spring-react-starter

A starter repo to building a web application with ReactJS, using the Java Spring framework.

### Prerequisites and Installation

- [NodeJS](https://nodejs.org/en/)
- [Java Development Kit](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Gradle](https://gradle.org/)

Verify the installation.

```bash
node --version
java -version
gradle -v
```

### Development

Clone the repository.

```bash
git clone https://github.com/pkcwong/spring-react-starter.git
cd spring-react-starter
```

Start Java Spring.

```bash
./gradlew bootrun
```

Start React.

```bash
cd client/
npm install
npm start
```

### Deployment

Build for production.

```bash
./gradlew clean
./gradlew build
```

The bundled JAR file will be located at ```/server/build/libs/server.jar```.

Start the production server.

```bash
./gradlew start
```

### Support and Update

To receive the latest updates do the following.

```bash
git remote add pk https://github.com/pkcwong/spring-react-starter.git
git pull pk master
```

Post your enquiries on [issues](https://github.com/pkcwong/spring-react-starter/issues) page, it will be addressed as soon as possible.

### Resource

- official tutorial for [ReactJS](https://reactjs.org/)
- official tutorial for [Java Spring](https://spring.io/guides)

### Contributing

- Christopher Wong [@pkcwong](https://github.com/pkcwong)
