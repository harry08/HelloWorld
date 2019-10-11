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
            junit 'build/test-results/test/*.xml'
            
            script {
                echo('Post actions...')
                echo('Copy Files...')
                sh './gradlew copyFile'
            }
        }
    }
}