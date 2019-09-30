pipeline {
    agent {
        label any
    }

    stages {
        stage('Checkout') {
            steps {
                echo('Checkout...')
            }
        }
        
        stage('Build and Test') {
            steps {
                script {
                    sh './gradlew test'
                }
            }
        }
    }

    post {
        always {
            script {
                echo('Post actions...')
            }
        }
    }
}