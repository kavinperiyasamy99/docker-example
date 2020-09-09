node {

  stage('Checkout') {
   echo "Checkout"
    checkout scm

      sh 'git submodule update --init'


    tag = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()
  }
stage('Build') {
    echo "Build"
    sh 'mvn clean install'
                  docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {
                      def customImage = docker.build("kavin24/dockerwebapp")
                      customImage.push()
                  }
                  }
}