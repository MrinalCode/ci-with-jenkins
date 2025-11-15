pipeline {
    agent { label 'JDK17' }

    stages {

        stage('build the code') {
            steps {
                sh "mvn clean package"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        } 

             stage('Publish TestNG Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Report'
                ])
            }
        }
}
     

    post {
        always {
            echo 'I will always say Hello again!'
        }
    }
}

