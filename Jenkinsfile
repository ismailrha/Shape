node('local'){
  stage('checkout') {
  checkout scm
  }
  stage('clean'){
  bat "mvn clean install"
  }
}
