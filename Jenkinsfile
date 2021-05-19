pipeline {
  
  agent any
  
  tools {
   // maven 'Maven 3.6.3'
    jdk 'jdk11'
  }
  
  stages {
    
    stage("Initialize"){
      steps{
           sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
      }
    }
   
    stage("build"){
      steps{
        catchError(buildResult: null, catchInterruptions: false) {
                    withMaven() {
                        sh 'mvn clean verify' // -> Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
                    }
                }
      
      }
    }
     stage("test"){
    
      steps{
        echo 'Testing ....'
      }
    }
     stage("deploy"){
    
      steps{
        echo 'deploying.....'
      }
    }
  }
  
  
}
