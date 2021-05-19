pipeline {
  
  agent any
  
  tools {
    maven 'Maven 3.6.3'
    jdk 'openjdk-11'
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
        sh 'mvn -B -DskipTests clean package'
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

