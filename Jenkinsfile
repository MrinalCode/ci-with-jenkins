pipeline {
    agent 
     { label 'JDK17' } 
   
    stages {

      stage('build the code'){
        steps{
          sh "mvn clean package"
        }
      }
      
      stage('get the extent report'){
        steps{
         sh '''
          'mkdir reports
          'cp ./test-output/junitreports/* reports'
        ''' 
       }
      }      
    }  
   
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    } 
}
