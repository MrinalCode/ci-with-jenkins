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

        stage('get the extent report') {
            steps {
                sh '''
                    mkdir -p reports
                    cp -r test-output/* reports/ || true
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

