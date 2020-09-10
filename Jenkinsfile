

node {
  def app_name = 'kavin24/dockerwebapp'
  def registry_url = 'https://registry.hub.docker.com'
  def registry_creds = 'dockerHub'
  def app_env = 'goomo-dev'

  def tag
  def image

  stage('Checkout') {
   echo "Checkout"
    checkout scm

      sh 'git submodule update --init'
      tag = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()
  }
stage('Build') {
    echo "Build"
    sh 'mvn clean install'
         docker.withRegistry("${registry_url}","${registry_creds}") {
          image = docker.build("${app_name}:${tag}")
        }
}

stage('Promote') {
    docker.withRegistry("${registry_url}","${registry_creds}"){
      docker.build("${app_name}:${tag}").push("${tag}")
    }
  }

  }






















// node {
//   def app_name = 'docker-example'
//   def registry_url = 'https://registry.hub.docker.com'
//   def registry_creds = 'dr_goomo_team'
//   def app_env = 'goomo-dev'
//
//   def tag
//   def image
//
//   stage('Checkout') {
//    echo "Checkout"
//     checkout scm
//
//       sh 'git submodule update --init'
//   }
// stage('Build') {
//     echo "Build"
//     sh 'mvn clean install'
//                   docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {
//                       def customImage = docker.build("kavin24/dockerwebapp")
//                       customImage.push()
//                   }
//                   }
// }
