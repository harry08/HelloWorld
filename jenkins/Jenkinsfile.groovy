pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo('Checkout...')
            }
        }
        
        stage('Build and Test') {
            steps {
                script {
                    echo('Execute tests...')
                    sh './gradlew test'
                }
            }
        }
    }

    post {
        always {
            script {
                echo('Post actions...')
                echo('Copy Files...')
                sh './gradlew copyFile'
            }
        }
    }
}